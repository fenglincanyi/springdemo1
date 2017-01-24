package com.geng.obj;

/**
 * Created by geng
 * on 2017/1/23.
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void showService() {
        System.out.println("show Service....");

        userDao.showUserDao();
    }
}

