package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 文章类目关联表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_article_category")
public class ArticleCategory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer articleCategoryId;
	
	    //文章编号
    @Column(name = "article_id")
    private Integer articleId;
	
	    //类目编号
    @Column(name = "category_id")
    private Integer categoryId;
	

	/**
	 * 设置：编号
	 */
	public void setArticleCategoryId(Integer articleCategoryId) {
		this.articleCategoryId = articleCategoryId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getArticleCategoryId() {
		return articleCategoryId;
	}
	/**
	 * 设置：文章编号
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	/**
	 * 获取：文章编号
	 */
	public Integer getArticleId() {
		return articleId;
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
}
