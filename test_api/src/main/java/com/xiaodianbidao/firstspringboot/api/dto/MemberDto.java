package com.xiaodianbidao.firstspringboot.api.dto;

import com.xiaodianbidao.firstspringboot.api.domain.Member;

import java.io.Serializable;

public class MemberDto implements Serializable {
    private Long id;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer sex;
    private Long phone;
    private String nickName;
    private String selfDesc;
    private String facePhoto;


    public MemberDto build(Member domain){
        if(domain==null){
            return null;
        }
        MemberDto dto=new MemberDto();
        dto.setId(domain.getId());
        dto.setGmtCreate(domain.getGmtCreate());
        dto.setGmtModified(domain.getGmtModified());
        dto.setSex(domain.getSex());
        dto.setPhone(domain.getPhone());
        dto.setNickName(domain.getNickName());
        dto.setSelfDesc(domain.getSelfDesc());
        dto.setFacePhoto(domain.getFacePhoto());
        return dto;

    }


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


    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSelfDesc() {
        return selfDesc;
    }

    public void setSelfDesc(String selfDesc) {
        this.selfDesc = selfDesc;
    }

    public String getFacePhoto() {
        return facePhoto;
    }

    public void setFacePhoto(String facePhoto) {
        this.facePhoto = facePhoto;
    }
}
