package com.datatech.cloud.cms.biz;

import org.springframework.stereotype.Service;

import com.datatech.cloud.cms.entity.Category;
import com.datatech.cloud.cms.mapper.CategoryMapper;
import com.datatech.cloud.common.biz.BaseBiz;

/**
 * 类目表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class CategoryBiz extends BaseBiz<CategoryMapper,Category> {
}