package com.datatech.cloud.cms.consumer.rest;

import com.datatech.cloud.common.rest.BaseController;
import com.datatech.cloud.cms.consumer.biz.TopicBiz;
import com.datatech.cloud.cms.entity.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("topic")
public class TopicController extends BaseController<TopicBiz,Topic> {

}