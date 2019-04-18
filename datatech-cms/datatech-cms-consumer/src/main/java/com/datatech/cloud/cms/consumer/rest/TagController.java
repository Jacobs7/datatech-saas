package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.cms.consumer.biz.TagBiz;
import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.entity.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tag")
public class TagController extends BaseController<TagBiz,Tag> {

}