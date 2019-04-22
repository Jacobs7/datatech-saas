/**
 * 公  司：魔力小猪
 * 文件名：ShopProviderApp
 * 作  者：Zly
 * 时  间：2019/4/18/11:16
 */
package com.datatech.springcloud.shop;


import com.ace.cache.EnableAceCache;
import com.datatech.cloud.upms.client.EnableAceAuthClient;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDiscoveryClient
@EnableCircuitBreaker
@SpringBootApplication
@EnableFeignClients({"com.datatech.cloud.upms.client.feign"})  //com.github.wxiaoqi.security.auth.client.feign
@EnableScheduling
@EnableAceAuthClient
@EnableAceCache
@EnableTransactionManagement
@MapperScan("com.datatech.springcloud.shop.mapper")  //com.github.wxiaoqi.security.admin.mapper
@EnableSwagger2Doc
public class ShopProviderApp {
     public static void main(String[] args){
         SpringApplication.run(ShopProviderApp.class,args);
     }

}
