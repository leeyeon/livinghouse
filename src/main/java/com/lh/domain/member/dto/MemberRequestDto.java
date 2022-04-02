package com.lh.domain.member.dto;

import com.lh.domain.member.entity.Member;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemberRequestDto {
	
	private String loginid;
	
	private String username;
	
	private String password;
	
	private String phone;
	
	private boolean delflag;
	
	private String email;
	
	private String address;
	
	public Member toEntity() {
		return Member.builder()
				.loginid(loginid)
				.username(username)
				.password(password)
				.phone(phone)
				.delflag(false)
				.email(email)
				.address(address)
				.build();
	}
}
