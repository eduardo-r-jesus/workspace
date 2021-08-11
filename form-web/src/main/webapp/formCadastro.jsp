<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
 <link rel="stylesheet" href="css/estilo.css">
</head>
<body>
	<ul>
        <li><a href="/form-web/formIndex.jsp"><b>Home</b></a></li>
        <li><a href="/form-web/formCadastro.jsp"><b>Cadastro</b></a></li>
        <li><a href="#Contato"><b>Contato</b></a></li>
        <li><a href="#Sobre"><b>Sobre</b></a></li>
    </ul>
 <form action="cadastroservlet" method="get">
        <fieldset>
            <legend>CADASTRO</legend>
                <img id="img-java" src="img/java.png">
                <label for="nome">Nome Completo:</label>
                <input type="text" class="larguraTexto" id="nome" name="nome-completo" placeholder="Digite o seu Nome Completo">
                <label for="telefone">Telefone:</label>
                <input type="text" class="larguraTexto" id="telefone" name="telefone" placeholder="(99)9.9999-9999)">
                <label for="dtNascimento">Data Nascimento:</label>
                <input type="date" class="larguraTexto" id="dtNascimento" name="dt-Nascimento" placeholder="Informe sua data de nascimento">
                <label for="email">E-mail:</label>
                <input type="email" class="larguraTexto" id="email" name="e-mail" placeholder="Informe seu e-mail">
                <label for="sexo">Sexo:</label>
                <div class="bloco-inline">
                    <input type="radio" id="masc" name="sexo" value="m"><label for="masc">Masculino</label>
                    <input type="radio" id="fem" name="sexo" value="f"><label for="fem">Feminino</label>
                </div>
                <label for="tecnologia">Tecnologia:</label>
                <div class="bloco-inline">
                    <input type="checkbox" id="masc" name="tecnologia" value="html"><label for="html">HTML</label>
                    <input type="checkbox" id="css" name="tecnologia" value="css"><label for="css">CSS</label>
                    <input type="checkbox" id="java" name="tecnologia" value="java"><label for="java">JAVA</label>
                    <input type="checkbox" id="php" name="tecnologia" value="php"><label for="php">PHP</label>
                </div>

                <label for="escolaridade">Escolaridade</label>
                <select name="escolaridade" class="larguraTexto" id="escolaridade">
                    <option value="Selecione">Selecione</option>
                    <option value="Ensino Fundamental">Ensino Fundamental</option>
                    <option value="Ensino M�dio">Ensino Médio</option>
                    <option value="Ensino Superior">Ensino Superior</option>
                    <option value="Especializa��o">Especialização</option>
                    <option value="Mestrado">Mestrado</option>
                    <option value="Doutorado">Doutorado</option>
                </select>

                <input type="submit" class="bt" id="espacamento" value="Enviar">
                <input type="reset" class="bt"  value="Limpar">
        </fieldset>
    </form> 
</body>
</html>