<%-- 
    Document   : paginacadastro
    Created on : 09/04/2024, 15:31:36
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./styles/cadastro.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <header></header>
        
        <main>
           <div class="container">
           <nav class="imagem"></nav>
            <div class="login">
                <h3>Nome:</h3><input type="text" id="taskUser" placeholder="Nome do usuário ">
                <br>
                <br>
                <h3>Senha:</h3><input type="text" id="taskSenha" placeholder="Senha ">
                <br>
                <br>
                <h3>Email:</h3><input type="text" id="taskEmail" placeholder="Email ">
                <br>
                <br>
                <h3>Telefone:</h3><input type="text" id="taskTele" placeholder="Telefone ">
                <br>
                <br>
                <h3>CPF:</h3><input type="text" id="taskCPF" placeholder="CPF ">
                <br>
                <br>
                <div class="buttons">
                    <a href="./login"><button id="entrarTask">Voltar</button></a>
                    <a href="./home"><button id="entrarTask">Confirmar</button></a>
                </div>
            </div>
           </div>
        </main>
        
        <footer></footer>
    </body>
</html>
