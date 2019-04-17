package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.consumer.biz.PageBiz;
import com.datatech.cloud.cms.entity.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController extends BaseController<PageBiz,Page> {

}