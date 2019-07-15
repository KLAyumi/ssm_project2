package com.ssm.dao;

import com.ssm.domain.Member;
import com.ssm.domain.Orders;
import com.ssm.domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrdersDao {

    //查询订单详情
    @Select("select * from orders where id = #{orderId}")
    @Results({
            @Result(id=true, column="id", property="id"),
            @Result(column="orderNum", property="orderNum"),
            @Result(column="orderTime", property="orderTime"),
            @Result(column="orderStatus", property="orderStatus"),
            @Result(column="peopleCount", property="peopleCount"),
            @Result(column="payType", property="payType"),
            @Result(column="orderDesc", property="orderDesc"),
            @Result(column = "productId",property="product",javaType = Product.class,one = @One(select = "com.ssm.dao.ProductDao.findById")),
            @Result(column = "memberId",property="member",javaType = Member.class,one = @One(select = "com.ssm.dao.MemberDao.findById")),
            @Result(column = "id",property="travellers",javaType = java.util.List.class,many = @Many(select = "com.ssm.dao.TravellerDao.findByOrdersId")),
    })
    public List<Orders> findById(String orderId);


    //查询所有订单
    @Select("select * from orders")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "orderNum", property = "orderNum"),
            @Result(column = "orderTime", property = "orderTime"),
            @Result(column = "orderStatus", property = "orderStatus"),
            @Result(column = "peopleCount", property = "peopleCount"),
            @Result(column = "payType", property = "payType"),
            @Result(column = "orderDesc", property = "orderDesc"),
            @Result(column = "productId", property = "product", javaType = Product.class, one = @One(select = "com.ssm.dao.ProductDao.findById"))
    })
    public List<Orders> findAll(int page,int size) throws Exception;
}
