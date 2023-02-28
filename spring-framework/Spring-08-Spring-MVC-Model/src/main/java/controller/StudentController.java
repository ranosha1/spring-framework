package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class StudentController {

    @RequestMapping("/welcome1")
    public String homePage(Model model){
        model.addAttribute("name", "Cydeo");
        model.addAttribute("course","MVC");


        return "st/welcome1";
    }
}
