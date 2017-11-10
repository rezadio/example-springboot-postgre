package com.truemoney.id.controller;

import com.truemoney.id.model.ComponentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ViewController {

    ComponentModel componentModel = new ComponentModel();

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        Map<String, Object> model = new HashMap<String, Object>();
        componentModel.setHeader("header");
        model.put("message","tes");
        model.put("comp",componentModel);
        return new ModelAndView("hello",model);
    }
    @RequestMapping(value = "/header")
    public ModelAndView header() {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("message","tes");
        model.put("template","header");
        return new ModelAndView("header",model);
    }

}
