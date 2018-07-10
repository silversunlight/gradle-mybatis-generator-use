package com.tcl.cibn.model;

public class Nownext {
    private Integer id;

    private Integer channelId;

    private Integer nowEpgId;

    private Integer nextEpgId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    public Integer getNowEpgId() {
        return nowEpgId;
    }

    public void setNowEpgId(Integer nowEpgId) {
        this.nowEpgId = nowEpgId;
    }

    public Integer getNextEpgId() {
        return nextEpgId;
    }

    public void setNextEpgId(Integer nextEpgId) {
        this.nextEpgId = nextEpgId;
    }
}