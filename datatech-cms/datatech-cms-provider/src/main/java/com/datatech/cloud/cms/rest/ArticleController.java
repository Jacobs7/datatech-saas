package com.datatech.cloud.cms.rest;


import com.datatech.cloud.cms.api.vo.article.ArticleInfo;
import com.datatech.cloud.cms.biz.ArticleBiz;
import com.datatech.cloud.cms.entity.Article;
import com.datatech.cloud.cms.rpc.service.ArticleService;
import com.datatech.cloud.cms.vo.ArticleInManager;
import com.datatech.cloud.common.msg.TableResultResponse;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.common.util.Query;
import com.github.pagehelper.PageHelper;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("article")
public class ArticleController extends BaseController<ArticleBiz,Article> {

    @Autowired
    ArticleBiz articleBiz;

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/datatech", method = RequestMethod.GET)
    public @ResponseBody
    String getAllMenus() throws Exception {
        return "hello datatech";
    }


    @RequestMapping(value = "/pagetest",method = RequestMethod.GET)
    @ResponseBody
    //public TableResultResponse pagetest(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1")int offset, String name){
    public Map<String, Object> pagetest(@RequestParam(defaultValue = "10") int limit, @RequestParam(defaultValue = "1")int offset, String name){


        // 1  利用框架原有 分页查询控件 Query 分页查询对象
//          Map queryMap = new HashMap();
//          Query query = new Query(queryMap);
//          return articleBiz.selectByQuery(query);

        // 2-1  select result return Serializable Obj
        List<ArticleInfo> list = articleService.queryForPageBiz(new HashMap<String, Object>());

        // 2-1-2  select result return map Obj
        //List<Map<String,Object>> list = articleService.queryForPageMapBiz(new HashMap<String, Object>());

        // 2-2 select count
        Long pageCount = articleService.queryForPageCountBiz(new HashMap<String, Object>());
        // 2-3  result object
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("status", 200);

        Map<String, Object> rows = new HashMap<String, Object>();
        rows.put("total", pageCount);
        rows.put("rows", list);

        result.put("data", rows);
        return result;
    }
}