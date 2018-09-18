package com.zb.service.impl;

import com.zb.dao.UserMapper;
import com.zb.entity.Users;
import com.zb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:34
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Users login(Users users) {
        List<Users> list = userMapper.findUserByNameAndPwd(users.getName(), users.getPassword());
        if(list.size()>0) {
            Users user = list.get(0);
            return user;
        }
        return null;
    }

    @Override
    public boolean updatePoint(Users users) {
        try {
            userMapper.updateUserPoint(users);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean updateStautsById(int id, int stauts) {
        try {
            userMapper.updateUserStauts(id, stauts);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean updateUserPwd(Users user) {
        try {
            userMapper.updateUserPwd(user);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public boolean updateUser(Users user) {
        try {
            userMapper.updateUser(user);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    @Override
    public List<Users> getByName(String tmpName) {
        String name = "%"+tmpName+"%";
        return userMapper.findByName(name);
    }

    @Override
    public List<Users> getPointByName(String tmpName) {
        String name = "%"+tmpName+"%";
        return userMapper.findPointByName(name);
    }

    @Override
    public List<Users> getAll() {
        return userMapper.findAllUser();
    }

    @Override
    public List<Users> getAllPoint() {
        return userMapper.findAllPoint();
    }

    @Override
    public Users getUserById(int id) {
        return userMapper.findUserById(id);
    }

    @Override
    public boolean addUser(Users users) {
        try {
            userMapper.insertUsers(users);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
