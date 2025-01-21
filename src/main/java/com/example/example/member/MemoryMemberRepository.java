package com.example.example.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);

        System.out.println("member = " + member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }

}
