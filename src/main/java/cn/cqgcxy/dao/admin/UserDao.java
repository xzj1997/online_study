package cn.cqgcxy.dao.admin;

import cn.cqgcxy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {

    //用户登录的服务 通过用户名查询用户
    @Query(value = "from User where name = ?1")
     User userLogin(String username);
}
