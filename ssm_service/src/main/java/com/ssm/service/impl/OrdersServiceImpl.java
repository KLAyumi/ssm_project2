package com.ssm.service.impl;

import com.ssm.dao.OrdersDao;
import com.ssm.domain.Orders;
import com.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;


    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        return ordersDao.findAll(page,size);
    }
}
