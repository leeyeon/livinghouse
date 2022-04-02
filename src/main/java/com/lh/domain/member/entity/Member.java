package com.lh.domain.member.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "member")
public class Member {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long meberid;
	
	@Column(nullable = false, length = 50)
	private String loginid;
	
	@Column(nullable = false, length = 255)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(columnDefinition = "boolean default false")
	private boolean delflag;
	
	@Column(length = 12)
	private String phone;
	
	@Column(length = 100)
	private String email;
	
	@Column(length = 255)
	private String address;
	
	@CreationTimestamp
	private LocalDateTime indt = LocalDateTime.now();
	
	@UpdateTimestamp
	private LocalDateTime updt;

	@Builder
	public Member(String loginid, String username, String password, boolean delflag, String phone, String email,
			String address) {
		this.loginid = loginid;
		this.username = username;
		this.password = password;
		this.delflag = delflag;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
}
