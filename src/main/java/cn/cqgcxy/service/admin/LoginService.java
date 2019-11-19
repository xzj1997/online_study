package cn.cqgcxy.service.admin;

import cn.cqgcxy.domain.User;

public interface LoginService {
    //用户登录的服务 通过账号查询用户
     User userLogin(String number);
}
