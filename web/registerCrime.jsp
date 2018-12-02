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
        <select name="type">
            <option></option>
            <option value="roubo_carro">Roubo ou Furto de Veículos</option>
            <option value="roubo_docs">Roubo ou Furto de documentos/objetos</option>
            <option value="injuria">Injúria, calúnia ou difamação</option>
            <option value="acidente">Acidente de trânsito com vítimas</option>
            <option value="sequestro">Sequestro</option>
        </select>
      </label>

      <label class="labelCadastro">
        Criminoso
        <select name="criminal">
            <optgroup label="Criminosos">
                <c:forEach var="criminal" items="${criminals}">
                    <option name="criminal" value="${criminal.getId()}">${criminal.getName()}</option>
                </c:forEach>
            </optgroup>
            <optgroup label="Quadrilhas">
                <c:forEach var="gang" items="${gangs}">
                    <option name="gang" value="${gang.id}">${gang.name}</option>
                </c:forEach>
            </optgroup>
        </select>
      </label>
        <label class="labelCadastro">
            Quadrilha
            <select name="gang">
                <optgroup label="Quadrilhas">
                    <c:forEach var="gang" items="${gangs}">
                        <option name="gang" value="${gang.getId()}">${gang.name}</option>
                    </c:forEach>
                </optgroup>
            </select>
        </label>

      <label class="labelCadastro">
        Bairro
        <select name="neigh">
            <c:forEach var="neigh" items="${neighs}">
                <option name="neigh" value="${neigh.getId()}">${neigh.name}</option>
            </c:forEach>
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

