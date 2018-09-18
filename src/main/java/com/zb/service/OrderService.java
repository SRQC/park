package com.zb.service;

import com.zb.entity.Order;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:27
 */
public interface OrderService {

    public List<Order> getAll();

    public Order getById(int id);

    public List<Order> getByUserId(int id);

    public List<Order> getByKey(String tmpKey);

    public boolean delOrder(int id);

    public boolean addOrder(Order order);

    public boolean updateOrderStatus(Order order);
}
