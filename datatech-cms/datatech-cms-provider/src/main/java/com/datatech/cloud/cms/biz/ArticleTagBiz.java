package com.datatech.cloud.cms.biz;

import org.springframework.stereotype.Service;

import com.datatech.cloud.cms.entity.ArticleTag;
import com.datatech.cloud.cms.mapper.ArticleTagMapper;
import com.datatech.cloud.common.biz.BaseBiz;

/**
 * 文章标签关联表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class ArticleTagBiz extends BaseBiz<ArticleTagMapper,ArticleTag> {
}