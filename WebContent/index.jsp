<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" src="<c:url value='/js/jquery-1.4.4.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/js/jquery-ui-1.8.9.custom.min.js'/>" ></script>
<script type="text/javascript" src="<c:url value='/js/jquery-placeholder.js'/>" ></script>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/reset.css'/>"></link>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/dirigindobem.css'/>"></link>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/smoothness/jquery-ui-1.8.9.custom.css'/>"></link>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/ui.form.css'/>"></link>
<link rel="stylesheet" type="text/css" href="<c:url value='/css/overrides.css'/>"></link>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Dirigindo bem?</title>
</head>
<body>
<div id="main">
	<div id="top">
	</div><!-- top -->
	<div id="content">
		<div class="ui-widget ui-form">
			<div class="ui-widget-content ui-corner-all">
				<form action="<c:url value='/mensagem' />" class="ui-helper-clearfix" id="adiciona_mensagem">
					<input type="text" name="veiculo.placa" id="veiculo_placa" placeholder="Teste"/>
					<input type="text" name="mensagem.conteudo" id="mensagem_conteudo"/>
					<button id="submita_mensagem" class="ui-button ui-corner-all ui-button-text-only">
						<span class="ui-button-text">POSTAR!</span>
					</button>
				</form>
			</div>
			<div class="ui-widget-content ui-corner-all" id="mensagens">
				<p>ABC-1234 >> Vai pra lá, vai pra lá. <em>20 abr 2011</em></p>
			</div>
			<div class="ui-helper-clearfix"></div>
			<div class="ui-widget-content ui-corner-all" id="ad"></div>
			<div class="ui-widget-content ui-corner-all" id="cadastro_email">
				<form action="#" class="ui-helper-clearfix" id="adiciona_cadastro">
					<h2>Quero acompanhar meu veículo!</h2>
					<input type="text" name="usuario.email" id="usuario_email"/>
					<input type="text" name="usuario.placa" id="usuario_placa"/>
					<button id="submita_cadastro" class="ui-button ui-corner-all ui-button-text-only">
						<span class="ui-button-text">OK!</span>
					</button>
				</form>
			</div>
			
		</div>
	</div><!-- content -->
</div><!--main-->
<div id="footer">
</div><!-- footer -->
</body>
</html>
<script type="text/javascript">
	$("#veiculo_placa").placeHolder({"text" : "ABC-1234"});
	$("#mensagem_conteudo").placeHolder({"text" : "Ei! Você dirige muito bem! Parabéns!"});
	$("#usuario_email").placeHolder({"text" : "seu@email.com.br"});
	$("#usuario_placa").placeHolder({"text" : "ABC-1234"});
	
</script>