package com.exampleone.order.service;

import com.exampleone.order.entity.OrderTable;
import com.exampleone.order.mapper.OrderTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderTableService {
    @Autowired
    private OrderTableMapper orderTableMapper;

    public List<OrderTable> queryOrderByOrderid(int orderId){
        return orderTableMapper.queryOrderByOrderid(orderId);
    }

    public int insertOrder(OrderTable orderTable){
        return orderTableMapper.insertOrder(orderTable);
    }

}
