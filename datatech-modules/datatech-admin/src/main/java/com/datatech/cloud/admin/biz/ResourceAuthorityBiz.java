package com.datatech.cloud.admin.biz;

import com.datatech.cloud.admin.entity.ResourceAuthority;
import com.datatech.cloud.admin.mapper.ResourceAuthorityMapper;
import com.datatech.cloud.common.biz.BaseBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ace on 2017/6/19.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResourceAuthorityBiz extends BaseBiz<ResourceAuthorityMapper,ResourceAuthority> {
}
