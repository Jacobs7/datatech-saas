package com.datatech.cloud.cms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 文章表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_article")
@Data
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //文章编号
    @Id
    private Integer articleId;
	
	    //所属专题
    @Column(name = "topic_id")
    private Integer topicId;
	
	    //文章标题
    @Column(name = "title")
    private String title;
	
	    //文章原作者
    @Column(name = "author")
    private String author;
	
	    //转载来源网址
    @Column(name = "fromurl")
    private String fromurl;
	
	    //封面图
    @Column(name = "image")
    private String image;
	
	    //关键字
    @Column(name = "keywords")
    private String keywords;
	
	    //简介
    @Column(name = "description")
    private String description;
	
	    //类型(1:普通,2:热门...)
    @Column(name = "type")
    private Integer type;
	
	    //是否允许评论(0:不允许,1:允许)
    @Column(name = "allowcomments")
    private Integer allowcomments;
	
	    //状态(-1:不通过,0未审核,1:通过)
    @Column(name = "status")
    private Integer status;
	
	    //内容
    @Column(name = "content")
    private String content;
	
	    //发布人id
    @Column(name = "user_id")
    private Integer userId;



	
	    //阅读数量
    @Column(name = "readnumber")
    private Integer readnumber;
	
	    //置顶等级
    @Column(name = "top")
    private Integer top;
	
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
	 * 设置：所属专题
	 */
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	/**
	 * 获取：所属专题
	 */
	public Integer getTopicId() {
		return topicId;
	}
	/**
	 * 设置：文章标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：文章标题
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：文章原作者
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * 获取：文章原作者
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 设置：转载来源网址
	 */
	public void setFromurl(String fromurl) {
		this.fromurl = fromurl;
	}
	/**
	 * 获取：转载来源网址
	 */
	public String getFromurl() {
		return fromurl;
	}
	/**
	 * 设置：封面图
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：封面图
	 */
	public String getImage() {
		return image;
	}
	/**
	 * 设置：关键字
	 */
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 获取：关键字
	 */
	public String getKeywords() {
		return keywords;
	}
	/**
	 * 设置：简介
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：简介
	 */
	public String getDescription() {
		return description;
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
	 * 设置：是否允许评论(0:不允许,1:允许)
	 */
	public void setAllowcomments(Integer allowcomments) {
		this.allowcomments = allowcomments;
	}
	/**
	 * 获取：是否允许评论(0:不允许,1:允许)
	 */
	public Integer getAllowcomments() {
		return allowcomments;
	}
	/**
	 * 设置：状态(-1:不通过,0未审核,1:通过)
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态(-1:不通过,0未审核,1:通过)
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：发布人id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：发布人id
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：阅读数量
	 */
	public void setReadnumber(Integer readnumber) {
		this.readnumber = readnumber;
	}
	/**
	 * 获取：阅读数量
	 */
	public Integer getReadnumber() {
		return readnumber;
	}
	/**
	 * 设置：置顶等级
	 */
	public void setTop(Integer top) {
		this.top = top;
	}
	/**
	 * 获取：置顶等级
	 */
	public Integer getTop() {
		return top;
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
