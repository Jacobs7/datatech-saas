package com.datatech.cloud.cms.biz;

import org.springframework.stereotype.Service;

import com.datatech.cloud.cms.entity.Setting;
import com.datatech.cloud.cms.mapper.SettingMapper;
import com.datatech.cloud.common.biz.BaseBiz;

/**
 * 网站配置
 *
 * @author Datatech.Co
 * @email 23484376@qq.com
 * @date 2019-04-13 15:31:18
 */
@Service
public class SettingBiz extends BaseBiz<SettingMapper,Setting> {
}