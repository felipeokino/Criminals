<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Login</title>
  <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<form class="central" action="controller" method="post">
  <h1>Login de Usuário</h1>
  <div class="dados">
    <label>Usuário</label>
    <input type="text" name="login">

    <label>Senha</label>
    <input type="password" name="password">
  </div>

  <div class="botoes">
    <button type="submit" class="btn" name="command" value="Login">Entrar</button>
    <a href="index.jsp"><button class="btn">Cancelar</button></a>
  </div>

</form>
</body>
</html>

