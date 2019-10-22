package cn.cqgcxy.service.admin;

import cn.cqgcxy.domain.User;

public interface LoginService {
    //用户登录的服务 通过用户名查询用户
     User userLogin(String username);
}
