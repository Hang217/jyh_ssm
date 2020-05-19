package com.jyh.ssm.service;

import com.jyh.ssm.domain.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll(int page, int size) throws Exception;

    void save(Product product);
}
