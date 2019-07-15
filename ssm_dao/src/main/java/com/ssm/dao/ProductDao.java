package com.ssm.dao;

import com.ssm.domain.Product;

import java.util.List;

public interface ProductDao {

    //查询所有产品信息
    public List<Product> findAll(int page,int size) throws Exception;

    //添加产品
    public void save(Product product) throws Exception;

    public Product findById(String id) throws Exception;
}
