package com.datatech.cloud.cms.mapper;

import com.datatech.cloud.cms.entity.Article;
import com.datatech.cloud.cms.vo.ArticleInManager;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 文章表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */

public interface ArticleMapper extends Mapper<Article> {
    //自定义查询
    List<ArticleInManager> queryForPageBiz(Example example);
	
}
