package com.weixin.order.service;

import com.weixin.order.dataobject.ProductCategory;

import java.util.List;

/**
 * 分类
 * @author ilovejava1314
 * @date 2019/8/16 22:11
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
