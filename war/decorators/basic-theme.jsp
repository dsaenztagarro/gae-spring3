<%@ include file="/WEB-INF/views/common/init.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<link rel="stylesheet" type="text/css"
		href="/resources/styles/navigation.css" />
	<decorator:head />
	<script type="text/javascript" src="/resources/scripts/jquery-1.7.2.js"></script>
	<script type="text/javascript" src="/resources/scripts/jquery-ui.js"></script>
	<script type="text/javascript">
		$(window).bind(
				"load",
				function() {
					$('.mnav ul li').mouseover(function() {
						if (!$(this).hasClass("active")) {
							$(this).addClass("selected");
						}
					});
					$('.mnav li').mouseout(function() {
						if ($(this).hasClass("selected")) {
							$(this).removeClass("selected");
						}
					});				
				});
	</script>
</head>
<body id="yaml-top" class="doc" data-twttr-rendered="true">
	<header>
		<%@ include file="/WEB-INF/views/common/header.jsp" %>
	</header>
    <nav id="sitenav" role="navigation">
    	<%@ include file="/WEB-INF/views/common/navigation.jsp" %>
    </nav>
    <decorator:body />
	<%@ include file="/WEB-INF/views/common/footer.jsp" %>
</body>
</html>