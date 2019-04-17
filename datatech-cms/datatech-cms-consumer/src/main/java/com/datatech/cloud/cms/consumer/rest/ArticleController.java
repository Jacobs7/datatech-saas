package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.consumer.biz.ArticleBiz;
import com.datatech.cloud.cms.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("article")
public class ArticleController extends BaseController<ArticleBiz,Article> {

}