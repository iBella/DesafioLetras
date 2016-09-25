<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- PESQUISA DE PALAVRA  -->

	<div id="busca">
		<h2>Pesquisa Palavra</h2>
		<form action="${linkTo[PalavrasController].salvar}" method="post">
			<input type="text" id="buscarPalavra" name="palavra.nome" value="${palavra.nome}" />
			<input type="submit" value="Buscar" />
		</form>
		<form action="${linkTo[PalavrasController].maisBuscadas}" method="post">
			<input type="submit" value="MaisBuscadas" />
		</form>
	</div>
	
</body>
</html>