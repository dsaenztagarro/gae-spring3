<%@ include file="/WEB-INF/views/common/init.jsp" %>
<!DOCTYPE html PUBLIC â€œ-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
<title><spring:message code="title.create" /></title>
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/core/base.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/forms/gray-theme.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/screen/typography.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/screen/screen-FULLPAGE-layout.css" />
</head>
<body id="yaml-top" class="doc" data-twttr-rendered="true">

	<div class="ym-wrapper">
		<div class="ym-wbox">
		
			<div align="left">
				<spring:message code="${message}" text="" />
			</div>

			<div class="ym-grid">
				<div class="ym-g50 ym-gl">
					<div class="ym-gbox">
						<h3><spring:message code="pet.wizard.page4" /></h3>
						<p class="box info">Acaba de completar el proceso de alta satisfactoriamente. En breve recibirá un correo de confirmación. Por favor, pulse en el siguiente link para volver a la página de inicio.</p>
						<a class="ym-button ym-next" href="/main/index.htm">Volver al inicio</a>
					</div>
				</div>
				<div class="ym-g50 ym-gr">
					<div class="ym-gbox">
						<yaml:img src="register_wizard_success.jpg"></yaml:img>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>