<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista mensagens</title>
</head>
<body>
	<ul>
		<c:forEach items="${mensagemList}" var="mensagem">
			<li>${mensagem.conteudo}<a href="<c:url value='/mensagem/${mensagem.id}' />"> >></a></li>
		</c:forEach>
	</ul>
	
</body>
</html>