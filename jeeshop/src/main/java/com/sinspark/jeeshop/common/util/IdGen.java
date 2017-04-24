package com.sinspark.jeeshop.common.util;

import java.io.Serializable;
import java.util.UUID;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionIdGenerator;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;


/**
 * 封装各种生成唯一性ID算法的工具类.
 * @author sinspark
 * @version 2017/4/24
 */
@Service
@Lazy(false)
public class IdGen implements SessionIdGenerator {
	
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid(){
		return UUID.randomUUID().toString().replace("-", "");
	}

	@Override
	public Serializable generateId(Session session) {
		return IdGen.uuid();
	}
	
}
