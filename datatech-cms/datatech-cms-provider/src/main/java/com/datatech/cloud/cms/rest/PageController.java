package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.PageBiz;
import com.datatech.cloud.cms.entity.Page;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController extends BaseController<PageBiz,Page> {

}