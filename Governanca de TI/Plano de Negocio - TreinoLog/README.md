# Plano de Negócios — TreinoLog (Governança de TI, UMC)

Entrega da **Tarefa 1 — Elaboração de Plano de Negócios** (metodologia Sebrae / plataforma PNBOX).
Empresa fictícia: **TreinoLog Tecnologia Ltda.**, plataforma SaaS de prescrição, acompanhamento e
retenção para profissionais de educação física, estúdios e academias de pequeno e médio porte.

O negócio foi construído sobre o protótipo `diariotreino` deste repositório (Java 17 + Spring Boot +
Spring Security/BCrypt + MySQL), tratado no plano como o MVP da empresa.

## Arquivos

| Arquivo | O que é |
|---|---|
| `Plano de Negocios - TreinoLog.pdf` | **Entrega final** — 37 páginas, com capa, todas as seções exigidas e 18 quadros financeiros |
| `plano_de_negocios.md` | Documento montado em Markdown (gerado; não editar à mão) |
| `plano_de_negocios.template.md` | Texto-fonte do plano, com marcadores `{{...}}` — **é aqui que se edita o conteúdo** |
| `modelo_financeiro.py` | Modelo financeiro de 48 meses: investimentos, custos, DRE, fluxo de caixa, indicadores e cenários |
| `tabelas_financeiras.md` | Os 18 quadros financeiros (gerado por `modelo_financeiro.py`) |
| `resultados.json` | Resultados do modelo em formato estruturado (gerado) |
| `montar_plano.py` | Injeta quadros e números do modelo no template |
| `gerar_pdf.py` | Converte o Markdown final em PDF paginado (reportlab) |

## Como regerar tudo

```bash
pip install reportlab
python3 modelo_financeiro.py   # recalcula os quadros financeiros
python3 montar_plano.py        # monta plano_de_negocios.md
python3 gerar_pdf.py           # gera o PDF final
```

Qualquer premissa alterada em `modelo_financeiro.py` (preço, churn, curva de aquisição, salários,
impostos) recalcula automaticamente **todos** os quadros e também os números citados no texto — o
documento nunca fica inconsistente com a planilha.

## Antes de entregar

1. **Preencher os nomes e RAs do grupo** — no `plano_de_negocios.template.md` procure por `«` e
   substitua os quatro integrantes (capa e seção 1.2); depois rode `montar_plano.py` e `gerar_pdf.py`.
2. **Transcrever no PNBOX** (https://pnbox.sebrae.com.br) — o **Apêndice A** do plano mapeia cada uma
   das 14 ferramentas da plataforma para a seção correspondente deste documento, na ordem sugerida de
   preenchimento. A avaliação prioriza **completude**: nenhum campo deve ficar vazio.
3. **Gerar o PDF pela própria plataforma** e anexá-lo à entrega. Este PDF serve como documento-base e
   como anexo complementar (memória de cálculo).

## Números-chave do plano

| Indicador | Valor |
|---|---|
| Investimento total | R$ 391.940 (fixo R$ 51.840 + pré-operacional R$ 55.100 + giro R$ 285.000) |
| Fontes | Sócios R$ 120.000 + investidor-anjo R$ 215.000 + financiamento R$ 60.000 |
| Receita Ano 1 / Ano 3 | R$ 257.397 / R$ 2.774.088 |
| Resultado líquido Ano 1 / Ano 3 | −R$ 185.269 / +R$ 434.562 |
| Clientes ativos mês 12 / 36 | 326 / 1.860 |
| Equilíbrio operacional | mês 18 (fluxo de caixa positivo no mês 19) |
| Ponto de equilíbrio (mês típico) | R$ 199.649/mês |
| Lucratividade / payback | 17,0% / mês 32 |
