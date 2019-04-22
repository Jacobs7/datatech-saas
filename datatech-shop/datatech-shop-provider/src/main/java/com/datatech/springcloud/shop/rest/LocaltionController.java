package com.datatech.springcloud.shop.rest;


import com.datatech.cloud.common.rest.BaseController;
import com.datatech.springcloud.shop.biz.LocaltionBiz;
import com.datatech.springcloud.shop.entity.Localtion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("localtion")
public class LocaltionController extends BaseController<LocaltionBiz, Localtion> {

}