package com.lagou.factory;

import com.lagou.dao.IUserDao;
import com.lagou.impl.UserDaoImpl;

public class DynamicFactoryBean {
    public IUserDao createUserDao(){
        return new UserDaoImpl();
    }
}
