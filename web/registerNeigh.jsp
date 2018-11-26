<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Cadastrar Bairro</title>
  <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
<div class="central" id="centralBairro">

  <h2 id="hSpecial">Novo Bairro</h2>

  <div class="dadoSpecial">
    <form action="controller" method="post">

      <label class="labelBairro">
        Nome
        <input type="text" name="nameNeigh">
      </label>

      <label class="labelBairro">
        Cidade
        <input type="text" name="city">
      </label>

      <div class="botoes">
        <button type="submit" value="RegisterNeigh" class="btn" name="command">Cadastrar</button>
        <a href="adminMain.jsp"><button class="btn">Voltar</button></a>
      </div>

    </form>
  </div>

</div>
</body>
</html>



















