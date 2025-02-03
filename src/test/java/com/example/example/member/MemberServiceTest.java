package com.example.example.member;

import org.junit.jupiter.api.BeforeEach;

import com.example.example.AppConfig;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    // @Test
    // void join() {
    //     // given
    //     Member member = new Member(1L, "memberA", Grade.VIP);

    //     // when
    //     memberService.join(member);
    //     Member findMember = memberService.findMember(1L);

    //     // then
    //     org.assertj.core.api.Assertions.assertThat(member).isEqualTo(findMember);
    // }
}
