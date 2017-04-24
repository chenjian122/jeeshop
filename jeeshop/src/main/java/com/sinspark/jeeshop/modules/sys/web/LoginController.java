package com.sinspark.jeeshop.modules.sys.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sinspark.jeeshop.modules.sys.security.Licensor;

/**
 * 登录Controller
 * @author sinspark
 * @version 2017/4/19
 *
 */
@Controller
public class LoginController {
	
	/**
	 * 管理登录
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginGet() {
		
		//Licensor licensor = 
		return "../MyJsp";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginPost(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("loginPost");
		return "index";
	}
}
