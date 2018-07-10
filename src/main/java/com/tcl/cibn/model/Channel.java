package com.tcl.cibn.model;

public class Channel {
    private Integer id;

    private String title;

    private String description;

    private Integer sort;

    private String icon;

    private String cp;

    private String thumb;

    private String thumbOtt;

    private String category;

    private Boolean blocked;

    private String share;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp == null ? null : cp.trim();
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    public String getThumbOtt() {
        return thumbOtt;
    }

    public void setThumbOtt(String thumbOtt) {
        this.thumbOtt = thumbOtt == null ? null : thumbOtt.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share == null ? null : share.trim();
    }
}