package org.vergil;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Vergil on 2016/9/1.
 */
@Controller
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(ModelMap model){
        model.addAttribute("message","hell Spring MVC");
        return "Hello";
    }

    @RequestMapping(value = "/sub",method = RequestMethod.GET)
    public String sub(ModelMap model){
        model.addAttribute("message","hell Spring MVC");
        return "redirect:one";
    }

    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public String one(ModelMap model){
        model.addAttribute("message","hell Spring MVC");
        return "one";
    }
}