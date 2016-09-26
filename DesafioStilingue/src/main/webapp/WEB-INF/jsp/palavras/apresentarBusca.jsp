<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value='/css/bootstrap.css' />" rel="stylesheet"/>
<link href="<c:url value='/css/site.css' />" rel="stylesheet"/>
<title>Desafio Stilingue</title>
</head>
<body>

	<!-- PESQUISA DE PALAVRA  -->
	<h1>Desafio Stilingue de Coleta</h1><br/>
	
	<div class="container">
		<h2>Faça sua busca</h2>
		<form action="${linkTo[PalavrasController].salvar}" method="post" >
			<input type="text" id="buscarPalavra" name="palavra.nome" value="${palavra.nome}" size="60"/>
			<input class="btn btn-primary" type="submit" value="Buscar" />
		</form>
		
		<br/>
		<form action="${linkTo[PalavrasController].maisBuscadas}" method="post" >
			<h4>Quer saber quais as palavras são as mais buscadas?</h4> <br/>
			<input type="submit" value="MaisBuscadas" class="btn btn-primary"/>
		</form>
	</div>
	
</body>
</html>