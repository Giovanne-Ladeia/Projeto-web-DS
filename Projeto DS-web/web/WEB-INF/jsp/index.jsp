<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//PT-BR"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <link rel="stylesheet" href="./styles/login.css">
        <title>Welcome to Spring Web MVC project</title>
        
    </head>

    <body>
        <header></header>

        <main>
            <div class="container mt-5">
            <div class="row justify-content-center">
              <div class="col-md-6">
                <div class="card">
                  <div class="card-header bg-primary text-white">
                    <h3 class="text-center">Login</h3>
                  </div>
                  <div class="card-body">
                    <form action="logar" name="frmLogin">
                      <div class="form-group">
                        <label for="username">Usuário</label>
                        <input type="text" class="form-control" id="username" placeholder="Digite seu usuário">
                      </div>
                      <div class="form-group">
                        <label for="password">Senha</label>
                        <input type="password" class="form-control" id="password" placeholder="Digite sua senha">
                      </div>
                      <button type="submit" class="btn btn-login btn-block">Entrar</button>
                    </form>
                  </div>
                  <div class="card-footer">
                    <p class="text-center mb-0">Não possui cadastro? <a href="./cadastrar">Cadastre-se</a></p>
                  </div>
                </div>
              </div>
            </div>
          </div>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js" integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V" crossorigin="anonymous"></script>
        </main>

        <footer></footer>
        
    </body>
</html>
