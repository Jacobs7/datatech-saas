package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.CategoryBiz;
import com.datatech.cloud.cms.entity.Category;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController extends BaseController<CategoryBiz,Category> {

}