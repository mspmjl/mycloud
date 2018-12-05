package com.mjl.mycloud.base;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Miaojiale
 * @date 2018/12/4
 */
public abstract class BaseDto implements Serializable {
    private Date createTime;
    private Date updateTime;
    private String uuid;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
