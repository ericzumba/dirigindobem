<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterando veículo</title>
</head>
<body>
	<form action="<c:url value='/veiculo/${veiculo.id}'/>" method="post">
		<input type="hidden" name="_method" value="put" />
		<label for="veiculo.placa" />Placa</label>
		<input type="text" name="veiculo.placa" id="veiculo.placa" value="${veiculo.placa}"/>	
		<input type="submit" value="Altera veículo" />
	</form>
</body>
</html>