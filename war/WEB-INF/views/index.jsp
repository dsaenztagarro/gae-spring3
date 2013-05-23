<%@ include file="/WEB-INF/views/common/init.jsp" %>
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="/resources/styles/custom_web.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/core/base.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/forms/gray-theme.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/screen/typography.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/screen/screen-FULLPAGE-layout.css" />
<link rel="stylesheet" type="text/css"
	href="/resources/styles/yaml/navigation/hlist.css" />

<script type="text/javascript" src="/resources/scripts/jquery-1.7.2.js"></script>
<script type="text/javascript" src="/resources/scripts/jquery-ui.js"></script>
<script type="text/javascript">
	$(window).bind(
			"load",
			function() {

				//$('.small').switchClass('small', 'big', 2000);
				$('#test').mouseover(function() {
					$(this).switchClass('pet-card', 'pet-card-over', 2000);
				});
				/*
				$('#test').click(function() {
					$(this).switchClass('pet-card', 'pet-card-over', 2000);
				});*/

				$('#pets').load(
						'/main/pets.htm',
						function() {
							var pet = $('#pets .box');
							pet.mouseover(function() {
								$(this).stop(true, true).switchClass(
										'pet-card', 'pet-card-over', 300);
							});
							pet.mouseout(function() {
								$(this).stop(true, true).switchClass(
										'pet-card-over', 'pet-card', 150);
							});
							pet.click(function(e) {
								alert('pet clicked');
							});

						});
				$('#news').load(
						'/main/news.htm',
						function() {
							$('#news .box').mouseover(
									function() {
										$(this).stop(true, true).switchClass(
												'news-card', 'news-card-over',
												300);
									}).mouseout(
									function() {
										$(this).stop(true, true).switchClass(
												'news-card-over', 'news-card',
												150);
									}).click(function() {
								alert('news clicked');
							});
						});

				/*$('#pets .box').
				live('mouseover',function() {
					$(this).switchClass('pet-card','pet-card-over',200);
				});*/
			});
</script>
</head>
<body id="yaml-top" class="doc" data-twttr-rendered="true">

	<sec:authorize access="isAnonymous()">
	    <form method="POST" action="<c:url value='j_spring_security_check'/>">
	        Username: <input name="j_username" type="text" value="${SPRING_SECURITY_LAST_USERNAME}" /> 
	        Password: <input name="j_password" type="password" /> 
	        <input type="submit" value="Sign in" />
	    </form>
	</sec:authorize>
	<sec:authorize access="isAuthenticated()">
	    <a href="<c:url value="/j_spring_security_logout" />">Logout</a>
	</sec:authorize>

	<nav class="ym-hlist">
		<ul>
			<li class="active"><strong>Home</strong></li>
			<li><a href="#">Pets</a></li>
			<li><a href="#">Users</a></li>
			<li><a href="#">Events</a></li>
			<li><a href="#">Foro</a></li>
			
			<sec:authorize access="hasRole('supervisor')">
				<li><a href="#">Administration</a></li>
			</sec:authorize>
		</ul>
	</nav>
	
	<div class="ym-wrapper">
		<div class="ym-grid linearize-level-1">
			<div class="ym-g50 ym-gl" id="pets"></div>
			<div class="ym-g50 ym-gr" id="news"></div>
		</div>
	</div>

	<div id="requests"></div>
</body>
</html>
