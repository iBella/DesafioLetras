<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resultado</title>
</head>
<body>
<h1>Resultado AQUI!</h1>

	<!-- RESULTADO DA BUSCA  -->
	
	<div id="pesquisa">
		<h2>Resultado da busca:</h2>
		<ul>
		<c:forEach items="${palavraList}" var="p">
			<li>${p.nome}</li> <br/>
		</c:forEach>
		</ul>
	</div>
	
	<div id="pesquisaSinonimo">
		<h2>Sinonimo(s):</h2>
		<ul>
		<c:forEach items="${sinonimoList}" var="s">
			<li>${s.nome}</li> <br/>
		</c:forEach>
		</ul>
	</div>
	
	<div id="pesquisaAutor">
		<h2>Autor(es):</h2>
		<ul>
		<c:forEach items="${autorList}" var="a">
			<li>${a.nome}</li> <br/>
		</c:forEach>
		</ul>
	</div>
	
	<div id="novaBusca">
		<form action="${linkTo[PalavrasController].apresentarBusca}" method="post">
			<input type="submit" value="Voltar" />
		</form>
	</div>

</body>
</html>