package com.datatech.cloud.shop.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-22 14:39:55
 */
@Table(name = "shop_detail")
public class Detail implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //
    @Column(name = "shop_name")
    private String shopName;
	
	    //
    @Column(name = "shop_price")
    private BigDecimal shopPrice;
	

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
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 获取：
	 */
	public String getShopName() {
		return shopName;
	}
	/**
	 * 设置：
	 */
	public void setShopPrice(BigDecimal shopPrice) {
		this.shopPrice = shopPrice;
	}
	/**
	 * 获取：
	 */
	public BigDecimal getShopPrice() {
		return shopPrice;
	}
}
