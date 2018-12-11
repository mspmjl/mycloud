package com.mjl.mycloud.controller;

import com.mjl.mycloud.dto.User;
import com.mjl.mycloud.service.UserService;
import org.json.JSONException;
import org.json.JSONObject;
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
    public String verifyRegister(HttpServletRequest request, @RequestBody User user) throws JSONException {
        String invitationCode = request.getParameter("invitationCode");
        JSONObject msg = new JSONObject();
        if (!"mjl".equals(invitationCode)) {
            msg.put("invitationCode", "Invitation Code illegal!");
        } else {
            if (null != user) {
                String userName = user.getUserName();
                User queryUser = userService.selectByName(userName);
                if (null == queryUser) {
                    msg.put("queryUser", "This user already exists.");
                }
            }
        }
        return msg.toString();
    }
}
