package com.weixin.order.service;

import com.weixin.order.dto.OrderDTO;

/**
 * 推送消息
 * @author ilovejava1314
 * @date 2019/8/16 22:15
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}