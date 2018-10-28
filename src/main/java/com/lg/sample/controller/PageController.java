package com.lg.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.time.Duration;
import java.time.temporal.TemporalUnit;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Controller
public class PageController {

    @RequestMapping("/")
    public ModelAndView page(HttpSession session) throws Exception {
        //String id = session.getId();
        ModelAndView view = new ModelAndView();

//        if (StringUtils.isEmpty(session.getAttribute("my-session"))) {
//            session.setAttribute("my-session", UUID.randomUUID().toString());
//        }

        view.setViewName("v1/page1");
        return view;
    }
}