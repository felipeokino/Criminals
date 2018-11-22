<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Cadastrar Criminoso</title>
  <link rel="stylesheet" type="text/css" href="../../../../WebstormProjects/EdiçãoTelasCriminal/Telas/style.css">
</head>
<body>
<div class="central">

  <h2>Novo Criminoso</h2>
  <div class="dadoSpecial">
    <form>

      <label class="labelCriminoso">
        CPF
        <input type="text" name="cpf">
      </label>

      <label class="labelCriminoso">
        Nome
      <input type="text" name="first_name">
      </label>

      <label class="labelCriminoso">
        Sobrenome
        <input type="text" name="last_name">
      </label>

      <label class="labelCriminoso">
        Nascimento
        <input class="inputDataNasc" type="date" name="niver">
      </label>

        <div>
          <label>Pertence a gangue?</label>
          <input type="checkbox" name="VISUAL">
        </div>

      <div class="botoes">
        <button type="submit" value="Enviar" class="btn">Enviar</button>
        <button type="reset" value="limpar" class="btn">Limpar</button>
      </div>
    </form>

  </div>

</div>
</body>
</html>

