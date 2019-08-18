package com.weixin.order.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.weixin.order.dto.OrderDTO;

/**
 * @author ilovejava1314
 * @date 2019/8/16 22:13
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}

