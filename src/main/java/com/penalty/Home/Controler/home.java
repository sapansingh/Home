package com.penalty.Home.Controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class home {
    
    @RequestMapping("/")
    public String requestMethodName() {



        return "yes this is working fine";
    }
    

    @RequestMapping("/test")
    public String test() {



        return "yes this is working fine but this is test page";
    }
    
    @RequestMapping("/home")
    public String home() {



        return "yes this is home";
    }

}
