package com.example.hystrixdemo.controller;

import com.example.hystrixdemo.model.MemberResponse;
import com.example.hystrixdemo.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    private MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("api/v1/members")
    public MemberResponse getAllMembers() {
        return memberService.getAllMembers();
    }
}
