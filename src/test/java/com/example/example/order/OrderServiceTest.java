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
        // long 으로 선언하면 null 이 아닌 0L 로 초기화 되어서 에러가 발생한다.
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
