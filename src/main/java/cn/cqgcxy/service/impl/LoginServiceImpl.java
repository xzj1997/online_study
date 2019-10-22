package cn.cqgcxy.service.impl;
import	java.awt.Desktop.Action;

import cn.cqgcxy.dao.admin.UserDao;
import cn.cqgcxy.domain.User;
import cn.cqgcxy.service.admin.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override//通过用户名查询用户
    public User userLogin(String username) {
        return userDao.userLogin(username);
    }
}
