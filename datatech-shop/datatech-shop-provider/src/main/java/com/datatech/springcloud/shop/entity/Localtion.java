package com.datatech.springcloud.shop.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-22 14:39:55
 */
@Table(name = "shop_localtion")
public class Localtion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "shop_type")
    private String shopType;
	
	    //
    @Column(name = "shop_location")
    private String shopLocation;
	
	    //
    @Column(name = "shop_id")
    private Integer shopId;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	/**
	 * 获取：
	 */
	public String getShopType() {
		return shopType;
	}
	/**
	 * 设置：
	 */
	public void setShopLocation(String shopLocation) {
		this.shopLocation = shopLocation;
	}
	/**
	 * 获取：
	 */
	public String getShopLocation() {
		return shopLocation;
	}
	/**
	 * 设置：
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	/**
	 * 获取：
	 */
	public Integer getShopId() {
		return shopId;
	}
}
