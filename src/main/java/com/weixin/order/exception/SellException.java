package com.weixin.order.exception;

import com.weixin.order.enums.ResultEnum;
import lombok.Getter;

/**
 * @author ilovejava1314
 * @date 2019/8/14 12:59
 */
@Getter

public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}

