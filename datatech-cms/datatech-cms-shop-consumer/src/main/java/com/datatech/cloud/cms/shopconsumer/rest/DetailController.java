package com.datatech.cloud.cms.shopconsumer.rest;


import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.shop.entity.Detail;
import com.datatech.cloud.shop.sp.biz.DetailBiz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("detail")
public class DetailController extends BaseController<DetailBiz, Detail> {

}