package com.datatech.cloud.cms.rpc.service;

import com.datatech.cloud.cms.biz.ArticleBiz;
import com.datatech.cloud.cms.vo.ArticleInManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    ArticleBiz articleBiz;

    public List<ArticleInManager> queryForPageBiz(){
        return null;
    }
}
