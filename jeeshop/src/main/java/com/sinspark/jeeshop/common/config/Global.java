package com.sinspark.jeeshop.common.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.sinspark.jeeshop.common.util.PropertiesLoader;


/**
 * 配置类
 * @author sinspark
 * @version 2017/3/31
 *
 */
public class Global {
	
	/**
	 * 全局属性值
	 */
	private static Map<String, String> map =  new HashMap<String, String>();
	
	private static PropertiesLoader loader = new PropertiesLoader("jeeshop.properties");
	
	/**
	 * 获取配置
	 */
	public static String getConfig(String key){
		String value = map.get(key);
		if(value == null){
			value = loader.getProperty(key);
			map.put(key, value!=null?value:StringUtils.EMPTY);
		}
		return value;
	}

}
