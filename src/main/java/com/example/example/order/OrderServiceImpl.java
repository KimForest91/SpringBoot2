package com.example.example.order;

import com.example.example.discount.DiscountPolicy;
import com.example.example.discount.RateDiscountPolicy;
import com.example.example.member.Member;
import com.example.example.member.MemberRepository;
import com.example.example.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository orderRepository = new MemoryMemberRepository();
    // private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = orderRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
