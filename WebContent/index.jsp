<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" src="<c:url value='/js/jquery-1.4.4.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/js/jquery-ui-1.8.9.custom.min.js'/>" ></script>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/smoothness/jquery-ui-1.8.9.custom.css'/>"></link>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/ui.form.css'/>"></link>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dirigindo bem?</title>
</head>
<body>
<div class="ui-widget ui-form">
	<div class="ui-widget-header ui-corner-all">
		<h2>Login Form</h2>
	</div>
	<div class="ui-widget-content ui-corner-all">
		<form action="#" class="ui-helper-clearfix">

			<label class="ui-helper-reset">Username</label>
			<div class="ui-state-error ui-corner-all">
				<input type="text"/>
				<div class="ui-icon-alert"></div>
				<p class="ui-helper-reset ui-state-error-text">Required field</p>
			</div>
		</form>
	</div>
</div>
	

</body>
</html>