package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 菜单
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_menu")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer menuId;
	
	    //父菜单
    @Column(name = "pid")
    private Integer pid;
	
	    //名称
    @Column(name = "name")
    private String name;
	
	    //链接
    @Column(name = "url")
    private String url;
	
	    //打开方式
    @Column(name = "target")
    private String target;
	
	    //排序
    @Column(name = "orders")
    private Long orders;
	

	/**
	 * 设置：编号
	 */
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getMenuId() {
		return menuId;
	}
	/**
	 * 设置：父菜单
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：父菜单
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * 设置：名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：链接
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：链接
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：打开方式
	 */
	public void setTarget(String target) {
		this.target = target;
	}
	/**
	 * 获取：打开方式
	 */
	public String getTarget() {
		return target;
	}
	/**
	 * 设置：排序
	 */
	public void setOrders(Long orders) {
		this.orders = orders;
	}
	/**
	 * 获取：排序
	 */
	public Long getOrders() {
		return orders;
	}
}
