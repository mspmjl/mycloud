package com.mjl.mycloud.dto;

/**
 * Created by Miaojiale on 12/12/2018.
 */
public class UserLoginInfo {
    private String userName;
    private String invitationCode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }
}
