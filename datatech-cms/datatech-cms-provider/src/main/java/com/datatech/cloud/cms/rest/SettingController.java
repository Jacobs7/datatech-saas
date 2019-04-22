package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.SettingBiz;
import com.datatech.cloud.cms.entity.Setting;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("setting")
public class SettingController extends BaseController<SettingBiz,Setting> {

}