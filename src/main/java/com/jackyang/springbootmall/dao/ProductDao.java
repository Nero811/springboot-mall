package com.jackyang.springbootmall.dao;

import com.jackyang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
