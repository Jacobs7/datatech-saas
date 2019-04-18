package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.SystemBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.System;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("system")
public class SystemController extends BaseController<SystemBiz,System> {

}