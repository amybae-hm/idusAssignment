package com.idus.assignment.service;

import com.idus.assignment.domain.dto.Member;
import com.idus.assignment.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) { this.memberRepository = memberRepository; }

    /**
     * 회원가입
     * @param member
     * @return
     */
    public String join(Member member) {
        validateDuplicateMem(member.getId());
        return member.getId();
    }

    private void validateDuplicateMem(String id) {
        memberRepository.findById(id)
                .ifPresent(id1 -> {
                    throw new IllegalStateException("이미 존재하는 아이디 입니다.");
                });
    }

    public Member findOneById(String id) {
        return memberRepository.findById(id).get();
    }
}
