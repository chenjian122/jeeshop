package com.sinspark.jeeshop.modules.sys.core.listener;

import javax.servlet.ServletContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

/**
 * 初始化web应用程序
 * @author sinspark
 * @version 2017/3/31
 *
 */
public class WebContextListener extends ContextLoaderListener {
	
	Log logger = LogFactory.getLog(WebContextListener.class);
	
	@Override
	public WebApplicationContext initWebApplicationContext(
			ServletContext servletContext) {
		StringBuilder sb = new StringBuilder();
		sb.append("\r\n======================================================================\r\n");
		sb.append("\r\n    欢迎使用jeeshop平台    \r\n");
		sb.append("\r\n======================================================================\r\n");
		logger.info(sb.toString());
		return super.initWebApplicationContext(servletContext);
	}
}
