package com.exampleone.order.mapper;

import com.exampleone.order.entity.OrderTable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderTableMapper {
    // 根据orderId查询订单信息
    public List<OrderTable> queryOrderByOrderid(int orderId);
    // 下订单
    public int insertOrder(OrderTable orderTable);
}
