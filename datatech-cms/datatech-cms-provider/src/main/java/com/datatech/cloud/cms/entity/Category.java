package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 类目表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_category")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //类目编号
    @Id
    private Integer categoryId;
	
	    //上级编号
    @Column(name = "pid")
    private Integer pid;
	
	    //层级
    @Column(name = "level")
    private Integer level;
	
	    //名称
    @Column(name = "name")
    private String name;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //图标
    @Column(name = "icon")
    private String icon;
	
	    //类型(1:普通,2:热门...)
    @Column(name = "type")
    private Integer type;
	
	    //别名
    @Column(name = "alias")
    private String alias;
	
	    //所属系统
    @Column(name = "system_id")
    private Integer systemId;
	
	    //创建时间
    @Column(name = "ctime")
    private Long ctime;
	
	    //排序
    @Column(name = "orders")
    private Long orders;
	

	/**
	 * 设置：类目编号
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * 获取：类目编号
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * 设置：上级编号
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：上级编号
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * 设置：层级
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：层级
	 */
	public Integer getLevel() {
		return level;
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
	 * 设置：描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：图标
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * 获取：图标
	 */
	public String getIcon() {
		return icon;
	}
	/**
	 * 设置：类型(1:普通,2:热门...)
	 */
	public void setType(Integer type) {
		this.type = type;
	}
	/**
	 * 获取：类型(1:普通,2:热门...)
	 */
	public Integer getType() {
		return type;
	}
	/**
	 * 设置：别名
	 */
	public void setAlias(String alias) {
		this.alias = alias;
	}
	/**
	 * 获取：别名
	 */
	public String getAlias() {
		return alias;
	}
	/**
	 * 设置：所属系统
	 */
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	/**
	 * 获取：所属系统
	 */
	public Integer getSystemId() {
		return systemId;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCtime(Long ctime) {
		this.ctime = ctime;
	}
	/**
	 * 获取：创建时间
	 */
	public Long getCtime() {
		return ctime;
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
