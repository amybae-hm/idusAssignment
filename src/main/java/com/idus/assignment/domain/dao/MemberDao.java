package com.idus.assignment.domain.dao;


import com.idus.assignment.domain.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface MemberDao {

    Member selectOneById(String id);
}
