package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.TagBiz;
import com.datatech.cloud.cms.entity.Tag;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tag")
public class TagController extends BaseController<TagBiz,Tag> {

}