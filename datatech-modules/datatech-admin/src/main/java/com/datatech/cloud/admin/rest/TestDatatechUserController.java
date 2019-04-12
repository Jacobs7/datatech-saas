package com.datatech.cloud.admin.rest;

import com.datatech.cloud.admin.biz.UserBiz;
import com.datatech.cloud.admin.entity.User;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("datatech")
public class TestDatatechUserController extends BaseController<UserBiz, User> {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public @ResponseBody
    String getMenusByUsername(String token) throws Exception {
        return "hi i am first msg from datatech cloud";
    }

}
