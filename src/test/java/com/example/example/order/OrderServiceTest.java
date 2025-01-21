package com.example.example.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.example.member.Grade;
import com.example.example.member.Member;
import com.example.example.member.MemberService;
import com.example.example.member.MemberServiceImpl;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(100);
    }
}
