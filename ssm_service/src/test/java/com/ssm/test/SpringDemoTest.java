package com.ssm.test;

import com.ssm.domain.Orders;
import com.ssm.service.OrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(value = {"classpath:applicationContext.xml"})
public class SpringDemoTest {

    /*@Autowired
    private OrdersService ordersService;

    @Test
    public void test1() throws Exception {
        List<Orders> ordersList = ordersService.findAll();
        for (Orders o : ordersList) {
            System.out.println(o);
        }
    }*/
}
