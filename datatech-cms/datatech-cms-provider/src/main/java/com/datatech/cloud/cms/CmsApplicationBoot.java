package com.datatech.cloud.cms;

import com.ace.cache.EnableAceCache;
import com.datatech.cloud.upms.client.EnableAceAuthClient;
import com.datatech.cloud.upms.client.annotation.IgnoreUserToken;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ${DESCRIPTION}
 *
 * @author wanghaobin
 * @create 2017-05-25 12:44
 */
@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients({"com.datatech.cloud.upms.client.feign"})  //com.github.wxiaoqi.security.auth.client.feign
@EnableScheduling
@EnableAceAuthClient
@EnableAceCache
@EnableTransactionManagement
@MapperScan("com.datatech.cloud.cms.mapper")  //com.github.wxiaoqi.security.admin.mapper
@EnableSwagger2Doc


public class CmsApplicationBoot {
    public static void main(String[] args) {
        new SpringApplicationBuilder(CmsApplicationBoot.class).run(args);    }
}
