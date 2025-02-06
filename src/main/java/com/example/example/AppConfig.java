package com.example.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

// @Configuration: 스프링 설정 정보라는 뜻
@Configuration
public class AppConfig {

    // @Bean: 스프링 컨테이너에 스프링 빈으로 등록
    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }


    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }


    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(), 
                discountPolicy());
    }


    @Bean
    public RateDiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }
}