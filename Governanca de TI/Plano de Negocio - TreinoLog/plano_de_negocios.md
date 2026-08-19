# TreinoLog

## Plano de Negócios

**Plataforma de prescrição, acompanhamento e retenção para profissionais de educação física, estúdios e academias de pequeno e médio porte**

---

**Universidade de Mogi das Cruzes — UMC**

**Disciplina:** Governança de TI

**Atividade:** Tarefa 1 — Elaboração de Plano de Negócios (metodologia Sebrae / plataforma PNBOX)

**Data de entrega:** setembro de 2026

**Grupo:**

| # | Integrante | RA | Papel assumido na empresa fictícia |
|---|---|---|---|
| 1 | «nome do integrante 1» | «RA» | CEO — Direção Comercial e de Relacionamento |
| 2 | «nome do integrante 2» | «RA» | CTO — Direção de Tecnologia e Dados |
| 3 | «nome do integrante 3» | «RA» | COO — Direção de Operações e Sucesso do Cliente |
| 4 | «nome do integrante 4» | «RA» | CPO — Direção de Produto e Experiência |

> **Aviso.** A TreinoLog Tecnologia Ltda. é uma **empresa fictícia**, criada exclusivamente para fins
> acadêmicos. CNPJ, endereço, valores de investimento e projeções são simulações elaboradas pelo grupo.
> Os dados de mercado citados são estimativas de fontes secundárias, listadas no Apêndice C.

---

## Sumário

1. Sumário Executivo
2. Problema e Solução (Proposta de Valor)
3. Análise de Mercado
4. Plano de Marketing
5. Plano Operacional
6. Plano Financeiro
7. Análise Estratégica
8. Avaliação do Plano de Negócio
- Apêndice A — Mapeamento das seções nas 14 ferramentas do PNBOX
- Apêndice B — Premissas e metodologia do modelo financeiro
- Apêndice C — Referências

---

# 1. Sumário Executivo

## 1.1 Resumo dos principais pontos do negócio

A **TreinoLog** é uma empresa de tecnologia (SaaS — *software as a service*) que oferece uma plataforma
web e móvel para **prescrição de treino, acompanhamento do aluno e retenção de clientes** em academias
de pequeno e médio porte, estúdios de treinamento, assessorias esportivas e para profissionais de
educação física autônomos.

O negócio nasce de um problema observado no dia a dia do setor: a maior parte dos profissionais de
educação física ainda gerencia fichas de treino em **papel, planilhas e mensagens de WhatsApp**. O
resultado é retrabalho, perda do histórico de evolução do aluno, ausência de dados para embasar
decisões e — principal consequência econômica — **evasão de alunos** que o gestor só percebe quando a
mensalidade deixa de ser paga.

A TreinoLog resolve esse problema com três entregas combinadas: (a) um **painel do profissional** para
montar e versionar fichas de treino em minutos; (b) um **aplicativo do aluno** (PWA) que registra
cargas, séries e percepção de esforço, funcionando mesmo com sinal instável dentro da academia; e (c)
um **motor de retenção** que calcula o Índice de Risco de Evasão (IRE) de cada aluno a partir da
aderência ao treino e entrega ao gestor uma lista priorizada de quem precisa ser contatado hoje.

O plano prevê início de operação em **janeiro de 2027**, com investimento total de
**R$ 391.940,00**, equilíbrio operacional no **mês 18**, fluxo de caixa positivo no **mês 19** e
recomposição integral do caixa investido no **mês 32**. No Ano 3, a projeção é de
**R$ 2.774.088 de receita bruta**, **1.860 clientes ativos** e lucratividade de
**17,0%** no mês típico.

| Indicador-síntese | Ano 1 (2027) | Ano 2 (2028) | Ano 3 (2029) |
|---|---:|---:|---:|
| Receita bruta (R$) | 257.397 | 1.226.009 | 2.774.088 |
| Resultado líquido (R$) | -185.269 | 48.182 | 434.562 |
| Clientes ativos em dezembro | 326 | 997 | 1.860 |
| Receita recorrente mensal (MRR) em dezembro (R$) | 39.213 | 131.955 | 269.950 |
| Alunos ativos atendidos na plataforma | 18.488 | 60.125 | 119.747 |

## 1.2 Dados dos empreendedores, experiência e atribuições

A sociedade é formada por quatro sócios-fundadores, estudantes de Tecnologia da Informação da UMC, que
desenvolveram em conjunto o protótipo funcional que dá origem ao produto (aplicação Java/Spring Boot
com perfis de administrador e aluno, cadastro de fichas de treino e biblioteca de exercícios).

| Sócio | Nome | Formação e experiência | Atribuições na empresa | Participação |
|---|---|---|---|---|
| 1 | «integrante 1» | TI (UMC); experiência em atendimento e vendas | **CEO**: estratégia, relacionamento com academias e redes, captação de investimento, parcerias com CREF/faculdades, gestão financeira | 25% |
| 2 | «integrante 2» | TI (UMC); desenvolvimento Java/Spring Boot e banco de dados | **CTO**: arquitetura, back-end, banco de dados, infraestrutura em nuvem, segurança da informação e LGPD (encarregado técnico) | 25% |
| 3 | «integrante 3» | TI (UMC); processos e suporte | **COO**: implantação de clientes, suporte, sucesso do cliente, processos operacionais, indicadores de serviço | 25% |
| 4 | «integrante 4» | TI (UMC); front-end e experiência do usuário | **CPO**: descoberta de produto, UX/UI, front-end, roadmap, quadro de experimentação | 25% |

Nenhum sócio recebe salário como empregado: a remuneração se dá por **pró-labore**, iniciando em
R$ 3.500 por sócio e evoluindo conforme a geração de caixa (Quadro 11). O acordo de sócios prevê
**vesting de 4 anos com cliff de 12 meses**, dedicação mínima acordada e cláusula de saída, para
mitigar o risco de descontinuidade.

## 1.3 Dados do empreendimento

| Item | Descrição |
|---|---|
| Razão social | TreinoLog Tecnologia Ltda. |
| Nome fantasia | TreinoLog |
| CNPJ | 61.204.877/0001-45 *(fictício)* |
| Endereço da sede | Coworking corporativo — Centro, Mogi das Cruzes/SP *(endereço fictício)* |
| Início das atividades | Janeiro de 2027 |
| Site / aplicativo | app.treinolog.com.br *(fictício)* |
| Porte | Empresa de Pequeno Porte (EPP) |
| Modelo de operação | Digital, com atendimento remoto em todo o território nacional |

## 1.4 Missão, visão e valores

**Missão.** Levar tecnologia simples e acessível de prescrição e acompanhamento de treino a profissionais
de educação física e academias de pequeno porte, transformando dados de treino em resultado para o aluno
e em retenção para o negócio.

**Visão.** Ser, até 2032, a plataforma de referência em gestão de treino e retenção de alunos entre as
academias e estúdios de pequeno e médio porte do Brasil, presente em 10 mil estabelecimentos.

**Valores.**

| Valor | Como se traduz na prática |
|---|---|
| O resultado do aluno no centro | Toda funcionalidade precisa responder: isso ajuda o aluno a treinar melhor? |
| Simplicidade radical | Primeira ficha publicada em menos de 10 minutos, sem treinamento obrigatório |
| Privacidade por concepção | Dado de saúde é dado sensível: LGPD *by design*, consentimento e trilha de auditoria |
| Transparência e governança | Preço público, sem multa de fidelidade, portabilidade de dados garantida |
| Parceria com o profissional | A plataforma sugere, o profissional registrado no CREF decide e assina |
| Aprender experimentando | Nenhuma hipótese relevante vai a produção sem experimento e métrica definida |

## 1.5 Setores de atividade e códigos CNAE

Atuação principal em **Tecnologia da Informação (serviços digitais)**, com aplicação no segmento de
**saúde, esporte e bem-estar**.

| CNAE | Descrição | Uso |
|---|---|---|
| 6203-1/00 | Desenvolvimento e licenciamento de programas de computador não customizáveis | Principal — assinaturas SaaS |
| 6202-3/00 | Desenvolvimento e licenciamento de programas customizáveis | Secundário — plano Rede e *white-label* |
| 6209-1/00 | Suporte técnico, manutenção e outros serviços em TI | Secundário — implantação e suporte |
| 6311-9/00 | Tratamento de dados, provedores de serviços de aplicação e hospedagem | Secundário — hospedagem da aplicação |
| 8599-6/04 | Treinamento em desenvolvimento profissional e gerencial | Secundário — capacitação de equipes de clientes |

## 1.6 Forma jurídica

**Sociedade Empresária Limitada (Ltda.)**, com quatro sócios e quotas iguais (25% cada). A escolha se
justifica por: (i) separação entre patrimônio pessoal e da empresa; (ii) flexibilidade para entrada de
investidor via mútuo conversível em participação; (iii) custo de constituição e manutenção compatível
com o porte; e (iv) exigência de pessoa jurídica para contratar com academias e redes.

## 1.7 Enquadramento tributário

Opção pelo **Simples Nacional — Anexo III**, aplicável ao licenciamento de software quando o **Fator R**
(folha de pagamento, incluindo pró-labore, sobre a receita bruta dos 12 meses) é **igual ou superior a
28%**. Como a folha da TreinoLog é o principal custo, a condição é atendida com folga em todo o
horizonte projetado, o que evita a tributação mais onerosa do Anexo V.

A alíquota efetiva parte de 6% na primeira faixa e evolui com a receita acumulada. No **Ano 4**, a
receita projetada supera o teto de R$ 4,8 milhões, o que provoca o **desenquadramento do Simples** e a
migração para o **Lucro Presumido** — evento já previsto e provisionado no plano (Quadro 10.1), com
estudo de planejamento tributário programado para o Ano 3.

## 1.8 Capital social e fontes de recursos

O capital social é de **R$ 120.000,00**, dividido em 120.000 quotas de R$ 1,00, integralizado em duas
parcelas pelos quatro sócios (R$ 30.000 cada). O restante do investimento vem de **investidor-anjo**
(contrato de mútuo conversível, sem diluição imediata) e de **linha de crédito para inovação**
vinculada à aquisição dos ativos. A composição completa está no Quadro 3.

## 1.9 Objetivos do negócio

| # | Objetivo (SMART) | Prazo | Métrica de verificação |
|---|---|---|---|
| O1 | Lançar a versão comercial com onboarding 100% autosserviço | Mês 1 | Cliente ativa a conta e publica ficha sem contato humano |
| O2 | Alcançar 326 clientes pagantes e R$ 39.213 de MRR | Mês 12 | Relatório de assinaturas |
| O3 | Manter churn mensal ≤ 4,0% (Solo) e ≤ 1,5% (Studio) | Mensal | Painel de retenção |
| O4 | Atingir resultado líquido positivo | Mês 18 | DRE mensal |
| O5 | Manter NPS ≥ 60 e CSAT ≥ 4,5/5,0 | A partir do mês 9 | Pesquisa trimestral e pós-atendimento |
| O6 | Sustentar disponibilidade ≥ 99,5% e MTTR ≤ 4 horas | Mensal | Monitoramento e registro de incidentes |
| O7 | Recompor integralmente o caixa investido | Mês 32 | Fluxo de caixa acumulado |
| O8 | Alcançar R$ 2.774.088 de receita e 1.860 clientes | Ano 3 | DRE anual |
| O9 | Responder 100% das solicitações de titulares (LGPD) em até 15 dias | Mensal | Registro do encarregado de dados |

## 1.10 Produtos e serviços — visão geral

| Linha | O que é | Modelo de receita |
|---|---|---|
| Assinatura da plataforma | Planos Solo, Pro, Studio e Rede, por número de alunos ativos e de profissionais | Recorrente mensal (MRR) |
| Implantação assistida | Configuração, importação da base e treinamento (planos Studio e Rede) | Pontual, na contratação |
| Migração de base | Digitalização de fichas em papel/planilhas com OCR assistido | Pontual, opcional |
| Integrações e API | Conexão com ERP financeiro, catraca e WhatsApp; *white-label* no plano Rede | Incluída no plano Rede |

## 1.11 Diferencial competitivo — visão geral

1. **Motor de retenção (IRE)** — o concorrente entrega prescrição; a TreinoLog entrega *quem vai sair
   da academia e o que fazer a respeito*.
2. **Experiência dupla e offline-first** — profissional e aluno na mesma base, com PWA que funciona
   com sinal ruim no ambiente da academia.
3. **Governança e conformidade** — trilha de auditoria da prescrição com registro do profissional
   responsável (CREF), consentimento do titular e portabilidade de dados.
4. **Time-to-value curto** — primeira ficha publicada em menos de 10 minutos; importação de fichas
   antigas sem digitação manual.
5. **Preço transparente e sem fidelidade** — sem taxa de implantação nos planos de entrada e sem multa
   de rescisão, reduzindo a barreira de experimentação.
6. **Extensibilidade** — API pública e *webhooks*, permitindo que redes integrem a plataforma ao seu
   ecossistema (ERP, catraca, CRM).

---

# 2. Problema e Solução (Proposta de Valor)

## 2.1 O problema

| Dimensão | Situação atual do profissional / estabelecimento | Consequência |
|---|---|---|
| Prescrição | Fichas em papel, cadernos, planilhas e PDFs enviados por WhatsApp | Retrabalho a cada renovação de treino; versões conflitantes |
| Histórico | Evolução de carga registrada de memória ou não registrada | Impossível demonstrar progresso — principal motivo de desmotivação |
| Retenção | O gestor descobre a evasão pela inadimplência | Perda de receita recorrente e custo de reposição do aluno |
| Gestão | Nenhum indicador de aderência por aluno, professor ou horário | Decisões por intuição; ociosidade não identificada |
| Conformidade | Dado de saúde (anamnese, lesões, medidas) em planilhas e celulares pessoais | Exposição a incidentes e a sanções da LGPD |
| Responsabilidade técnica | Prescrição sem registro de autoria e data | Fragilidade em caso de questionamento técnico ou judicial |

**Por que o problema persiste.** As soluções existentes se dividem entre (a) aplicativos muito baratos
voltados ao personal autônomo, que não atendem à operação de um estúdio com vários professores, e
(b) sistemas de gestão de academia (ERP: matrícula, financeiro, catraca), em que o treino é um módulo
secundário. Entre os dois extremos fica desatendido o segmento que mais cresce — **estúdios e academias
de pequeno e médio porte e assessorias esportivas** —, que precisa de prescrição colaborativa,
acompanhamento do aluno e informação de retenção, sem o preço e a complexidade de um ERP completo.

## 2.2 A solução

A TreinoLog é uma plataforma única com três frentes de valor:

**a) Painel do profissional (web).** Cadastro de alunos, montagem de fichas por dia da semana,
biblioteca de exercícios com vídeo, cópia e versionamento de treinos, periodização, anamnese digital,
avaliação física, agenda e relatórios de aderência. Vários professores atuam sobre a mesma base, com
permissões distintas e registro de autoria.

**b) Aplicativo do aluno (PWA).** Ficha do dia, execução guiada com vídeo, registro de séries, cargas e
percepção de esforço, histórico de evolução, fotos de progresso e comunicação com o professor.
Funciona como aplicativo instalável, com cache local para operar em áreas de sinal fraco e sincronizar
depois.

**c) Motor de retenção (IRE).** A partir da frequência de registro, do intervalo entre treinos, da
conclusão das séries prescritas e da evolução de carga, o sistema calcula o **Índice de Risco de
Evasão** de cada aluno, classifica a base em faixas de risco e entrega ao gestor uma fila de ação
diária, com mensagens sugeridas e registro do contato realizado.

## 2.3 Canvas da proposta de valor

| Segmento | Dores | Ganhos esperados | Como a TreinoLog entrega |
|---|---|---|---|
| Personal autônomo | Tempo gasto montando ficha; aluno "desaparece"; imagem amadora | Mais alunos atendidos por hora; aparência profissional | Modelos de treino reutilizáveis; app com sua marca; lembretes automáticos |
| Estúdio / academia pequena | Evasão silenciosa; padrão de treino desigual entre professores; retrabalho | Retenção maior; padronização; controle | IRE com fila de ação; biblioteca institucional; permissões e auditoria |
| Assessoria / rede | Falta de padronização entre unidades; ausência de dados consolidados; integração | Escala com controle; relatórios por unidade | Multiunidade, API, SSO, *white-label*, painéis comparativos |
| Aluno (usuário final) | Não sabe se está evoluindo; esquece a execução correta | Clareza e motivação | Histórico visual de evolução; vídeo do exercício; treino no bolso |

**Declaração de posicionamento.** *Para estúdios e academias de pequeno e médio porte que perdem alunos
sem perceber, a TreinoLog é a plataforma de treino que transforma o registro do aluno em alerta de
retenção — diferente dos aplicativos de prescrição, que param na entrega da ficha, e dos ERPs de
academia, em que o treino é um módulo acessório.*

## 2.4 Quadro de experimentação

Nenhuma hipótese crítica é assumida como verdadeira sem experimento. Este quadro é revisado a cada
ciclo de duas semanas pelo comitê de produto.

| # | Hipótese | Experimento | Métrica | Critério de sucesso | Prazo | Custo (R$) |
|---|---|---|---|---|---|---|
| H1 | O estúdio percebe valor no IRE e paga por ele | Piloto gratuito de 60 dias em 10 estúdios do Alto Tietê | Conversão em plano pago ao fim do piloto | ≥ 5 de 10 convertem | Meses 1–3 | 2.500 |
| H2 | O aluno registra o treino de forma consistente | Medir registros/semana na base piloto | % de alunos com ≥ 2 registros/semana | ≥ 55% na 4ª semana | Meses 1–2 | 0 (dentro do piloto) |
| H3 | O onboarding autosserviço dispensa suporte humano | Liberar cadastro público e medir ativação | % que publica 1ª ficha em < 10 min sem contato | ≥ 60% | Meses 2–4 | 1.800 |
| H4 | Uma dupla SDR + closer sustenta 16 fechamentos/mês | Operar 3 meses com metas e registro no CRM | Fechamentos/mês por dupla | ≥ 14/mês na média trimestral | Meses 18–21 | 0 (folha já prevista) |
| H5 | Parcerias com cursos de educação física geram leads baratos | Convênio com 3 instituições e 1 regional do CREF | CAC do canal parceria | ≤ R$ 120 por cliente | Meses 4–9 | 3.400 |
| H6 | O IRE prevê evasão melhor que a intuição do gestor | Comparar previsão do modelo com evasão real observada | Acurácia e recall em 90 dias | Recall ≥ 70% | Meses 9–15 | 4.200 |
| H7 | Redes aceitam pagar por *white-label* e API | Prospecção ativa de 20 redes regionais | Propostas fechadas no plano Rede | ≥ 4 no Ano 2 | Meses 13–24 | 6.000 |

---

# 3. Análise de Mercado

## 3.1 Panorama e dimensionamento

O Brasil é um dos maiores mercados de fitness do mundo. Estimativas setoriais indicam
**41.332 academias ativas e 13,65 milhões de alunos** (penetração de cerca de 7% da população), e o
Conselho Federal de Educação Física registra **59.891 empresas ativas** no segmento de atividades
físicas, contra 21.541 em 2014. O faturamento do setor é estimado entre **R$ 17 e R$ 20 bilhões por
ano** (fontes no Apêndice C).

Esse mercado é **pulverizado**: a maior parte dos estabelecimentos é de pequeno porte, com gestão
familiar e baixa informatização da área técnica — exatamente o perfil que a TreinoLog atende.

## Quadro 16 - Dimensionamento do mercado (TAM / SAM / SOM)

| Medida | Base de cálculo | Valor (R$/ano) |
|---|---|---:|
| TAM - academias e estúdios | 41.332 estabelecimentos x R$ 4.198,80 (plano Studio anual) | 173.544.802 |
| TAM - profissionais autônomos | 200.000 profissionais x R$ 898,80 (média Solo/Pro anual) | 179.760.000 |
| **TAM total (Brasil)** | soma das linhas anteriores | **353.304.802** |
| **SAM (mercado atingível)** | 45% do TAM: Sudeste/Sul + estabelecimentos de pequeno e médio porte | **158.987.161** |
| **SOM (meta do Ano 3)** | receita projetada para o Ano 3 | **2.774.088** |
| Participação no SAM no Ano 3 | receita do Ano 3 / SAM | 1,74% |
| Participação no SAM no Ano 4 | receita do Ano 4 / SAM | 3,10% |
| Penetração em estabelecimentos (mês 36) | clientes Studio + Rede / 41.332 academias | 0,82% |
| Alunos atendidos na plataforma (mês 36) | base instalada / 13,65 milhões de alunos do país | 0,88% |


A leitura do quadro é deliberadamente conservadora: a meta do Ano 3 representa **1,74% do mercado
atingível**, com presença em **0,82% dos estabelecimentos** do país. O plano não depende, portanto, de
liderança de mercado — apenas de execução consistente em um nicho.

## 3.2 Estudo dos clientes

### 3.2.1 Segmentação

| Segmento | Perfil | Tamanho estimado | Plano-alvo | Ticket mensal | Canal |
|---|---|---|---|---|---|
| S1 — Personal autônomo iniciante | Até 20 alunos, atende em academia de terceiros ou domicílio | Muito grande | Solo | R$ 49,90 | Autosserviço |
| S2 — Personal consolidado / consultoria online | 20 a 60 alunos, marca própria | Grande | Pro | R$ 99,90 | Autosserviço + indicação |
| S3 — Estúdio / academia de bairro | 80 a 300 alunos, 3 a 6 professores | Médio | Studio | R$ 349,90 | Vendas assistidas |
| S4 — Rede regional / assessoria esportiva | 2 a 6 unidades, 300 a 1.500 alunos | Pequeno | Rede | R$ 1.190,00 | Venda consultiva |

### 3.2.2 Personas

**Persona 1 — Rafael, 29 anos, personal trainer autônomo (S1/S2).**
Atende 22 alunos em duas academias e três atendimentos em domicílio. Monta ficha em planilha e envia
PDF por WhatsApp; perde tempo refazendo treinos parecidos e não consegue provar evolução ao aluno.
Ganha cerca de R$ 5.000/mês e é sensível a preço, mas paga por algo que o faça parecer profissional.
*Critério de decisão:* testar sem cartão, resolver em uma tarde, custar menos que uma hora de aula.

**Persona 2 — Camila, 38 anos, sócia-proprietária de estúdio de treinamento funcional (S3).**
180 alunos, 5 professores, faturamento de R$ 48 mil/mês. Sua dor é evasão: perde 8 a 12 alunos por mês
e só descobre no vencimento. Não consegue garantir que os professores sigam um padrão técnico.
*Critério de decisão:* retorno claro — se a plataforma evitar 2 cancelamentos por mês, já se pagou.

**Persona 3 — Marcos, 45 anos, gestor de rede regional com 4 unidades (S4).**
950 alunos, ERP financeiro e catraca já instalados. Precisa padronizar o método entre unidades,
comparar desempenho e integrar sistemas, sem trocar o ERP.
*Critério de decisão:* integração via API, contrato com SLA, segurança da informação e LGPD.

**Persona 4 — Bruno, 34 anos, aluno (usuário final, não pagante).**
Treina 3 vezes por semana, esquece a execução dos exercícios e desanima sem ver resultado. É o usuário
que determina o valor percebido pelo cliente pagante — e o principal vetor de indicação.

### 3.2.3 Jornada do cliente

| Etapa | O que o cliente faz | Ponto de contato | Risco de perda | Ação da TreinoLog | Métrica |
|---|---|---|---|---|---|
| Descoberta | Busca "app para prescrição de treino"; vê conteúdo ou indicação | Blog/SEO, redes sociais, parceria com CREF e faculdades | Não nos encontra | Conteúdo técnico e programa de indicação | Visitantes, origem do lead |
| Consideração | Compara preço e funcionalidades | Página de planos, comparativo, avaliações | Acha caro/complexo | Preço público e demonstração de 3 min | Taxa visitante→lead |
| Experimentação | Cria conta e testa 14 dias | Onboarding autosserviço, modelos prontos | Não chega ao primeiro valor | Assistente de primeira ficha em 10 min | Taxa de ativação |
| Compra | Escolhe plano e cadastra pagamento | Checkout, PIX/cartão | Fricção no pagamento | Sem fidelidade, cancelamento em 1 clique | Taxa trial→pago |
| Implantação | Importa base e treina a equipe | Migração assistida (Studio/Rede) | Abandono na migração | OCR de fichas antigas e sessão guiada | Tempo até 100% da base migrada |
| Uso e valor | Prescreve, acompanha, age sobre o IRE | Painel, app do aluno, e-mail semanal | Uso cai e o valor desaparece | Relatório semanal e fila de ação | Alunos ativos, aderência |
| Expansão | Adiciona professores/unidades | Upgrade dentro do produto | Teto do plano | Upgrade proporcional automático | Receita de expansão (NRR) |
| Renovação / defesa | Renova e indica | Pesquisa NPS, programa de indicação | Concorrente ou corte de custo | Revisão trimestral de resultado | Churn, NPS, indicações |

## 3.3 Estudo dos concorrentes

| Concorrente | Público principal | Preço de referência | Forças | Fraquezas | Como a TreinoLog se posiciona |
|---|---|---|---|---|---|
| MFIT Personal | Personal autônomo | A partir de ~R$ 9,90/mês | Base muito grande de profissionais; marca conhecida; preço agressivo | Foco no autônomo; pouca gestão multiprofissional; retenção não é o núcleo | Não competir por preço no S1; ganhar em S3/S4 com IRE e governança |
| Tecnofit | Academias e personais | Camada gratuita + planos por porte | Solução ampla de gestão; biblioteca de exercícios com vídeo | Treino compete com módulos administrativos; complexidade no estúdio pequeno | Foco no técnico-pedagógico e na retenção, integrando ao ERP existente |
| Pacto Soluções | Academias pequenas e médias | Mensalidade por porte | Presença consolidada; controle de acesso e financeiro | Módulo de treino menos aprofundado; implantação mais longa | Coexistir via API em vez de substituir o ERP |
| PersonalGO | Personal autônomo | R$ 79,90/mês (≈ R$ 49,90 anual) | Camada gratuita robusta; boa experiência | Pouca aderência a operação multiprofessor | Competir com o plano Pro em funcionalidade, não em preço |
| TreinoAI | Personal autônomo | A partir de ~R$ 10,90/mês | Geração de treino assistida por IA; entrada barata | Confiabilidade técnica e responsabilidade profissional | IA como sugestão ao profissional, com registro de autoria e CREF |
| NextFit / Mobitrainer | Estúdios e academias | Mensalidade por porte | Gestão completa; agendamento de turmas | Treino secundário; custo maior para o estúdio pequeno | Preço intermediário com profundidade técnica |
| **Planilha + WhatsApp** (concorrente real) | Todos os segmentos | R$ 0 | Custo zero, domínio total, nenhuma curva de aprendizado | Sem histórico, sem retenção, sem conformidade | Migração sem digitação (OCR) e ganho mensurável de retenção |

**Conclusão da análise.** A concorrência é intensa e barata na ponta do profissional autônomo — razão
pela qual os planos Solo e Pro existem como **porta de entrada e canal de aquisição** (o professor traz
o estúdio onde trabalha), não como principal fonte de margem. A rentabilidade do plano vem de S3 e S4,
onde o concorrente direto é o ERP de academia, que não resolve o problema técnico-pedagógico, e onde
o custo de troca é alto — a favor de quem já detém o histórico de treino.

## 3.4 Estudo dos fornecedores

| Fornecedor / insumo | Papel | Critério de escolha | Custo estimado | Risco de dependência | Mitigação |
|---|---|---|---|---|---|
| Provedor de nuvem (AWS ou GCP) | Hospedagem, banco, armazenamento, CDN | Presença no Brasil, crédito para *startups*, conformidade | R$ 1.200/mês + R$ 0,27 por aluno ativo | Alto | Aplicação em contêineres, dados em PostgreSQL/MySQL padrão, portabilidade testada anualmente |
| Gateway de pagamento e cobrança recorrente | Assinaturas, PIX, cartão, régua de cobrança | Taxa, taxa de aprovação, antifraude | 3,29% + R$ 0,49 por cobrança | Médio | Segundo provedor homologado como reserva |
| WhatsApp Business API (via BSP) | Notificações e reengajamento | Custo por conversa, estabilidade | Incluído no custo por aluno ativo | Médio | Fallback para e-mail e *push* do PWA |
| Biblioteca de vídeos de exercícios | Acervo demonstrativo | Licenciamento, qualidade, cobertura | R$ 9.800 (pré-operacional) + atualizações | Médio | Produção própria progressiva com professores parceiros |
| Ferramentas de engenharia (GitHub, CI/CD, observabilidade, design) | Desenvolvimento e operação | Custo por usuário, integração | R$ 980/mês (Ano 1) | Baixo | Alternativas abertas equivalentes |
| CRM e automação de marketing | Funil e relacionamento | Integração, custo por contato | Incluído nas ferramentas SaaS | Baixo | Exportação periódica da base |
| Escritório de contabilidade | Fiscal, folha, Simples Nacional | Experiência com SaaS e Fator R | R$ 690/mês | Baixo | Contrato mensal, substituível |
| Assessoria jurídica e DPO como serviço | LGPD, contratos, marca | Especialização em tecnologia | R$ 450/mês + R$ 5.400 de setup | Baixo | Conhecimento documentado internamente |
| Coworking corporativo | Estrutura física | Custo, localização, sala de reunião | R$ 1.900/mês | Baixo | Contrato mensal, operação híbrida |
| Fornecedor de equipamentos | Notebooks, monitores, celulares de teste | Garantia, prazo, preço | R$ 51.840 (investimento fixo) | Baixo | Três cotações por compra |

## 3.5 Tendências de mercado

| # | Tendência | Efeito sobre o negócio |
|---|---|---|
| 1 | Digitalização acelerada de academias de pequeno porte | Amplia a base disposta a assinar software (favorável) |
| 2 | Consultoria online e modelos híbridos de treino | Aumenta a demanda por acompanhamento remoto (favorável) |
| 3 | IA aplicada à periodização e à predição de comportamento | Valida o IRE, mas reduz barreiras de entrada (ambíguo) |
| 4 | Wearables e integração com Health Connect / HealthKit | Novas fontes de dado de aderência (favorável) |
| 5 | Crescimento da base de alunos impulsionado por saúde e medicamentos GLP-1 | Perfil que exige acompanhamento próximo (favorável) |
| 6 | Fitness como benefício corporativo (Wellhub, TotalPass) | Aumenta o fluxo de alunos nas academias parceiras (favorável) |
| 7 | Rigor crescente na proteção de dado sensível de saúde | Conformidade como diferencial competitivo (favorável) |
| 8 | Consolidação e aquisições entre plataformas | Pressão competitiva e possível rota de saída (ambíguo) |
| 9 | Envelhecimento populacional e treino orientado à saúde | Prescrição individualizada e registro ganham peso (favorável) |
| 10 | Guerra de preços na camada de entrada do mercado | Comprime margem em S1/S2 (desfavorável) |

## 3.6 Oportunidades e ameaças

**Oportunidades.** (1) Segmento de estúdios e academias pequenas mal atendido entre aplicativos baratos e
ERPs completos; (2) retenção como dor economicamente mensurável, que facilita a venda por retorno;
(3) parcerias com cursos de educação física e conselhos regionais como canal de baixo custo;
(4) coexistência com ERPs via API, ampliando o mercado em vez de disputá-lo; (5) exigência de
conformidade em LGPD favorecendo fornecedores preparados; (6) protótipo já desenvolvido, reduzindo
tempo e custo até o lançamento.

**Ameaças.** (1) Concorrentes com base instalada e preço muito baixo; (2) entrada de ERP consolidado no
nicho de treino; (3) elevação do CAC com a saturação dos canais digitais; (4) incidente de segurança
com dado sensível; (5) dependência de fornecedores de nuvem e pagamento; (6) retração econômica
afetando academias de bairro; (7) mudanças regulatórias no exercício profissional ou no tratamento de
dados de saúde.

---

# 4. Plano de Marketing

## 4.1 Estratégia de produto

O produto é organizado em quatro planos, com escada de valor clara: o profissional entra no plano de
entrada, cresce para o Pro e, quando passa a atuar em estúdio, leva a plataforma para dentro do
estabelecimento (movimento *bottom-up* que reduz o custo de aquisição do segmento S3).

| Plano | Para quem | Limites | Recursos incluídos | Preço |
|---|---|---|---|---|
| **Solo** | Personal autônomo iniciante | Até 20 alunos ativos, 1 profissional | Fichas ilimitadas, app do aluno, biblioteca de exercícios, histórico de cargas | R$ 49,90/mês |
| **Pro** | Personal consolidado, consultoria online | Até 60 alunos ativos, 1 profissional | Solo + anamnese e avaliação física, periodização, marca do profissional no app, relatórios de aderência | R$ 99,90/mês |
| **Studio** | Estúdio e academia de bairro | Até 300 alunos ativos, até 6 profissionais | Pro + multiprofissional com permissões, biblioteca institucional, **motor de retenção (IRE)**, painel de gestão, trilha de auditoria, implantação assistida | R$ 349,90/mês |
| **Rede** | Rede regional e assessoria | Multiunidade, até 25 profissionais | Studio + multiunidade, API e *webhooks*, SSO, *white-label*, painéis comparativos, SLA contratual e gerente de conta | R$ 1.190,00/mês |

**Política de excedente.** Alunos ativos acima do limite do plano são cobrados a R$ 1,20/aluno/mês, com
sugestão automática de *upgrade* quando o excedente se torna mais caro que o plano superior — regra que
protege a percepção de justiça do preço.

**Roadmap de produto (12 meses).**

| Trimestre | Entregas |
|---|---|
| T1/2027 | Lançamento comercial: prescrição, app do aluno, biblioteca, cobrança recorrente, onboarding autosserviço |
| T2/2027 | Motor de retenção (IRE) v1, relatórios de aderência, anamnese e avaliação física digitais |
| T3/2027 | Multiprofissional com permissões, OCR de fichas antigas, integração com WhatsApp |
| T4/2027 | API pública e *webhooks*, painel de gestão do estúdio, exportação e portabilidade de dados |
| T1/2028 | IRE v2 com modelo preditivo, integração com wearables, *white-label* do plano Rede |

## 4.2 Estratégia de preço

**Método.** O preço parte do valor percebido e é validado contra o custo. Para o plano Studio, o
argumento de venda é direto: a mensalidade média de um aluno de estúdio no Alto Tietê está entre R$ 150
e R$ 250; **evitar dois cancelamentos por mês já paga a assinatura**. Para o plano Rede, o preço é
calibrado por unidade atendida (cerca de R$ 300 por unidade).

**Verificação de custo.** O Quadro 10 mostra o custo variável unitário de cada plano (infraestrutura por
aluno, meios de pagamento, comissão e imposto) e a margem de contribuição resultante — todos os planos
superam 68% de margem de contribuição, condição necessária para sustentar a estrutura fixa.

## Quadro 10 - Planos, preços e custo variável unitário

| Plano | Preço/mês (R$) | Alunos ativos (média) | Custo variável unitário (R$) | Margem de contribuição unitária (R$) | % |
|---|---:|---:|---:|---:|---:|
| Solo | 49,90 | 14 | 15,63 | 34,27 | 68,7% |
| Pro | 99,90 | 42 | 34,57 | 65,33 | 65,4% |
| Studio | 349,90 | 180 | 128,73 | 221,17 | 63,2% |
| Rede | 1.190,00 | 950 | 527,85 | 662,15 | 55,6% |

> Alíquota efetiva do Simples Nacional usada na referência: 16,5% (Anexo III, RBT12 do Ano 3).


**Política comercial.** (a) 14 dias de teste sem cartão de crédito; (b) desconto de 15% no pagamento
anual antecipado, que melhora o caixa e reduz churn; (c) sem multa de fidelidade — a retenção é
sustentada por valor, não por contrato; (d) reajuste anual pelo IPCA, comunicado com 60 dias de
antecedência; (e) para instituições de ensino e conselhos parceiros, licença de uso acadêmico gratuita,
que alimenta o canal de indicação.

## Quadro 13 - Unit economics por plano (base: mês típico do Ano 3)

| Plano | Preço/mês (R$) | MC unitária (R$) | Churn mensal | Vida média (meses) | LTV (R$) | CAC máximo suportado = LTV/3 (R$) |
|---|---:|---:|---:|---:|---:|---:|
| Solo | 49,90 | 34,27 | 4,0% | 25 | 856,81 | 285,60 |
| Pro | 99,90 | 65,33 | 2,8% | 36 | 2.333,28 | 777,76 |
| Studio | 349,90 | 221,17 | 1,5% | 67 | 14.744,63 | 4.914,88 |
| Rede | 1.190,00 | 662,15 | 0,8% | 125 | 82.769,35 | 27.589,78 |


A leitura da relação LTV/CAC é o principal teste de sustentabilidade do modelo: mesmo no plano de
entrada, o valor do cliente ao longo da vida suporta um custo de aquisição até três vezes maior que o
previsto no plano.

## 4.3 Estratégia de praça (distribuição)

A distribuição é **100% digital**, sem revenda física:

| Canal | Papel | Segmentos | Participação esperada nas vendas (Ano 3) |
|---|---|---|---|
| Site com autosserviço | Cadastro, teste e conversão sem contato humano | S1, S2 | 62% |
| Vendas assistidas (inside sales) | SDR qualifica, closer demonstra e fecha remotamente | S3 | 24% |
| Venda consultiva | Proposta, prova de conceito e contrato com SLA | S4 | 4% |
| Indicação (profissional → estúdio) | Professor usuário leva a plataforma ao estabelecimento | S3, S4 | 7% |
| Parcerias institucionais (faculdades, conselhos, fornecedores de equipamentos) | Geração de leads qualificados e credibilidade | Todos | 3% |

**Cobertura geográfica.** Ano 1 concentrado no Alto Tietê e Grande São Paulo (proximidade permite
piloto presencial e prova social); Ano 2 expansão para Sudeste e Sul; Ano 3 atendimento nacional
remoto.

## 4.4 Estratégia de promoção e divulgação

| Canal | Ação | Investimento mensal (Ano 1) | Indicador |
|---|---|---|---|
| Conteúdo e SEO | Blog técnico ("como reduzir evasão", "periodização na prática"), calculadora de evasão gratuita | R$ 900 | Visitantes orgânicos, leads |
| Mídia paga | Google Ads e Meta Ads segmentados por interesse profissional | R$ 1.200 | CPL, CAC por canal |
| Redes sociais e vídeo | Instagram/TikTok com professores parceiros demonstrando o produto | R$ 600 | Alcance, cliques, leads |
| Programa de indicação | 1 mês grátis para quem indica; bônus quando a indicação é um estúdio | R$ 400 | Indicações convertidas |
| Parcerias institucionais | Convênios com cursos de educação física e ações com o CREF regional | R$ 300 | Leads por parceria |
| Eventos e feiras | Presença em feiras do setor (a partir do Ano 2) | — | Reuniões agendadas |
| Comunidade e webinars | Encontros mensais sobre gestão e retenção | R$ 100 | Participantes, NPS |

## Quadro 15 - Funil de vendas necessário (metas mensais)

| Etapa do funil | Taxa de conversão | Mês 12 | Mês 24 | Mês 36 |
|---|---:|---:|---:|---:|
| Visitantes únicos no site/blog | - | 16.698 | 28.942 | 42.301 |
| Leads (cadastro de e-mail) | 3,5% | 584 | 1.013 | 1.481 |
| Testes gratuitos iniciados (14 dias) | 35% | 205 | 355 | 518 |
| Novos clientes por autosserviço (Solo/Pro) | 22% | 45 | 78 | 114 |
| MQLs de vendas assistidas (Studio/Rede) | - | 80 | 140 | 210 |
| Demonstrações realizadas | 40% | 32 | 56 | 84 |
| Novos clientes por venda assistida | 25% | 8 | 14 | 21 |
| Total de novos clientes no mês | - | 53 | 92 | 135 |


O funil está dimensionado a partir das metas de aquisição do plano financeiro: para entregar
53 novos clientes no mês 12, é preciso sustentar cerca de 16.698 visitantes únicos
e 205 testes iniciados por mês. Esse é o principal ponto de atenção do plano — e a razão de
o quadro de experimentação testar as taxas de conversão desde o mês 2.

## Quadro 14 - Custo de aquisição de clientes (CAC) implícito no plano

| Exercício | Marketing (R$) | Comissões (R$) | Folha comercial (R$) | Investimento comercial total (R$) | Novos clientes | CAC implícito (R$) | CAC máximo suportado (R$) | Folga |
|---|---:|---:|---:|---:|---:|---:|---:|---:|
| Ano 1 | 37.800 | 7.722 | 0 | 45.522 | 370 | 123 | 1.322 | 10,7x |
| Ano 2 | 96.000 | 36.780 | 27.651 | 160.431 | 908 | 177 | 1.356 | 7,7x |
| Ano 3 | 156.000 | 83.223 | 140.642 | 379.865 | 1.384 | 274 | 1.419 | 5,2x |
| Ano 4 | 216.000 | 147.932 | 214.448 | 578.380 | 1.899 | 305 | 1.483 | 4,9x |

> O CAC implícito é o resultado da divisão do investimento comercial total pelo número de novos clientes
> do exercício. A folga indica quantas vezes o CAC poderia crescer antes de comprometer a relação
> LTV/CAC = 3, referência usual para negócios de receita recorrente.


## 4.5 Estrutura de comercialização

| Elemento | Definição |
|---|---|
| Equipe comercial | Ano 1: fundadores (CEO à frente); Ano 2: 1 SDR + 1 closer; Ano 3: reforço de marketing |
| Ferramenta | CRM com funil por segmento, registro de atividades e previsão de fechamento |
| Ciclo de venda | Autosserviço: 3 a 14 dias. Studio: cerca de 32 dias. Rede: 60 a 90 dias |
| Remuneração variável | Comissão de 3% sobre a receita bruta (Quadro 14), paga sobre recebimento |
| Meta por dupla comercial | 16 fechamentos/mês em S3 e S4 (hipótese H4) |
| Pós-venda | COO assume a implantação; revisão trimestral de resultado com o cliente |
| Cobrança | Recorrência automática em cartão ou PIX; régua de cobrança de 10 dias antes da suspensão |

## 4.6 Localização do negócio

A sede é um **coworking corporativo no centro de Mogi das Cruzes/SP**, com quatro estações fixas e
acesso a sala de reunião. A escolha se justifica por:

- **Custo e flexibilidade** — R$ 1.900/mês, sem obra, sem contrato longo, expansível por estação;
- **Proximidade do mercado piloto** — o Alto Tietê concentra centenas de estúdios e academias de
  bairro, permitindo visitas presenciais no piloto;
- **Acesso a talento e à universidade** — parceria com a UMC para estágios e projetos de extensão;
- **Irrelevância do ponto comercial** — o produto é vendido remotamente; o endereço tem função
  administrativa e de encontro da equipe, que opera em modelo híbrido (3 dias presenciais).

---

# 5. Plano Operacional

## 5.1 Estrutura física e layout

| Ambiente | Área aproximada | Uso | Ocupação |
|---|---|---|---|
| Estações de trabalho (4) | 16 m² | Desenvolvimento, produto, comercial | Sócios e equipe, modelo híbrido |
| Estação compartilhada (2 posições) | 8 m² | Suporte e estágio | Escala alternada |
| Sala de reunião (compartilhada) | 12 m² | Demonstrações, comitês, entrevistas | Reserva por hora |
| Armário técnico e guarda de equipamentos | 2 m² | Notebooks de reserva, celulares de teste, nobreak | Permanente |
| Áreas comuns (copa, recepção, internet) | — | Infraestrutura do coworking | Incluídas no contrato |

**Layout lógico.** As estações são dispostas em duas duplas frente a frente (tecnologia/produto e
comercial/operações), o que favorece a comunicação nas cerimônias diárias sem isolar as funções. A sala
de reunião é reservada nos horários de demonstração comercial (10h–12h e 15h–18h), janelas de maior
disponibilidade dos gestores de academia.

## 5.2 Capacidade instalada e de atendimento

| Recurso | Capacidade instalada | Demanda no mês 12 | Demanda no mês 24 | Demanda no mês 36 | Decisão |
|---|---|---|---|---|---|
| Suporte / sucesso do cliente | ~250 clientes por analista | 326 clientes | 997 clientes | 1.860 clientes | 1 analista no mês 7; 2º no mês 16; 3º no Ano 4 |
| Capacidade comercial | 16 fechamentos/mês por dupla | 8 assistidos/mês | 14 assistidos/mês | 21 assistidos/mês | Dupla no Ano 2; reforço no Ano 3 |
| Infraestrutura em nuvem | Escala horizontal automática | 18.488 alunos | 60.125 alunos | 119.747 alunos | Teste de carga trimestral a 2× o pico |
| Engenharia | 2 entregas por semana | Roadmap T1–T4 | Roadmap Ano 2 | Roadmap Ano 3 | Devs nos meses 11, 20, 28 |
| Implantação assistida | 12 implantações/mês por analista | 8/mês | 14/mês | 21/mês | Playbook padronizado + autosserviço guiado |

O pico de uso é concentrado entre 6h–9h e 18h–21h, quando a academia está cheia. O dimensionamento da
infraestrutura usa como referência **2,5 vezes o pico observado**, com autoescala e testes de carga
trimestrais.

## 5.3 Processos de trabalho

Os processos são modelados em **BPMN 2.0** e mantidos em repositório versionado. A tabela abaixo
descreve os processos essenciais em formato de raia (papel), atividade, tipo de elemento BPMN, sistema
de apoio e prazo acordado.

### P1 — Aquisição e ativação por autosserviço

| Raia | Atividade | Elemento BPMN | Sistema | SLA |
|---|---|---|---|---|
| Cliente | Cria conta e informa segmento | Evento inicial + tarefa de usuário | Plataforma | — |
| Plataforma | Provisiona ambiente e aplica modelo de treino do segmento | Tarefa de serviço | Plataforma | < 30 s |
| Cliente | Publica a primeira ficha | Tarefa de usuário | Plataforma | Meta: < 10 min |
| Plataforma | Verifica ativação em 48 h | *Gateway* exclusivo | Automação | 48 h |
| Sucesso do cliente | Se não ativou: contato guiado por playbook | Tarefa de usuário | CRM | 1 dia útil |
| Plataforma | Converte em assinatura ao fim do teste | Tarefa de serviço + evento final | Gateway de pagamento | Dia 14 |

### P2 — Implantação assistida (Studio e Rede)

| Raia | Atividade | Elemento BPMN | Sistema | SLA |
|---|---|---|---|---|
| Comercial | Registra contrato e escopo da migração | Evento inicial | CRM | — |
| Operações | Reunião de *kickoff* e coleta da base atual | Tarefa de usuário | Videoconferência | 2 dias úteis |
| Plataforma | OCR das fichas em papel/planilhas e carga | Tarefa de serviço | Plataforma | 3 dias úteis |
| Operações | Conferência amostral com o cliente | Tarefa de usuário | Plataforma | 1 dia útil |
| Operações | Treinamento da equipe do cliente (2 sessões) | Tarefa de usuário | Videoconferência | 5 dias úteis |
| Operações | Aceite formal e liberação de produção | Evento final | Plataforma | Até 10 dias úteis |

### P3 — Prescrição, execução e acompanhamento

| Raia | Atividade | Elemento BPMN | Sistema | Controle |
|---|---|---|---|---|
| Profissional (CREF) | Registra anamnese e avaliação física | Tarefa de usuário | Plataforma | Consentimento do titular registrado |
| Plataforma | Sugere periodização com base no objetivo | Tarefa de serviço | Motor de sugestão | Sugestão nunca é publicada sozinha |
| Profissional (CREF) | Revisa, ajusta e **publica** a ficha | Tarefa de usuário | Plataforma | Registro de autoria, CREF e data (trilha de auditoria) |
| Aluno | Executa e registra séries, cargas e esforço | Tarefa de usuário | App do aluno (PWA) | Funciona offline e sincroniza |
| Plataforma | Recalcula aderência e o IRE | Tarefa de serviço | Motor de retenção | Diário, de madrugada |
| Gestor | Age sobre a fila de risco de evasão | Tarefa de usuário | Painel de gestão | Contato registrado |

### P4 — Suporte e gestão de incidentes (base ITIL 4)

| Prioridade | Definição | Primeira resposta | Solução esperada | Escalonamento |
|---|---|---|---|---|
| P1 — Crítico | Plataforma indisponível ou dado exposto | 15 min | 4 h | CTO imediatamente; comunicado a todos os clientes |
| P2 — Alto | Função essencial indisponível (publicar ficha, registrar treino) | 1 h | 8 h | CTO em 2 h |
| P3 — Médio | Função secundária com erro e contorno disponível | 4 h úteis | 3 dias úteis | COO no 2º dia |
| P4 — Baixo | Dúvida, melhoria, ajuste cosmético | 1 dia útil | Backlog priorizado | Comitê de produto |

Todo incidente P1 e P2 gera **análise de causa raiz** documentada em até 5 dias úteis, com ação
preventiva registrada no backlog.

### P5 — Desenvolvimento e implantação (DevOps)

Fluxo: demanda priorizada no comitê de produto → *branch* → revisão obrigatória por outro
desenvolvedor → testes automatizados na integração contínua → *deploy* automático em homologação →
validação de produto → *deploy* em produção com liberação gradual e possibilidade de reversão em um
comando. Mudanças em banco de dados são versionadas por *scripts* de migração; nenhuma alteração é
aplicada manualmente em produção.

### P6 — Faturamento e cobrança recorrente

Geração da fatura no dia do aniversário do contrato → tentativa automática em cartão/PIX → em caso de
falha, régua de 3 tentativas em 10 dias com aviso por e-mail e WhatsApp → suspensão do acesso no 11º
dia, com dados preservados por 90 dias → reativação imediata no pagamento. Emissão de nota fiscal de
serviço automatizada e conciliação mensal pela contabilidade.

### P7 — Atendimento a titulares de dados (LGPD)

Solicitação recebida em canal exclusivo (privacidade@treinolog.com.br) → identificação do titular →
classificação (acesso, correção, portabilidade, eliminação, revogação de consentimento) → execução
técnica com registro → resposta formal em **até 15 dias**. Incidentes com dado pessoal seguem o plano
de resposta, com avaliação de risco e comunicação à ANPD e aos titulares quando aplicável.

## 5.4 Recursos tecnológicos

A plataforma evolui a partir do protótipo já construído pelo grupo, o que reduz risco técnico e prazo
de lançamento.

| Camada | Tecnologia | Justificativa |
|---|---|---|
| Back-end | Java 17 + Spring Boot (Spring MVC, Spring Data JPA, Spring Security) | Base do protótipo; maturidade, ecossistema e disponibilidade de mão de obra |
| Autenticação | Spring Security com senhas em **BCrypt**, perfis ADMIN/USER, primeiro acesso com senha provisória | Já implementado no protótipo; evolução para MFA e SSO no plano Rede |
| Front-end profissional | Thymeleaf com evolução progressiva para componentes reativos | Entrega rápida sem reescrita do que funciona |
| Aplicativo do aluno | PWA instalável com *service worker* e cache local | Um só código para Android e iOS; opera com sinal instável na academia |
| Banco de dados | MySQL 8 gerenciado (RDS), com réplica de leitura a partir do Ano 2 | Compatível com o protótipo; custo previsível |
| Armazenamento de mídia | Object storage (S3) + CDN | **Correção de dívida técnica**: no protótipo as fotos são gravadas em Base64 em coluna LONGTEXT, o que infla o banco e degrada consultas |
| Versionamento de esquema | Flyway | Substitui o `ddl-auto=update` do protótipo, inadequado para produção |
| Empacotamento e execução | Docker + orquestração gerenciada, com autoescala | Portabilidade entre provedores de nuvem |
| Integração e entrega contínuas | GitHub + Actions (build, testes, análise estática, *deploy*) | Reduz erro humano e acelera correções |
| Observabilidade | Métricas, *logs* centralizados, rastreamento e alertas | Sustenta o SLA de 99,5% e o MTTR de 4 h |
| Segurança | TLS obrigatório, criptografia em repouso, segredos em cofre, teste de intrusão anual, cópias com RPO de 15 min e RTO de 4 h | Dado de saúde é dado sensível (LGPD, art. 5º, II) |
| Dados e IA | Camada analítica para aderência e IRE; modelo preditivo a partir do Ano 2 | Sustenta o principal diferencial do produto |
| Integrações | API REST pública, *webhooks*, WhatsApp Business API, ERPs de academia | Viabiliza coexistência com sistemas já instalados |

**Dívidas técnicas herdadas do protótipo e tratamento previsto:** (1) migrar fotos de Base64/LONGTEXT
para object storage; (2) substituir `ddl-auto=update` por migrações versionadas; (3) adicionar MFA e
política de senha; (4) criar suíte de testes automatizados com cobertura mínima de 70% no núcleo;
(5) segregar ambientes de desenvolvimento, homologação e produção. Os itens 1 a 3 estão no escopo dos
investimentos pré-operacionais (finalização do MVP, Quadro 2).

## 5.5 Necessidade de pessoal, equipe e responsabilidades

## Quadro 11 - Quadro de pessoal e custo mensal (mês 36)

| Função | Regime | Remuneração (R$) | Encargos/provisões | Custo mensal (R$) | Admissão |
|---|---|---:|---:|---:|---:|
| 4 sócios (CEO, CTO, COO, CPO) | Pró-labore | 7.500,00 cada | INSS retido do sócio | 30.000,00 | mês 1 |
| Estagiário(a) de desenvolvimento | Estágio | 1.700,00 | 5% | 1.949,26 | mês 4 |
| Analista de Suporte/CS I | CLT | 2.900,00 | 35% | 4.275,28 | mês 7 |
| Desenvolvedor(a) pleno I | CLT | 7.500,00 | 35% | 11.056,75 | mês 11 |
| Analista de Sucesso do Cliente II | CLT | 3.600,00 | 35% | 5.307,24 | mês 16 |
| SDR (pré-vendas) | CLT | 2.800,00 | 35% | 4.127,85 | mês 18 |
| Desenvolvedor(a) pleno II | CLT | 7.800,00 | 35% | 11.499,02 | mês 20 |
| Estagiário(a) de suporte | Estágio | 1.700,00 | 5% | 1.949,26 | mês 22 |
| Executivo(a) de Contas (closer) | CLT | 3.800,00 | 35% | 5.602,09 | mês 26 |
| Desenvolvedor(a) sênior | CLT | 11.000,00 | 35% | 16.216,57 | mês 28 |
| Analista de Dados/ML | CLT | 8.200,00 | 35% | 12.088,72 | mês 31 |
| Analista de Marketing | CLT | 5.000,00 | 35% | 7.371,17 | mês 33 |
| Analista Administrativo-Financeiro | CLT | 4.200,00 | 35% | 6.191,78 | mês 38 |
| Desenvolvedor(a) pleno III | CLT | 8.000,00 | 35% | 11.793,87 | mês 40 |
| Analista de Suporte/CS III | CLT | 3.200,00 | 35% | 4.717,55 | mês 42 |
| Especialista em Segurança da Informação | CLT | 9.500,00 | 35% | 14.005,22 | mês 45 |
| **Total de pessoal no mês 36** | | | | **148.151,64** | |


**Matriz de responsabilidades (RACI) dos processos críticos.** R = responsável pela execução,
A = autoridade final, C = consultado, I = informado.

| Processo / decisão | CEO | CTO | COO | CPO |
|---|---|---|---|---|
| Estratégia e orçamento | A/R | C | C | C |
| Roadmap de produto | C | C | I | A/R |
| Arquitetura e segurança da informação | I | A/R | C | C |
| Implantação e suporte ao cliente | I | C | A/R | I |
| Precificação e política comercial | A/R | I | C | C |
| Resposta a incidente P1 | I | A/R | R | I |
| Conformidade com a LGPD | A | R | C | C |
| Contratação e desligamento | A/R | C | C | C |

**Política de pessoas.** Contratação de estagiários da UMC como porta de entrada (dois previstos no
horizonte), plano de carreira em duas trilhas (técnica e gestão), avaliação semestral por competências
e metas, e orçamento anual de capacitação de R$ 1.200 por pessoa. Modelo híbrido com três dias
presenciais.

## 5.6 Governança de TI aplicada ao negócio

Como o produto é o próprio serviço de TI, a governança não é acessório — é condição de sobrevivência
do modelo de receita recorrente. A estrutura adotada se apoia em **COBIT 2019** (objetivos de
governança e gestão) e **ITIL 4** (práticas de serviço), dimensionada ao porte da empresa.

| Instância | Composição | Frequência | Decisões e entregas |
|---|---|---|---|
| Comitê de Governança | 4 sócios | Mensal | Aprovação de orçamento, riscos, política de segurança, indicadores estratégicos |
| Comitê de Produto | CPO, CTO, COO | Quinzenal | Priorização do backlog, quadro de experimentação, aceite de entregas |
| Reunião de Operação e Serviço | COO, CTO, suporte | Semanal | Incidentes, SLA, capacidade, causa raiz |
| Revisão de Segurança e Privacidade | CTO (encarregado técnico), jurídico externo | Trimestral | Riscos de segurança, RIPD, acessos, resultado de testes |

| Objetivo COBIT 2019 | Aplicação na TreinoLog | Indicador |
|---|---|---|
| EDM01 — Assegurar governança | Comitê mensal com pauta e ata; alçadas definidas | 100% das reuniões realizadas com ata |
| APO12 — Gerenciar riscos | Matriz de riscos revisada trimestralmente (seção 7.3) | Riscos altos com plano de ação ativo |
| APO13 / DSS05 — Segurança | Política de segurança, gestão de acessos, teste de intrusão anual | Zero incidentes reportáveis; 100% de acessos revisados por trimestre |
| BAI06 — Gerenciar mudanças | Revisão obrigatória de código, *deploy* automatizado e reversível | Taxa de falha em mudanças < 15% |
| DSS02 — Requisições e incidentes | Mesa de serviço com prioridades P1–P4 | Cumprimento de SLA ≥ 95% |
| DSS04 — Continuidade | Cópias com RPO 15 min / RTO 4 h; teste de restauração semestral | Teste de recuperação aprovado |
| MEA01 — Monitorar desempenho | Painel único de indicadores de negócio e de serviço | Painel atualizado diariamente |

**Painel de indicadores (revisão mensal no comitê).**

| Dimensão | Indicadores |
|---|---|
| Receita | MRR, ARR, receita de expansão, retenção líquida de receita (NRR) |
| Clientes | Churn por plano, LTV, CAC, LTV/CAC, prazo de retorno do CAC |
| Produto | Taxa de ativação, alunos ativos, aderência média, uso do IRE |
| Serviço | Disponibilidade, MTTR, cumprimento de SLA, volume por prioridade |
| Engenharia | Frequência de *deploy*, *lead time* de mudança, taxa de falha, tempo de restauração |
| Financeiro | Margem de contribuição, custo de infraestrutura por aluno ativo, queima de caixa |
| Pessoas | Rotatividade, capacitação realizada, satisfação interna |

---

# 6. Plano Financeiro

## 6.1 Premissas gerais

Todos os quadros desta seção são gerados por um único modelo financeiro (`modelo_financeiro.py`), a
partir das premissas do Apêndice B. Isso garante que investimento, custos, receitas, DRE, fluxo de
caixa e indicadores estejam aritmeticamente consistentes entre si. As principais premissas são:

| Premissa | Valor adotado | Origem |
|---|---|---|
| Horizonte de projeção | 48 meses (2027–2030) | Decisão do grupo |
| Início das operações | Janeiro de 2027 | Cronograma do plano |
| Inflação anual aplicada a folha e estrutura | 4,5% a.a. | Estimativa conservadora |
| Churn mensal por plano | Solo 4,0% / Pro 2,8% / Studio 1,5% / Rede 0,8% | Referências de mercado para SaaS de pequenas empresas |
| Custo de infraestrutura por aluno ativo | R$ 0,27/mês | Estimativa de nuvem + notificações |
| Taxa de meios de pagamento | 3,29% + R$ 0,49 por cobrança | Prática de mercado |
| Comissão comercial | 3% da receita bruta | Política definida no plano |
| Regime tributário | Simples Nacional, Anexo III (Fator R ≥ 28%) até o teto de R$ 4,8 mi; Lucro Presumido a partir daí | LC 123/2006 |
| Encargos sobre CLT | 35% (FGTS e provisões de 13º, férias e 1/3) | CPP recolhida no DAS (Anexo III) |
| Juros do financiamento | 1,15% a.m., 36 meses, 6 de carência | Linha de inovação |
| Margem de segurança do capital de giro | 20% sobre o maior déficit acumulado | Critério do grupo |

## 6.2 Investimento inicial

## Quadro 1 - Investimentos fixos

| Item | Valor (R$) |
|---|---:|
| 4 notebooks de desenvolvimento (16GB/512GB) - R$ 5.200 | 20.800,00 |
| 2 notebooks de apoio (suporte/estágio) - R$ 3.500 | 7.000,00 |
| 6 monitores 24" - R$ 890 | 5.340,00 |
| 2 smartphones para teste (Android/iOS) - R$ 2.900 | 5.800,00 |
| 4 cadeiras ergonômicas - R$ 1.100 | 4.400,00 |
| Rede, nobreak, headsets e periféricos | 3.900,00 |
| Smart TV 55" + webcam + áudio (sala de reunião) | 3.200,00 |
| Impressora multifuncional | 1.400,00 |
| **Total de investimentos fixos** | **51.840,00** |


## Quadro 2 - Investimentos pré-operacionais

| Item | Valor (R$) |
|---|---:|
| Constituição da empresa (JUCESP, contador, alvarás) | 3.200,00 |
| Registro da marca no INPI (2 classes) | 2.100,00 |
| Adequação LGPD (consultoria, políticas, DPO as a service - setup) | 5.400,00 |
| Finalização do MVP com terceiros (UX/UI, QA, teste de carga) | 22.000,00 |
| Identidade visual, site, landing pages e vídeos | 9.800,00 |
| Domínios, certificados e licenças (12 meses antecipados) | 3.600,00 |
| Caução do coworking (2 meses) | 3.800,00 |
| Treinamento da equipe e certificações cloud | 2.600,00 |
| Reserva para contingências pré-operacionais | 2.600,00 |
| **Total pré-operacional** | **55.100,00** |


## Quadro 3 - Investimento total e fontes de recursos

| Descrição | Valor (R$) | % |
|---|---:|---:|
| Investimentos fixos (imobilizado) | 51.840,00 | 13,2% |
| Investimentos pré-operacionais | 55.100,00 | 14,1% |
| Capital de giro (caixa mínimo dimensionado) | 285.000,00 | 72,7% |
| **Investimento total** | **391.940,00** | **100,0%** |

| Fonte de recursos | Valor (R$) | % |
|---|---:|---:|
| Capital próprio - 4 sócios (R$ 30.000 cada) | 120.000,00 | 30,4% |
| Investidor-anjo (mútuo conversível, rodada pre-seed) | 215.000,00 | 54,4% |
| Financiamento de inovação para ativos (1,15% a.m., 36 meses) | 60.000,00 | 15,2% |
| **Total de fontes** | **395.000,00** | **100,0%** |

> Caixa disponível na abertura (fontes - investimentos fixos e pré-operacionais): **R$ 288.060,00**.
> Maior necessidade de caixa observada na simulação: **R$ 237.025,74** (mês de maior déficit acumulado);
> capital de giro dimensionado com 20% de folga = **R$ 285.000,00**.


**Como o capital de giro foi dimensionado.** Em negócios de receita recorrente, o caixa é consumido
antes de a base de assinantes cobrir a estrutura. O modelo simula os 48 meses com caixa inicial zero,
identifica o **maior déficit acumulado** e adiciona 20% de margem de segurança. O resultado
(R$ 285.000) responde por 72,7% do investimento total — proporção esperada em software,
onde o imobilizado é pequeno e o esforço é remunerar equipe até o ponto de equilíbrio.

**Estrutura de capital.** A dívida (R$ 60.000) é vinculada apenas à aquisição dos ativos, e não ao
financiamento do prejuízo do ramp-up: uma dívida amortizável em 36 meses usada para cobrir queima de
caixa exigiria mais caixa do que aporta. O giro é coberto por **capital de risco** (sócios e
investidor-anjo), que não gera desembolso obrigatório antes da geração de resultado.

## 6.3 Estimativa de faturamento

A receita tem duas naturezas: **recorrente** (assinaturas, que formam o MRR) e **pontual** (implantação
e migração de base, cobradas na entrada dos planos Studio e Rede). A projeção parte da curva de
aquisição de clientes por plano, deduzido o churn mensal.

| Marco | Clientes ativos | Alunos ativos | MRR (R$) | Receita do mês (R$) |
|---|---:|---:|---:|---:|
| Mês 12 (dez/2027) | 326 | 18.488 | 39.213 | 50.003 |
| Mês 24 (dez/2028) | 997 | 60.125 | 131.955 | 150.504 |
| Mês 36 (dez/2029) | 1.860 | 119.747 | 269.950 | 299.850 |

Composição da base ao fim do Ano 3: Solo 908, Pro 613, Studio 312, Rede 26. A concentração de receita nos planos Studio e Rede é
intencional — são os segmentos de maior margem de contribuição, menor churn e maior custo de troca.

## 6.4 Custos variáveis e custos de comercialização

Os custos que variam com a receita são: **impostos sobre vendas**, **taxas de meios de pagamento**,
**comissão comercial (3%)** e **infraestrutura por aluno ativo**. O custo variável unitário de cada
plano e a margem de contribuição resultante constam do **Quadro 10** (seção 4.2); os custos de
comercialização, no **Quadro 14** (seção 4.4).

O indicador operacional que sintetiza essa estrutura é o **índice de margem de contribuição de
67,6%** no mês típico: de cada R$ 100 faturados, R$ 67,55 ficam disponíveis para cobrir
custos fixos e gerar lucro.

## 6.5 Custos fixos operacionais

## Quadro 12 - Custos fixos operacionais mensais

| Item | Ano 1 (R$) | Ano 2 (R$) | Ano 3 (R$) |
|---|---:|---:|---:|
| Coworking corporativo (4 estações + sala de reunião) | 1.900,00 | 2.470,00 | 3.230,00 |
| Energia, água e limpeza (rateio) | 320,00 | 416,00 | 544,00 |
| Internet dedicada e telefonia | 260,00 | 338,00 | 442,00 |
| Infraestrutura de nuvem - base fixa | 1.200,00 | 1.560,00 | 2.040,00 |
| Ferramentas SaaS (Git, CI/CD, design, CRM, observabilidade) | 980,00 | 1.274,00 | 1.666,00 |
| Serviços contábeis | 690,00 | 897,00 | 1.173,00 |
| Assessoria jurídica e LGPD (mensal) | 450,00 | 585,00 | 765,00 |
| Seguros e segurança da informacao (pentest rateado) | 380,00 | 494,00 | 646,00 |
| Material de escritório e copa | 240,00 | 312,00 | 408,00 |
| Manutenção e despesas diversas | 260,00 | 338,00 | 442,00 |
| Marketing e vendas | 3.800,00 | 8.000,00 | 13.000,00 |
| Pessoal (pró-labore + CLT com encargos) | 33.825,00 | 62.435,10 | 111.443,22 |
| Depreciação | 830,00 | 1.130,00 | 1.530,00 |
| **Total de custos fixos mensais** | **45.135,00** | **80.249,10** | **137.329,22** |

> Valores dos meses 12, 24 e 36 (já com inflação de 4,5% a.a. sobre folha e escala de estrutura).


O quadro de pessoal detalhado, com cargos, regime, encargos e mês de admissão, está no **Quadro 11**
(seção 5.5). A folha representa a maior parte do custo fixo — característica de empresa de software — e
é o principal instrumento de controle de caixa: no cenário pessimista (seção 6.10), o freio de
contratações é a primeira alavanca acionada.

## 6.6 Depreciação

| Grupo de ativos | Valor (R$) | Vida útil | Depreciação mensal (R$) |
|---|---:|---:|---:|
| Equipamentos de informática e eletrônicos | 47.440,00 | 5 anos (20% a.a.) | 790,67 |
| Móveis e utensílios | 4.400,00 | 10 anos (10% a.a.) | 36,67 |
| **Total no Ano 1** | **51.840,00** | — | **≈ 830,00** |

Nos Anos 2, 3 e 4, a depreciação sobe para R$ 1.130, R$ 1.530 e R$ 1.900 por mês, incorporando os
investimentos de expansão (renovação de equipamentos e postos de trabalho das novas contratações),
lançados no fluxo de caixa como *capex* de R$ 3.000, R$ 5.000 e R$ 6.000 mensais.

## 6.7 Regime e carga tributária

## Quadro 10.1 - Carga tributária projetada e regime

| Exercício | Receita bruta (R$) | Regime vigente no fim do ano | Impostos sobre vendas (R$) | Carga efetiva |
|---|---:|---|---:|---:|
| Ano 1 | 257.397 | Simples Nacional - Anexo III | 16.172 | 6,3% |
| Ano 2 | 1.226.009 | Simples Nacional - Anexo III | 134.455 | 11,0% |
| Ano 3 | 2.774.088 | Simples Nacional - Anexo III | 407.563 | 14,7% |
| Ano 4 | 4.931.067 | Simples Nacional - Anexo III | 849.931 | 17,2% |

> A partir do mês em que a receita acumulada dos 12 meses anteriores supera R$ 4.800.000, a empresa
> é desenquadrada do Simples Nacional e passa ao Lucro Presumido (presunção de 32% para serviços).
> O plano já projeta esse desenquadramento no Ano 4 e prevê estudo de planejamento tributário no Ano 3.


## 6.8 Demonstrativo de resultados (DRE)

## Quadro 7 - Demonstrativo de resultados (DRE) - Anos 1 a 4 (R$)

| Conta | Ano 1 | Ano 2 | Ano 3 | Ano 4 |
|---|---:|---:|---:|---:|
| 1. Receita com assinaturas (recorrente) | 192.197 | 1.048.161 | 2.476.620 | 4.491.387 |
| 2. Receita com serviços (implantação/migração) | 65.200 | 177.849 | 297.468 | 439.680 |
| **3. Receita bruta total** | **257.397** | **1.226.009** | **2.774.088** | **4.931.067** |
| 4. (-) Impostos sobre vendas (Simples Nacional) | -16.172 | -134.455 | -407.563 | -849.931 |
| 5. (-) Custos variáveis totais | -38.784 | -203.766 | -467.744 | -830.499 |
| **6. = Margem de contribuição** | **202.441** | **887.788** | **1.898.781** | **3.250.638** |
| 7. (-) Pró-labore dos sócios | -192.000 | -288.000 | -360.000 | -432.000 |
| 8. (-) Salários e encargos (CLT) | -59.805 | -332.420 | -791.565 | -1.296.445 |
| 9. (-) Marketing e vendas | -37.800 | -96.000 | -156.000 | -216.000 |
| 10. (-) Outros custos fixos operacionais | -80.160 | -104.208 | -136.272 | -168.336 |
| 11. (-) Depreciação | -9.960 | -13.560 | -18.360 | -22.800 |
| **12. = Resultado operacional (EBIT)** | **-177.284** | **53.600** | **436.583** | **1.115.057** |
| 13. (-) Despesas financeiras (juros) | -7.985 | -5.418 | -2.022 | 0 |
| **14. = Resultado líquido do exercício** | **-185.269** | **48.182** | **434.562** | **1.115.057** |
| 15. (+) Depreciação (não desembolsável) | 9.960 | 13.560 | 18.360 | 22.800 |
| 16. (-) Amortização do financiamento | -10.412 | -23.095 | -26.492 | 0 |
| 17. (-) Investimentos de expansão (capex) | 0 | -36.000 | -60.000 | -72.000 |
| **18. = Fluxo de caixa do exercício** | **-185.721** | **2.646** | **366.429** | **1.065.857** |

| Indicador de fechamento | Ano 1 | Ano 2 | Ano 3 | Ano 4 |
|---|---:|---:|---:|---:|
| Clientes ativos em dezembro | 326 | 997 | 1.860 | 2.889 |
| Alunos ativos na plataforma | 18.488 | 60.125 | 119.747 | 198.175 |
| MRR de dezembro (R$) | 39.213 | 131.955 | 269.950 | 457.705 |
| Saldo de caixa no fim do ano (R$) | 102.339 | 104.985 | 471.415 | 1.537.272 |
| Margem de contribuição / receita | 78,6% | 72,4% | 68,4% | 65,9% |
| Resultado líquido / receita | -72,0% | 3,9% | 15,7% | 22,6% |


**Leitura do resultado.** O Ano 1 fecha com prejuízo de R$ 185.269 — resultado esperado e
planejado, coberto pelo capital de giro dimensionado no Quadro 3. O Ano 2 já apresenta lucro líquido de
R$ 48.182, e o Ano 3 alcança R$ 434.562, equivalentes a 15,7% da receita
bruta. O ponto de virada é o **mês 18**, quando a margem de contribuição passa a cobrir integralmente
a estrutura fixa.

## 6.9 Fluxo de caixa

## Quadro 4 - Fluxo de caixa mensal do Ano 1 (R$)

| Mês | Clientes | Alunos ativos | Receita bruta | Impostos | Custos variáveis | Margem de contrib. | Custos fixos | Result. líquido | Fluxo do mês | Saldo de caixa |
|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 1 | 9 | 348 | 2.009 | 121 | 187 | 1.702 | 24.010 | -22.998 | -22.168 | 265.892 |
| 2 | 21 | 758 | 3.035 | 182 | 367 | 2.486 | 24.010 | -22.214 | -21.384 | 244.508 |
| 3 | 37 | 1.449 | 5.842 | 351 | 700 | 4.791 | 24.010 | -19.909 | -19.079 | 225.428 |
| 4 | 57 | 2.374 | 9.155 | 549 | 1.130 | 7.476 | 25.795 | -19.009 | -18.179 | 207.249 |
| 5 | 81 | 4.339 | 15.414 | 925 | 1.978 | 12.511 | 25.795 | -13.974 | -13.144 | 194.105 |
| 6 | 107 | 5.574 | 16.782 | 1.007 | 2.460 | 13.315 | 25.795 | -13.170 | -12.340 | 181.765 |
| 7 | 136 | 6.850 | 19.788 | 1.187 | 3.008 | 15.593 | 35.010 | -20.107 | -20.963 | 160.802 |
| 8 | 169 | 9.339 | 28.387 | 1.703 | 4.111 | 22.573 | 35.010 | -13.108 | -13.983 | 146.819 |
| 9 | 204 | 10.905 | 29.398 | 1.764 | 4.703 | 22.931 | 35.010 | -12.730 | -13.625 | 133.194 |
| 10 | 241 | 12.685 | 34.694 | 2.082 | 5.496 | 27.116 | 35.010 | -8.525 | -9.440 | 123.754 |
| 11 | 282 | 15.487 | 42.888 | 2.770 | 6.701 | 33.418 | 45.135 | -12.328 | -13.263 | 110.491 |
| 12 | 326 | 18.488 | 50.003 | 3.532 | 7.942 | 38.530 | 45.135 | -7.196 | -8.151 | 102.339 |


## Quadro 5 - Fluxo de caixa mensal do Ano 2 (R$)

| Mês | Clientes | Alunos ativos | Receita bruta | Impostos | Custos variáveis | Margem de contrib. | Custos fixos | Result. líquido | Fluxo do mês | Saldo de caixa |
|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 13 | 372 | 21.685 | 60.130 | 4.548 | 9.409 | 46.173 | 58.351 | -12.749 | -16.425 | 85.915 |
| 14 | 419 | 23.945 | 62.827 | 5.173 | 10.303 | 47.350 | 58.351 | -11.550 | -15.247 | 70.668 |
| 15 | 470 | 27.353 | 73.999 | 6.512 | 11.819 | 55.668 | 58.351 | -3.212 | -6.930 | 63.738 |
| 16 | 523 | 30.811 | 81.327 | 7.744 | 13.240 | 60.343 | 63.430 | -3.594 | -7.333 | 56.405 |
| 17 | 577 | 33.504 | 86.249 | 8.693 | 14.355 | 63.201 | 63.430 | -715 | -4.475 | 51.930 |
| 18 | 633 | 37.157 | 96.833 | 10.160 | 15.943 | 70.730 | 67.380 | 2.886 | -896 | 51.034 |
| 19 | 692 | 40.992 | 106.243 | 11.531 | 17.559 | 77.153 | 67.380 | 9.331 | 5.527 | 56.561 |
| 20 | 752 | 44.825 | 114.470 | 12.897 | 19.141 | 82.432 | 78.384 | 3.629 | -198 | 56.363 |
| 21 | 812 | 47.871 | 120.218 | 14.128 | 20.406 | 85.683 | 78.384 | 6.902 | 3.053 | 59.416 |
| 22 | 873 | 51.856 | 131.557 | 16.007 | 22.133 | 93.417 | 80.249 | 12.793 | 8.922 | 68.338 |
| 23 | 935 | 56.001 | 141.654 | 17.748 | 23.878 | 100.028 | 80.249 | 19.428 | 15.533 | 83.871 |
| 24 | 997 | 60.125 | 150.504 | 19.315 | 25.579 | 105.610 | 80.249 | 25.033 | 21.115 | 104.985 |


## Quadro 6 - Fluxo de caixa mensal do Ano 3 (R$)

| Mês | Clientes | Alunos ativos | Receita bruta | Impostos | Custos variáveis | Margem de contrib. | Custos fixos | Result. líquido | Fluxo do mês | Saldo de caixa |
|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 25 | 1.062 | 64.421 | 168.190 | 22.021 | 27.814 | 118.356 | 96.051 | 22.000 | 16.459 | 121.444 |
| 26 | 1.127 | 68.707 | 177.848 | 23.704 | 29.610 | 124.533 | 101.653 | 22.600 | 17.034 | 138.479 |
| 27 | 1.194 | 73.161 | 189.162 | 25.614 | 31.516 | 132.033 | 101.653 | 30.123 | 24.534 | 163.013 |
| 28 | 1.262 | 77.601 | 199.211 | 27.335 | 33.380 | 138.496 | 117.869 | 20.394 | 14.780 | 177.793 |
| 29 | 1.333 | 83.156 | 215.122 | 29.862 | 35.778 | 149.482 | 117.869 | 31.405 | 25.767 | 203.560 |
| 30 | 1.404 | 87.736 | 222.617 | 31.305 | 37.617 | 153.695 | 117.869 | 35.642 | 29.979 | 233.539 |
| 31 | 1.477 | 92.479 | 234.666 | 34.057 | 39.649 | 160.960 | 129.958 | 30.845 | 25.156 | 258.695 |
| 32 | 1.551 | 98.151 | 249.648 | 37.238 | 42.063 | 170.346 | 129.958 | 40.256 | 34.542 | 293.237 |
| 33 | 1.626 | 103.024 | 259.120 | 39.620 | 44.066 | 175.434 | 137.329 | 37.998 | 32.258 | 325.495 |
| 34 | 1.703 | 108.825 | 274.431 | 42.891 | 46.537 | 185.003 | 137.329 | 47.593 | 41.827 | 367.322 |
| 35 | 1.781 | 113.824 | 284.224 | 45.300 | 48.595 | 190.329 | 137.329 | 52.946 | 47.153 | 414.476 |
| 36 | 1.860 | 119.747 | 299.850 | 48.615 | 51.120 | 200.115 | 137.329 | 62.758 | 56.939 | 471.415 |


## Quadro 6.1 - Fluxo de caixa mensal do Ano 4 (R$)

| Mês | Clientes | Alunos ativos | Receita bruta | Impostos | Custos variáveis | Margem de contrib. | Custos fixos | Result. líquido | Fluxo do mês | Saldo de caixa |
|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|---:|
| 37 | 1.940 | 125.816 | 328.303 | 54.075 | 54.500 | 219.729 | 155.036 | 64.692 | 60.592 | 532.007 |
| 38 | 2.022 | 131.848 | 341.888 | 57.157 | 57.023 | 227.708 | 161.507 | 66.201 | 62.101 | 594.108 |
| 39 | 2.104 | 138.025 | 357.143 | 60.517 | 59.647 | 236.979 | 161.507 | 75.472 | 71.372 | 665.481 |
| 40 | 2.187 | 144.162 | 371.017 | 63.642 | 62.217 | 245.157 | 173.831 | 71.326 | 67.226 | 732.707 |
| 41 | 2.272 | 150.441 | 386.554 | 67.050 | 64.888 | 254.616 | 173.831 | 80.785 | 76.685 | 809.392 |
| 42 | 2.357 | 156.679 | 400.703 | 60.295 | 67.504 | 272.905 | 178.761 | 94.144 | 90.044 | 899.436 |
| 43 | 2.443 | 163.055 | 416.510 | 66.189 | 70.218 | 280.103 | 178.761 | 101.342 | 97.242 | 996.678 |
| 44 | 2.530 | 169.389 | 430.922 | 71.857 | 72.877 | 286.188 | 178.761 | 107.427 | 103.327 | 1.100.006 |
| 45 | 2.619 | 176.809 | 451.391 | 78.488 | 76.068 | 296.835 | 193.396 | 103.438 | 99.338 | 1.199.344 |
| 46 | 2.707 | 183.226 | 462.996 | 83.706 | 78.674 | 300.616 | 193.396 | 107.220 | 103.120 | 1.302.464 |
| 47 | 2.798 | 190.728 | 483.700 | 90.452 | 81.903 | 311.345 | 193.396 | 117.948 | 113.848 | 1.416.312 |
| 48 | 2.889 | 198.175 | 499.939 | 96.503 | 84.979 | 318.456 | 193.396 | 125.060 | 120.960 | 1.537.272 |


O menor saldo de caixa do período é de **R$ 51.034**, o que confirma o dimensionamento do
capital de giro: a empresa atravessa todo o ramp-up sem necessidade de aporte extraordinário no cenário
realista. O fluxo de caixa passa a ser positivo de forma sustentada no **mês 19**.

## 6.10 Indicadores de viabilidade

## Quadro 8 - Indicadores de viabilidade (mês típico: média dos meses 31 a 36)

| Indicador | Fórmula | Resultado |
|---|---|---:|
| Receita bruta do mês típico | - | R$ 266.990 |
| Margem de contribuição | Receita - impostos - custos variáveis | R$ 180.364 |
| Índice de margem de contribuição (IMC) | MC / Receita | 67,6% |
| Custos fixos totais | - | R$ 134.872 |
| **Ponto de equilíbrio (faturamento)** | Custo fixo / IMC | **R$ 199.649/mês** |
| Ponto de equilíbrio (% da receita do mês típico) | PE / Receita | 74,8% |
| **Lucratividade** | Lucro líquido / Receita bruta | **17,0%** |
| **Rentabilidade (a.a.)** | (Lucro líquido do mês típico x 12) / Investimento total | **139,0%** |
| Rentabilidade efetiva do Ano 2 | Lucro líquido do Ano 2 / Investimento total | 12,3% |
| Rentabilidade efetiva do Ano 3 | Lucro líquido do Ano 3 / Investimento total | 110,9% |
| Rentabilidade efetiva do Ano 4 | Lucro líquido do Ano 4 / Investimento total | 284,5% |
| Prazo de retorno pela fórmula simples (Sebrae) | Investimento total / lucro líquido do mês típico | 8,6 meses |
| **Payback efetivo (recomposição integral do caixa investido)** | Mês em que o saldo de caixa volta ao nível de abertura | **mês 32** |
| Primeiro mês com lucro líquido positivo | - | mês 18 |
| Primeiro mês com fluxo de caixa positivo | - | mês 19 |
| Menor saldo de caixa do período | - | R$ 51.034 |

> **Nota metodológica sobre o payback.** A fórmula simples do Sebrae divide o investimento total pelo lucro
> líquido de um mês já estabilizado e, por isso, desconsidera o período de ramp-up (o Ano 1 opera com
> prejuízo). O grupo adota como payback oficial do plano a **recomposição integral do caixa investido, no
> mês 32** (2 anos e 8 meses) - indicador mais conservador e mais aderente ao comportamento de negócios
> de receita recorrente, em que o retorno depende do acúmulo da base de assinantes.


**Interpretação.**

- **Ponto de equilíbrio.** A empresa precisa faturar R$ 199.649 por mês para não ter prejuízo no mês
  típico, o equivalente a 74,8% da receita projetada — folga de 25,2% sobre o nível de
  operação previsto.
- **Lucratividade de 17,0%.** Compatível com SaaS em fase de crescimento, que reinveste
  parte da margem em aquisição e produto em vez de maximizar lucro imediato.
- **Payback no mês 32.** Prazo coerente com negócios de receita recorrente, em que o retorno se
  constrói pelo acúmulo da base. Pela fórmula simples do Sebrae o prazo seria de 8,6 meses, mas essa
  conta ignora o prejuízo do ramp-up; o grupo optou por divulgar o indicador mais conservador.
- **Retenção como principal alavanca.** Como a margem de contribuição é alta, cada ponto percentual de
  churn evitado tem efeito maior no resultado do que a mesma variação em preço — o que justifica o
  investimento no motor de retenção.

## 6.11 Construção de cenários e análise de sensibilidade

## Quadro 9 - Construção de cenários (Ano 3 e indicadores)

| Parâmetro | Pessimista | Realista | Otimista |
|---|---:|---:|---:|
| Aquisição de clientes vs. plano | -35% | plano | +25% |
| Churn mensal vs. plano | +40% | plano | -15% |
| Preço médio vs. plano | -5% | plano | plano |
| Receita bruta do Ano 3 (R$) | 1.681.711 | 2.774.088 | 3.477.516 |
| Margem de contribuição do Ano 3 (R$) | 1.166.351 | 1.898.781 | 2.350.745 |
| Resultado líquido do Ano 3 (R$) | 14.808 | 434.562 | 886.526 |
| Fluxo de caixa do Ano 3 (R$) | -53.324 | 366.429 | 818.394 |
| Clientes ativos no mês 36 | 1.074 | 1.860 | 2.433 |
| Lucratividade (mês típico) | 3,9% | 17,0% | 26,3% |
| Rentabilidade anual | 19,0% | 139,0% | 269,4% |
| Payback simples (meses) | 63,2 | 8,6 | 4,5 |
| Menor saldo de caixa (R$) | -107.446 | 51.034 | 136.096 |


**Cenário pessimista — e o que fazer.** O cenário combina aquisição 35% menor, churn 40% maior e preço
médio 5% menor, já com o **freio de custos** acionado (contratações adiadas em 6 meses e marketing
reduzido em 40%). Mesmo assim, o caixa chega a R$ -107.446 no pior mês, o que indica a
necessidade de **aporte adicional de aproximadamente R$ 130 mil** ou de antecipação da rodada seguinte.
Por isso o plano prevê, como medida preventiva: (a) cláusula de *follow-on* com o investidor-anjo;
(b) linha de crédito pré-aprovada de R$ 150 mil; e (c) receita de serviços de customização como
alavanca de caixa de curto prazo, aproveitando a competência técnica da equipe.

**Sensibilidade ao custo de aquisição.** Se o CAC dobrar em relação ao previsto no Ano 3, o custo
comercial adicional de R$ 379.865 reduziria o lucro líquido do exercício de R$ 434.562
para cerca de R$ 54.697 — a operação continuaria viável, mas o crescimento teria de ser
desacelerado. É a razão de a hipótese H5 (canais de baixo custo via parcerias) ser tratada como
crítica no quadro de experimentação.

**Sensibilidade ao churn.** Um aumento permanente de 1 ponto percentual no churn do plano Studio
reduziria a vida média do cliente de 67 para 40 meses, cortando o LTV desse plano em cerca de 40% —
impacto que atinge diretamente a rentabilidade do segmento mais lucrativo.

---

# 7. Análise Estratégica

## 7.1 Matriz SWOT (FOFA)

| **Forças (ambiente interno)** | **Fraquezas (ambiente interno)** |
|---|---|
| F1. Protótipo funcional já desenvolvido, encurtando prazo e custo até o lançamento | W1. Marca desconhecida, sem prova social nem base instalada |
| F2. Equipe técnica multidisciplinar com domínio do *stack* utilizado | W2. Capital limitado e dependência da rodada com investidor-anjo |
| F3. Estrutura fixa enxuta (coworking e sócios operando o negócio) | W3. Equipe pequena, com concentração de conhecimento (*bus factor*) |
| F4. Motor de retenção (IRE) como diferencial de difícil replicação imediata | W4. Pouca experiência prévia em venda B2B recorrente |
| F5. Conhecimento do mercado local do Alto Tietê para o piloto | W5. Dívidas técnicas herdadas do protótipo |
| F6. Margem de contribuição elevada (67,6%) | W6. Ausência de integrações prontas com ERPs no lançamento |
| F7. Governança, segurança e LGPD tratadas desde a concepção | W7. Dependência de fornecedores de nuvem e de meios de pagamento |

| **Oportunidades (ambiente externo)** | **Ameaças (ambiente externo)** |
|---|---|
| O1. Segmento de estúdios e academias pequenas mal atendido | A1. Concorrentes com base instalada e preço muito baixo |
| O2. Evasão é dor mensurável, o que facilita a venda por retorno | A2. Entrada de ERP consolidado no nicho de treino |
| O3. Parcerias com faculdades e conselhos como canal barato | A3. Elevação do CAC pela saturação dos canais digitais |
| O4. Coexistência com ERPs via API amplia o mercado | A4. Incidente de segurança com dado sensível de saúde |
| O5. Exigência de conformidade favorece fornecedor preparado | A5. Dependência de fornecedores críticos |
| O6. Crescimento estrutural do mercado fitness brasileiro | A6. Retração econômica atingindo academias de bairro |
| O7. IA e wearables ampliando as fontes de dado de aderência | A7. Mudanças regulatórias no exercício profissional ou na proteção de dados |

## 7.2 Cruzamento estratégico da matriz

| Cruzamento | Estratégia resultante |
|---|---|
| **F1 + O1** (ofensiva) | Lançar rápido no nicho desatendido com piloto no Alto Tietê, convertendo os 10 primeiros estúdios em casos de sucesso documentados |
| **F4 + O2** (ofensiva) | Vender por retorno: "duas retenções por mês pagam a assinatura", com calculadora de evasão pública como isca de marketing |
| **F7 + O5** (ofensiva) | Usar conformidade e trilha de auditoria como critério de desempate nas vendas para redes |
| **F3 + A3** (defensiva) | Estrutura enxuta permite sustentar o negócio mesmo com CAC maior; folga de 5,2 vezes na relação LTV/CAC |
| **F2 + A2** (defensiva) | Profundidade técnico-pedagógica e API aberta, ocupando o espaço que o ERP não cobre em vez de confrontá-lo |
| **W1 + O3** (reforço) | Parcerias institucionais e programa de indicação para construir prova social sem gastar em mídia |
| **W6 + O4** (reforço) | Priorizar a API pública no roadmap do T4 para viabilizar coexistência com ERPs |
| **W2 + A6** (sobrevivência) | Gatilhos financeiros de contenção definidos, linha pré-aprovada e receita de serviços como amortecedor |
| **W3 + A4** (sobrevivência) | Documentação obrigatória, revisão cruzada de código, cofre de segredos e seguro de responsabilidade cibernética |

## 7.3 Principais riscos e estratégias de mitigação

Escala de severidade: probabilidade (B/M/A) × impacto (B/M/A). Riscos de severidade alta são
acompanhados mensalmente pelo Comitê de Governança.

| # | Risco | Prob. | Impacto | Severidade | Mitigação | Gatilho de acionamento | Responsável |
|---|---|---|---|---|---|---|---|
| R1 | CAC acima do previsto | A | A | **Alta** | Canais de baixo custo (parcerias, indicação, conteúdo); folga de 5,2 vezes em LTV/CAC | CAC > R$ 350 por 2 meses consecutivos | CEO |
| R2 | Churn acima do previsto | M | A | **Alta** | Onboarding assistido, IRE aplicado à própria base, revisão trimestral de resultado com o cliente | Churn Solo > 5,5% ou Studio > 2,5% | COO |
| R3 | Incidente de segurança com dado sensível | B | A | **Alta** | LGPD *by design*, criptografia, teste de intrusão anual, plano de resposta, seguro cibernético | Qualquer incidente confirmado | CTO |
| R4 | Não concretização da rodada com investidor-anjo | M | A | **Alta** | Plano B: escopo reduzido, receita de customização, adiamento de contratações | 90 dias antes do início sem termo assinado | CEO |
| R5 | Concorrente incumbente replica o IRE e baixa preço | M | M | Média | Vantagem de dados históricos, integrações e custo de troca; foco em nicho | Lançamento equivalente por concorrente | CPO |
| R6 | Indisponibilidade em horário de pico | M | M | Média | Autoescala, testes de carga trimestrais a 2,5× o pico, SLO e alertas | Disponibilidade mensal < 99,5% | CTO |
| R7 | Dependência de fornecedor único (nuvem/pagamento) | M | M | Média | Contêineres portáveis, segundo gateway homologado, teste anual de portabilidade | Interrupção > 4 h ou reajuste > 20% | CTO |
| R8 | Saída de sócio-chave | B | A | Média | *Vesting* de 4 anos com *cliff* de 12 meses, documentação, revisão cruzada de código | Comunicação formal de saída | CEO |
| R9 | Inadimplência de clientes | M | B | Baixa | Cobrança recorrente automatizada, régua de 10 dias, suspensão automática | Inadimplência > 4% do MRR | COO |
| R10 | Desenquadramento do Simples Nacional | A | M | Média | Planejamento tributário no Ano 3, provisão no Ano 4 | RBT12 > R$ 4,3 mi | CEO |
| R11 | Responsabilidade técnica sobre prescrição automatizada | B | A | Média | IA apenas sugere; publicação exige profissional registrado, com autoria e data em trilha de auditoria | Qualquer questionamento técnico formal | CTO |
| R12 | Sobrecarga da equipe reduzida (atraso no roadmap) | A | M | Média | Escopo trimestral fechado, priorização no comitê de produto, estagiários como apoio | Atraso > 3 semanas em entrega crítica | CPO |

## 7.4 Fatores críticos de sucesso

1. **Ativação rápida** — o cliente precisa alcançar valor (primeira ficha publicada) em menos de 10
   minutos; sem isso, nenhum investimento em aquisição se converte em receita.
2. **Aderência do aluno** — o IRE só funciona se o aluno registrar o treino; a experiência do
   aplicativo é, portanto, condição do diferencial competitivo.
3. **Custo de aquisição sob controle** — a viabilidade depende de canais de baixo custo (parcerias,
   indicação e conteúdo) e não de mídia paga.
4. **Retenção dos planos Studio e Rede** — concentram margem; churn nesses planos custa muito mais que
   nos planos de entrada.
5. **Confiabilidade do serviço** — indisponibilidade em horário de pico destrói confiança em um produto
   usado durante o treino.
6. **Disciplina de caixa** — respeitar os gatilhos de contenção definidos, sem antecipar contratações
   com base em otimismo de pipeline.

---

# 8. Avaliação do Plano de Negócio

**Conclusão sobre a viabilidade.** O plano se mostra **viável sob condições controladas**. Os
indicadores do mês típico (margem de contribuição de 67,6%, lucratividade de 17,0%,
ponto de equilíbrio 25,2% abaixo da receita projetada e recomposição do caixa investido no mês
32) sustentam a decisão de seguir. O investimento total de R$ 391.940,00 é compatível com a
capacidade de captação descrita, e o menor saldo de caixa projetado (R$ 51.034) mostra que o
capital de giro foi dimensionado com folga suficiente para o ramp-up.

**Condicionantes.** A viabilidade depende de três hipóteses que o plano trata explicitamente como
críticas: (1) o custo de aquisição permanecer na ordem de grandeza projetada, sustentado por canais de
baixo custo; (2) o churn dos planos Studio e Rede permanecer nos níveis previstos; e (3) a rodada com
investidor-anjo se concretizar antes do início das operações. A falha na terceira hipótese não
inviabiliza o negócio, mas exige redução de escopo e crescimento mais lento — como demonstrado no
cenário pessimista.

**Pontos de atenção reconhecidos pelo grupo.** O plano assume um funil de aquisição eficiente e um
custo de aquisição abaixo do que se pratica em vendas B2B assistidas; essa é a fragilidade mais
relevante da projeção. Ela é mitigada pela folga de 5,2 vezes na relação LTV/CAC e pela previsão
explícita de desaceleração do crescimento caso o CAC dobre. Do lado do custo, o cenário pessimista
demonstra que a estrutura enxuta permite reagir sem comprometer a operação, ainda que exija aporte
complementar.

**Recomendação e próximos passos.**

| # | Próximo passo | Prazo |
|---|---|---|
| 1 | Executar o piloto com 10 estúdios do Alto Tietê (hipóteses H1 e H2) antes de constituir a empresa | Trimestre anterior à abertura |
| 2 | Fechar a rodada com investidor-anjo e formalizar o acordo de sócios com *vesting* | Até 90 dias antes do início |
| 3 | Concluir as correções de dívida técnica do protótipo (mídia, migrações, MFA, testes) | Período pré-operacional |
| 4 | Implantar o painel de indicadores e os comitês de governança desde o mês 1 | Mês 1 |
| 5 | Reavaliar o plano financeiro com dados reais do trimestre e recalibrar o modelo | Mês 4 e trimestralmente |

**Reflexão de Governança de TI.** O exercício evidencia o que a disciplina propõe: em um negócio digital,
as decisões de TI *são* decisões de negócio. A escolha de arquitetura define o custo variável por aluno
e, portanto, a margem de contribuição; a política de segurança e privacidade é argumento de venda para
redes; a disciplina de mudanças determina a confiabilidade percebida e, com ela, o churn; e o painel de
indicadores é o instrumento que liga a operação técnica às metas financeiras. A governança, aqui, não é
custo de conformidade — é o mecanismo que transforma tecnologia em valor mensurável para o negócio.

---

# Apêndice A — Mapeamento das seções nas 14 ferramentas do PNBOX

A plataforma PNBOX do Sebrae organiza o plano de negócios em **quatro blocos temáticos** — *Cliente e
Mercado*, *Problema e Solução*, *Canais de Aquisição* e *Finanças* — distribuídos em **14 ferramentas**
modulares. A tabela abaixo indica em qual seção deste documento está o conteúdo de cada ferramenta, para
transcrição direta na plataforma. Os nomes das ferramentas podem variar ligeiramente na interface.

| Bloco PNBOX | Ferramenta | Seção deste plano | Conteúdo a transcrever |
|---|---|---|---|
| Cliente e Mercado | 1. Segmentação de mercado | 3.2.1 | Segmentos S1 a S4, com tamanho, plano-alvo e ticket |
| Cliente e Mercado | 2. Geração de personas | 3.2.2 | Personas Rafael, Camila, Marcos e Bruno |
| Cliente e Mercado | 3. Jornada do cliente | 3.2.3 | Oito etapas, com pontos de contato, riscos e métricas |
| Cliente e Mercado | 4. Análise da concorrência | 3.3 | Sete concorrentes comparados, incluindo "planilha + WhatsApp" |
| Problema e Solução | 5. Problema | 2.1 | Seis dimensões do problema e sua consequência econômica |
| Problema e Solução | 6. Proposta de valor | 2.2 e 2.3 | Canvas por segmento e declaração de posicionamento |
| Problema e Solução | 7. Quadro de experimentação | 2.4 | Hipóteses H1 a H7, com métrica, critério, prazo e custo |
| Canais de Aquisição | 8. Canais de aquisição | 4.3 e 4.4 | Cinco canais, participação esperada e investimento |
| Canais de Aquisição | 9. Funil de vendas | 4.4 (Quadro 15) | Etapas, taxas de conversão e metas dos meses 12, 24 e 36 |
| Finanças | 10. Investimentos | 6.2 (Quadros 1 a 3) | Investimento fixo, pré-operacional, capital de giro e fontes |
| Finanças | 11. Ganhos (receitas) | 6.3 | MRR, receita de serviços e evolução da base de clientes |
| Finanças | 12. Custos | 6.4 a 6.6 (Quadros 10, 11, 12) | Custos variáveis, de comercialização, fixos e depreciação |
| Finanças | 13. Precificação | 4.1 e 4.2 (Quadros 10 e 13) | Planos, preços, margem unitária e *unit economics* |
| Finanças | 14. DRE, indicadores e simulador de resultados | 6.7 a 6.11 (Quadros 7 a 9) | DRE, fluxo de caixa, indicadores de viabilidade e cenários |

**Roteiro sugerido de preenchimento no PNBOX.** (1) Criar o plano com o nome "TreinoLog"; (2) preencher
o bloco *Problema e Solução* (seções 2.1 a 2.4); (3) preencher *Cliente e Mercado* (seção 3);
(4) preencher *Canais de Aquisição* (seção 4); (5) lançar as *Finanças* na ordem investimentos →
ganhos → custos → DRE, conferindo cada campo contra os quadros da seção 6; (6) revisar os campos
descritivos do resumo executivo (seção 1); (7) gerar o PDF pela própria plataforma e anexá-lo à
entrega. Antes de gerar o PDF, confirmar que **nenhum campo obrigatório ficou vazio** — a completude é
o critério prioritário de avaliação da atividade.

---

# Apêndice B — Premissas e metodologia do modelo financeiro

Todos os quadros financeiros são calculados pelo arquivo `modelo_financeiro.py`, executável com
`python3 modelo_financeiro.py`, que produz `tabelas_financeiras.md` e `resultados.json`. Qualquer
premissa alterada recalcula automaticamente investimento, custos, DRE, fluxo de caixa, indicadores e
cenários — evitando divergências entre seções.

## B.1 Premissas de receita

| Parâmetro | Valor |
|---|---|
| Preços mensais | Solo R$ 49,90 / Pro R$ 99,90 / Studio R$ 349,90 / Rede R$ 1.190,00 |
| Alunos ativos por cliente (média) | Solo 14 / Pro 42 / Studio 180 / Rede 950 |
| Churn mensal | Solo 4,0% / Pro 2,8% / Studio 1,5% / Rede 0,8% |
| Serviços pontuais | Implantação: Studio R$ 890, Rede R$ 2.400; migração de base R$ 450, com adesão de 60% |
| Aluno excedente ao limite do plano | R$ 1,20/aluno/mês (não considerado na projeção, por conservadorismo) |
| Curva de aquisição | Definida mês a mês para 48 meses (vetor `ADDS` no modelo) |
| Reajuste anual | 4,5% sobre preços, folha e estrutura |

## B.2 Premissas de custo

| Parâmetro | Valor |
|---|---|
| Infraestrutura variável | R$ 0,27 por aluno ativo/mês (nuvem, notificações e mensageria) |
| Meios de pagamento | 3,29% da receita de assinaturas + R$ 0,49 por cobrança emitida |
| Comissão comercial | 3% da receita bruta |
| Encargos e provisões sobre CLT | 35% (FGTS 8% e provisões de 13º, férias e 1/3 de férias) |
| Encargos sobre estágio | 5% (auxílio-transporte); sem FGTS e 13º, conforme Lei 11.788/2008 |
| Contribuição previdenciária patronal | Recolhida no DAS (Anexo III), não somada à folha |
| Escala dos custos fixos não relacionados a pessoal | 1,00 / 1,30 / 1,70 / 2,10 (Anos 1 a 4) |
| Marketing mensal | R$ 2.500 → 3.800 → 8.000 → 13.000 → 18.000 (por faixa de meses) |
| Depreciação | Informática 5 anos; móveis 10 anos |
| *Capex* de expansão | R$ 3.000/mês (Ano 2), R$ 5.000 (Ano 3), R$ 6.000 (Ano 4) |

## B.3 Premissas tributárias

- **Simples Nacional, Anexo III** (LC 123/2006): faixas de 6,00% a 33,00% com parcela a deduzir,
  aplicadas sobre a RBT12. No primeiro ano, a RBT12 é **proporcionalizada** pela média dos meses já
  transcorridos multiplicada por 12, conforme a legislação.
- **Fator R** ≥ 28% verificado em todo o horizonte (a folha, incluindo pró-labore, supera esse
  percentual da receita), o que mantém o enquadramento no Anexo III em vez do Anexo V.
- **Lucro Presumido** a partir do mês em que a RBT12 supera R$ 4,8 milhões: presunção de 32% para
  serviços, com IRPJ 15%, adicional de 10% sobre a base que exceder R$ 20.000/mês, CSLL 9%, PIS 0,65%,
  COFINS 3% e ISS 2%.

## B.4 Premissas de financiamento e de capital

| Parâmetro | Valor |
|---|---|
| Capital social | R$ 120.000 (4 sócios × R$ 30.000) |
| Investidor-anjo | Mútuo conversível, valor definido pelo modelo para fechar o investimento total |
| Financiamento de ativos | R$ 60.000, 1,15% a.m., 36 meses, 6 de carência de principal, amortização pela Tabela Price (parcela de R$ 2.376,16) |
| Capital de giro | Maior déficit acumulado da simulação + 20% de margem de segurança |

## B.5 Premissas do funil e do dimensionamento de mercado

| Parâmetro | Valor |
|---|---|
| Conversão visitante → lead | 3,5% |
| Conversão lead → teste gratuito | 35% |
| Conversão teste → cliente pagante (autosserviço) | 22% |
| Conversão MQL → demonstração | 40% |
| Conversão demonstração → cliente (venda assistida) | 25% |
| Base de mercado (TAM) | 41.332 academias e 200.000 profissionais potenciais |
| Mercado atingível (SAM) | 45% do TAM |

## B.6 Limitações reconhecidas do modelo

1. A curva de aquisição é uma **premissa de planejamento**, não uma projeção estatística; sua validação
   é o objeto do quadro de experimentação (seção 2.4).
2. O churn é aplicado de forma constante por plano, sem sazonalidade (na prática, academias sofrem mais
   evasão em dezembro e janeiro).
3. O modelo não considera receita de aluno excedente nem de parcerias/marketplace, o que torna a
   projeção de receita conservadora.
4. Custos de infraestrutura crescem linearmente com o número de alunos; ganhos de escala em nuvem
   tendem a reduzir esse custo unitário, efeito não capturado.
5. Não há correção do capital de giro por inflação após a abertura.
6. O CAC implícito no plano é inferior ao praticado em vendas B2B assistidas; o risco está registrado
   (R1) e sensibilizado na seção 6.11.

---

# Apêndice C — Referências

**Metodologia e plataforma**

1. SEBRAE. *PNBOX — plano de negócios*. Disponível em: https://pnbox.sebrae.com.br/planoNegocio
2. SEBRAE MINAS. *PNBOX — o seu novo plano de negócios*. Disponível em: https://sebraemg.com.br/pnbox-novo-plano-negocio/
3. SEBRAE PARANÁ. *Crie planos de negócios com o PNBOX*. Disponível em: https://sebraepr.com.br/servicos/pnbox/
4. SEBRAE. *Como elaborar um plano de negócios* (estrutura de sumário executivo, análise de mercado, plano de marketing, plano operacional e plano financeiro).

**Dados de mercado (fontes secundárias)**

5. BLING. *Mercado fitness no Brasil: dados e tendências*. Disponível em: https://blog.bling.com.br/mercado-fitness-no-brasil/ — referência para 41.332 academias ativas e 13,65 milhões de alunos (HFA Global Report e CONFEF).
6. FECOMERCIO. *O novo fôlego do mercado fitness*. Disponível em: https://www.fecomercio.com.br/noticia/o-novo-folego-do-mercado-fitness — referência para 59.891 empresas ativas no segmento (CONFEF) e evolução do faturamento setorial.
7. INVESTNEWS. *Boom fitness: Brasil vê academias e alunos crescerem; medicamentos GLP-1 impulsionam o mercado*. Disponível em: https://investnews.com.br/negocios/de-influencers-a-ozempic-o-que-esta-por-tras-do-crescimento-do-mercado-fitness-no-brasil/
8. SISTEMA PACTO. *Mercado fitness no Brasil: panorama completo do setor*. Disponível em: https://blog.sistemapacto.com.br/mercado-fitness-latino-americano-brasil-2026/
9. ACAD BRASIL. *Principais motivos que levam os alunos a desistirem da academia e como reduzir a taxa de evasão*. Disponível em: https://acadbrasil.com.br/blog/noticias/principais-motivos-que-levam-os-alunos-a-desistirem-da-academia-e-como-reduzir-a-taxa-de-evasao/

**Concorrentes analisados**

10. MFIT PERSONAL. *Assinaturas*. Disponível em: https://www.mfitpersonal.com.br/pages/assinaturas.html
11. TECNOFIT. *Software para personal trainer*. Disponível em: https://www.tecnofit.com.br/blog/sistema-de-gestao-para-personal-trainer/
12. PACTO SOLUÇÕES. *Sistema para academia*. Disponível em: https://sistemapacto.com.br/sistema-para-academia/
13. PERSONALGO. *Melhor app para personal trainer em 2026: comparativo*. Disponível em: https://www.personalgo.com.br/post/melhor-app-para-personal-trainer-em-2026/
14. TREINOAI. *Melhores apps para personal trainer*. Disponível em: https://www.treinoai.com.br/academy/blog/melhor-app-para-personal-trainer-2026

**Legislação e referenciais técnicos**

15. BRASIL. Lei Complementar nº 123/2006 — Simples Nacional (Anexos III e V; Fator R).
16. BRASIL. Lei nº 13.709/2018 — Lei Geral de Proteção de Dados Pessoais (LGPD), em especial o art. 5º, II (dado pessoal sensível, incluindo dado referente à saúde).
17. BRASIL. Lei nº 11.788/2008 — Lei do Estágio.
18. BRASIL. Lei nº 9.696/1998 — regulamentação da profissão de Educação Física (atuação privativa do profissional registrado no sistema CONFEF/CREF).
19. ISACA. *COBIT 2019 Framework: Governance and Management Objectives*.
20. AXELOS. *ITIL 4 Foundation* — práticas de gerenciamento de serviços.
21. OMG. *Business Process Model and Notation (BPMN) — versão 2.0*.

**Ativo próprio do grupo**

22. Repositório do protótipo funcional `diariotreino` (Java 17, Spring Boot, Spring Security com BCrypt, Spring Data JPA, Thymeleaf, MySQL 8), desenvolvido pelos integrantes do grupo e utilizado como base técnica do produto descrito neste plano.

---

*Documento elaborado como atividade acadêmica da disciplina de Governança de TI — Universidade de Mogi
das Cruzes. Empresa, valores e projeções são fictícios, construídos a partir da metodologia Sebrae e de
dados públicos de mercado.*
