package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.ArticleTagBiz;
import com.datatech.cloud.cms.entity.ArticleTag;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("articleTag")
public class ArticleTagController extends BaseController<ArticleTagBiz,ArticleTag> {

}