<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterando mensagem</title>
</head>
<body>
	<form action="<c:url value='/mensagem/${mensagem.id}'/>" method="post">
		<input type="hidden" name="_method" value="put" />
		<label for="mensagem.conteudo" />Conteúdo</label>
		<input type="text" name="mensagem.conteudo" id="mensagem.conteudo" value="${mensagem.conteudo}"/>	
		<input type="submit" value="Altera mensagem" />
	</form>
</body>
</html>