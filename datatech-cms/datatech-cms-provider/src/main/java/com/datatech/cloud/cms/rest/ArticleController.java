package com.datatech.cloud.cms.rest;


import com.datatech.cloud.cms.biz.ArticleBiz;
import com.datatech.cloud.cms.entity.Article;
import com.datatech.cloud.common.msg.TableResultResponse;
import com.datatech.cloud.common.rest.BaseController;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;


@Controller
@RequestMapping("article")
public class ArticleController extends BaseController<ArticleBiz,Article> {

    @Autowired
    ArticleBiz articleBiz;

    @RequestMapping(value = "/datatech", method = RequestMethod.GET)
    public @ResponseBody
    String getAllMenus() throws Exception {
        return "hello datatech";
    }


    @RequestMapping(value = "/pagetest",method = RequestMethod.GET)
    @ResponseBody
    public TableResultResponse<Article> pagetest(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1")int offset, String name){

        Example example = new Example(Article.class);
        if(StringUtils.isNotBlank(name)) {
            example.createCriteria().andLike("menu", "%" + name + "%");
        }
        int count = baseBiz.selectCountByExample(example);
        PageHelper.startPage(offset, limit);
        return new TableResultResponse<Article>(count,articleBiz.queryForPageBiz(example));
    }
}