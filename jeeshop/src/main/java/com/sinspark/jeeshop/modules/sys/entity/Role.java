package com.sinspark.jeeshop.modules.sys.entity;

import java.io.Serializable;

/**
 * 权限Entity
 * @author sinspark
 * @version 2017/4/24
 */
public class Role implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;		//角色名称
	private String enname; 	//英文名称
	private String roleType;	//权限类型
	private String dataScope;	//数据范围
	private String sysData; 	//是否是系统数据
	private String useable; 		//是否是可用
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnname() {
		return enname;
	}
	public void setEnname(String enname) {
		this.enname = enname;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getDataScope() {
		return dataScope;
	}
	public void setDataScope(String dataScope) {
		this.dataScope = dataScope;
	}
	public String getSysData() {
		return sysData;
	}
	public void setSysData(String sysData) {
		this.sysData = sysData;
	}
	public String getUseable() {
		return useable;
	}
	public void setUseable(String useable) {
		this.useable = useable;
	}
	
}
