package com.sinspark.jeeshop.modules.sys.security;

import java.io.Serializable;

import com.sinspark.jeeshop.modules.sys.entity.User;

/**
 * 授权用户信息
 * @author sinspark
 * @version 2017/4/19
 */
public class Licensor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;					//编号
	private String loginName;		//登录名
	private String name;				//姓名
	private boolean mobileLogin;	//手机是否登录
	
	/**
	 * Licensor Constructor
	 * @param user
	 * @param mobileLogin
	 */
	public Licensor(User user, boolean mobileLogin) {
		this.id  = user.getId();
		this.loginName = user.getLoginName();
		this.name = user.getName();
		this.mobileLogin = mobileLogin;
	}
	
	public String getSessionId(){
		try {
			return "";
		} catch (Exception e) {
			return "";
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isMobileLogin() {
		return mobileLogin;
	}
	public void setMobileLogin(boolean mobileLogin) {
		this.mobileLogin = mobileLogin;
	}

	@Override
	public String toString() {
		return "Licensor [id=" + id + ", loginName=" + loginName + ", name="
				+ name + ", mobileLogin=" + mobileLogin + "]";
	}
	
}
