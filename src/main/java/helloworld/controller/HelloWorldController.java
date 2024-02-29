package helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello(ModelMap model){
        model.addAttribute("greeting","Hello World from Spring MVC");
        return "welcome";
    }
    @RequestMapping(value = "/helloAgain", method = RequestMethod.GET)
    public String sayWelcomeAgain(ModelMap model){
        model.addAttribute("greeting","Hello World again from Spring MVC");
        return "welcome";
    }
}