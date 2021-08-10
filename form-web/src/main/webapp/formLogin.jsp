<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/estilo.css">
</head>
<body>
    <fieldset>
    <legend>ACESSAR</legend>
    <form action="loginservlet" method="post">        
            <img id="img-java" src="img/java.png">
            <label for="login">Login:</label>
            <input type="text" class="larguraTexto" id="login" name="login" autocomplete="off" placeholder="Digite o seu Login">
            <label for="senha">Senha:</label>
            <input type="password" class="larguraTexto" id="senha" name="senha" placeholder="Digite sua senha">
            <input type="submit" class="bt" value="Acessar">
    </form>
    </fieldset>
</body>
</html>