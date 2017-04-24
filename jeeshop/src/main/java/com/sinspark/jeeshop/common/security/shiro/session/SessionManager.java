package com.sinspark.jeeshop.common.security.shiro.session;

import java.io.Serializable;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;


/**
 * 自定义Web会话管理类
 * @author sinspark
 * @version 2017/4/24
 */
public class SessionManager extends DefaultWebSessionManager{
	
	@Override
	protected Serializable getSessionId(ServletRequest request,
			ServletResponse response) {
		// TODO Auto-generated method stub
		return super.getSessionId(request, response);
	}
	
	@Override
	public void validateSessions() {
		// TODO Auto-generated method stub
		super.validateSessions();
	}
}
