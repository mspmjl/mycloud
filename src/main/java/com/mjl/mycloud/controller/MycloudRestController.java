package com.mjl.mycloud.controller;

import com.google.gson.JsonObject;
import com.mjl.mycloud.dto.User;
import com.mjl.mycloud.dto.UserLoginInfo;
import com.mjl.mycloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Miaojiale on 2018/12/11.
 */
@RestController
public class MycloudRestController {
    @Autowired
    UserService userService;


    @PostMapping(value = "/doRegisterVerify")
    public String verifyRegister(HttpServletRequest request, @RequestBody UserLoginInfo userLoginInfo) {

        JsonObject msg = new JsonObject();
        if (userLoginInfo != null) {
            if (!"mjl".equals(userLoginInfo.getInvitationCode())) {
                msg.addProperty("invitationCode", "Invitation Code illegal!");
            }
            String userName = userLoginInfo.getUserName();
            User queryUser = userService.selectByName(userName);
            if (null != queryUser) {
                msg.addProperty("queryUser", "This user already exists.");
            }
        }
        return msg.toString();
    }
}
