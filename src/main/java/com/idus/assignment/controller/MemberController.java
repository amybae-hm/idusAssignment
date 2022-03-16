package com.idus.assignment.controller;

import com.idus.assignment.domain.dto.Member;
import com.idus.assignment.service.MemberService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/{id}")
    @ApiOperation(value = "단일 회원 상세 정보 조회", notes = "ID로 단일 회원 정보를 조회합니다.")
    @ApiImplicitParam(
            name = "id"
            , value = "회원아이디"
            , required = true
            , dataType = "String"
            , paramType = "path"
    )
    public Optional<Member> getMemberInfo(@ApiParam(name = "id", value = "회원아이디", required = true)
                                @PathVariable(name = "id") String id) {
        Member member = new Member();
        member = memberService.findOneById(id);
        return Optional.ofNullable(member);
    }




}
