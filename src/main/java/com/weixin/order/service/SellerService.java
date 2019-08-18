package com.weixin.order.service;

import com.weixin.order.dataobject.SellerInfo;

/**
 * 卖家端
 * @author ilovejava1314
 * @date 2019/8/16 22:18
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
