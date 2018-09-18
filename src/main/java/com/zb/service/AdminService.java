package com.zb.service;

import com.zb.entity.Admin;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:31
 */
public interface AdminService {

    public Admin login(Admin admin);

    public boolean addAdmin(Admin admin);

    public boolean delAdmin(int id);

    public boolean updateAdmin(Admin admin);

    public Admin getAdminById(int id);

    public List<Admin> getAdminByName(String name);

    public List<Admin> getAllAdmin();
}
