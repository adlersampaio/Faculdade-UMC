<%--
    Document   : insc_cons_nome
    Projeto    : Inscrição para Evento - Atividade 1 - M1
    Descrição  : Busca uma inscrição pelo nome completo e mostra os dados
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
        <h2>Inscrição para o Evento (CTRL) - Consultar Nome</h2>
        <%
            request.setCharacterEncoding("UTF-8"); //Encoding "UTF-8"

            // Entrada
            String nome = request.getParameter("insc_nome");

            //Consultar Nome
            InscricaoDAO inscDAO = new InscricaoDAO();

            // Instância obj.
            Inscricao insc = inscDAO.consultarNome(nome);

            // cod = 0 significa que nenhuma linha foi encontrada
            if (insc == null || insc.getCod()==0){
                out.println("<br> <b>Inscrição Não encontrada!!!</b> ");
            }else{
                out.println("<br> Inscrição Localizada! ");
                // Saída / Processamento
                out.println("<br><br> <b>Identificador.....:</b> " + insc.getCod());
                out.println("<br> <b>Nome..............:</b> " + insc.getNome());
                out.println("<br> <b>E-mail............:</b> " + insc.getEmail());
                out.println("<br> <b>Telefone..........:</b> " + insc.getTelefone());
                out.println("<br> <b>CPF...............:</b> " + insc.getCpf());
                out.println("<br> <b>Data de nascimento:</b> " + insc.getDataNasc());
                out.println("<br> <b>Empresa...........:</b> " + insc.getEmpresa());
                out.println("<br> <b>Cargo.............:</b> " + insc.getCargo());
                out.println("<br> <b>Cidade / UF.......:</b> " + insc.getCidade() + " / " + insc.getEstado());
                out.println("<br> <b>Modalidade........:</b> " + insc.getModalidade());
                out.println("<br> <b>Data da inscrição.:</b> " + insc.getDataInscricao());
            }
        %>
        <p> <a href="index.html"> Nova consulta </a> | <a href="../index.html"> Menu </a> </p>
    </body>
</html>
