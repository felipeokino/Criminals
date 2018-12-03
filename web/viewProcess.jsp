<%--
  Created by IntelliJ IDEA.
  User: felipeokino
  Date: 22/10/18
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Processos</title>
  </head>
  <body background="images.jpg">
  <fieldset class="principal">
    <h2 >Registro de Processos</h2>
    <form id="register_form" method="post">
      <div class="form_child">
          <grd:dbgrid id="tblProcesso" width="100" pageSize="10"

                      currentPage="<%=intCurr%>" border="0" cellSpacing="1" cellPadding="2"

                      dataMember="<%=strSQL%>" dataSource="<%=objCnn%>" cssClass="gridTable">
            <grd:gridpager imgFirst="" imgPrevious=""

                           imgNext="" imgLast=""/>
            <grd:gridsorter sortColumn="<%=strSortCol%>" sortAscending="<%=blnSortAsc%>"/>
            <grd:rownumcolumn headerText="#" width="5" HAlign="right"/>
            <grd:imagecolumn headerText="" width="5" HAlign="center"

                             imageSrc=""

                             linkUrl="jdbc:hsqldb:hsql://localhost:9001/jpapu"

                             imageBorder="0" imageWidth="16" imageHeight="16"

                             alterText="Clique para editar o processo"/>
            <grd:textcolumn dataField="nroProcesso" headerText="Numero do Processo"

                            width="20" sortable="true"/>
            <grd:textcolumn dataField="crime" headerText="Crime"

                            width="40" sortable="true"/>
            <grd:textcolumn dataField="criminoso" headerText="Criminoso"

          </grd:dbgrid>
          <input TYPE="hidden" NAME="txtCurr" VALUE="<%=intCurr%>">
          <input TYPE="hidden" NAME="txtSortCol" VALUE="<%=strSortCol%>">
          <input TYPE="hidden" NAME="txtSortAsc" VALUE="<%=strSortOrd%>">
      </div>
    </form>
  </fieldset>
  </body>
</html>
