package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.CategoryTagBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.CategoryTag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categoryTag")
public class CategoryTagController extends BaseController<CategoryTagBiz,CategoryTag> {

}