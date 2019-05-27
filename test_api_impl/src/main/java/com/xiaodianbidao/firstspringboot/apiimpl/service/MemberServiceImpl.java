package com.xiaodianbidao.firstspringboot.apiimpl.service;

import com.xiaodianbidao.firstspringboot.api.dto.MemberDto;
import com.xiaodianbidao.firstspringboot.api.service.MemberService;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MemberServiceImpl implements MemberService {
    @Override
    public List<MemberDto> getMemberDtosByIds(List<Long> ids) {
        if(CollectionUtils.isEmpty(ids)){
            return new ArrayList<>();
        }
        return null;
    }
}
