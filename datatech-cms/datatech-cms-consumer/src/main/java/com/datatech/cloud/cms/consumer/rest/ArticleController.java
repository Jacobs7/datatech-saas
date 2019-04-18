package com.datatech.cloud.cms.consumer.rest;


import com.datatech.cloud.cms.consumer.biz.ArticleBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("article")
public class ArticleController extends BaseController<ArticleBiz,Article> {

    @RequestMapping(value = "/datatech", method = RequestMethod.GET)
    public @ResponseBody
    String getAllMenus() throws Exception {
        return "hello datatech";
    }
}