<%@ include file="/WEB-INF/views/common/init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
<title><spring:message code="title.create" /></title>
<meta name="menu" content="register-page3" /> 
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
			<div class="ym-gbox">
				<h3><spring:message code="pet.wizard.page3" /></h3>
			</div>
			<div class="ym-grid">
				<div class="ym-g50 ym-gl">
					<div class="ym-gbox">
						<p class="box info">Confirme que la información introducida es la correcta</p>
						<form:form method="POST" commandName="registerWizardForm"
							class="ym-form linearize-form ym-full">
							<div class="ym-gbox">
								<form:errors path="*" cssClass="box error" element="p" />
							</div>
							<div class="ym-grid linearize-level-2">
								<div class="ym-g50 ym-gl">
									<div class="ym-fbox-text">
										<label for="name"><spring:message code="retype-password" /></label>
										<form:input path="retypePassword" id="retypePassword" type="text" size="20"
											/>
									</div>
								</div>
								<div class="ym-g50 ym-gr">
								</div>
							</div>
							<div class="ym-fbox-button">	
								<input type="submit" class=submit name="_target1" value='<spring:message code="previous" />' >
								<input type="submit" class=submit name="_finish" value='<spring:message code="next" />' >
								<input type="reset" class=submit name="_cancel" value='<spring:message code="cancel" />' >
							</div>
						</form:form>
					</div>
				</div>
				<div class="ym-g50 ym-gr">
					<div class="ym-gbox">
						<yaml:img src="register_wizard_page3.jpg"></yaml:img>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>