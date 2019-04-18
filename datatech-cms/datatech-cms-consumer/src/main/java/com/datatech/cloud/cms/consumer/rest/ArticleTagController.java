package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.ArticleTagBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.ArticleTag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("articleTag")
public class ArticleTagController extends BaseController<ArticleTagBiz,ArticleTag> {

}