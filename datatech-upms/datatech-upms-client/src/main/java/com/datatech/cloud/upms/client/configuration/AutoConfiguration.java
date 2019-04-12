package com.datatech.cloud.upms.client.configuration;

import com.datatech.cloud.upms.client.config.ServiceAuthConfig;
import com.datatech.cloud.upms.client.config.UserAuthConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ace on 2017/9/15.  com.datatech.cloud.upms.common
 */
@Configuration
@ComponentScan({"com.datatech.cloud.upms.client","com.datatech.cloud.upms.common"})
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig(){
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig(){
        return new UserAuthConfig();
    }

}
