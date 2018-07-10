package com.tcl.cibn.model;

public class PlayUrl {
    private Integer id;

    private String title;

    private Integer quality;

    private Byte vipOnly;

    private Byte sharable;

    private Integer channelId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Byte getVipOnly() {
        return vipOnly;
    }

    public void setVipOnly(Byte vipOnly) {
        this.vipOnly = vipOnly;
    }

    public Byte getSharable() {
        return sharable;
    }

    public void setSharable(Byte sharable) {
        this.sharable = sharable;
    }

    public Integer getChannelId() {
        return channelId;
    }

    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }
}