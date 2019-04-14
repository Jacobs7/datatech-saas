package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 文章标签关联表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_article_tag")
public class ArticleTag implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer articleTagId;
	
	    //文章编号
    @Column(name = "article_id")
    private Integer articleId;
	
	    //标签编号
    @Column(name = "tag_id")
    private Integer tagId;
	

	/**
	 * 设置：编号
	 */
	public void setArticleTagId(Integer articleTagId) {
		this.articleTagId = articleTagId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getArticleTagId() {
		return articleTagId;
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
