package com.datatech.cloud.upms.server.controller;

import com.datatech.cloud.upms.server.biz.ClientBiz;
import com.datatech.cloud.upms.server.entity.Client;
import com.datatech.cloud.upms.server.entity.ClientService;
import com.datatech.cloud.common.msg.ObjectRestResponse;
import com.datatech.cloud.common.rest.BaseController;
import org.springframework.web.bind.annotation.*;

/**
 * @author ace
 * @create 2017/12/26.
 */
@RestController
@RequestMapping("service")
public class ServiceController extends BaseController<ClientBiz,Client>{

    @RequestMapping(value = "/{id}/client", method = RequestMethod.PUT)
    @ResponseBody
    public ObjectRestResponse modifyUsers(@PathVariable int id, String clients){
        baseBiz.modifyClientServices(id, clients);
        return new ObjectRestResponse().rel(true);
    }

    @RequestMapping(value = "/{id}/client", method = RequestMethod.GET)
    @ResponseBody
    public ObjectRestResponse<ClientService> getUsers(@PathVariable int id){
        return new ObjectRestResponse<ClientService>().rel(true).data(baseBiz.getClientServices(id));
    }
}
