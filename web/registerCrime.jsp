<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8"/>
  <title>Registro de Ocorrência</title>
  <link rel="stylesheet" type="text/css" href="../../../../WebstormProjects/EdiçãoTelasCriminal/Telas/style.css">
</head>
<body>
<div class="central" id="centralCadastro">

  <h2>Registro de Ocorrência</h2>
  <div class="dadoSpecial">
    <form>

      <label class="labelCadastro">
        Tipo Crime
        <select>
          <option></option>
          <option>Roubo ou Furto de Veículos</option>
          <option>Roubo ou Furto de documentos/objetos</option>
          <option>Injúria, calúnia ou difamação</option>
          <option>Acidente de trânsito com vítimas</option>
          <option>Sequestro</option>
        </select>
      </label>

      <label class="labelCadastro">
        Criminoso
        <select>
          <option></option>
          <option>Bia</option>
          <option>Edipo</option>
          <option>Kim</option>
          <option>Valmir</option>
        </select>
      </label>

      <label class="labelCadastro">
        Bairro
        <select>
          <option></option>
          <option>Santa Felícia</option>
          <option>Cidade Aracy</option>
          <option>Gonzaga</option>
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
          <textarea class="desc"></textarea>
        </div>
        <div>
          <label>Outro indivíduo?</label>
          <input type="checkbox" name="VISUAL">
        </div>
      </div>

      <div class="botoes">
        <button type="submit" value="Enviar" class="btn">Entrar</button>
        <button type="reset" value="limpar" class="btn">Cancelar</button>
      </div>
    </form>

  </div>

</div>
</body>
</html>

