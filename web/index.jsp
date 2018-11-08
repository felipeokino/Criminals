
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Login</title>
  <%--<meta http-equiv="refresh" content="0"/>--%>
</head>
<body background="images.jpg" style="width: 100%">
<div style="width: 60%; margin: auto; display: grid; grid-template-columns: auto; row-gap: 15%" autocomplete="off">
  <span class="label">Login</span>
  <input class="input" type="text" name="login" autocomplete="false">
  <span class="label">Senha</span>
  <input class="input" type="password" name="passwd" autocomplete="false">
  <div style="display: grid; grid-template-columns: 50% 50%; align-items: center">
    <a href="userMain.jsp"><button>LOGAR usuario</button></a>
    <a href="adminMain.jsp" style="margin-left: auto"><button>LOGAR admin</button></a>
  </div>
</div>

</body>
</html>

