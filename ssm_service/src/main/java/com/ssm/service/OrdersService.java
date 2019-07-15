package com.ssm.service;

import com.ssm.domain.Orders;
import org.springframework.stereotype.Service;

import java.util.List;


public interface OrdersService {

    public List<Orders> findAll(int page,int size) throws Exception;
}
