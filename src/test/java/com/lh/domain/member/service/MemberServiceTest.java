package com.lh.domain.member.service;

import static org.junit.jupiter.api.Assertions.fail;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lh.domain.member.dto.MemberRequestDto;
import com.lh.domain.member.entity.Member;

@SpringBootTest
@Transactional
class MemberServiceTest {
	
	@Autowired
	private MemberService memberService;

	@Test
	void testCreateMember() {
		//fail("Not yet implemented");
		//given
		MemberRequestDto dto = new MemberRequestDto();
		
		dto.setLoginid("lyh0208");
		dto.setPassword("1234");
		dto.setUsername("이연희");
		dto.setPhone("01085286534");
		dto.setEmail("bbqgoood@nate.com");
		dto.setAddress("서울특별시 광진구 영화사로16길 34-10 403호");
		
		//when
		Long memberId = memberService.createMember(dto);
		
		//then
		System.out.println(memberId);
		
		Member createdMember = memberService.findMember(memberId);
		
		System.out.println(createdMember);
	}

}
