package com.datatech.cloud.gateway.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "datatech-cms")
public interface ICmsService {

}
