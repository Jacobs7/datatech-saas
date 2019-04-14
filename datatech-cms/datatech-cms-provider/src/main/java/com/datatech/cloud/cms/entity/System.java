package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 系统管理
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_system")
public class System implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer systemId;
	
	    //系统名称
    @Column(name = "name")
    private String name;
	
	    //别名
    @Column(name = "code")
    private String code;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //创建时间
    @Column(name = "ctime")
    private Long ctime;
	
	    //排序
    @Column(name = "orders")
    private Long orders;
	

	/**
	 * 设置：编号
	 */
	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getSystemId() {
		return systemId;
	}
	/**
	 * 设置：系统名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：系统名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：别名
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：别名
	 */
	public String getCode() {
		return code;
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
