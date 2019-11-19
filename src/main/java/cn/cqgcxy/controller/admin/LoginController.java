package cn.cqgcxy.controller.admin;
import cn.cqgcxy.domain.User;
import cn.cqgcxy.service.admin.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
    public String userLogin(String number, String password, HttpServletRequest request){
        if (loginService.userLogin(number) != null){
            User user = loginService.userLogin(number);
            if (password.equals(user.getUserPassword())) {
                HttpSession session = request.getSession();
                session.setAttribute("user",user);
                return "redirect:/views/index";
            }
            else {
                return "密码错误";
            }
        }
        else {
            return "此用户不存在";
        }

    }

    /**
     * 退出登录
     * @param request
     * @return
     */
    @RequestMapping("/outLogin")
    public String outLogin(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return "redirect:/views/login";
    }



}
