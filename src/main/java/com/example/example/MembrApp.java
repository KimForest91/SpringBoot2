package com.example.example;

import com.example.example.member.Grade;
import com.example.example.member.Member;
import com.example.example.member.MemberService;

public class MembrApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("new member = " + findMember);
    }
}
