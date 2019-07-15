package com.ssm.service;

import com.ssm.domain.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll(int page,int size) throws Exception;

    public void save(Product product) throws Exception;
}
