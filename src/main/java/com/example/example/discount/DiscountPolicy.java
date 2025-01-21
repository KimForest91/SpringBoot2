package com.example.example.discount;

import com.example.example.member.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
