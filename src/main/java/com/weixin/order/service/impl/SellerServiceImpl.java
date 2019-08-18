package com.weixin.order.service.impl;

import com.weixin.order.dataobject.SellerInfo;
import com.weixin.order.repository.SellerInfoRepository;
import com.weixin.order.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ilovejava1314
 * @date 2019/8/17 14:00
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
