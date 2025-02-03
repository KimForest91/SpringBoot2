package com.example.example;

import com.example.example.discount.RateDiscountPolicy;
import com.example.example.member.MemberService;
import com.example.example.member.MemberServiceImpl;
import com.example.example.member.MemoryMemberRepository;
import com.example.example.order.OrderService;
import com.example.example.order.OrderServiceImpl;

/* public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                new MemoryMemberRepository(), 
                new RateDiscountPolicy());
    }
}
 */


public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(), 
                discountPolicy());
    }

    private RateDiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}