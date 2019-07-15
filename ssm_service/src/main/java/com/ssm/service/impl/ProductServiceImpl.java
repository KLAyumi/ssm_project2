package com.ssm.service.impl;

import com.ssm.dao.ProductDao;
import com.ssm.domain.Product;
import com.ssm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll(int page,int size) throws Exception {
        return productDao.findAll(page,size);
    }

    @Override
    public void save(Product product) throws Exception {
        productDao.save(product);
    }
}
