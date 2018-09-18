package com.zb.service;

import com.zb.entity.Users;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:18
 */
public interface UserService {

    /***
     * 登录
     * @param users
     * @return
     */
    public Users login(Users users);


    public boolean updatePoint(Users users);

    /**
     * 通过id修改状态
     * @param id
     * @param stauts
     * @return
     */
    public boolean updateStautsById(int id,int stauts);

    /**
     * 修改用户密码
     * @param user
     * @return
     */
    public boolean updateUserPwd(Users user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    public boolean updateUser(Users user);

    /**
     * 名称模糊查询用户
     * @param tmpName
     * @return
     */
    public List<Users> getByName(String tmpName);

    public List<Users> getPointByName(String tmpName);

    public List<Users> getAll();

    public List<Users> getAllPoint();

    public Users getUserById(int id);

    public boolean addUser(Users users);
}
