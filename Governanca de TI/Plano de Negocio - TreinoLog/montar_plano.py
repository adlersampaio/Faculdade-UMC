# -*- coding: utf-8 -*-
"""
Monta o documento final do plano de negócios.

Lê:
  - plano_de_negocios.template.md  (texto do plano, com marcadores {{...}})
  - tabelas_financeiras.md         (quadros gerados por modelo_financeiro.py)
  - resultados.json                (números do modelo financeiro)
Escreve:
  - plano_de_negocios.md

Os marcadores {{QUADRO n}} são substituídos pelo quadro correspondente e os
marcadores de valor ({{INV_TOTAL}}, {{IMC}}, ...) pelos números do modelo, de
modo que o texto nunca divirja das planilhas.

Uso: python3 modelo_financeiro.py && python3 montar_plano.py
"""
import json
import re
import sys

TPL = "plano_de_negocios.template.md"
TAB = "tabelas_financeiras.md"
RES = "resultados.json"
OUT = "plano_de_negocios.md"


def br(v, dec=2):
    return f"{v:,.{dec}f}".replace(",", "X").replace(".", ",").replace("X", ".")


def pct(v, dec=1):
    return f"{v * 100:.{dec}f}".replace(".", ",") + "%"


# ------------------------------------------------------------------ quadros
tabelas = open(TAB, encoding="utf-8").read()
blocos = re.split(r"(?m)^## Quadro ", tabelas)[1:]
quadros = {}
for b in blocos:
    rotulo = b.split(" ", 1)[0].rstrip("-").strip()
    quadros[rotulo] = ("## Quadro " + b).rstrip() + "\n"
print(f"quadros carregados: {', '.join(sorted(quadros, key=lambda x: float(x)))}")

# ------------------------------------------------------------------ valores
d = json.load(open(RES, encoding="utf-8"))
ind = d["indicadores"]
a1, a2, a3 = d["ano1"], d["ano2"], d["ano3"]
m12, m24, m36 = d["mes12"], d["mes24"], d["mes36"]
f12 = d["funil"]["m12"]
cac3 = d["cac"]["3"]
mix = d["mix_m36"]
mt = ind["mes_tipico"]

valores = {
    "INV_TOTAL": br(d["investimento_total"]),
    "CAIXA_MIN": br(d["capital_giro"], 0),
    "PCT_GIRO": pct(d["capital_giro"] / d["investimento_total"]),
    "REC_ANO1": br(a1["receita"], 0),
    "REC_ANO2": br(a2["receita"], 0),
    "REC_ANO3": br(a3["receita"], 0),
    "LUCRO_ANO1": br(a1["result_liq"], 0),
    "LUCRO_ANO2": br(a2["result_liq"], 0),
    "LUCRO_ANO3": br(a3["result_liq"], 0),
    "PREJUIZO_ANO1": br(abs(a1["result_liq"]), 0),
    "MARGEM_ANO3": pct(a3["result_liq"] / a3["receita"]),
    "CLIENTES_M12": br(m12["total_clientes"], 0),
    "CLIENTES_M24": br(m24["total_clientes"], 0),
    "CLIENTES_M36": br(m36["total_clientes"], 0),
    "ALUNOS_M12": br(m12["alunos"], 0),
    "ALUNOS_M24": br(m24["alunos"], 0),
    "ALUNOS_M36": br(m36["alunos"], 0),
    "MRR_M12": br(m12["rec_assin"], 0),
    "MRR_M24": br(m24["rec_assin"], 0),
    "MRR_M36": br(m36["rec_assin"], 0),
    "RECMES_M12": br(m12["receita"], 0),
    "RECMES_M24": br(m24["receita"], 0),
    "RECMES_M36": br(m36["receita"], 0),
    "MIX_M36": ", ".join(f"{k} {br(v, 0)}" for k, v in mix.items()),
    "IMC": pct(ind["imc"]),
    "IMC_REAIS": br(ind["imc"] * 100),
    "LUCRATIVIDADE": pct(ind["lucratividade"]),
    "MENOR_CAIXA": br(ind["caixa_min_atingido"], 0),
    "PE": br(ind["pe_valor"], 0),
    "PE_PCT": pct(ind["pe_valor"] / mt["receita"]),
    "PE_FOLGA": pct(1 - ind["pe_valor"] / mt["receita"]),
    "PESS_CAIXA": br(d["pessimista"]["caixa_min_atingido"], 0),
    "CAC_ANO3": br(cac3["total"], 0),
    "LUCRO_ANO3_CAC2X": br(a3["result_liq"] - cac3["total"], 0),
    "FOLGA_CAC": br(cac3["folga"], 1) + " vez" + ("es" if cac3["folga"] >= 2 else ""),
    "SOM_PCT": pct(a3["receita"] / (41332 * 349.90 * 12 + 200000 * 74.90 * 12) / 0.45 * 1, 2),
    "PEN_ESTAB": pct((mix["Studio"] + mix["Rede"]) / 41332, 2),
    "NOVOS_M12": br(f12["total"], 0),
    "VISITAS_M12": br(f12["visitas"], 0),
    "TRIALS_M12": br(f12["trials"], 0),
}

# ------------------------------------------------------------------ montagem
doc = open(TPL, encoding="utf-8").read()

def sub_quadro(m):
    rot = m.group(1).strip()
    if rot not in quadros:
        sys.exit(f"ERRO: quadro {rot} não encontrado em {TAB}")
    return quadros[rot]

doc = re.sub(r"\{\{QUADRO ([0-9.]+)\}\}", sub_quadro, doc)

def sub_valor(m):
    chave = m.group(1)
    if chave not in valores:
        sys.exit(f"ERRO: valor {chave} não definido em montar_plano.py")
    return valores[chave]

doc = re.sub(r"\{\{([A-Z0-9_]+)\}\}", sub_valor, doc)

restos = re.findall(r"\{\{[^}]*\}\}", doc)
if restos:
    sys.exit(f"ERRO: marcadores não substituídos: {set(restos)}")

open(OUT, "w", encoding="utf-8").write(doc)
palavras = len(doc.split())
print(f"{OUT} gerado: {len(doc.splitlines())} linhas, ~{palavras} palavras, "
      f"{doc.count('| ') // 3} células de tabela")
