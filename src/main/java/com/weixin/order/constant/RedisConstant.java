package com.weixin.order.constant;

/**
 * Redis常量
 * @author ilovejava1314
 * @date 2019/8/14 13:06
 */
public interface RedisConstant {
    String TOKEN_PREFIX = "token_%s";

    Integer EXPIRE = 7200; //2小时
}
