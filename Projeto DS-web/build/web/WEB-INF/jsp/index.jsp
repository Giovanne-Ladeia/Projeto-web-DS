<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./styles/index.css" rel="stylesheet" type="text/css"/>
        <title>Welcome to Spring Web MVC project</title>
        
    </head>

    <body>
        <header></header>

        <main>
            <div class="container">
        <nav class="imagem"></nav>
        <div class="login">
            <h1>Login</h1>
            <div class="teste">
                <i class="fa-solid fa-user"></i><input type="text" id="taskUser" placeholder="Nome do usuário ">
            </div>
            <br>
            <br>
            <div class="teste">
                <i class="fa-solid fa-lock"></i><input type="text" id="taskSenha" placeholder="Senha">
            </div>
            <br>
            <br>
            <a href="pages/pagina1jsp.jsp"><button id="entrarTask">Entrar</button></a>
        </div>
    </div>
        </main>

        <footer></footer>
        
    </body>
</html>
