package com.datatech.cloud.shop.rest;


import com.datatech.cloud.common.rest.BaseController;

import com.datatech.cloud.shop.biz.DetailBiz;
import com.datatech.cloud.shop.entity.Detail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("detail")
public class DetailController extends BaseController<DetailBiz, Detail> {

}