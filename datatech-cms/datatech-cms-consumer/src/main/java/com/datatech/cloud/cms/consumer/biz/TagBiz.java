package com.datatech.cloud.cms.consumer.biz;

import com.datatech.cloud.cms.entity.Tag;
import com.datatech.cloud.cms.mapper.TagMapper;
import com.datatech.cloud.common.biz.BaseBiz;
import org.springframework.stereotype.Service;

/**
 * 标签表
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class TagBiz extends BaseBiz<TagMapper,Tag> {
}