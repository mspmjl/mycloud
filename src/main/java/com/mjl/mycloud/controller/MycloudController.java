package com.mjl.mycloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Miaojiale on 2018/12/5.
 */
@RestController
public class MycloudController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index() {
        return "index.jsp";
    }
}
