package co.nilin.security.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "Home Sweet Home";
    }


    @RequestMapping("/admin")
    @ResponseBody
    public String admins(){
        return "Welcome Admin\n                      " +
                "\nBaw ADMIN ;)";
    }

}
