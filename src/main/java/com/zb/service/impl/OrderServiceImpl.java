package com.zb.service.impl;

import com.zb.dao.OrderMapper;
import com.zb.entity.Order;
import com.zb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:35
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getAll() {
        return orderMapper.findAllOrder();
    }

    @Override
    public Order getById(int id) {
        return orderMapper.findById(id);
    }

    @Override
    public List<Order> getByUserId(int id) {
        return orderMapper.findByUserId(id);
    }

    @Override
    public List<Order> getByKey(String tmpKey) {
        String key = "%"+tmpKey+"%";
        return orderMapper.findByKey(key);
    }

    @Override
    public boolean delOrder(int id) {
        try {
            orderMapper.deleteOrder(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean addOrder(Order order) {
        try {
            orderMapper.insertOrder(order);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean updateOrderStatus(Order order) {
        try {
            orderMapper.updateStatus(order);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
