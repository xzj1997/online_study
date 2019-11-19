package cn.cqgcxy.controller.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于页面跳转的controller
 */
@Controller
public class ViewsController {

    @RequestMapping("/views/welcome")
   public String welcomeController(){
        return "welcome";
    }
    @RequestMapping("/views/login")
    public String loginController(){
        return "login";
    }
    @RequestMapping("/views/index")
    public String indexController(){
        return "index";
    }
    @RequestMapping("/studentList")
    public String studentListController(){
        return "student-list";
    }
    @RequestMapping("/cgClassList")
    public String cgClassListController(){
        return "cg-class-list";
    }
    @RequestMapping("/courseWareLists")
    public String courseWareListController(){
        return "course-ware-list";
    }
    @RequestMapping("/courseLists")
    public String courseListsController(){
        return "course-list";
    }
    @RequestMapping("/subjectLists")
    public String subjectListsController(){
        return "subject-list";
    }
    @RequestMapping("/studyRecordLists")
    public String studyRecordListsController(){
        return "study-record-list";
    }
    @RequestMapping("/test")
    public String testController(){
        return "student-index";
    }
    @RequestMapping("/pages/index")
    public String indexsController(){
        return "pages/index";
    }

}
