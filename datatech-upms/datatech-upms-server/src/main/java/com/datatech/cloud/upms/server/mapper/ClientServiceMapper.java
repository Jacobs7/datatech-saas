package com.datatech.cloud.upms.server.mapper;

import com.datatech.cloud.upms.server.entity.ClientService;
import tk.mybatis.mapper.common.Mapper;

public interface ClientServiceMapper extends Mapper<ClientService> {
    void deleteByServiceId(int id);
}