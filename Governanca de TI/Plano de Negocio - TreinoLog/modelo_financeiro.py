# -*- coding: utf-8 -*-
"""
Modelo financeiro do Plano de Negocios - TreinoLog Tecnologia Ltda.
Governanca de TI - UMC | Metodologia Sebrae / PNBOX

Gera todas as tabelas financeiras do plano (investimentos, custos, DRE,
fluxo de caixa, indicadores de viabilidade e cenarios) a partir de um unico
conjunto de premissas, garantindo consistencia entre as secoes.

Uso: python3 modelo_financeiro.py
Saidas: tabelas_financeiras.md  e  resultados.json
"""
import json
from collections import OrderedDict

MESES = 48
INFLACAO_ANO = 0.045

# ---------------------------------------------------------------- 1. PRECOS
PLANOS = OrderedDict([
    ("Solo",   {"preco": 49.90,   "alunos": 14,  "prof": 1}),
    ("Pro",    {"preco": 99.90,   "alunos": 42,  "prof": 1}),
    ("Studio", {"preco": 349.90,  "alunos": 180, "prof": 6}),
    ("Rede",   {"preco": 1190.00, "alunos": 950, "prof": 25}),
])

# Servicos pontuais (nao recorrentes)
IMPLANTACAO = {"Solo": 0.0, "Pro": 0.0, "Studio": 890.00, "Rede": 2400.00}
MIGRACAO_PRECO = 450.00
MIGRACAO_ADESAO = 0.60   # % dos novos Studio/Rede que contratam migracao de base

# ------------------------------------------------- 2. AQUISICAO E RETENCAO
# Novos clientes por mes (bruto). Ano 1 = ramp-up pos-lancamento.
ADDS = {
    "Solo":   [6,8,10,12,14,16,18,20,22,24,26,28,
               30,32,34,36,38,40,42,44,45,46,47,48,
               50,52,54,56,58,60,62,64,66,68,70,72,
               74,76,78,80,82,84,86,88,90,92,94,96],
    "Pro":    [2,3,5,6,8,9,10,12,13,14,16,17,
               18,19,20,22,23,24,25,26,27,28,29,30,
               31,32,33,34,35,36,37,38,39,40,41,42,
               43,44,45,46,47,48,49,50,51,52,53,54],
    "Studio": [1,1,2,3,3,4,4,5,5,6,6,7,
               8,8,9,9,10,10,11,11,12,12,13,13,
               14,14,15,15,16,16,17,17,18,18,19,19,
               20,20,21,21,22,22,23,23,24,24,25,25],
    "Rede":   [0,0,0,0,1,0,0,1,0,0,1,1,
               1,0,1,1,0,1,1,1,0,1,1,1,
               1,1,1,1,2,1,1,2,1,2,1,2,
               2,2,2,2,2,2,2,2,3,2,3,3],
}
CHURN = {"Solo": 0.040, "Pro": 0.028, "Studio": 0.015, "Rede": 0.008}

# ------------------------------------------------- 3. CUSTOS VARIAVEIS
CUSTO_INFRA_ALUNO = 0.27      # R$/aluno ativo/mes (cloud + notificacoes/WhatsApp)
TAXA_PAGAMENTO_PCT = 0.0329   # % sobre receita de assinaturas (cartao/Pix)
TAXA_PAGAMENTO_FIXA = 0.49    # R$ por cobranca emitida
COMISSAO_PCT = 0.030          # comissao de vendas sobre receita bruta

# ------------------------------------------------- 4. SIMPLES NACIONAL III
# Anexo III (licenciamento de software com Fator R >= 28%) - LC 123/2006
ANEXO_III = [
    (180000.00,   0.060, 0.00),
    (360000.00,   0.112, 9360.00),
    (720000.00,   0.135, 17640.00),
    (1800000.00,  0.160, 35640.00),
    (3600000.00,  0.210, 125640.00),
    (4800000.00,  0.330, 648000.00),
]

TETO_SIMPLES = 4800000.00
# Lucro Presumido - servicos (presuncao de 32%): PIS 0,65% + COFINS 3% + ISS 2%
# sobre a receita; IRPJ 15% e CSLL 9% sobre a base presumida; adicional de IRPJ
# de 10% sobre a parcela da base que exceder R$ 20.000/mes.
PRESUMIDO_SOBRE_RECEITA = 0.0065 + 0.03 + 0.02
PRESUMIDO_PRESUNCAO = 0.32


def imposto_presumido(receita_mes):
    base = receita_mes * PRESUMIDO_PRESUNCAO
    irpj = base * 0.15
    adicional = max(base - 20000.0, 0.0) * 0.10
    csll = base * 0.09
    return receita_mes * PRESUMIDO_SOBRE_RECEITA + irpj + adicional + csll


def aliquota_efetiva(rbt12):
    for teto, nominal, dedu in ANEXO_III:
        if rbt12 <= teto:
            if rbt12 == 0:
                return nominal
            return max((rbt12 * nominal - dedu) / rbt12, 0.04)
    return 0.33

# ------------------------------------------------- 5. INVESTIMENTOS
INV_FIXO = OrderedDict([
    ("4 notebooks de desenvolvimento (16GB/512GB) - R$ 5.200",            20800.00),
    ("2 notebooks de apoio (suporte/estagio) - R$ 3.500",                  7000.00),
    ("6 monitores 24\" - R$ 890",                                          5340.00),
    ("2 smartphones para teste (Android/iOS) - R$ 2.900",                  5800.00),
    ("4 cadeiras ergonomicas - R$ 1.100",                                  4400.00),
    ("Rede, nobreak, headsets e perifericos",                              3900.00),
    ("Smart TV 55\" + webcam + audio (sala de reuniao)",                   3200.00),
    ("Impressora multifuncional",                                          1400.00),
])
INV_PREOP = OrderedDict([
    ("Constituicao da empresa (JUCESP, contador, alvaras)",                3200.00),
    ("Registro da marca no INPI (2 classes)",                              2100.00),
    ("Adequacao LGPD (consultoria, politicas, DPO as a service - setup)",  5400.00),
    ("Finalizacao do MVP com terceiros (UX/UI, QA, teste de carga)",      22000.00),
    ("Identidade visual, site, landing pages e videos",                    9800.00),
    ("Dominios, certificados e licencas (12 meses antecipados)",           3600.00),
    ("Caucao do coworking (2 meses)",                                      3800.00),
    ("Treinamento da equipe e certificacoes cloud",                        2600.00),
    ("Reserva para contingencias pre-operacionais",                        2600.00),
])
DEPRECIACAO_MES = {1: 830.00, 2: 1130.00, 3: 1530.00, 4: 1900.00}   # ver nota de calculo
CAPEX_EXPANSAO_MES = {1: 0.00, 2: 3000.00, 3: 5000.00, 4: 6000.00}  # reinvestimento em ativos

# ------------------------------------------------- 6. FINANCIAMENTO
CAPITAL_SOCIOS = 120000.00     # 4 socios x R$ 30.000
EMPRESTIMO_ATIVOS = 60000.00   # linha de inovacao vinculada aos ativos (Inovacred)
JUROS_MES = 0.0115             # 1,15% a.m. - linha de inovacao (Desenvolve SP)
CARENCIA = 6                   # meses pagando somente juros
PRAZO_AMORT = 30               # parcelas de amortizacao (sistema Price)

# ------------------------------------------------- 7. PESSOAL
ENCARGOS_CLT = 1.35   # FGTS + provisoes de 13o, ferias e 1/3 (CPP no DAS - Anexo III)
ENCARGOS_EST = 1.05   # bolsa + auxilio transporte

PRO_LABORE = [(1, 4 * 3500.0), (7, 4 * 4500.0), (13, 4 * 6000.0),
              (25, 4 * 7500.0), (37, 4 * 9000.0)]

# (cargo, salario, mes de admissao, fator de encargo)
EQUIPE_CLT = [
    ("Estagiario(a) de desenvolvimento",     1700.0,  4, ENCARGOS_EST),
    ("Analista de Suporte/CS I",             2900.0,  7, ENCARGOS_CLT),
    ("Desenvolvedor(a) pleno I",             7500.0, 11, ENCARGOS_CLT),
    ("Analista de Sucesso do Cliente II",    3600.0, 16, ENCARGOS_CLT),
    ("SDR (pre-vendas)",                     2800.0, 18, ENCARGOS_CLT),
    ("Desenvolvedor(a) pleno II",            7800.0, 20, ENCARGOS_CLT),
    ("Estagiario(a) de suporte",             1700.0, 22, ENCARGOS_EST),
    ("Executivo(a) de Contas (closer)",      3800.0, 26, ENCARGOS_CLT),
    ("Desenvolvedor(a) senior",             11000.0, 28, ENCARGOS_CLT),
    ("Analista de Dados/ML",                 8200.0, 31, ENCARGOS_CLT),
    ("Analista de Marketing",                5000.0, 33, ENCARGOS_CLT),
    ("Analista Administrativo-Financeiro",   4200.0, 38, ENCARGOS_CLT),
    ("Desenvolvedor(a) pleno III",           8000.0, 40, ENCARGOS_CLT),
    ("Analista de Suporte/CS III",           3200.0, 42, ENCARGOS_CLT),
    ("Especialista em Seguranca da Informacao", 9500.0, 45, ENCARGOS_CLT),
]

# ------------------------------------------------- 8. CUSTOS FIXOS (ANO 1)
FIXOS_BASE = OrderedDict([
    ("Coworking corporativo (4 estacoes + sala de reuniao)", 1900.00),
    ("Energia, agua e limpeza (rateio)",                      320.00),
    ("Internet dedicada e telefonia",                         260.00),
    ("Infraestrutura de nuvem - base fixa",                  1200.00),
    ("Ferramentas SaaS (Git, CI/CD, design, CRM, observabilidade)", 980.00),
    ("Servicos contabeis",                                    690.00),
    ("Assessoria juridica e LGPD (mensal)",                   450.00),
    ("Seguros e seguranca da informacao (pentest rateado)",    380.00),
    ("Material de escritorio e copa",                          240.00),
    ("Manutencao e despesas diversas",                         260.00),
])
MARKETING = [(1, 2500.0), (7, 3800.0), (13, 8000.0), (25, 13000.0), (37, 18000.0)]
# escala dos fixos nao-marketing por ano (crescimento de estrutura + inflacao)
ESCALA_FIXOS = {1: 1.00, 2: 1.30, 3: 1.70, 4: 2.10}


def por_mes(tabela, m):
    """Retorna o valor vigente no mes m para uma tabela [(mes_inicio, valor)]."""
    valor = 0.0
    for inicio, v in tabela:
        if m >= inicio:
            valor = v
    return valor


def pmt(pv, i, n):
    return pv * (i * (1 + i) ** n) / ((1 + i) ** n - 1)


def simular(fator_adds=1.0, fator_churn=1.0, fator_preco=1.0, caixa_inicial=0.0,
            emprestimo=0.0, atraso_contratacoes=0, fator_mkt=1.0):
    """Simula 36 meses. Retorna lista de dicionarios (um por mes)."""
    base = {p: 0.0 for p in PLANOS}
    parcela = pmt(emprestimo, JUROS_MES, PRAZO_AMORT) if emprestimo else 0.0
    saldo_div = emprestimo
    receitas_hist = []
    caixa = caixa_inicial
    linhas = []

    for m in range(1, MESES + 1):
        ano = (m - 1) // 12 + 1
        infl = (1 + INFLACAO_ANO) ** (ano - 1)

        # --- clientes
        novos = {}
        for p in PLANOS:
            n = round(ADDS[p][m - 1] * fator_adds)
            base[p] = base[p] * (1 - CHURN[p] * fator_churn) + n
            novos[p] = n
        clientes = {p: base[p] for p in PLANOS}
        total_clientes = sum(clientes.values())
        alunos = sum(clientes[p] * PLANOS[p]["alunos"] for p in PLANOS)

        # --- receitas
        rec_assin = sum(clientes[p] * PLANOS[p]["preco"] * fator_preco * infl
                        for p in PLANOS)
        rec_impl = sum(novos[p] * IMPLANTACAO[p] * infl for p in PLANOS)
        rec_migr = (novos["Studio"] + novos["Rede"]) * MIGRACAO_ADESAO * MIGRACAO_PRECO * infl
        rec_serv = rec_impl + rec_migr
        receita = rec_assin + rec_serv

        # --- Simples Nacional (RBT12 proporcionalizada no 1o ano)
        if receitas_hist:
            rbt12 = sum(receitas_hist) / len(receitas_hist) * 12
        else:
            rbt12 = receita * 12
        if rbt12 > TETO_SIMPLES:
            regime = "Lucro Presumido"
            impostos = imposto_presumido(receita)
            aliq = impostos / receita if receita else 0.0
        else:
            regime = "Simples Nacional - Anexo III"
            aliq = aliquota_efetiva(rbt12)
            impostos = receita * aliq
        receitas_hist.append(receita)
        if len(receitas_hist) > 12:
            receitas_hist.pop(0)

        # --- custos variaveis
        c_infra = alunos * CUSTO_INFRA_ALUNO
        c_pagto = rec_assin * TAXA_PAGAMENTO_PCT + total_clientes * TAXA_PAGAMENTO_FIXA
        c_comis = receita * COMISSAO_PCT
        var_total = c_infra + c_pagto + c_comis
        margem_contrib = receita - impostos - var_total

        # --- custos fixos
        pl = por_mes(PRO_LABORE, m)
        clt = sum(s * f for (_c, s, adm, f) in EQUIPE_CLT
                  if m >= adm + atraso_contratacoes) * infl
        mkt = por_mes(MARKETING, m) * fator_mkt
        outros = sum(FIXOS_BASE.values()) * ESCALA_FIXOS[ano]
        depr = DEPRECIACAO_MES[ano]
        fixo_total = pl + clt + mkt + outros + depr

        ebitda = margem_contrib - (fixo_total - depr)
        result_oper = margem_contrib - fixo_total

        # --- financiamento
        juros = saldo_div * JUROS_MES
        amort = 0.0
        if emprestimo and m > CARENCIA and saldo_div > 0.01:
            amort = min(parcela - juros, saldo_div)
        saldo_div = max(saldo_div - amort, 0.0)

        result_liq = result_oper - juros
        capex = CAPEX_EXPANSAO_MES[ano]
        fluxo = result_liq + depr - amort - capex
        caixa += fluxo

        linhas.append(dict(
            mes=m, ano=ano, clientes=dict(clientes), novos=dict(novos),
            total_clientes=total_clientes, alunos=alunos,
            rec_assin=rec_assin, rec_serv=rec_serv, receita=receita,
            rbt12=rbt12, aliq=aliq, impostos=impostos, regime=regime,
            c_infra=c_infra, c_pagto=c_pagto, c_comis=c_comis, var_total=var_total,
            margem_contrib=margem_contrib, pl=pl, clt=clt, mkt=mkt, outros=outros,
            depr=depr, fixo_total=fixo_total, ebitda=ebitda,
            result_oper=result_oper, juros=juros, amort=amort, saldo_div=saldo_div,
            result_liq=result_liq, capex=capex, fluxo=fluxo, caixa=caixa,
        ))
    return linhas


# ---------------------------------------------------------------------------
# Dimensionamento do capital de giro: maior deficit acumulado + 20% de folga
# ---------------------------------------------------------------------------
INV_FIXO_TOTAL = sum(INV_FIXO.values())
INV_PREOP_TOTAL = sum(INV_PREOP.values())

EMPRESTIMO = EMPRESTIMO_ATIVOS
pre = simular(caixa_inicial=0.0, emprestimo=EMPRESTIMO)
deficit = min(l["caixa"] for l in pre)
caixa_min = round((-deficit * 1.20) / 5000.0 + 0.4999) * 5000.0
INV_TOTAL = INV_FIXO_TOTAL + INV_PREOP_TOTAL + caixa_min
CAPITAL_ANJO = max(round((INV_TOTAL - CAPITAL_SOCIOS - EMPRESTIMO) / 5000.0 + 0.4999) * 5000.0, 0.0)
FONTES_TOTAL = CAPITAL_SOCIOS + CAPITAL_ANJO + EMPRESTIMO
CAIXA_ABERTURA = FONTES_TOTAL - INV_FIXO_TOTAL - INV_PREOP_TOTAL

real = simular(caixa_inicial=CAIXA_ABERTURA, emprestimo=EMPRESTIMO)
pess = simular(fator_adds=0.65, fator_churn=1.40, fator_preco=0.95,
               caixa_inicial=CAIXA_ABERTURA, emprestimo=EMPRESTIMO,
               atraso_contratacoes=6, fator_mkt=0.60)
otim = simular(fator_adds=1.25, fator_churn=0.85, fator_preco=1.00,
               caixa_inicial=CAIXA_ABERTURA, emprestimo=EMPRESTIMO)


def anual(linhas, ano):
    ls = [l for l in linhas if l["ano"] == ano]
    keys = ["rec_assin", "rec_serv", "receita", "impostos", "c_infra", "c_pagto",
            "c_comis", "var_total", "margem_contrib", "pl", "clt", "mkt", "outros",
            "depr", "fixo_total", "ebitda", "result_oper", "juros", "result_liq",
            "amort", "capex", "fluxo"]
    d = {k: sum(l[k] for l in ls) for k in keys}
    d["caixa_final"] = ls[-1]["caixa"]
    d["clientes_final"] = ls[-1]["total_clientes"]
    d["alunos_final"] = ls[-1]["alunos"]
    d["mrr_final"] = ls[-1]["rec_assin"]
    return d


def indicadores(linhas):
    a = {y: anual(linhas, y) for y in (1, 2, 3, 4)}
    # mes tipico = media do 2o semestre do ano 3 (operacao estabilizada)
    tip = [l for l in linhas if 31 <= l["mes"] <= 36]
    n = len(tip)
    md = {k: sum(l[k] for l in tip) / n for k in
          ("receita", "impostos", "var_total", "margem_contrib", "fixo_total",
           "result_liq", "juros", "ebitda")}
    imc = md["margem_contrib"] / md["receita"]                  # indice de margem de contribuicao
    pe_valor = md["fixo_total"] / imc                            # ponto de equilibrio (R$/mes)
    lucratividade = md["result_liq"] / md["receita"]
    rentabilidade = (md["result_liq"] * 12) / INV_TOTAL
    # (a) payback simples (metodologia Sebrae): investimento / lucro liquido do mes tipico
    payback_meses = (INV_TOTAL / md["result_liq"]) if md["result_liq"] > 0 else None
    # (b) recomposicao do caixa: mes em que o saldo retorna ao nivel de abertura
    recomposicao = next((l["mes"] for l in linhas
                         if l["mes"] > 6 and l["caixa"] >= CAIXA_ABERTURA), None)
    breakeven_mes = next((l["mes"] for l in linhas if l["result_liq"] > 0), None)
    fc_breakeven = next((l["mes"] for l in linhas if l["fluxo"] > 0), None)
    caixa_min_atingido = min(l["caixa"] for l in linhas)
    return dict(anual=a, mes_tipico=md, imc=imc, pe_valor=pe_valor,
                lucratividade=lucratividade, rentabilidade=rentabilidade,
                payback_meses=payback_meses, recomposicao_mes=recomposicao,
                breakeven_mes=breakeven_mes,
                fc_breakeven_mes=fc_breakeven, caixa_min_atingido=caixa_min_atingido)


ind = indicadores(real)
ind_p = indicadores(pess)
ind_o = indicadores(otim)

# ---------------------------------------------------------------- FORMATACAO
def br(v, dec=2):
    if abs(v) < 0.5 / (10 ** dec):      # evita exibir "-0"
        v = 0.0
    s = f"{v:,.{dec}f}"
    return s.replace(",", "X").replace(".", ",").replace("X", ".")

def mil(v):
    """Inteiro com separador de milhar no padrao brasileiro."""
    return f"{v:,.0f}".replace(",", ".")


def pct(v, dec=1):
    return f"{v*100:.{dec}f}".replace(".", ",") + "%"

out = []
w = out.append

w("<!-- Gerado por modelo_financeiro.py - nao editar a mao -->\n")
w("## Quadro 1 - Investimentos fixos\n")
w("| Item | Valor (R$) |")
w("|---|---:|")
for k, v in INV_FIXO.items():
    w(f"| {k} | {br(v)} |")
w(f"| **Total de investimentos fixos** | **{br(INV_FIXO_TOTAL)}** |\n")

w("## Quadro 2 - Investimentos pre-operacionais\n")
w("| Item | Valor (R$) |")
w("|---|---:|")
for k, v in INV_PREOP.items():
    w(f"| {k} | {br(v)} |")
w(f"| **Total pre-operacional** | **{br(INV_PREOP_TOTAL)}** |\n")

w("## Quadro 3 - Investimento total e fontes de recursos\n")
w("| Descricao | Valor (R$) | % |")
w("|---|---:|---:|")
for nome, v in (("Investimentos fixos (imobilizado)", INV_FIXO_TOTAL),
                ("Investimentos pre-operacionais", INV_PREOP_TOTAL),
                ("Capital de giro (caixa minimo dimensionado)", caixa_min)):
    w(f"| {nome} | {br(v)} | {pct(v/INV_TOTAL)} |")
w(f"| **Investimento total** | **{br(INV_TOTAL)}** | **100,0%** |")
w("")
w("| Fonte de recursos | Valor (R$) | % |")
w("|---|---:|---:|")
for nome, v in (("Capital proprio - 4 socios (R$ 30.000 cada)", CAPITAL_SOCIOS),
                ("Investidor-anjo (mutuo conversivel, rodada pre-seed)", CAPITAL_ANJO),
                ("Financiamento de inovacao para ativos (1,15% a.m., 36 meses)", EMPRESTIMO)):
    w(f"| {nome} | {br(v)} | {pct(v/FONTES_TOTAL)} |")
w(f"| **Total de fontes** | **{br(FONTES_TOTAL)}** | **100,0%** |")
w(f"\n> Caixa disponivel na abertura (fontes - investimentos fixos e pre-operacionais): **R$ {br(CAIXA_ABERTURA)}**.")
w(f"> Maior necessidade de caixa observada na simulacao: **R$ {br(-deficit)}** (mes de maior deficit acumulado);")
w(f"> capital de giro dimensionado com 20% de folga = **R$ {br(caixa_min)}**.\n")

# --- fluxo de caixa ano 1 (mensal)
def tabela_mensal(linhas, m0, m1, titulo):
    w(f"## {titulo}\n")
    w("| Mes | Clientes | Alunos ativos | Receita bruta | Impostos | Custos variaveis | Margem de contrib. | Custos fixos | Result. liquido | Fluxo do mes | Saldo de caixa |")
    w("|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|")
    for l in linhas:
        if m0 <= l["mes"] <= m1:
            w(f"| {l['mes']} | {mil(l['total_clientes'])} | {mil(l['alunos'])} | "
              f"{br(l['receita'],0)} | {br(l['impostos'],0)} | {br(l['var_total'],0)} | "
              f"{br(l['margem_contrib'],0)} | {br(l['fixo_total'],0)} | {br(l['result_liq'],0)} | "
              f"{br(l['fluxo'],0)} | {br(l['caixa'],0)} |")
    w("")

tabela_mensal(real, 1, 12, "Quadro 4 - Fluxo de caixa mensal do Ano 1 (R$)")
tabela_mensal(real, 13, 24, "Quadro 5 - Fluxo de caixa mensal do Ano 2 (R$)")
tabela_mensal(real, 25, 36, "Quadro 6 - Fluxo de caixa mensal do Ano 3 (R$)")
tabela_mensal(real, 37, 48, "Quadro 6.1 - Fluxo de caixa mensal do Ano 4 (R$)")

# --- DRE anual
w("## Quadro 7 - Demonstrativo de resultados (DRE) - Anos 1 a 4 (R$)\n")
a1, a2, a3, a4 = anual(real, 1), anual(real, 2), anual(real, 3), anual(real, 4)
w("| Conta | Ano 1 | Ano 2 | Ano 3 | Ano 4 |")
w("|---|---:|---:|---:|---:|")
def linha_dre(nome, key, sinal=1, negrito=False):
    vals = [sinal * a[key] for a in (a1, a2, a3, a4)]
    n = f"**{nome}**" if negrito else nome
    fm = (lambda v: f"**{br(v,0)}**") if negrito else (lambda v: br(v, 0))
    w(f"| {n} | {fm(vals[0])} | {fm(vals[1])} | {fm(vals[2])} | {fm(vals[3])} |")

linha_dre("1. Receita com assinaturas (recorrente)", "rec_assin")
linha_dre("2. Receita com servicos (implantacao/migracao)", "rec_serv")
linha_dre("3. Receita bruta total", "receita", negrito=True)
linha_dre("4. (-) Impostos sobre vendas (Simples Nacional)", "impostos", -1)
linha_dre("5. (-) Custos variaveis totais", "var_total", -1)
linha_dre("6. = Margem de contribuicao", "margem_contrib", negrito=True)
linha_dre("7. (-) Pro-labore dos socios", "pl", -1)
linha_dre("8. (-) Salarios e encargos (CLT)", "clt", -1)
linha_dre("9. (-) Marketing e vendas", "mkt", -1)
linha_dre("10. (-) Outros custos fixos operacionais", "outros", -1)
linha_dre("11. (-) Depreciacao", "depr", -1)
linha_dre("12. = Resultado operacional (EBIT)", "result_oper", negrito=True)
linha_dre("13. (-) Despesas financeiras (juros)", "juros", -1)
linha_dre("14. = Resultado liquido do exercicio", "result_liq", negrito=True)
linha_dre("15. (+) Depreciacao (nao desembolsavel)", "depr")
linha_dre("16. (-) Amortizacao do financiamento", "amort", -1)
linha_dre("17. (-) Investimentos de expansao (capex)", "capex", -1)
linha_dre("18. = Fluxo de caixa do exercicio", "fluxo", negrito=True)
w("")
w("| Indicador de fechamento | Ano 1 | Ano 2 | Ano 3 | Ano 4 |")
w("|---|---:|---:|---:|---:|")
w(f"| Clientes ativos em dezembro | {mil(a1['clientes_final'])} | {mil(a2['clientes_final'])} | {mil(a3['clientes_final'])} | {mil(a4['clientes_final'])} |")
w(f"| Alunos ativos na plataforma | {mil(a1['alunos_final'])} | {mil(a2['alunos_final'])} | {mil(a3['alunos_final'])} | {mil(a4['alunos_final'])} |")
w(f"| MRR de dezembro (R$) | {br(a1['mrr_final'],0)} | {br(a2['mrr_final'],0)} | {br(a3['mrr_final'],0)} | {br(a4['mrr_final'],0)} |")
w(f"| Saldo de caixa no fim do ano (R$) | {br(a1['caixa_final'],0)} | {br(a2['caixa_final'],0)} | {br(a3['caixa_final'],0)} | {br(a4['caixa_final'],0)} |")
w(f"| Margem de contribuicao / receita | {pct(a1['margem_contrib']/a1['receita'])} | {pct(a2['margem_contrib']/a2['receita'])} | {pct(a3['margem_contrib']/a3['receita'])} | {pct(a4['margem_contrib']/a4['receita'])} |")
w(f"| Resultado liquido / receita | {pct(a1['result_liq']/a1['receita'])} | {pct(a2['result_liq']/a2['receita'])} | {pct(a3['result_liq']/a3['receita'])} | {pct(a4['result_liq']/a4['receita'])} |")
w("")

# --- indicadores de viabilidade
md = ind["mes_tipico"]
w("## Quadro 8 - Indicadores de viabilidade (mes tipico: media dos meses 31 a 36)\n")
w("| Indicador | Formula | Resultado |")
w("|---|---|---:|")
w(f"| Receita bruta do mes tipico | - | R$ {br(md['receita'],0)} |")
w(f"| Margem de contribuicao | Receita - impostos - custos variaveis | R$ {br(md['margem_contrib'],0)} |")
w(f"| Indice de margem de contribuicao (IMC) | MC / Receita | {pct(ind['imc'])} |")
w(f"| Custos fixos totais | - | R$ {br(md['fixo_total'],0)} |")
w(f"| **Ponto de equilibrio (faturamento)** | Custo fixo / IMC | **R$ {br(ind['pe_valor'],0)}/mes** |")
w(f"| Ponto de equilibrio (% da receita do mes tipico) | PE / Receita | {pct(ind['pe_valor']/md['receita'])} |")
w(f"| **Lucratividade** | Lucro liquido / Receita bruta | **{pct(ind['lucratividade'])}** |")
w(f"| **Rentabilidade (a.a.)** | (Lucro liquido do mes tipico x 12) / Investimento total | **{pct(ind['rentabilidade'])}** |")
for _y in (2, 3, 4):
    w(f"| Rentabilidade efetiva do Ano {_y} | Lucro liquido do Ano {_y} / Investimento total | {pct(ind['anual'][_y]['result_liq']/INV_TOTAL)} |")
w(f"| Prazo de retorno pela formula simples (Sebrae) | Investimento total / lucro liquido do mes tipico | {br(ind['payback_meses'],1)} meses |")
w(f"| **Payback efetivo (recomposicao integral do caixa investido)** | Mes em que o saldo de caixa volta ao nivel de abertura | **mes {ind['recomposicao_mes']}** |")
w(f"| Primeiro mes com lucro liquido positivo | - | mes {ind['breakeven_mes']} |")
w(f"| Primeiro mes com fluxo de caixa positivo | - | mes {ind['fc_breakeven_mes']} |")
w(f"| Menor saldo de caixa do periodo | - | R$ {br(ind['caixa_min_atingido'],0)} |")
w("")
w("> **Nota metodologica sobre o payback.** A formula simples do Sebrae divide o investimento total pelo lucro")
w("> liquido de um mes ja estabilizado e, por isso, desconsidera o periodo de ramp-up (o Ano 1 opera com")
w("> prejuizo). O grupo adota como payback oficial do plano a **recomposicao integral do caixa investido, no")
w(f"> mes {ind['recomposicao_mes']}** (2 anos e 8 meses) - indicador mais conservador e mais aderente ao comportamento de negocios")
w("> de receita recorrente, em que o retorno depende do acumulo da base de assinantes.")
w("")

# --- cenarios
w("## Quadro 9 - Construcao de cenarios (Ano 3 e indicadores)\n")
w("| Parametro | Pessimista | Realista | Otimista |")
w("|---|---:|---:|---:|")
w("| Aquisicao de clientes vs. plano | -35% | plano | +25% |")
w("| Churn mensal vs. plano | +40% | plano | -15% |")
w("| Preco medio vs. plano | -5% | plano | plano |")
for nome, key, f in (("Receita bruta do Ano 3 (R$)", "receita", 0),
                     ("Margem de contribuicao do Ano 3 (R$)", "margem_contrib", 0),
                     ("Resultado liquido do Ano 3 (R$)", "result_liq", 0),
                     ("Fluxo de caixa do Ano 3 (R$)", "fluxo", 0)):
    w(f"| {nome} | {br(ind_p['anual'][3][key],f)} | {br(ind['anual'][3][key],f)} | {br(ind_o['anual'][3][key],f)} |")
w(f"| Clientes ativos no mes 36 | {mil(ind_p['anual'][3]['clientes_final'])} | {mil(ind['anual'][3]['clientes_final'])} | {mil(ind_o['anual'][3]['clientes_final'])} |")
w(f"| Lucratividade (mes tipico) | {pct(ind_p['lucratividade'])} | {pct(ind['lucratividade'])} | {pct(ind_o['lucratividade'])} |")
w(f"| Rentabilidade anual | {pct(ind_p['rentabilidade'])} | {pct(ind['rentabilidade'])} | {pct(ind_o['rentabilidade'])} |")
pb = lambda x: (br(x['payback_meses'],1) if x['payback_meses'] and x['payback_meses'] <= 120 else "nao se paga no horizonte")
w(f"| Payback simples (meses) | {pb(ind_p)} | {pb(ind)} | {pb(ind_o)} |")
w(f"| Menor saldo de caixa (R$) | {br(ind_p['caixa_min_atingido'],0)} | {br(ind['caixa_min_atingido'],0)} | {br(ind_o['caixa_min_atingido'],0)} |")
w("")

# --- estrutura de precos e custos unitarios
w("## Quadro 10 - Planos, precos e custo variavel unitario\n")
w("| Plano | Preco/mes (R$) | Alunos ativos (media) | Custo variavel unitario (R$) | Margem de contribuicao unitaria (R$) | % |")
w("|---|---:|---:|---:|---:|---:|")
aliq_ref = aliquota_efetiva(anual(real, 3)["receita"])
for p, cfg in PLANOS.items():
    preco = cfg["preco"]
    cv = (cfg["alunos"] * CUSTO_INFRA_ALUNO + preco * TAXA_PAGAMENTO_PCT +
          TAXA_PAGAMENTO_FIXA + preco * COMISSAO_PCT + preco * aliq_ref)
    w(f"| {p} | {br(preco)} | {cfg['alunos']} | {br(cv)} | {br(preco-cv)} | {pct((preco-cv)/preco)} |")
w(f"\n> Aliquota efetiva do Simples Nacional usada na referencia: {pct(aliq_ref)} "
  f"(Anexo III, RBT12 do Ano 3).\n")

w("## Quadro 10.1 - Carga tributaria projetada e regime\n")
w("| Exercicio | Receita bruta (R$) | Regime vigente no fim do ano | Impostos sobre vendas (R$) | Carga efetiva |")
w("|---|---:|---|---:|---:|")
for _y, _a in ((1, a1), (2, a2), (3, a3), (4, a4)):
    _ult = [l for l in real if l["ano"] == _y][-1]
    w(f"| Ano {_y} | {br(_a['receita'],0)} | {_ult['regime']} | {br(_a['impostos'],0)} | {pct(_a['impostos']/_a['receita'])} |")
w(f"\n> A partir do mes em que a receita acumulada dos 12 meses anteriores supera R$ {br(TETO_SIMPLES,0)}, a empresa")
w("> e desenquadrada do Simples Nacional e passa ao Lucro Presumido (presuncao de 32% para servicos).")
w("> O plano ja projeta esse desenquadramento no Ano 4 e preve estudo de planejamento tributario no Ano 3.\n")

# --- quadro de pessoal
w("## Quadro 11 - Quadro de pessoal e custo mensal (mes 36)\n")
w("| Funcao | Regime | Remuneracao (R$) | Encargos/provisoes | Custo mensal (R$) | Admissao |")
w("|---|---|---:|---:|---:|---:|")
pl36 = por_mes(PRO_LABORE, 36)
w(f"| 4 socios (CEO, CTO, COO, CPO) | Pro-labore | {br(pl36/4)} cada | INSS retido do socio | {br(pl36)} | mes 1 |")
tot_clt = 0.0
for cargo, sal, adm, fat in EQUIPE_CLT:
    custo = sal * fat * (1 + INFLACAO_ANO) ** 2
    tot_clt += custo
    w(f"| {cargo} | {'Estagio' if fat == ENCARGOS_EST else 'CLT'} | {br(sal)} | "
      f"{pct(fat-1,0)} | {br(custo)} | mes {adm} |")
w(f"| **Total de pessoal no mes 36** | | | | **{br(pl36+tot_clt)}** | |\n")

# --- custos fixos detalhados
w("## Quadro 12 - Custos fixos operacionais mensais\n")
w("| Item | Ano 1 (R$) | Ano 2 (R$) | Ano 3 (R$) |")
w("|---|---:|---:|---:|")
for k, v in FIXOS_BASE.items():
    w(f"| {k} | {br(v)} | {br(v*ESCALA_FIXOS[2])} | {br(v*ESCALA_FIXOS[3])} |")
for ano, rot in ((1, "mes 12"), (2, "mes 24"), (3, "mes 36")):
    pass
w(f"| Marketing e vendas | {br(por_mes(MARKETING,12))} | {br(por_mes(MARKETING,24))} | {br(por_mes(MARKETING,36))} |")
w(f"| Pessoal (pro-labore + CLT com encargos) | {br(real[11]['pl']+real[11]['clt'])} | {br(real[23]['pl']+real[23]['clt'])} | {br(real[35]['pl']+real[35]['clt'])} |")
w(f"| Depreciacao | {br(DEPRECIACAO_MES[1])} | {br(DEPRECIACAO_MES[2])} | {br(DEPRECIACAO_MES[3])} |")
w(f"| **Total de custos fixos mensais** | **{br(real[11]['fixo_total'])}** | **{br(real[23]['fixo_total'])}** | **{br(real[35]['fixo_total'])}** |")
w("\n> Valores dos meses 12, 24 e 36 (ja com inflacao de 4,5% a.a. sobre folha e escala de estrutura).\n")

# ---------------------------------------------------------------------------
# Quadro 13 - Unit economics por plano
# ---------------------------------------------------------------------------
w("## Quadro 13 - Unit economics por plano (base: mes tipico do Ano 3)\n")
w("| Plano | Preco/mes (R$) | MC unitaria (R$) | Churn mensal | Vida media (meses) | LTV (R$) | CAC maximo suportado = LTV/3 (R$) |")
w("|---|---:|---:|---:|---:|---:|---:|")
ltv = {}
for _p, cfg in PLANOS.items():
    preco = cfg["preco"]
    cv = (cfg["alunos"] * CUSTO_INFRA_ALUNO + preco * TAXA_PAGAMENTO_PCT +
          TAXA_PAGAMENTO_FIXA + preco * COMISSAO_PCT + preco * aliq_ref)
    mc = preco - cv
    vida = 1.0 / CHURN[_p]
    ltv[_p] = mc * vida
    w(f"| {_p} | {br(preco)} | {br(mc)} | {pct(CHURN[_p],1)} | {vida:.0f} | {br(ltv[_p])} | {br(ltv[_p]/3)} |")
w("")

# ---------------------------------------------------------------------------
# Quadro 14 - CAC implicito no plano
# ---------------------------------------------------------------------------
CARGOS_COMERCIAIS = ("SDR (pre-vendas)", "Executivo(a) de Contas (closer)", "Analista de Marketing")
cac_por_ano = {}
w("## Quadro 14 - Custo de aquisicao de clientes (CAC) implicito no plano\n")
w("| Exercicio | Marketing (R$) | Comissoes (R$) | Folha comercial (R$) | Investimento comercial total (R$) | Novos clientes | CAC implicito (R$) | CAC maximo suportado (R$) | Folga |")
w("|---|---:|---:|---:|---:|---:|---:|---:|---:|")
for _y in (1, 2, 3, 4):
    ls = [l for l in real if l["ano"] == _y]
    mkt_y = sum(l["mkt"] for l in ls)
    com_y = sum(l["c_comis"] for l in ls)
    infl_y = (1 + INFLACAO_ANO) ** (_y - 1)
    folha_y = sum(sal * fat * infl_y
                  for (cargo, sal, adm, fat) in EQUIPE_CLT if cargo in CARGOS_COMERCIAIS
                  for _l in ls if _l["mes"] >= adm)
    total_y = mkt_y + com_y + folha_y
    novos_y = sum(sum(l["novos"].values()) for l in ls)
    cac = total_y / novos_y
    # CAC maximo suportado ponderado pelo mix de novos clientes do ano
    mix = {_p: sum(l["novos"][_p] for l in ls) for _p in PLANOS}
    cac_max = sum(mix[_p] * ltv[_p] / 3 for _p in PLANOS) / novos_y
    cac_por_ano[_y] = dict(marketing=mkt_y, comissoes=com_y, folha=folha_y,
                           total=total_y, novos=novos_y, cac=cac, cac_max=cac_max,
                           folga=cac_max / cac)
    w(f"| Ano {_y} | {br(mkt_y,0)} | {br(com_y,0)} | {br(folha_y,0)} | {br(total_y,0)} | {mil(novos_y)} | "
      f"{br(cac,0)} | {br(cac_max,0)} | {br(cac_max/cac,1)}x |")
w("")
w("> O CAC implicito e o resultado da divisao do investimento comercial total pelo numero de novos clientes")
w("> do exercicio. A folga indica quantas vezes o CAC poderia crescer antes de comprometer a relacao")
w("> LTV/CAC = 3, referencia usual para negocios de receita recorrente.\n")

# ---------------------------------------------------------------------------
# Quadro 15 - Funil de vendas
# ---------------------------------------------------------------------------
CONV = dict(visit_lead=0.035, lead_trial=0.35, trial_pago=0.22,   # autosservico
            mql_demo=0.40, demo_fecha=0.25)                        # vendas assistidas
w("## Quadro 15 - Funil de vendas necessario (metas mensais)\n")
w("| Etapa do funil | Taxa de conversao | Mes 12 | Mes 24 | Mes 36 |")
w("|---|---:|---:|---:|---:|")
def funil(m):
    l = real[m - 1]
    self_serve = l["novos"]["Solo"] + l["novos"]["Pro"]
    assistido = l["novos"]["Studio"] + l["novos"]["Rede"]
    trials = self_serve / CONV["trial_pago"]
    leads = trials / CONV["lead_trial"]
    visitas = leads / CONV["visit_lead"]
    demos = assistido / CONV["demo_fecha"]
    mqls = demos / CONV["mql_demo"]
    return dict(visitas=visitas, leads=leads, trials=trials, self_serve=self_serve,
                mqls=mqls, demos=demos, assistido=assistido,
                total=self_serve + assistido)
f12, f24, f36 = funil(12), funil(24), funil(36)
for rot, key, tx in (
    ("Visitantes unicos no site/blog", "visitas", "-"),
    ("Leads (cadastro de e-mail)", "leads", pct(CONV['visit_lead'],1)),
    ("Testes gratuitos iniciados (14 dias)", "trials", pct(CONV['lead_trial'],0)),
    ("Novos clientes por autosservico (Solo/Pro)", "self_serve", pct(CONV['trial_pago'],0)),
    ("MQLs de vendas assistidas (Studio/Rede)", "mqls", "-"),
    ("Demonstracoes realizadas", "demos", pct(CONV['mql_demo'],0)),
    ("Novos clientes por venda assistida", "assistido", pct(CONV['demo_fecha'],0)),
    ("Total de novos clientes no mes", "total", "-"),
):
    w(f"| {rot} | {tx} | {mil(f12[key])} | {mil(f24[key])} | {mil(f36[key])} |")
w("")

# ---------------------------------------------------------------------------
# Quadro 16 - Dimensionamento do mercado (TAM/SAM/SOM)
# ---------------------------------------------------------------------------
ACADEMIAS_BR = 41332
PROF_POTENCIAIS = 200000
TICKET_ESTAB_ANO = PLANOS["Studio"]["preco"] * 12
TICKET_PROF_ANO = (PLANOS["Solo"]["preco"] + PLANOS["Pro"]["preco"]) / 2 * 12
TAM = ACADEMIAS_BR * TICKET_ESTAB_ANO + PROF_POTENCIAIS * TICKET_PROF_ANO
SAM_PCT = 0.45
SAM = TAM * SAM_PCT
w("## Quadro 16 - Dimensionamento do mercado (TAM / SAM / SOM)\n")
w("| Medida | Base de calculo | Valor (R$/ano) |")
w("|---|---|---:|")
w(f"| TAM - academias e estudios | {mil(ACADEMIAS_BR)} estabelecimentos x R$ {br(TICKET_ESTAB_ANO)} (plano Studio anual) | {br(ACADEMIAS_BR*TICKET_ESTAB_ANO,0)} |")
w(f"| TAM - profissionais autonomos | {mil(PROF_POTENCIAIS)} profissionais x R$ {br(TICKET_PROF_ANO)} (media Solo/Pro anual) | {br(PROF_POTENCIAIS*TICKET_PROF_ANO,0)} |")
w(f"| **TAM total (Brasil)** | soma das linhas anteriores | **{br(TAM,0)}** |")
w(f"| **SAM (mercado atingivel)** | {pct(SAM_PCT,0)} do TAM: Sudeste/Sul + estabelecimentos de pequeno e medio porte | **{br(SAM,0)}** |")
w(f"| **SOM (meta do Ano 3)** | receita projetada para o Ano 3 | **{br(a3['receita'],0)}** |")
w(f"| Participacao no SAM no Ano 3 | receita do Ano 3 / SAM | {pct(a3['receita']/SAM,2)} |")
w(f"| Participacao no SAM no Ano 4 | receita do Ano 4 / SAM | {pct(a4['receita']/SAM,2)} |")
w(f"| Penetracao em estabelecimentos (mes 36) | clientes Studio + Rede / {mil(ACADEMIAS_BR)} academias | {pct((real[35]['clientes']['Studio']+real[35]['clientes']['Rede'])/ACADEMIAS_BR,2)} |")
w(f"| Alunos atendidos na plataforma (mes 36) | base instalada / 13,65 milhoes de alunos do pais | {pct(real[35]['alunos']/13650000,2)} |")
w("")

ACENTOS = {
    "pre-operacionais": "pré-operacionais", "pre-operacional": "pré-operacional",
    "minimo": "mínimo", "socios": "sócios", "socio": "sócio", "proprio": "próprio",
    "mutuo": "mútuo", "conversivel": "conversível", "inovacao": "inovação",
    "disponivel": "disponível", "simulacao": "simulação", "mes": "mês",
    "deficit": "déficit", "variaveis": "variáveis", "variavel": "variável",
    "liquido": "líquido", "servicos": "serviços", "implantacao": "implantação",
    "migracao": "migração", "contribuicao": "contribuição", "Pro-labore": "Pró-labore",
    "pro-labore": "pró-labore", "Salarios": "Salários", "Depreciacao": "Depreciação",
    "exercicio": "exercício", "Exercicio": "Exercício", "nao": "não",
    "desembolsavel": "desembolsável", "Amortizacao": "Amortização",
    "expansao": "expansão", "tipico": "típico", "media": "média", "Formula": "Fórmula",
    "formula": "fórmula", "Indice": "Índice", "equilibrio": "equilíbrio",
    "recomposicao": "recomposição", "Recomposicao": "Recomposição", "nivel": "nível",
    "periodo": "período", "ja": "já", "prejuizo": "prejuízo", "negocios": "negócios",
    "Construcao": "Construção", "cenarios": "cenários", "Parametro": "Parâmetro",
    "Aquisicao": "Aquisição", "aquisicao": "aquisição", "Preco": "Preço",
    "preco": "preço", "precos": "preços", "unitario": "unitário",
    "unitaria": "unitária", "Aliquota": "Alíquota", "referencia": "referência",
    "tributaria": "tributária", "tributario": "tributário", "presuncao": "presunção",
    "preve": "prevê", "Funcao": "Função", "Remuneracao": "Remuneração",
    "provisoes": "provisões", "Admissao": "Admissão", "Estagio": "Estágio",
    "estagio": "estágio", "senior": "sênior", "Seguranca": "Segurança",
    "seguranca": "segurança", "Informacao": "Informação", "ergonomicas": "ergonômicas",
    "perifericos": "periféricos", "audio": "áudio", "reuniao": "reunião",
    "Constituicao": "Constituição", "alvaras": "alvarás", "Adequacao": "Adequação",
    "politicas": "políticas", "Finalizacao": "Finalização", "videos": "vídeos",
    "Dominios": "Domínios", "licencas": "licenças", "Caucao": "Caução",
    "certificacoes": "certificações", "contingencias": "contingências",
    "estacoes": "estações", "agua": "água", "Servicos": "Serviços",
    "contabeis": "contábeis", "juridica": "jurídica", "escritorio": "escritório",
    "Manutencao": "Manutenção", "inflacao": "inflação", "maximo": "máximo",
    "implicito": "implícito", "Comissoes": "Comissões", "divisao": "divisão",
    "numero": "número", "relacao": "relação", "necessario": "necessário",
    "conversao": "conversão", "unicos": "únicos", "autosservico": "autosserviço",
    "Demonstracoes": "Demonstrações", "calculo": "cálculo", "estudios": "estúdios",
    "autonomos": "autônomos", "atingivel": "atingível", "medio": "médio",
    "Participacao": "Participação", "Penetracao": "Penetração",
    "milhoes": "milhões", "pais": "país", "Descricao": "Descrição",
    "Mes": "Mês", "mao": "mão", "metodologica": "metodológica",
    "acumulo": "acúmulo",
    "Estagiario(a)": "Estagiário(a)", "pre-vendas": "pré-vendas",
    "operacoes": "operações", "Depreciacao": "Depreciação",
}
FRASES = {
    "e desenquadrada": "é desenquadrada",
    "O CAC implícito e o resultado": "O CAC implícito é o resultado",
    "e, por isso,": "e, por isso,",
}


def acentuar(txt):
    import re as _re
    for k in sorted(ACENTOS, key=len, reverse=True):
        txt = _re.sub(r"(?<![\wÀ-ÿ-])" + _re.escape(k) + r"(?![\wÀ-ÿ-])",
                      ACENTOS[k].replace("\\", "\\\\"), txt)
    for k, v in FRASES.items():
        txt = txt.replace(k, v)
    return txt


texto = acentuar("\n".join(out))
base_dir = "/home/user/Faculdade-UMC/Governanca de TI/Plano de Negocio - TreinoLog"
with open(f"{base_dir}/tabelas_financeiras.md", "w", encoding="utf-8") as f:
    f.write(texto)

resumo = dict(
    investimento_fixo=INV_FIXO_TOTAL, investimento_preop=INV_PREOP_TOTAL,
    capital_giro=caixa_min, investimento_total=INV_TOTAL,
    emprestimo=EMPRESTIMO, capital_socios=CAPITAL_SOCIOS, anjo=CAPITAL_ANJO,
    caixa_abertura=CAIXA_ABERTURA,
    parcela_emprestimo=pmt(EMPRESTIMO, JUROS_MES, PRAZO_AMORT) if EMPRESTIMO else 0,
    ano1=anual(real, 1), ano2=anual(real, 2), ano3=anual(real, 3), ano4=anual(real, 4),
    indicadores={k: v for k, v in ind.items() if k != "anual"},
    mes12={k: real[11][k] for k in ("total_clientes", "alunos", "receita", "rec_assin", "fixo_total", "result_liq", "caixa")},
    mes24={k: real[23][k] for k in ("total_clientes", "alunos", "receita", "rec_assin", "fixo_total", "result_liq", "caixa")},
    mes36={k: real[35][k] for k in ("total_clientes", "alunos", "receita", "rec_assin", "fixo_total", "result_liq", "caixa")},
    mes48={k: real[47][k] for k in ("total_clientes", "alunos", "receita", "rec_assin", "fixo_total", "result_liq", "caixa")},
    clientes_mes12=real[11]["clientes"], clientes_mes24=real[23]["clientes"],
    clientes_mes36=real[35]["clientes"], clientes_mes48=real[47]["clientes"],
    pessimista={k: v for k, v in ind_p.items() if k != "anual"},
    otimista={k: v for k, v in ind_o.items() if k != "anual"},
    pess_ano3=ind_p["anual"][3], otim_ano3=ind_o["anual"][3],
    funil={"m12": f12, "m24": f24, "m36": f36},
    cac=cac_por_ano, mix_m36=real[35]["clientes"],
    parcela=pmt(EMPRESTIMO, JUROS_MES, PRAZO_AMORT) if EMPRESTIMO else 0.0,
)
with open(f"{base_dir}/resultados.json", "w", encoding="utf-8") as f:
    json.dump(resumo, f, ensure_ascii=False, indent=2, default=float)

print("=== RESUMO ===")
print(f"Investimento fixo........ R$ {br(INV_FIXO_TOTAL)}")
print(f"Pre-operacional.......... R$ {br(INV_PREOP_TOTAL)}")
print(f"Capital de giro.......... R$ {br(caixa_min)}")
print(f"INVESTIMENTO TOTAL....... R$ {br(INV_TOTAL)}")
print(f"Fontes: socios {br(CAPITAL_SOCIOS)} | anjo {br(CAPITAL_ANJO)} | emprestimo {br(EMPRESTIMO)} = {br(FONTES_TOTAL)}")
print(f"Caixa na abertura........ R$ {br(CAIXA_ABERTURA)}")
print(f"Menor saldo de caixa..... R$ {br(ind['caixa_min_atingido'])} (mes de maior aperto)")
for y in (1, 2, 3, 4):
    a = anual(real, y)
    print(f"Ano {y}: receita {br(a['receita'],0)} | MC {br(a['margem_contrib'],0)} | "
          f"fixos {br(a['fixo_total'],0)} | liquido {br(a['result_liq'],0)} | "
          f"caixa final {br(a['caixa_final'],0)} | clientes {a['clientes_final']:.0f} | MRR dez {br(a['mrr_final'],0)}")
print(f"Breakeven contabil: mes {ind['breakeven_mes']} | fluxo positivo: mes {ind['fc_breakeven_mes']}")
print(f"Payback: {ind['payback_meses']} meses | recomposicao mes {ind['recomposicao_mes']} | Lucratividade {pct(ind['lucratividade'])} | "
      f"Rentabilidade {pct(ind['rentabilidade'])} | PE R$ {br(ind['pe_valor'],0)}/mes | IMC {pct(ind['imc'])}")
print(f"PESSIMISTA: caixa min {br(ind_p['caixa_min_atingido'],0)} | ano3 liquido {br(ind_p['anual'][3]['result_liq'],0)} | payback {ind_p['payback_meses']}")
print(f"OTIMISTA:   caixa min {br(ind_o['caixa_min_atingido'],0)} | ano3 liquido {br(ind_o['anual'][3]['result_liq'],0)} | payback {ind_o['payback_meses']}")
