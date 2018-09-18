package com.zb.service.impl;

import com.zb.dao.AdminMapper;
import com.zb.entity.Admin;
import com.zb.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:35
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    //登陆
    public Admin login(Admin admin) {
        List<Admin> list = adminMapper.login(admin);
        if(list.size()>0) {
            admin = list.get(0);
            return admin;
        }
        return null;
    }

    //添加管理员
    public boolean addAdmin(Admin admin) {
        try {
            adminMapper.insert(admin);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    //删除管理员
    public boolean delAdmin(int id) {
        try {
            adminMapper.delete(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    //修改管理员
    public boolean updateAdmin(Admin admin) {
        try {
            adminMapper.update(admin);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    //通过id查找管理员
    public Admin getAdminById(int id) {
        return adminMapper.findById(id);
    }

    //通过name模糊查找管理员
    public List<Admin> getAdminByName(String name) {
        return adminMapper.findByName("%"+name+"%");
    }

    //查找全部
    public List<Admin> getAllAdmin(){
        return adminMapper.findAll();
    }
}
