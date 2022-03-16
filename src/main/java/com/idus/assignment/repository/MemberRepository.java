package com.idus.assignment.repository;

import com.idus.assignment.domain.dto.Member;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface MemberRepository {
    Optional<Member> findById(String id);
    //Member save(Member member);
    //Optional<Member> findById(Long id);
    //Optional<Member> findByName(String name);
    //List<Member> findAll();
    //void clearStore();
}
