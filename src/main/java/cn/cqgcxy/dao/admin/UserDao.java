package cn.cqgcxy.dao.admin;
import	java.util.List;

import cn.cqgcxy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {

    //用户登录的服务 通过用户名查询用户
    @Query(value = "from User where userNumber = ?1")
     User userLogin(String number);

    /**
     * 通过用户名模糊查询
     * @param userName
     * @return
     */
    @Query(value = "from User where userName like %?1%")
    List<User> likeStudentByUserNames(String userName);

    /**
     * 通过学号模糊查询
     * @param userNumber
     * @return
     */
    @Query(value = "from User where userNumber like %?1%")
    List<User> likeStudentByUserNumbers(String userNumber);





}
