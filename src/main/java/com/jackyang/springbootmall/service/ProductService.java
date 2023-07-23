package com.jackyang.springbootmall.service;

import com.jackyang.springbootmall.constant.ProductCategory;
import com.jackyang.springbootmall.dto.ProductQueryParams;
import com.jackyang.springbootmall.dto.ProductRequest;
import com.jackyang.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
