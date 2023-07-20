package com.jackyang.springbootmall.service;

import com.jackyang.springbootmall.dto.ProductRequest;
import com.jackyang.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
