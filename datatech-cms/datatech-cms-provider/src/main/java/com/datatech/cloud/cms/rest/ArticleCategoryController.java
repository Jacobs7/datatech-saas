package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.ArticleCategoryBiz;
import com.datatech.cloud.cms.entity.ArticleCategory;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("articleCategory")
public class ArticleCategoryController extends BaseController<ArticleCategoryBiz,ArticleCategory> {

}