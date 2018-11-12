<%--
  // tela inicial do admin
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Registro Bairro</title>
  <meta charset="UTF-8"/>
  <link rel="stylesheet" type="text/css" href="style.css">
  <%--<meta http-equiv="refresh" content="0"/>--%>
</head>
<body background="images.jpg" style="color: white">
<fieldset class="principal">
  <h2 >Novo Bairro</h2>
  <form id="register_form">
    <div class="form_child">
      <label>Nome</label>
      <input type="text" name="name">

      <label>Cidade</label>
      <input type="text" name="city">

      <input type="submit" name="enviar" value="Cadastrar">
      <a href="adminMain.jsp"><button>Voltar</button></a>
    </div>
  </form>
</fieldset>
</body>
</html>