package cn.cqgcxy.controller.admin;
import	java.lang.ref.Reference;
import cn.cqgcxy.domain.User;
import cn.cqgcxy.service.admin.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录的验证方法
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(String username,String password,String data){
        System.out.println(data );

        System.out.println(username+password);
        if (loginService.userLogin(username) != null){
            User user = loginService.userLogin(username);
            if (password.equals(user.getPassword())) {
                return "登录成功";
            }
            else {
                return "密码错误";
            }
        }
        else {
            return "此用户不存在";
        }

    }
}
