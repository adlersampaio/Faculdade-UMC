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
**R$ {{INV_TOTAL}}**, equilíbrio operacional no **mês 18**, fluxo de caixa positivo no **mês 19** e
recomposição integral do caixa investido no **mês 32**. No Ano 3, a projeção é de
**R$ {{REC_ANO3}} de receita bruta**, **{{CLIENTES_M36}} clientes ativos** e lucratividade de
**{{LUCRATIVIDADE}}** no mês típico.

| Indicador-síntese | Ano 1 (2027) | Ano 2 (2028) | Ano 3 (2029) |
|---|---:|---:|---:|
| Receita bruta (R$) | {{REC_ANO1}} | {{REC_ANO2}} | {{REC_ANO3}} |
| Resultado líquido (R$) | {{LUCRO_ANO1}} | {{LUCRO_ANO2}} | {{LUCRO_ANO3}} |
| Clientes ativos em dezembro | {{CLIENTES_M12}} | {{CLIENTES_M24}} | {{CLIENTES_M36}} |
| Receita recorrente mensal (MRR) em dezembro (R$) | {{MRR_M12}} | {{MRR_M24}} | {{MRR_M36}} |
| Alunos ativos atendidos na plataforma | {{ALUNOS_M12}} | {{ALUNOS_M24}} | {{ALUNOS_M36}} |

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
| O2 | Alcançar {{CLIENTES_M12}} clientes pagantes e R$ {{MRR_M12}} de MRR | Mês 12 | Relatório de assinaturas |
| O3 | Manter churn mensal ≤ 4,0% (Solo) e ≤ 1,5% (Studio) | Mensal | Painel de retenção |
| O4 | Atingir resultado líquido positivo | Mês 18 | DRE mensal |
| O5 | Manter NPS ≥ 60 e CSAT ≥ 4,5/5,0 | A partir do mês 9 | Pesquisa trimestral e pós-atendimento |
| O6 | Sustentar disponibilidade ≥ 99,5% e MTTR ≤ 4 horas | Mensal | Monitoramento e registro de incidentes |
| O7 | Recompor integralmente o caixa investido | Mês 32 | Fluxo de caixa acumulado |
| O8 | Alcançar R$ {{REC_ANO3}} de receita e {{CLIENTES_M36}} clientes | Ano 3 | DRE anual |
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

{{QUADRO 16}}

A leitura do quadro é deliberadamente conservadora: a meta do Ano 3 representa **{{SOM_PCT}} do mercado
atingível**, com presença em **{{PEN_ESTAB}} dos estabelecimentos** do país. O plano não depende, portanto, de
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

{{QUADRO 10}}

**Política comercial.** (a) 14 dias de teste sem cartão de crédito; (b) desconto de 15% no pagamento
anual antecipado, que melhora o caixa e reduz churn; (c) sem multa de fidelidade — a retenção é
sustentada por valor, não por contrato; (d) reajuste anual pelo IPCA, comunicado com 60 dias de
antecedência; (e) para instituições de ensino e conselhos parceiros, licença de uso acadêmico gratuita,
que alimenta o canal de indicação.

{{QUADRO 13}}

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

{{QUADRO 15}}

O funil está dimensionado a partir das metas de aquisição do plano financeiro: para entregar
{{NOVOS_M12}} novos clientes no mês 12, é preciso sustentar cerca de {{VISITAS_M12}} visitantes únicos
e {{TRIALS_M12}} testes iniciados por mês. Esse é o principal ponto de atenção do plano — e a razão de
o quadro de experimentação testar as taxas de conversão desde o mês 2.

{{QUADRO 14}}

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
| Suporte / sucesso do cliente | ~250 clientes por analista | {{CLIENTES_M12}} clientes | {{CLIENTES_M24}} clientes | {{CLIENTES_M36}} clientes | 1 analista no mês 7; 2º no mês 16; 3º no Ano 4 |
| Capacidade comercial | 16 fechamentos/mês por dupla | 8 assistidos/mês | 14 assistidos/mês | 21 assistidos/mês | Dupla no Ano 2; reforço no Ano 3 |
| Infraestrutura em nuvem | Escala horizontal automática | {{ALUNOS_M12}} alunos | {{ALUNOS_M24}} alunos | {{ALUNOS_M36}} alunos | Teste de carga trimestral a 2× o pico |
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

{{QUADRO 11}}

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

{{QUADRO 1}}

{{QUADRO 2}}

{{QUADRO 3}}

**Como o capital de giro foi dimensionado.** Em negócios de receita recorrente, o caixa é consumido
antes de a base de assinantes cobrir a estrutura. O modelo simula os 48 meses com caixa inicial zero,
identifica o **maior déficit acumulado** e adiciona 20% de margem de segurança. O resultado
(R$ {{CAIXA_MIN}}) responde por {{PCT_GIRO}} do investimento total — proporção esperada em software,
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
| Mês 12 (dez/2027) | {{CLIENTES_M12}} | {{ALUNOS_M12}} | {{MRR_M12}} | {{RECMES_M12}} |
| Mês 24 (dez/2028) | {{CLIENTES_M24}} | {{ALUNOS_M24}} | {{MRR_M24}} | {{RECMES_M24}} |
| Mês 36 (dez/2029) | {{CLIENTES_M36}} | {{ALUNOS_M36}} | {{MRR_M36}} | {{RECMES_M36}} |

Composição da base ao fim do Ano 3: {{MIX_M36}}. A concentração de receita nos planos Studio e Rede é
intencional — são os segmentos de maior margem de contribuição, menor churn e maior custo de troca.

## 6.4 Custos variáveis e custos de comercialização

Os custos que variam com a receita são: **impostos sobre vendas**, **taxas de meios de pagamento**,
**comissão comercial (3%)** e **infraestrutura por aluno ativo**. O custo variável unitário de cada
plano e a margem de contribuição resultante constam do **Quadro 10** (seção 4.2); os custos de
comercialização, no **Quadro 14** (seção 4.4).

O indicador operacional que sintetiza essa estrutura é o **índice de margem de contribuição de
{{IMC}}** no mês típico: de cada R$ 100 faturados, R$ {{IMC_REAIS}} ficam disponíveis para cobrir
custos fixos e gerar lucro.

## 6.5 Custos fixos operacionais

{{QUADRO 12}}

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

{{QUADRO 10.1}}

## 6.8 Demonstrativo de resultados (DRE)

{{QUADRO 7}}

**Leitura do resultado.** O Ano 1 fecha com prejuízo de R$ {{PREJUIZO_ANO1}} — resultado esperado e
planejado, coberto pelo capital de giro dimensionado no Quadro 3. O Ano 2 já apresenta lucro líquido de
R$ {{LUCRO_ANO2}}, e o Ano 3 alcança R$ {{LUCRO_ANO3}}, equivalentes a {{MARGEM_ANO3}} da receita
bruta. O ponto de virada é o **mês 18**, quando a margem de contribuição passa a cobrir integralmente
a estrutura fixa.

## 6.9 Fluxo de caixa

{{QUADRO 4}}

{{QUADRO 5}}

{{QUADRO 6}}

{{QUADRO 6.1}}

O menor saldo de caixa do período é de **R$ {{MENOR_CAIXA}}**, o que confirma o dimensionamento do
capital de giro: a empresa atravessa todo o ramp-up sem necessidade de aporte extraordinário no cenário
realista. O fluxo de caixa passa a ser positivo de forma sustentada no **mês 19**.

## 6.10 Indicadores de viabilidade

{{QUADRO 8}}

**Interpretação.**

- **Ponto de equilíbrio.** A empresa precisa faturar R$ {{PE}} por mês para não ter prejuízo no mês
  típico, o equivalente a {{PE_PCT}} da receita projetada — folga de {{PE_FOLGA}} sobre o nível de
  operação previsto.
- **Lucratividade de {{LUCRATIVIDADE}}.** Compatível com SaaS em fase de crescimento, que reinveste
  parte da margem em aquisição e produto em vez de maximizar lucro imediato.
- **Payback no mês 32.** Prazo coerente com negócios de receita recorrente, em que o retorno se
  constrói pelo acúmulo da base. Pela fórmula simples do Sebrae o prazo seria de 8,6 meses, mas essa
  conta ignora o prejuízo do ramp-up; o grupo optou por divulgar o indicador mais conservador.
- **Retenção como principal alavanca.** Como a margem de contribuição é alta, cada ponto percentual de
  churn evitado tem efeito maior no resultado do que a mesma variação em preço — o que justifica o
  investimento no motor de retenção.

## 6.11 Construção de cenários e análise de sensibilidade

{{QUADRO 9}}

**Cenário pessimista — e o que fazer.** O cenário combina aquisição 35% menor, churn 40% maior e preço
médio 5% menor, já com o **freio de custos** acionado (contratações adiadas em 6 meses e marketing
reduzido em 40%). Mesmo assim, o caixa chega a R$ {{PESS_CAIXA}} no pior mês, o que indica a
necessidade de **aporte adicional de aproximadamente R$ 130 mil** ou de antecipação da rodada seguinte.
Por isso o plano prevê, como medida preventiva: (a) cláusula de *follow-on* com o investidor-anjo;
(b) linha de crédito pré-aprovada de R$ 150 mil; e (c) receita de serviços de customização como
alavanca de caixa de curto prazo, aproveitando a competência técnica da equipe.

**Sensibilidade ao custo de aquisição.** Se o CAC dobrar em relação ao previsto no Ano 3, o custo
comercial adicional de R$ {{CAC_ANO3}} reduziria o lucro líquido do exercício de R$ {{LUCRO_ANO3}}
para cerca de R$ {{LUCRO_ANO3_CAC2X}} — a operação continuaria viável, mas o crescimento teria de ser
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
| F6. Margem de contribuição elevada ({{IMC}}) | W6. Ausência de integrações prontas com ERPs no lançamento |
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
| **F3 + A3** (defensiva) | Estrutura enxuta permite sustentar o negócio mesmo com CAC maior; folga de {{FOLGA_CAC}} na relação LTV/CAC |
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
| R1 | CAC acima do previsto | A | A | **Alta** | Canais de baixo custo (parcerias, indicação, conteúdo); folga de {{FOLGA_CAC}} em LTV/CAC | CAC > R$ 350 por 2 meses consecutivos | CEO |
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
indicadores do mês típico (margem de contribuição de {{IMC}}, lucratividade de {{LUCRATIVIDADE}},
ponto de equilíbrio {{PE_FOLGA}} abaixo da receita projetada e recomposição do caixa investido no mês
32) sustentam a decisão de seguir. O investimento total de R$ {{INV_TOTAL}} é compatível com a
capacidade de captação descrita, e o menor saldo de caixa projetado (R$ {{MENOR_CAIXA}}) mostra que o
capital de giro foi dimensionado com folga suficiente para o ramp-up.

**Condicionantes.** A viabilidade depende de três hipóteses que o plano trata explicitamente como
críticas: (1) o custo de aquisição permanecer na ordem de grandeza projetada, sustentado por canais de
baixo custo; (2) o churn dos planos Studio e Rede permanecer nos níveis previstos; e (3) a rodada com
investidor-anjo se concretizar antes do início das operações. A falha na terceira hipótese não
inviabiliza o negócio, mas exige redução de escopo e crescimento mais lento — como demonstrado no
cenário pessimista.

**Pontos de atenção reconhecidos pelo grupo.** O plano assume um funil de aquisição eficiente e um
custo de aquisição abaixo do que se pratica em vendas B2B assistidas; essa é a fragilidade mais
relevante da projeção. Ela é mitigada pela folga de {{FOLGA_CAC}} na relação LTV/CAC e pela previsão
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
