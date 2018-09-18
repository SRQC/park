package com.zb.service;

import com.zb.entity.Park;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:25
 */
public interface ParkService {

    public List<Park> getAll();

    public List<Park> getAllByKey(int status);

    public List<Park> getByKey(String key);

    public Park getById(int id);

    public boolean updateCar(Park car);

    public boolean updateCarStatus(Park car);

    public boolean delCar(int id);

    public boolean addCar(Park car);
}
