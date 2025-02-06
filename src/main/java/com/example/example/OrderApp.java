package com.example.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.example.member.Grade;
import com.example.example.member.Member;
import com.example.example.member.MemberService;
import com.example.example.order.Order;
import com.example.example.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        // AppConfig appConfig = new AppConfig();

        // MemberService memberService = appConfig.memberService();
        // OrderService orderService = appConfig.orderService();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);


        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(1L, "itemA", 10000);
        System.out.println("order = " + order);
        System.out.println("order = " + order.calculatePrice());
    }
}
