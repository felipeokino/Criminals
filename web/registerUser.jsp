<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Cadastro de Usuário</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="central" id="centralCadastroUser">

  <h2 id="hSpecial">Cadastro de Usuário</h2>
  <div class="dadoSpecial">
    <form action="controller" method="post">

      <label class="labelUser">
        CPF
        <input type="text" name="cpf">
      </label>

      <label class="labelUser">
        Nome
        <input type="text" name="first_name">
      </label>

      <label class="labelUser">
        Sobrenome
        <input type="text" name="last_name">
      </label>

      <label class="labelUser">
        Nascimento
        <input class="inputDataUser" type="date" name="niver">
      </label>

      <label class="labelUser">
        Cargo
        <input class="inputDataUser" type="text" name="office">
      </label>
      <div>
        <button type="submit" value="RegisterUser" class="btnCadastroUser" name="command">Cadastrar</button>
        <button type="reset" value="limpar" class="btnCadastroUser">Limpar</button>
        <a href="adminMain.jsp"><button class="btnCadastroUser">Voltar</button></a>
      </div>
    </form>

  </div>

</div>
</body>
</html>

