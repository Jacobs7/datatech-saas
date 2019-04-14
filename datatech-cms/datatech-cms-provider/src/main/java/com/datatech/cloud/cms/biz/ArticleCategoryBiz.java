package com.datatech.cloud.cms.biz;

import org.springframework.stereotype.Service;

import com.datatech.cloud.cms.entity.ArticleCategory;
import com.datatech.cloud.cms.mapper.ArticleCategoryMapper;
import com.datatech.cloud.common.biz.BaseBiz;

/**
 * 文章类目关联表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class ArticleCategoryBiz extends BaseBiz<ArticleCategoryMapper,ArticleCategory> {
}