package cn.cqgcxy.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("/")
    public String view(){
        return "login";
    }
}
