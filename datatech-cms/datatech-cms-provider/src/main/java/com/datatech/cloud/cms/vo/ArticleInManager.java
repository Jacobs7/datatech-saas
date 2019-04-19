package com.datatech.cloud.cms.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArticleInManager implements Serializable {

    //文章编号
    private Integer articleId;

    //所属专题
    private Integer topicId;
    //所属专题
    private String topicStr;

    //文章标题
    private String title;
    //文章原作者
    private String author;
    //转载来源网址
    private String fromurl;
    //封面图
    private String image;
    //关键字
    private String keywords;
    //简介
    private String description;

    //类型(1:普通,2:热门...)
    private Integer type;
    //类型(1:普通,2:热门...)
    private Integer typeStr;

    //是否允许评论(0:不允许,1:允许)
    private Integer allowcomments;
    //是否允许评论(0:不允许,1:允许)
    private Integer allowcommentsStr;

    //状态(-1:不通过,0未审核,1:通过)
    private Integer status;
    //状态(-1:不通过,0未审核,1:通过)
    private String statusStr;

    //内容
    private String content;

    //发布人id
    private Integer userId;

    private String username;


    //阅读数量
    private Integer readnumber;

    //置顶等级
    private Integer top;

    //所属系统
    private Integer systemId;

    //创建时间
    private Long ctime;

    //排序
    private Long orders;


}
