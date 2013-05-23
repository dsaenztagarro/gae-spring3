<%@ include file="/WEB-INF/views/common/init.jsp"%>

<decorator:usePage id="thePage" /> 
<% String menu = thePage.getProperty("meta.menu"); %> 

<div class="ym-wrapper">
	<div class="mnav">
		<ul class="ym-grid ym-equalize linearize-level-2">
			<li class="ym-g20 ym-gl"><a href="http://www.yaml.de">Home</a>
			</li>
			<li class="ym-g20 ym-gl"><strong> Docs & Demos</strong>
					<span>Layout Demos and Documentation</span>
			</li>
			<li class="ym-g20 ym-gl <%= menu!=null && menu.equals("register-page1")? "active" : "" %>"><a href="../license.html">
					License<br><span>License Modells & License Conditions</span>
			</a></li>
			<li class="ym-g20 ym-gl <%= menu!=null && menu.equals("register-page2")? "active" : "" %>"><a href="../resources.html">
					Resources<br><span>Download Archive, Developer Tools & CMS
						Integration</span>
			</a></li>
			<li class="ym-g20 ym-gr"><a
				href="https://plus.google.com/113701724985470452841">
					Development Blog<br><span> Latest news, release notes and
						tipps & tricks (on Google+)</span>
			</a></li>
			<li class="ym-g20 ym-gr"><a
				href="https://plus.google.com/113701724985470452841">
					Administration<br><span>Access to administrator console</span>
			</a></li>			
		</ul>
	</div>
</div>
