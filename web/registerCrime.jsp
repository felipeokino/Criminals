
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Registro Crime</title>
  <meta charset="UTF-8"/>
  <link rel="stylesheet" type="text/css" href="style.css">
  <%--<meta http-equiv="refresh" content="0"/>--%>
</head>
</head>
<body background="images.jpg" style="color: white">
<fieldset class="principal">
  <h2 >Registro de Ocorrência</h2>

  <form id="register_form">
    <div class="form_child">

      <label>Tipo Crime</label>
      <select>
        <option></option>
        <option>Roubo ou Furto de Veículos</option>
        <option>Furto ou perda de documentos/objetos</option>
        <option>Roubo de documentos e/ou objetos</option>
        <option>Injúria, calúnia ou difamação</option>
        <option>Acidente de trânsito sem vítimas</option>
        <option>Desaparecimento de pessoas</option>
        <option>Encontro de pessoas</option>
        <option>DEPA - Proteção animal</option>
      </select>

      <label>Criminoso</label>
      <select>
        <option></option>
        <option>Kim</option>
        <option>Valdo</option>
        <option>Bia</option>
      </select>

      <label>Data</label>
      <input type="datetime-local" name="date">

      <label>Bairro</label>
      <select>
        <option></option>
        <option>Santa Felícia</option>
        <option>Cidade Aracy</option>
        <option>Gonzaga</option>
      </select>
    </div>
    <div style="margin-top: 10%">
            <span style="margin: auto; width: 30%">
            Descrição dos fatos
        </span>
      <div>
        <textarea class="desc"></textarea>
      </div>
      <div>
        <label>Outro indivíduo?</label>
        <input type="checkbox" name="VISUAL">
      </div>
    </div>

    <div>
      <input type="submit" name="enviar" value="Enviar">
      <input type="reset" name="limpar" value="limpar">
    </div>
  </form>
</fieldset>
</body>
</html>
