<%@ include file="/WEB-INF/views/common/init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
<head>
<title><spring:message code="title.create" /></title>
<meta name="menu" content="register-page2" /> 
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
				<h3>
					<spring:message code="pet.wizard.page2" />
				</h3>
			</div>
			<div class="ym-grid">
				<div class="ym-g60 ym-gl">
					<div class="ym-gbox">
						<p class="box info">
							<spring:message code="pet.wizard.page2.message" />
						</p>
							<div class="ym-gbox">
								<form:errors path="*" cssClass="box error" element="p" />
							</div>
						
						<form:form method="POST" commandName="registerWizardForm"
							class="ym-form linearize-form ym-full">
							<div class="ym-gbox">
								<form:errors path="*" cssClass="box error" element="p" />
							</div>
							<h6>
								<spring:message code="register-information" />
							</h6>
							<div class="ym-grid linearize-level-2">
								<div class="ym-g50 ym-gl">
									<div class="ym-fbox-text">
										<label for="firstName">
											<spring:message code="login" /> 
										</label>
										<form:input path="user.login" id="login"
											type="text" size="20" />
									</div>
								</div>
								<div class="ym-g50 ym-gr">
									<div class="ym-fbox-text">
										<label for="password"><spring:message code="password" /></label>
										<form:input path="user.password" id="password" type="text"
											size="20" />
									</div>
									<div class="ym-fbox-text">
										<label for="phone"><spring:message code="retype-password" /></label>
										<form:input path="retypePassword" id="retypePassword" type="text"
											size="100" />
									</div>
								</div>
							</div>
							<h6>
								<spring:message code="your-information" />
							</h6>
							<div class="ym-grid linearize-level-2">
								<div class="ym-g50 ym-gl">
									<div class="ym-fbox-text">
										<label for="firstName">
											<spring:message code="firstName" /> 
										</label>
										<form:input path="user.firstName" id="firstName"
											type="text" size="20" />
									</div>
									<div class="ym-fbox-text">
										<label for="email"><spring:message code="email" /></label>
										<form:input path="user.email" id="email" type="text"
											size="20" />
									</div>
								</div>
								<div class="ym-g50 ym-gr">
									<div class="ym-fbox-text">
										<label for="lastName"><spring:message code="lastName" /></label>
										<form:input path="user.lastName" id="lastName" type="text"
											size="20" />
									</div>
									<div class="ym-fbox-text">
										<label for="phone"><spring:message code="phone" /></label>
										<form:input path="user.phone" id="phone" type="text"
											size="100" />
									</div>
								</div>
							</div>
							<h6>
								<spring:message code="address" />
							</h6>
							<div class="ym-grid linearize-level-2">
								<div class="ym-g50 ym-gl">
									<div class="ym-fbox-text">
										<label for="address"><spring:message code="address" /></label>
										<form:input path="user.address" id="address" type="text"
											size="20" />
									</div>
									<div class="ym-fbox-text">
										<label for="state"><spring:message code="state" /></label>
										<form:input path="user.state" id="state" type="text"
											size="20" />
									</div>
								</div>
								<div class="ym-g50 ym-gr">
									<div class="ym-fbox-text">
										<label for="city"><spring:message code="city" /></label>
										<form:input path="user.city" id="city" type="text"
											size="20" />
									</div>
									<div class="ym-fbox-text">
										<label for="zipCode"><spring:message code="zipCode" /></label>
										<form:input path="user.zipCode" id="zipCode" type="text"
											size="20" />
									</div>
								</div>
							</div>
							<div class="ym-fbox-button">
								<input type="submit" class=submit name="_target0"
									value='<spring:message code="previous" />'> 
								<input type="submit" class=submit name="_target2"
									value='<spring:message code="next" />'> 
								<input type="reset" class=submit name="_cancel"
									value='<spring:message code="cancel" />'>
							</div>
						</form:form>
					</div>
				</div>
				<div class="ym-g40 ym-gr">
					<yaml:img src="register_wizard_page2.jpg"></yaml:img>
				</div>
			</div>
		</div>
	</div>
</body>
</html>