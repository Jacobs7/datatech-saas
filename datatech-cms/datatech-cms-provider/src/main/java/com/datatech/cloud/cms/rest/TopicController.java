package com.datatech.cloud.cms.rest;

import com.datatech.cloud.cms.biz.TopicBiz;
import com.datatech.cloud.cms.entity.Topic;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("topic")
public class TopicController extends BaseController<TopicBiz,Topic> {

}