package com.tcl.cibn.model;

public class Epg {
    private Integer id;

    private Integer streamId;

    private String title;

    private String type;

    private String tag;

    private String start;

    private String end;

    private Byte blocked;

    private String thumbOtt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public void setStreamId(Integer streamId) {
        this.streamId = streamId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end == null ? null : end.trim();
    }

    public Byte getBlocked() {
        return blocked;
    }

    public void setBlocked(Byte blocked) {
        this.blocked = blocked;
    }

    public String getThumbOtt() {
        return thumbOtt;
    }

    public void setThumbOtt(String thumbOtt) {
        this.thumbOtt = thumbOtt == null ? null : thumbOtt.trim();
    }
}