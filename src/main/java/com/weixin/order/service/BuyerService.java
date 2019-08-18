package com.weixin.order.service;

import com.weixin.order.dto.OrderDTO;

/**
 * 买家
 * @author ilovejava1314
 * @date 2019/8/16 22:11
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
