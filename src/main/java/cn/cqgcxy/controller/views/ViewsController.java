package cn.cqgcxy.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于页面跳转的controller
 */
@Controller
@RequestMapping("/views")
public class ViewsController {

    @RequestMapping("/welcome")
   public String welcomeController(){
        return "welcome";
    }
    @RequestMapping("/login")
    public String loginController(){
        return "login";
    }
}
