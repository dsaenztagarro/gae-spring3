<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC “-//W3C//DTD XHTML 1.0 Transitional//EN"
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

					<p class="box success">Usuario creado satisfactoriamente</p>
					<form:form method="POST" class="ym-form linearize-form">
						<div class="ym-fbox-text">
							<label for="firstName"><spring:message code="firstName" /></label>
							<input type="text" id="firstName" type="text" size="20" required="required" readonly value="${userAdministrationForm.firstName}" />
						</div>
						<div class="ym-fbox-text">
							<label for="lastName"><spring:message code="lastName" /></label>
							<input type="text" id="lastName" type="text" size="20" required="required" readonly value="${userAdministrationForm.lastName}" />
						</div>		
					</form:form>
					
					</div>
				</div>
				<div class="ym-g50 ym-gr">
					<div class="ym-gbox">
						<!-- content -->

					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>