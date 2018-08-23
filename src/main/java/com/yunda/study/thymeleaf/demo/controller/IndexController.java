package com.yunda.study.thymeleaf.demo.controller;/*
 * Description
 *@author Ruimeng
 *@Date 2018/8/22 9:30
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
        //单个数据
        map.put("username", "入门案例");
        return "admin/index";
    }
}
