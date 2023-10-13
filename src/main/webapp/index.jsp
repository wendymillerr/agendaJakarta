<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Minha Página JSP</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
    <h1>Formulário JSP</h1>
    
    <div class="form-container">
        <form action="telaLoginServlet" method="post">
            <div class="form-group">
                <label for="usuario">Nome: </label>
                <input type="text" name="usuario" id="usuario">
            </div>
            <div class="form-group">
                <label for="senha">Senha: </label>
                <input type="password" name="senha" id="senha">
            </div>
            <div class="form-group">
                <input type="submit" value="Enviar">
            </div>
        </form>
    </div>
</body>
</html>
