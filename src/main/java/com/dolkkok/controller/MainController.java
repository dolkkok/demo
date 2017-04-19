package com.dolkkok.controller;

import com.dolkkok.service.main.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hanjunghee on 2017. 4. 19..
 */
@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping("/")
    public ModelAndView getMainPage() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", mainService.getMainPageMessage());
        mv.setViewName("main");
        return mv;
    }
}
