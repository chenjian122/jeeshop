package com.sinspark.jeeshop.modules.sys.utils;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

import com.sinspark.jeeshop.modules.sys.entity.Menu;
import com.sinspark.jeeshop.modules.sys.entity.Role;
import com.sinspark.jeeshop.modules.sys.entity.User;
import com.sinspark.jeeshop.modules.sys.security.Licensor;

/**
 * 用户工具类
 * @author sinspark
 * @version 2017/4/19
 *
 */
public class UserUtils {
	
	
	/**
	 * 根据id取用户
	 * @param id
	 * @return 返回用户取不到返回null
	 */
	public static User get(String id){
		return null;
	}
	
	/**
	 * 根据登录名获取用户
	 * @param loginName
	 * @return 返回用户取不到返回null
	 */
	public static User getByLoginName(String loginName){
		return null;
	}
	
	/**
	 * 获取当前用户
	 * @return 返回当前用户取不到返回 new User()
	 */
	public static User getUser(){
		Licensor licensor = getLicensor();
		if(licensor != null){
			User user = get(licensor.getId());
			if(user != null){
				return null;
			}
			return new User();
		}
		//如果没有登录，则返回实例化为空的User对象。
		return new User();
	}

	
	/**
	 * 获取当前用户角色列表
	 * @return
	 */
	public static List<Role> getRoleList(){
		return null;
	}
	
	/**
	 * 获取当前用户授权菜单
	 * @return
	 */
	public static List<Menu> getMenuList(){
		return null;
	}
	
	/**
	 * 获取当前登录者对象
	 * @return 取不到返回null
	 */
	private static Licensor getLicensor() {
		try {
			Subject subject = SecurityUtils.getSubject();
			Licensor licensor = (Licensor) subject.getPrincipal();
			if(licensor != null){
				return licensor;
			}
		} catch (InvalidSessionException e) {
			// TODO: handle exception
		}
		return null;
	}
	
	/**
	 * 获取授权主要对象
	 */
	public static Subject getSubject(){
		return SecurityUtils.getSubject();
	}
	
	/**
	 * 获取授权Session
	 * @return
	 */
	public static Session getSession(){
		try{
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession(false);
			if (session == null){
				session = subject.getSession();
			}
			if (session != null){
				return session;
			}
		}catch (InvalidSessionException e){
			
		}
		return null;
	}
	

}
