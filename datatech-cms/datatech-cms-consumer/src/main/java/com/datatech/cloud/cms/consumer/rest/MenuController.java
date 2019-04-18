package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.MenuBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menu")
public class MenuController extends BaseController<MenuBiz,Menu> {

}