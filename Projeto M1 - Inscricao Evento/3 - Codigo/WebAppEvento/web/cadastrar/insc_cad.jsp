<%--
    Document   : insc_cad
    Projeto    : Inscrição para Evento - Atividade 1 - M1
    Descrição  : Recebe os dados do formulário, grava no banco e mostra o resultado
    Author     : Gabriel Gomes, Adler Augusto Vendramel Sampaio, Julia Nascimento Ignácio
--%>

<%@page import="model.Inscricao"%>
<%@page import="model.DAO.InscricaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Web App Evento</title>
    </head>
    <body>
        <h2>Inscrição para o Evento (CTRL) - Cadastrar</h2>
        <%
            request.setCharacterEncoding("UTF-8"); //Encoding "UTF-8"

            // Instância obj. / Entrada (dados vindos do formulário)
            Inscricao insc = new Inscricao(
                    0,
                    request.getParameter("nome"),
                    request.getParameter("email"),
                    request.getParameter("telefone"),
                    request.getParameter("cpf"),
                    request.getParameter("data_nasc"),
                    request.getParameter("empresa"),
                    request.getParameter("cargo"),
                    request.getParameter("cidade"),
                    request.getParameter("estado"),
                    request.getParameter("modalidade") );

            //SALVAR - GRAVAR
            InscricaoDAO inscDAO = new InscricaoDAO();

            if (inscDAO.cadastrar(insc) == true){
                out.println("<br> <b>Inscrição realizada com sucesso!!!</b> ");
            }else{
                out.println("<br> <b>Inscrição NÃO realizada!</b> ");
            }

            // Saída / Processamento
            out.println("<br><br> <b>Nome..............:</b> " + insc.getNome());
            out.println("<br> <b>E-mail............:</b> " + insc.getEmail());
            out.println("<br> <b>Telefone..........:</b> " + insc.getTelefone());
            out.println("<br> <b>CPF...............:</b> " + insc.getCpf());
            out.println("<br> <b>Data de nascimento:</b> " + insc.getDataNasc());
            out.println("<br> <b>Empresa...........:</b> " + insc.getEmpresa());
            out.println("<br> <b>Cargo.............:</b> " + insc.getCargo());
            out.println("<br> <b>Cidade / UF.......:</b> " + insc.getCidade() + " / " + insc.getEstado());
            out.println("<br> <b>Modalidade........:</b> " + insc.getModalidade());
        %>
        <p> <a href="index.html"> Nova inscrição </a> | <a href="../index.html"> Menu </a> </p>
    </body>
</html>
