package com.sinspark.jeeshop.modules.sys.security;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 安全认证实现类
 * @author sinspark
 * @version 2017/4/19
 */
@Service
public class SystemAuthorizingRealm extends AuthorizingRealm{

	private Logger logger = LoggerFactory.getLogger(SystemAuthorizingRealm.class);

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		System.out.println("doGetAuthorizationInfo");
		return null;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		System.out.println("doGetAuthenticationInfo");
		return null;
	}

}
