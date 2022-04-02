package com.lh.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lh.domain.member.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
