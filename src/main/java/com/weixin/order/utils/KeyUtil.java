package com.weixin.order.utils;

import java.util.Random;

/**
 * @author ilovejava1314
 * @date 2019/8/12 22:59
 */
public class KeyUtil {
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
