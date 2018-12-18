package com.mjl.mycloud.dto;

import com.mjl.mycloud.base.BaseDto;

/**
 * Created by Miaojiale on 12/18/2018.
 */
public class Dairy extends BaseDto {
    private String dairyTitle;
    private String dairyBody;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDairyTitle() {
        return dairyTitle;
    }

    public void setDairyTitle(String dairyTitle) {
        this.dairyTitle = dairyTitle;
    }

    public String getDairyBody() {
        return dairyBody;
    }

    public void setDairyBody(String dairyBody) {
        this.dairyBody = dairyBody;
    }
}
