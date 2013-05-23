<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">

<title>Vertical Navigation Menu: CSS3 Coded</title>

<link rel="stylesheet" type="text/css"
	href="/resources/styles/custom_admin.css" />
<script type="text/javascript"
	src="/resources/scripts/jquery-1.7.2.js"></script>

</head>
<body>
	<div id="wrapper">

		<ul class="menu">
			<li class="item1"><a href="#">Users <span>340</span></a>
            <ul>
                <li class="subitem1"><a href="#">Users1 <span>14</span></a></li>
                <li class="subitem2"><a href="#">Users2 <span>6</span></a></li>
                <li class="subitem1"><a href="#">Users3 <span>14</span></a></li>
                <li class="subitem2"><a href="#">Users4 <span>6</span></a></li>
            </ul>			
			</li>
			<li class="item2"><a href="#">Pets <span>147</span></a>
            <ul>
                <li class="subitem1"><a href="#">Pets1 <span>14</span></a></li>
                <li class="subitem2"><a href="#">Pets2 <span>6</span></a></li>
                <li class="subitem1"><a href="#">Pets3 <span>14</span></a></li>
                <li class="subitem2"><a href="#">Pets4 <span>6</span></a></li>
            </ul>			
			</li>
			<li class="item3"><a href="#">Messages <span>340</span></a>
            <ul>
                <li class="subitem1"><a href="#">Message1 <span>14</span></a></li>
                <li class="subitem2"><a href="#">Message2 <span>6</span></a></li>
                <li class="subitem1"><a href="#">Message3 <span>14</span></a></li>
                <li class="subitem2"><a href="#">Message4 <span>6</span></a></li>
            </ul>			
			</li>
			<li class="item4"><a href="#">Social <span>2</span></a>
            <ul>
                <li class="subitem1"><a href="#">Facebook <span>14</span></a></li>
                <li class="subitem2"><a href="#">Twitter <span>6</span></a></li>
            </ul>			
			</li>
			<li class="item4"><a href="#">Security <span>2</span></a>
            <ul>
                <li class="subitem1"><a href="#">Groups <span>14</span></a></li>
                <li class="subitem2"><a href="#">Roles <span>6</span></a></li>
            </ul>			
			</li>
		</ul>

	</div>
	<script type="text/javascript">
	$(function() {
		var menu_ul = $('.menu > li > ul'),
			menu_a = $('.menu > li > a');
		
		menu_ul.hide();
		
		menu_a.click(function(e) {
			e.preventDefault();
			if(!$(this).hasClass('active')) {
				menu_a.removeClass('active');
				menu_ul.filter(':visible').slideUp('normal');
				$(this).addClass('active').next().stop(true,true).slideDown('normal');
			} else {
				$(this).removeClass('active');
				$(this).next().stop(true,true).slideUp('normal');
			}
		});
	}); 	
	</script>
</body>
</html>