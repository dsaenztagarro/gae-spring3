<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="yaml" uri="/WEB-INF/yaml-tags.tld"  %>
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
		
					<div class="ym-gbox">
						<p class="box info">Rellene el formulario</p>
						<form:form method="POST" commandName="userAdministrationForm"
							class="ym-form linearize-form ym-full">
							<div class="ym-gbox">
								<form:errors path="*" cssClass="box error" element="p" />
							</div>
							<div class="ym-grid linearize-level-2">
								<div class="ym-g50 ym-gl">
									<div class="ym-fbox-text">
										<label for="firstName"><spring:message code="firstName" /></label>
										<form:input path="firstName" id="firstName" type="text" size="20"
											required="required" />
										<label for="lastName"><spring:message code="lastName" /></label>
										<form:input path="lastName" id="lastName" type="text" size="100"
											required="required" />
										<label for="email"><spring:message code="email" /></label>
										<form:input path="email" id="email" type="text" size="200"
											required="required" />
										<label for="password"><spring:message code="password" /></label>
										<form:input path="password" id="password" type="text" size="20"
											required="required" />
											<!-- 
										<label for="retypePassword"><spring:message code="retypePassword" /></label>
										<form:input path="retypePassword" id="retypePassword" type="text" size="20"
											required="required" />
											 -->
									</div>
								</div>
								<div class="ym-g50 ym-gr">
								</div>
							</div>
							<div class="ym-fbox-button">	
								<input type="submit" class=submit>
								<input type="reset" class=reset value="Limpiar">
							</div>
						</form:form>
					</div>
				</div>
				<div class="ym-g50 ym-gr">
					<div class="ym-gbox">
						<!-- content -->
						...
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>