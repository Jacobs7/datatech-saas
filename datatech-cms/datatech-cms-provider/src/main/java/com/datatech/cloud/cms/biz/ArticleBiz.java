package com.datatech.cloud.cms.biz;

import com.datatech.cloud.cms.entity.Article;
import com.datatech.cloud.cms.mapper.ArticleMapper;
import com.datatech.cloud.cms.vo.ArticleInManager;
import com.datatech.cloud.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 文章表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ArticleBiz extends BaseBiz<ArticleMapper,Article> {

    public List<ArticleInManager> queryForPageBiz(Example example){

        return mapper.queryForPageBiz(example);
    }
}