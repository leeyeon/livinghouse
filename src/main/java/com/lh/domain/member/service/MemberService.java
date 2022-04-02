package com.lh.domain.member.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.lh.domain.member.dto.MemberRequestDto;
import com.lh.domain.member.entity.Member;
import com.lh.domain.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {

	private final MemberRepository memberRepository;
	
	@Transactional
	public Long createMember(MemberRequestDto dto) {
		Member member = memberRepository.save(dto.toEntity());
		return member.getMeberid();
	}
	
	public Member findMember(Long id) {
		Member member = memberRepository.getById(id);
		return member;
	}
	
}
