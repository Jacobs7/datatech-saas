package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 专题
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:17
 */
@Table(name = "cms_topic")
public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer topicId;
	
	    //标题
    @Column(name = "title")
    private String title;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //链接
    @Column(name = "url")
    private String url;
	
	    //创建时间
    @Column(name = "ctime")
    private Long ctime;
	

	/**
	 * 设置：编号
	 */
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getTopicId() {
		return topicId;
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
	 * 设置：链接
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：链接
	 */
	public String getUrl() {
		return url;
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
}
