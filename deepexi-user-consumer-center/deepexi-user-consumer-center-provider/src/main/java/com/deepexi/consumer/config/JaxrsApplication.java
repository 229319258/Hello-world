package com.deepexi.consumer.config;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * 描述。
 * <p>
 * <br>==========================
 * <br> 公司：滴普科技
 * <br> 开发：hudong@deepexi.com
 * <br> 版本：1.0
 * <br> 创建时间：2018/4/28 14:13
 * <br>==========================
 */
@Component
@ApplicationPath("/")
public class JaxrsApplication extends Application {



}