package com.weixin.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ilovejava1314
 * @date 2019/8/16 21:56
 */
@Component
@ConfigurationProperties("upyun")
@Data
public class UpYunConfig {

    private String bucketName;

    private String username;

    private String password;

    /**
     * http://xxx.com/
     */
    private String imageHost;
}