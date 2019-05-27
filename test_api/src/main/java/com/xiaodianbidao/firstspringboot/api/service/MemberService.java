package com.xiaodianbidao.firstspringboot.api.service;

import com.xiaodianbidao.firstspringboot.api.dto.MemberDto;

import java.util.List;

public interface MemberService {

List<MemberDto> getMemberDtosByIds(List<Long> ids);
}
