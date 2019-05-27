package com.xiaodianbidao.firstspringboot.api.domain;

public class BaseDomain {
    private Long id;
    private Long gmtCreate;
    private Long gmtModified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Long getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    public void fillCreateTime(){
        this.gmtCreate=System.currentTimeMillis();
        this.gmtModified=System.currentTimeMillis();
    }

    public void fillModifiedTime(){
        this.gmtModified=System.currentTimeMillis();
    }



}
