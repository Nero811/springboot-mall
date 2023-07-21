package com.jackyang.springbootmall.dao;

import com.jackyang.springbootmall.constant.ProductCategory;
import com.jackyang.springbootmall.dto.ProductRequest;
import com.jackyang.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
