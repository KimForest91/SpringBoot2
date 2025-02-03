package com.example.example.order;

import org.junit.jupiter.api.BeforeEach;

import com.example.example.AppConfig;
import com.example.example.member.MemberService;


public class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    // @Test
    // void createOrder() {
    //     // long 으로 선언하면 null 이 아닌 0L 로 초기화 되어서 에러가 발생한다.
    //     Long memberId = 1L;
    //     Member member = new Member(memberId, "memberA", Grade.VIP);

    //     memberService.join(member);

    //     Order order = orderService.createOrder(memberId, "itemA", 10000);
    //     Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    // }
}
