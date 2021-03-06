package com.taoqy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈一句话功能简述〉
 * 〈功能详细描述〉
 *
 * @author Taoqy
 * @version 1.0, 2019/4/1
 * @see [相关类/方法]
 * @since
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class SwaggerTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerTestApplication.class,args);
    }
}
