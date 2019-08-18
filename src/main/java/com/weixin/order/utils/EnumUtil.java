package com.weixin.order.utils;

import com.weixin.order.enums.CodeEnum;

/**
 * @author ilovejava1314
 * @date 2019/8/12 22:52
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
