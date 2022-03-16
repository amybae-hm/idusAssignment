package com.idus.assignment.repository.impl;

import com.idus.assignment.domain.dao.MemberDao;
import com.idus.assignment.domain.dto.Member;
import com.idus.assignment.repository.MemberRepository;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.Optional;

@Repository
public class MemberRepositoryImpl implements MemberRepository {

    MemberDao memberDao;

    public MemberRepositoryImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public Optional<Member> findById(String id) {
        Member member = new Member();
        member = memberDao.selectOneById(id);
        return Optional.ofNullable(member);
    }
}
