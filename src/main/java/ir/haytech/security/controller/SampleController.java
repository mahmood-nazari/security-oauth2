package ir.haytech.security.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
public class SampleController {

    @GetMapping("/")
    public String sampleMethod(){
        return "hello";
    }

    @GetMapping("/success")
    public String success(){
        return "successfully oauth2 protocol";
    }

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/second-page")
    public String sampleMethod2(){
        return "second page";
    }

    @GetMapping("/new")
    public String sampleMethod3(){
        return "new";
    }

    @GetMapping("/edite")
    public String edite(){
        return "edite";
    }

    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }

}
