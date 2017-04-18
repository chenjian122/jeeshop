package com.sinspark.jeeshop.common.util;


import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Properties文件载入工具类.可载入多个properties文件,
 * 相同的属性在最后载入的文件中的值将会覆盖之前的值
 * @author sinspark
 * @version 2017/3/31
 *
 */
public class PropertiesLoader {
	
	private Logger logger = LoggerFactory.getLogger(PropertiesLoader.class);
	
	private static ResourceLoader resourceLoader = new DefaultResourceLoader();
	
	private final  Properties properties;
	
	public PropertiesLoader(String ...reourcesPaths){
		properties = loadProperties(reourcesPaths);
	}
	
	public Properties getProperties() {
		return properties;
	}

	/**
	 * 加载多个文件
	 * @param reourcesPaths
	 * @return
	 */
	private Properties loadProperties(String ...reourcesPaths){
		Properties properties = new Properties();
		for (String location : reourcesPaths) {
			InputStream is = null;
			try {
				Resource resource = resourceLoader.getResource(location);
				is = resource.getInputStream();
				properties.load(is);
			} catch (IOException e) {
				logger.info("Could not load properties from path:"+ location+","+e.getMessage());
			} finally{
				IOUtils.closeQuietly(is);
			}
		}
		return properties;
	}
	
	/**
	 *  取出String类型的Property，但以System的Property优先,如果都为Null则抛出异常.
	 * @param key
	 * @return
	 */
	public String getProperty(String key) {
		String value = getValue(key);
		if(value == null){
			throw new NoSuchElementException();
		}
		return value;

	}

	/**
	 * 取出Property，但以System的Property优先,取不到返回空字符串.
	 * @param key
	 * @return
	 */
	private String getValue(String key) {
		String systemProperty = System.getProperty(key);
		if(systemProperty != null){
			return systemProperty;
		}
		if(properties.containsKey(key)){
			return properties.getProperty(key);
		}
		return "";
	}
}
