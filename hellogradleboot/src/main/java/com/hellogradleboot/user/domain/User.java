package com.hellogradleboot.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;

	@Column(length = 50, nullable = false)
	private String id;

	@Column(length = 50, nullable = false)
	private String password;

	@Builder
	public User(Long idx, String id, String password) {
		this.idx = idx;
		this.id = id;
		this.password = password;
	}
}
