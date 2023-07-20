package com.jackyang.springbootmall.dao;

import com.jackyang.springbootmall.dto.ProductRequest;
import com.jackyang.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
