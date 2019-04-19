package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.CommentBiz;
import com.datatech.cloud.cms.entity.Comment;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("comment")
public class CommentController extends BaseController<CommentBiz,Comment> {

}