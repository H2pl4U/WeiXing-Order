package com.weixin.order.repository;

import com.weixin.order.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ilovejava1314
 * @date 2019/8/16 22:09
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {
    SellerInfo findByOpenid(String openid);
}