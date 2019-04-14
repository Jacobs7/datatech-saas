package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 页面
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_page")
public class Page implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编码
    @Id
    private Integer pageId;
	
	    //父页面
    @Column(name = "pid")
    private Integer pid;
	
	    //标题
    @Column(name = "title")
    private String title;
	
	    //别名
    @Column(name = "alias")
    private String alias;
	
	    //页面内容
    @Column(name = "content")
    private String content;
	
	    //关键字
    @Column(name = "keywords")
    private String keywords;
	
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
	 * 设置：编码
	 */
	public void setPageId(Integer pageId) {
		this.pageId = pageId;
	}
	/**
	 * 获取：编码
	 */
	public Integer getPageId() {
		return pageId;
	}
	/**
	 * 设置：父页面
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：父页面
	 */
	public Integer getPid() {
		return pid;
	}
	/**
	 * 设置：标题
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：标题
	 */
	public String getTitle() {
		return title;
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
	 * 设置：页面内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：页面内容
	 */
	public String getContent() {
		return content;
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
