package com.xu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Home controller
 *
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView root(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("title", "Home");
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("/login")
    public String login (){
        //return login page
        return "/login";
    }

    /**
     * Request admin page
     * @return
     */
    @RequestMapping("/admin")
    public String toAdmin (){
        //return main page
        return "admin/main";
    }
}
