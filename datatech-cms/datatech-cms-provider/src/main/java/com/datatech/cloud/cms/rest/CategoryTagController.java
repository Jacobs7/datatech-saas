package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.CategoryTagBiz;
import com.datatech.cloud.cms.entity.CategoryTag;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categoryTag")
public class CategoryTagController extends BaseController<CategoryTagBiz,CategoryTag> {

}