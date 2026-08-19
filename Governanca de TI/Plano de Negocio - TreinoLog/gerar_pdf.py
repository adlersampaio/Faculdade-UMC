# -*- coding: utf-8 -*-
"""
Gera o PDF final do plano de negócios a partir de plano_de_negocios.md.

Converte o subconjunto de Markdown usado no documento (títulos de 1 a 3
níveis, parágrafos, negrito/itálico/código, listas, citações e tabelas) em um
PDF paginado com capa, cabeçalho, numeração de páginas e páginas em paisagem
para as tabelas mais largas.

Uso: python3 gerar_pdf.py
"""
import re
import xml.sax.saxutils as sx

from reportlab.lib import colors
from reportlab.lib.enums import TA_CENTER, TA_JUSTIFY
from reportlab.lib.pagesizes import A4, landscape
from reportlab.lib.styles import ParagraphStyle
from reportlab.lib.units import cm
from reportlab.platypus import (BaseDocTemplate, Frame, KeepTogether, NextPageTemplate,
                                PageBreak, PageTemplate, Paragraph, Spacer, Table,
                                TableStyle)

ORIGEM = "plano_de_negocios.md"
DESTINO = "Plano de Negocios - TreinoLog.pdf"
COLUNAS_PAISAGEM = 10         # a partir daqui a tabela vai para página em paisagem

AZUL = colors.HexColor("#1F3A5F")
AZUL_CLARO = colors.HexColor("#E8EEF6")
CINZA = colors.HexColor("#555555")
CINZA_CLARO = colors.HexColor("#F4F6F9")
BORDA = colors.HexColor("#B9C4D2")

# ------------------------------------------------------------------ estilos
def est(nome, **kw):
    base = dict(fontName="Times-Roman", fontSize=9.8, leading=13.4,
                spaceAfter=5, alignment=TA_JUSTIFY, textColor=colors.black)
    base.update(kw)
    return ParagraphStyle(nome, **base)


S = {
    "corpo": est("corpo"),
    "h1": est("h1", fontName="Helvetica-Bold", fontSize=17, leading=21, textColor=AZUL,
              spaceBefore=2, spaceAfter=10, alignment=0),
    "h2": est("h2", fontName="Helvetica-Bold", fontSize=12.5, leading=16, textColor=AZUL,
              spaceBefore=12, spaceAfter=5, alignment=0, keepWithNext=1),
    "h3": est("h3", fontName="Helvetica-Bold", fontSize=10.5, leading=14, textColor=CINZA,
              spaceBefore=9, spaceAfter=3, alignment=0, keepWithNext=1),
    "lista": est("lista", leftIndent=14, bulletIndent=4, spaceAfter=3),
    "citacao": est("citacao", fontSize=9, leading=12.4, textColor=CINZA,
                   leftIndent=12, borderPadding=0, spaceBefore=3, spaceAfter=7),
    "cel": est("cel", fontName="Helvetica", fontSize=7.6, leading=9.6, spaceAfter=0,
               alignment=0),
    "cel_dir": est("cel_dir", fontName="Helvetica", fontSize=7.6, leading=9.6,
                   spaceAfter=0, alignment=2),
    "cel_cab": est("cel_cab", fontName="Helvetica-Bold", fontSize=7.6, leading=9.6,
                   spaceAfter=0, textColor=colors.white, alignment=0),
    "capa_titulo": est("capa_titulo", fontName="Helvetica-Bold", fontSize=52, leading=58,
                       textColor=AZUL, alignment=TA_CENTER, spaceAfter=6),
    "capa_sub": est("capa_sub", fontName="Helvetica-Bold", fontSize=20, leading=25,
                    textColor=CINZA, alignment=TA_CENTER, spaceAfter=18),
    "capa_txt": est("capa_txt", fontSize=11, leading=16, alignment=TA_CENTER,
                    spaceAfter=8),
}


def inline(txt):
    """Markdown inline -> marcação do reportlab."""
    txt = sx.escape(txt)
    txt = re.sub(r"\*\*(.+?)\*\*", r"<b>\1</b>", txt)
    txt = re.sub(r"(?<!\*)\*([^*]+?)\*(?!\*)", r"<i>\1</i>", txt)
    txt = re.sub(r"`([^`]+?)`", r'<font face="Courier">\1</font>', txt)
    return txt


def cabecalho_rodape(canv, doc):
    canv.saveState()
    largura, altura = canv._pagesize
    if doc.page > 1:
        canv.setFont("Helvetica", 7.5)
        canv.setFillColor(CINZA)
        canv.drawString(2.0 * cm, altura - 1.25 * cm,
                        "TreinoLog Tecnologia Ltda. — Plano de Negócios")
        canv.drawRightString(largura - 2.0 * cm, altura - 1.25 * cm,
                             "Governança de TI — UMC")
        canv.setStrokeColor(BORDA)
        canv.setLineWidth(0.5)
        canv.line(2.0 * cm, altura - 1.42 * cm, largura - 2.0 * cm, altura - 1.42 * cm)
        canv.setFont("Helvetica", 8)
        canv.drawCentredString(largura / 2.0, 1.25 * cm, str(doc.page))
    canv.restoreState()


# ------------------------------------------------------------------ leitura
linhas = open(ORIGEM, encoding="utf-8").read().split("\n")
fluxo = []
na_capa = True
primeiro_h1 = True
em_paisagem = False
i = 0


def proxima_e_tabela_larga(lns, k):
    """Verifica se o próximo bloco (ignorando linhas vazias) é uma tabela larga."""
    while k < len(lns) and not lns[k].strip():
        k += 1
    if k + 1 < len(lns) and lns[k].strip().startswith("|") and \
            re.match(r"^\|[\s\-:|]+\|$", lns[k + 1].strip()):
        return len(lns[k].strip().strip("|").split("|")) >= COLUNAS_PAISAGEM
    return False


def voltar_ao_retrato():
    """Encerra a sequência de páginas em paisagem, se houver uma aberta."""
    global em_paisagem
    if em_paisagem:
        fluxo.extend([NextPageTemplate("retrato"), PageBreak()])
        em_paisagem = False

while i < len(linhas):
    bruto = linhas[i].strip()

    # ---- tabela
    if bruto.startswith("|") and i + 1 < len(linhas) and \
            re.match(r"^\|[\s\-:|]+\|$", linhas[i + 1].strip()):
        cab = [c.strip() for c in bruto.strip("|").split("|")]
        alinha = [c.strip() for c in linhas[i + 1].strip().strip("|").split("|")]
        i += 2
        corpo = []
        while i < len(linhas) and linhas[i].strip().startswith("|"):
            cels = [c.strip() for c in linhas[i].strip().strip("|").split("|")]
            cels += [""] * (len(cab) - len(cels))
            corpo.append(cels[:len(cab)])
            i += 1

        n = len(cab)
        paisagem = n >= COLUNAS_PAISAGEM
        util = (27.0 if paisagem else 17.0) * cm
        tam = 6.2 if n >= 11 else (6.8 if n >= 9 else (7.2 if n >= 7 else 7.8))

        e_cab = ParagraphStyle("c", parent=S["cel_cab"], fontSize=tam, leading=tam + 1.9)
        e_esq = ParagraphStyle("e", parent=S["cel"], fontSize=tam, leading=tam + 2.1)
        e_dir = ParagraphStyle("d", parent=S["cel_dir"], fontSize=tam, leading=tam + 2.1)

        dados = [[Paragraph(inline(c.replace("**", "")), e_cab) for c in cab]]
        for linha in corpo:
            dados.append([
                Paragraph(inline(c), e_dir if (j < len(alinha) and alinha[j].endswith(":"))
                          else e_esq)
                for j, c in enumerate(linha)])

        # largura das colunas proporcional ao conteúdo, com piso e teto
        pesos = []
        for j in range(n):
            maior = max(len(re.sub(r"[*`]", "", (l[j] if j < len(l) else "")))
                        for l in [cab] + corpo)
            pesos.append(min(max(maior, 6), 46))
        total = float(sum(pesos))
        larguras = [util * p / total for p in pesos]

        tab = Table(dados, colWidths=larguras, repeatRows=1, hAlign="CENTER")
        estilo = [
            ("BACKGROUND", (0, 0), (-1, 0), AZUL),
            ("GRID", (0, 0), (-1, -1), 0.4, BORDA),
            ("VALIGN", (0, 0), (-1, -1), "MIDDLE"),
            ("TOPPADDING", (0, 0), (-1, -1), 2.2),
            ("BOTTOMPADDING", (0, 0), (-1, -1), 2.2),
            ("LEFTPADDING", (0, 0), (-1, -1), 3),
            ("RIGHTPADDING", (0, 0), (-1, -1), 3),
        ]
        for k in range(1, len(dados)):
            if k % 2 == 0:
                estilo.append(("BACKGROUND", (0, k), (-1, k), CINZA_CLARO))
        tab.setStyle(TableStyle(estilo))

        if paisagem:
            # o título do quadro acompanha a tabela na mesma página
            titulo = None
            while fluxo and isinstance(fluxo[-1], Spacer):
                fluxo.pop()
            if fluxo and isinstance(fluxo[-1], Paragraph) and \
                    fluxo[-1].style.name == "h2" and \
                    fluxo[-1].getPlainText().startswith("Quadro"):
                titulo = fluxo.pop()
            if not em_paisagem:
                fluxo += [NextPageTemplate("paisagem"), PageBreak()]
                em_paisagem = True
            juntos = ([titulo] if titulo is not None else []) + [tab]
            fluxo += [KeepTogether(juntos), Spacer(1, 12)]
        else:
            voltar_ao_retrato()
            fluxo += [Spacer(1, 2), tab, Spacer(1, 8)]
        continue

    # ---- títulos
    if bruto.startswith("# "):
        voltar_ao_retrato()
        if primeiro_h1:
            fluxo += [Spacer(1, 4.2 * cm), Paragraph(inline(bruto[2:]), S["capa_titulo"])]
            primeiro_h1 = False
        else:
            fluxo += [PageBreak(), Paragraph(inline(bruto[2:]), S["h1"])]
        i += 1
        continue
    if bruto.startswith("## "):
        if not proxima_e_tabela_larga(linhas, i + 1):
            voltar_ao_retrato()
        estilo = S["capa_sub"] if na_capa else S["h2"]
        fluxo.append(Paragraph(inline(bruto[3:]), estilo))
        i += 1
        continue
    if bruto.startswith("### "):
        voltar_ao_retrato()
        fluxo.append(Paragraph(inline(bruto[4:]), S["h3"]))
        i += 1
        continue

    # ---- régua horizontal
    if bruto == "---":
        if na_capa:                      # fim da capa: começa em página nova
            na_capa = False
            fluxo.append(PageBreak())
        i += 1
        continue

    # ---- citação
    if bruto.startswith(">"):
        voltar_ao_retrato()
        bloco = []
        while i < len(linhas) and linhas[i].strip().startswith(">"):
            bloco.append(linhas[i].strip().lstrip(">").strip())
            i += 1
        p = Paragraph(inline(" ".join(bloco)), S["citacao"])
        t = Table([[p]], colWidths=[17.0 * cm])
        t.setStyle(TableStyle([
            ("BACKGROUND", (0, 0), (-1, -1), AZUL_CLARO),
            ("LINEBEFORE", (0, 0), (0, -1), 2, AZUL),
            ("TOPPADDING", (0, 0), (-1, -1), 5),
            ("BOTTOMPADDING", (0, 0), (-1, -1), 5),
            ("LEFTPADDING", (0, 0), (-1, -1), 8),
            ("RIGHTPADDING", (0, 0), (-1, -1), 8),
        ]))
        fluxo += [t, Spacer(1, 7)]
        continue

    # ---- listas
    m_num = re.match(r"^(\d+)\.\s+(.*)$", bruto)
    if bruto.startswith("- ") or m_num:
        voltar_ao_retrato()
        itens = []
        while i < len(linhas):
            atual = linhas[i].strip()
            mn = re.match(r"^(\d+)\.\s+(.*)$", atual)
            if not (atual.startswith("- ") or mn):
                break
            texto = mn.group(2) if mn else atual[2:]
            marca = f"{mn.group(1)}." if mn else "\u2022"
            i += 1
            while i < len(linhas) and linhas[i].startswith("  ") and linhas[i].strip():
                texto += " " + linhas[i].strip()
                i += 1
            itens.append(Paragraph(inline(texto), S["lista"], bulletText=marca))
        if len(itens) <= 9:
            fluxo.append(KeepTogether(itens))
        else:
            fluxo.extend(itens)
        continue

    # ---- parágrafo
    if bruto:
        voltar_ao_retrato()
        bloco = [bruto]
        i += 1
        while (i < len(linhas) and linhas[i].strip()
               and not linhas[i].strip().startswith(("#", "|", ">", "- ", "---"))
               and not re.match(r"^\d+\.\s", linhas[i].strip())):
            bloco.append(linhas[i].strip())
            i += 1
        estilo = S["capa_txt"] if na_capa else S["corpo"]
        fluxo.append(Paragraph(inline(" ".join(bloco)), estilo))
        continue

    i += 1

# ------------------------------------------------------------------ montagem
doc = BaseDocTemplate(DESTINO, pagesize=A4, title="Plano de Negócios - TreinoLog",
                      author="Grupo de Governança de TI - UMC",
                      subject="Plano de Negócios (metodologia Sebrae / PNBOX)",
                      leftMargin=2 * cm, rightMargin=2 * cm,
                      topMargin=2 * cm, bottomMargin=2 * cm)
retrato = PageTemplate(
    id="retrato", onPage=cabecalho_rodape,
    frames=[Frame(2 * cm, 2 * cm, A4[0] - 4 * cm, A4[1] - 4 * cm, id="r")])
lp = landscape(A4)
paisagem = PageTemplate(
    id="paisagem", onPage=cabecalho_rodape, pagesize=lp,
    frames=[Frame(1.5 * cm, 1.5 * cm, lp[0] - 3 * cm, lp[1] - 3.4 * cm, id="p")])
doc.addPageTemplates([retrato, paisagem])
doc.build(fluxo)

import os
print(f"{DESTINO} gerado — {os.path.getsize(DESTINO)/1024:.0f} KB, "
      f"{doc.page} páginas, {sum(1 for f in fluxo if isinstance(f, Table))} tabelas")
