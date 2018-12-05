package com.mjl.mycloud.dto;

import com.mjl.mycloud.base.BaseDto;

/**
 * Created by Miaojiale on 2018/12/4.
 */
public class User extends BaseDto {
    private String userName;
    private String password;
    private String role;
    private Integer section;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getSection() {
        return section;
    }

    public void setSection(Integer section) {
        this.section = section;
    }
}
