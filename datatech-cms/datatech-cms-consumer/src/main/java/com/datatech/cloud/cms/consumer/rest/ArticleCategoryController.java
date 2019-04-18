package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.ArticleCategoryBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.ArticleCategory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("articleCategory")
public class ArticleCategoryController extends BaseController<ArticleCategoryBiz,ArticleCategory> {

}