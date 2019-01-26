package co.nilin.security.oauth2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {

    @RequestMapping({"/" , "index"})
    @ResponseBody
    public String home(){
        return "Home Sweet Home";
    }

    @RequestMapping({"/anonymous"})
    @ResponseBody
    public String anonymousHi(){
        return "Welcome Sweet Home Anonymous";
    }

    @RequestMapping({"/hi"})
    @ResponseBody
    public String hi(Principal principal){
        return String.format("Welcome Sweet Home %s", principal.getName());
    }


    @RequestMapping("/admin")
    @ResponseBody
    public String admins(){
        return "Welcome Admin\n                      " +
                "\nBaw ADMIN ;)";
    }

}
