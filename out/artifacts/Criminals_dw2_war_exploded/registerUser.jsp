<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro Usuario</title>
    <meta charset="UTF-8"/>
    <link rel="stylesheet" type="text/css" href="style.css">
    <%--<meta http-equiv="refresh" content="0"/>--%>
</head>
<body background="images.jpg" style="color: white">
  <form id="register_form">
    <div class="form_child">
      <label>CPF</label>
      <input type="text" name="cpf">

      <label>Nome</label>
      <input type="text" name="first_name">

      <label>Sobrenome</label>
      <input type="text" name="last_name">

      <label>Nascimento</label>
      <input type="date" name="niver">
    </div>
    <div>
      <input type="submit" name="enviar" value="Enviar">
      <input type="reset" name="limpar" value="limpar">
    </div>
  </form>
  <input type="submit" name="enviar" value="Cadastrar">
  <a href="adminMain.jsp"><button>Voltar</button></a>
  </body>
</html>
