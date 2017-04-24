package com.sinspark.jeeshop.modules.sys.entity;

import java.io.Serializable;

/**
 * 菜单Entity
 * @author sinspark
 * @version 2017/4/24
 */
public class Menu implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Menu parent;					//父级菜单
	private String parentIds;			//所有父级编号
	private String name;					//名称
	private String href;					//连接
	private String target;				//目标（_blank、_self、_parent、_top）
	private String icon;					//图标
	private Integer sort;					//排序
	private String isShow;				//是否在菜单中显示
	private String permission;			//权限标识
	
	public Menu getParent() {
		return parent;
	}
	public void setParent(Menu parent) {
		this.parent = parent;
	}
	public String getParentIds() {
		return parentIds;
	}
	public void setParentIds(String parentIds) {
		this.parentIds = parentIds;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
}
