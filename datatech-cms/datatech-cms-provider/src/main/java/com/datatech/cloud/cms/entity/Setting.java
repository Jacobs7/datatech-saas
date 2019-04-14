package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 网站配置
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_setting")
public class Setting implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer settingId;
	
	    //
    @Column(name = "setting_key")
    private String settingKey;
	
	    //
    @Column(name = "setting_value")
    private String settingValue;
	

	/**
	 * 设置：
	 */
	public void setSettingId(Integer settingId) {
		this.settingId = settingId;
	}
	/**
	 * 获取：
	 */
	public Integer getSettingId() {
		return settingId;
	}
	/**
	 * 设置：
	 */
	public void setSettingKey(String settingKey) {
		this.settingKey = settingKey;
	}
	/**
	 * 获取：
	 */
	public String getSettingKey() {
		return settingKey;
	}
	/**
	 * 设置：
	 */
	public void setSettingValue(String settingValue) {
		this.settingValue = settingValue;
	}
	/**
	 * 获取：
	 */
	public String getSettingValue() {
		return settingValue;
	}
}
