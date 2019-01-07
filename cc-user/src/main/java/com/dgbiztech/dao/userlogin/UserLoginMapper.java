package com.dgbiztech.dao.userlogin;

import com.dgbiztech.model.userlogin.UserLogin;

import java.util.List;

/**
 * User用户类
 * @ClassName UserLoginMapper
 * @author Hongping.Zhong
 * @date 2019-01-04 16:00
 * @version 1.0.0
 */
public interface UserLoginMapper {

    /**
     * 查找所有用户
     * @return
     */
    List<UserLogin> getUsers();

}
