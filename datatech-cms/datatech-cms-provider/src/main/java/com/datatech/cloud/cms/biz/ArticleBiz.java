package com.datatech.cloud.cms.biz;

import org.springframework.stereotype.Service;

import com.datatech.cloud.cms.entity.Article;
import com.datatech.cloud.cms.mapper.ArticleMapper;
import com.datatech.cloud.common.biz.BaseBiz;

import java.util.List;

/**
 * 文章表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class ArticleBiz extends BaseBiz<ArticleMapper,Article> {

}