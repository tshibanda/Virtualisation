package com.dupuidstshibanda.webservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
class HomeController{

	@RequestMapping(method = RequestMethod.GET)
    ModelAndView
    index(Model model)
    {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("version", "5.2.0.22");
        return mav;
    }
	
}