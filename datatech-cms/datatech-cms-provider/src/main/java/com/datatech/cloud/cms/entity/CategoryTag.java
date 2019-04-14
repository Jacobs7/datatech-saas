package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 类目标签关联表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_category_tag")
public class CategoryTag implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer categoryTagId;
	
	    //类目编号
    @Column(name = "category_id")
    private Integer categoryId;
	
	    //标签编号
    @Column(name = "tag_id")
    private Integer tagId;
	

	/**
	 * 设置：编号
	 */
	public void setCategoryTagId(Integer categoryTagId) {
		this.categoryTagId = categoryTagId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getCategoryTagId() {
		return categoryTagId;
	}
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
	 * 设置：标签编号
	 */
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}
	/**
	 * 获取：标签编号
	 */
	public Integer getTagId() {
		return tagId;
	}
}
