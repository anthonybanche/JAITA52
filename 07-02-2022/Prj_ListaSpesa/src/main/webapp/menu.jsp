<% if(request.getAttribute("errorMessage")!=null) {%>
 <%@ include file="errorContainer.jsp"%>
<% } %> 

<a href="index.jsp">Home Page</a>
<a href="profilo.jsp">Profilo Utente</a>
<%  if(session.getAttribute("email")!=null) {%>
		<a href="logout.jsp">Logout</a>
<% } %> 
