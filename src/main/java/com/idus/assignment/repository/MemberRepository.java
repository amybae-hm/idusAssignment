package com.idus.assignment.repository;

import com.idus.assignment.domain.Member;
import org.apache.el.stream.Optional;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MemberRepository {
    Member save(Member member);
    //Optional<Member> findById(Long id);
    //Optional<Member> findByName(String name);
    //List<Member> findAll();
    //void clearStore();
}
