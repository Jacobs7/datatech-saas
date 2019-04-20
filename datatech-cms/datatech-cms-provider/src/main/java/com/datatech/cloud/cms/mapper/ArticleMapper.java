package com.datatech.cloud.cms.mapper;

import com.datatech.cloud.cms.api.vo.article.ArticleInfo;
import com.datatech.cloud.cms.entity.Article;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

/**
 * 文章表
 * 
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */

public interface ArticleMapper extends Mapper<Article> {
    //自定义查询
//    List<Article> queryForPageBiz(Example example);
    //public List<Map<String, Object>> queryForPageBiz(Map<String, Object> map);
    public List<ArticleInfo> queryForPageBiz(Map<String, Object> map);

    //返回未封装Map对象
    public List<Map<String, Object>> queryForPageMapBiz(Map<String, Object> map);

    public Long queryForPageCountBiz(Map<String,Object> map);
}
