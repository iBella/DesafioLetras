<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value='/css/bootstrap.css' />" rel="stylesheet"/>
<link href="<c:url value='/css/site.css' />" rel="stylesheet"/>
<title>Resultado</title>
</head>
<body>
<h2>Resultado Coleta</h2>

	<div class="container">

	<!-- RESULTADO DA BUSCA  -->
	
	<div id="pesquisa">
		<h3>Resultado da busca:</h3>
		<ul class="list-group">
		<c:forEach items="${palavraList}" var="p">
			<li class="list-group-item">${p.nome}</li> <br/>
			
		</c:forEach>
		</ul>
	</div>
	
	<div id="pesquisaSinonimo">
		<h3>Sinonimo(s):</h3>
		<ul class="list-group">
		<c:forEach items="${sinonimoList}" var="s">
			<li class="list-group-item">${s.nome}</li> <br/>
		</c:forEach>
		</ul>
	</div>
	
	<div id="pesquisaAntonimo">
		<h3>Antonimo(s):</h3>
		<ul class="list-group">
		<c:forEach items="${antonimoList}" var="t">
			<li class="list-group-item">${t.nome}</li> <br/>
		</c:forEach>
		</ul>
	</div>
	
	<div id="pesquisaAutor">
		<h3>Autor(es):</h3>
		<ul class="list-group">
		<c:forEach items="${autorList}" var="a">
			<li class="list-group-item">${a.nome}</li> <br/>
		</c:forEach>
		</ul>
	</div>
	
	<div id="novaBusca">
		<form action="${linkTo[PalavrasController].apresentarBusca}" method="post">
			<input type="submit" value="Voltar" class="btn btn-primary"/>
		</form>
	</div>
	
	</div>

</body>
</html>