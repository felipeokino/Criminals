<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Registro de Ocorrência</title>
  <link rel="stylesheet" type="text/css" href="./style.css">
</head>
<body>
<div class="central" id="centralCadastro">

  <h2>Registro de Ocorrência</h2>
  <div class="dadoSpecial">
    <form method="post" action="controller">

      <label class="labelCadastro">
        Tipo Crime
        <select>
            <option></option>
            <option name="roubo_carro">Roubo ou Furto de Veículos</option>
            <option name="roubo_docs">Roubo ou Furto de documentos/objetos</option>
            <option name="injuria">Injúria, calúnia ou difamação</option>
            <option name="acidente">Acidente de trânsito com vítimas</option>
            <option name="sequestro">Sequestro</option>
        </select>
      </label>

      <label class="labelCadastro">
        Criminoso
        <select>
            <option></option>
            <option name="kim">Kim</option>
            <option name="valmir">Valmir</option>
            <option name="bia">Bia</option>
            <option name="edipo">Edipo</option>
        </select>
      </label>

      <label class="labelCadastro">
        Bairro
        <select>
            <option></option>
            <option name="saoJose">Vila São Jose</option>
            <option name="aracy">Aracy</option>
            <option name="faga">Faga</option>
        </select>
      </label>

      <label class="labelCadastro">
        Data
        <input class="inputData" type="date" name="date">
      </label>

      <div class="texto">
            <span style="margin: auto; width: 30%">
            Descrição dos fatos
        </span>
        <div>
          <textarea class="desc" name="desc"></textarea>
        </div>
        <%--<div>--%>
          <%--<label>Outro indivíduo?</label>--%>
          <%--<input type="checkbox" name="other_criminal">--%>
        <%--</div>--%>
      </div>

      <div class="botoes">
        <button type="submit" value="RegisterCrime" name="command" class="btn">Entrar</button>
        <button type="reset" value="limpar" class="btn">Cancelar</button>
      </div>
    </form>

  </div>

</div>
</body>
</html>

