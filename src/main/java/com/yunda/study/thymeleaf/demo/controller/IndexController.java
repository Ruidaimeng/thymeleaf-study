package com.yunda.study.thymeleaf.demo.controller;/*
 * Description
 *@author Ruimeng
 *@Date 2018/8/22 9:30
 */

import com.sun.xml.internal.ws.spi.db.DatabindingException;
import com.yunda.study.thymeleaf.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class IndexController {
    /**
     * 创建日期:2018年4月5日<br/>
     * 代码创建:黄聪<br/>
     * 功能描述:首页模版<br/>
     * @return
     */
    @RequestMapping("/index")
    public String index(ModelMap map){
        User user= new User();
        //单个数据
        user.setId(new Long(123));
        user.setEmail("1382163.com");
        user.setName("芮呆");
        map.put("username", "入门案例");
        map.put("user",user);
        return "admin/index";
    }

    @RequestMapping("/index2")
    public ModelAndView index2(Model model){
        User user= new User();
        //单个数据
        user.setId(new Long(123));
        user.setEmail("1382163.com");
        user.setName("芮呆");
        model.addAttribute("user", user);
        model.addAttribute("username", "查看用户");
        model.addAttribute("today",new Date());
        return  new ModelAndView("admin/index","userModel",model);
    }
}
