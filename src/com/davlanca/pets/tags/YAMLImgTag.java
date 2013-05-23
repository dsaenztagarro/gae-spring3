package com.davlanca.pets.tags;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * Example:
 *	<label for="retypePassword"><spring:message code="retypePassword" /></label>
 *	<form:input path="retypePassword" id="retypePassword" type="text" size="20" required="required" />
 */
public class YAMLImgTag extends TagSupport {

	private String _src;

	/* public YAMLTag() {
		_applicationContext = RequestContextUtils.getWebApplicationContext(
				pageContext.getRequest(),
				pageContext.getServletContext()
				);		
	}*/
	
	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.print("<img src=\"/resources/images/"+_src+"\" class=\"bordered\" width=\"325px\" />");
		} catch (IOException ioe) {
			System.out.println("Error in ExampleTag: " + ioe);
		}
		return (SKIP_BODY);
	}
	
	public void setSrc(String _src) {
		this._src = _src;
	}

}
