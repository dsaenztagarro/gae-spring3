<%@ include file="/WEB-INF/views/common/init.jsp" %>
<!DOCTYPE html PUBLIC “-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" >
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
<style>
.errorblock {
	color: #ff0000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
<body id="yaml-top" class="doc" data-twttr-rendered="true">

	<div class="ym-wrapper">
		<div class="ym-wbox">
			<div class="ym-gbox">
				<h3><spring:message code="sign-in-to-web" /></h3>
			</div>
			<div class="ym-grid">
				<div class="ym-g50 ym-gl">
					<div class="ym-gbox">
						<p class="box info">Introduzca sus datos de usuario para continuar</p>

						<c:if test="${not empty error}">
							<p class="box error">
								Your login attempt was not successful, try again.<br /> Caused :
								${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
							</p>
						</c:if>

						<form name='f' action="<c:url value='j_spring_security_check' />" 
							method='POST' class="ym-form linearize-form ym-full">
							
							<div class="ym-grid linearize-level-1">
								<div class="ym-g50 ym-gl">
									<div class="ym-fbox-text">
										<label for="j_username"><spring:message code="login" /></label>
										<input type="text" name="j_username" size="20" />
									</div>
									<div class="ym-fbox-text">
										<label for="j_password"><spring:message code="password" /></label>
										<input type="text" name="j_password" size="20" />
									</div>
								</div>
								<div class="ym-g50 ym-gr">
								</div>
							</div>
							<div class="ym-fbox-button">	
								<input type="submit" class=submit name="submit" value='<spring:message code="sign-in" />' >
								<input type="reset" class=submit name="reset" value='<spring:message code="reset" />' >
							</div>
						</form>

					</div>
				</div>
				<div class="ym-g50 ym-gr">
					<div class="ym-gbox">
						<yaml:img src="secure_login.jpg"></yaml:img>
					</div>
				</div>
			</div>

		</div>
	</div>
</body>
</html>