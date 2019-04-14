package com.datatech.cloud.cms.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 评论表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Table(name = "cms_comment")
public class Comment implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //编号
    @Id
    private Integer commentId;
	
	    //回复楼中楼编号回复楼中楼编号
    @Column(name = "pid")
    private Integer pid;
	
	    //文章编号
    @Column(name = "article_id")
    private Integer articleId;
	
	    //用户编号
    @Column(name = "user_id")
    private Integer userId;
	
	    //评论内容
    @Column(name = "content")
    private String content;
	
	    //状态(-1:不通过,0:未审核,1:通过)
    @Column(name = "status")
    private Integer status;
	
	    //评论人ip地址
    @Column(name = "ip")
    private String ip;
	
	    //评论人终端信息
    @Column(name = "agent")
    private String agent;
	
	    //所属系统
    @Column(name = "system_id")
    private Integer systemId;
	
	    //创建时间
    @Column(name = "ctime")
    private Long ctime;
	

	/**
	 * 设置：编号
	 */
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	/**
	 * 获取：编号
	 */
	public Integer getCommentId() {
		return commentId;
	}
	/**
	 * 设置：回复楼中楼编号回复楼中楼编号
	 */
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	/**
	 * 获取：回复楼中楼编号回复楼中楼编号
	 */
	public Integer getPid() {
		return pid;
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
	 * 设置：用户编号
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户编号
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：评论内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：评论内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：状态(-1:不通过,0:未审核,1:通过)
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态(-1:不通过,0:未审核,1:通过)
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：评论人ip地址
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * 获取：评论人ip地址
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * 设置：评论人终端信息
	 */
	public void setAgent(String agent) {
		this.agent = agent;
	}
	/**
	 * 获取：评论人终端信息
	 */
	public String getAgent() {
		return agent;
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
}
