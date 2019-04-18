package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.CommentBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("comment")
public class CommentController extends BaseController<CommentBiz,Comment> {

}