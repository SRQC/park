package com.zb.service.impl;

import com.zb.dao.ParkMapper;
import com.zb.entity.Park;
import com.zb.service.ParkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:35
 */
@Service
public class ParkServiceImpl implements ParkService {

    @Autowired
    private ParkMapper parkMapper;

    @Override
    public List<Park> getAll() {
        return parkMapper.findAllPark();
    }

    @Override
    public List<Park> getAllByKey(int status) {
        return parkMapper.findAllParkByKey(status);
    }

    @Override
    public List<Park> getByKey(String key) {
        return parkMapper.findParkByKey("%"+key+"%");
    }

    @Override
    public Park getById(int id) {

        return parkMapper.findCarById(id);
    }

    @Override
    public boolean updateCar(Park car) {
        try {
            parkMapper.updateCar(car);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean updateCarStatus(Park car) {
        try {
            parkMapper.updateCarStatus(car);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean delCar(int id) {
        try {
            parkMapper.deleteCar(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean addCar(Park car) {
        try {
            parkMapper.insertCar(car);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
