package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.MenuBiz;
import com.datatech.cloud.cms.entity.Menu;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menu")
public class MenuController extends BaseController<MenuBiz,Menu> {

}