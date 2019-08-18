package com.weixin.order.dto;

import lombok.Data;

/**
 * 购物车
 * @author ilovejava1314
 * @date 2019/8/12 21:30
 */
@Data
public class CartDTO {

    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
