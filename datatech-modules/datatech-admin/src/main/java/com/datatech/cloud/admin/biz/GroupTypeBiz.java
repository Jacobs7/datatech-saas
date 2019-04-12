package com.datatech.cloud.admin.biz;

import com.datatech.cloud.admin.entity.GroupType;
import com.datatech.cloud.admin.mapper.GroupTypeMapper;
import com.datatech.cloud.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-06-12 8:48
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GroupTypeBiz extends BaseBiz<GroupTypeMapper,GroupType> {
}
