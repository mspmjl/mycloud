package com.mjl.mycloud.controller;

import com.mjl.mycloud.dto.User;
import com.mjl.mycloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Miaojiale on 2018/12/5.
 */

//@RestController直接返回字段值,@Controller是找页面
@Controller
public class MycloudController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/")
    public String defaultPage() {
        return "login";
    }
    @RequestMapping(value = "/index")
    public String index() {
        return "login";
    }

    @RequestMapping(value = "/dairy")
    public String dairy() {
        return "dairy";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Map<String, Object> map, HttpSession session) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        if (userName != null) {
            User user = userService.selectByName(userName);
            if (password != null && user != null && password.equals(user.getPassword())) {
                map.put("msg", null);
                session.setAttribute("loginName", userName);
                return "redirect:/dairy";
            } else {
                map.put("msg", "用户名密码错误");
            }
        }
        return "login";
    }
}
