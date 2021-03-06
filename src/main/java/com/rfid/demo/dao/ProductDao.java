package com.rfid.demo.dao;

import com.rfid.demo.entity.Product;

import java.util.List;

/**
 *
 */
public interface ProductDao {
    int add(Product product);

    int update(Product product);

    int delete(String orderNum);

    Product findProductByOrder(String orderNum);

    List<Product> findAllProduct();


}
