package com.exampleone.order.controller;

import com.exampleone.order.entity.OrderTable;
import com.exampleone.order.service.OrderTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/order")
public class OrderTableController {
    @Autowired
    OrderTableService orderTableService;

    @GetMapping(value = "/queryOrderByOrderid")
    public List<OrderTable> queryOrderByOrderid(int orderId){
        return orderTableService.queryOrderByOrderid(orderId);
    }

    @RequestMapping(value = "/insertOrder", method = RequestMethod.GET)
    public int insertOrder(OrderTable orderTable){
        return orderTableService.insertOrder(orderTable);
    }
}
