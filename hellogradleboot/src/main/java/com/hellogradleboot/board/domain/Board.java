package com.hellogradleboot.board.domain;

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
public class Board {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idx;

	@Column(length = 100)
	private String title;

	@Column(length = 50)
	private String writer;

	@Column(columnDefinition="TEXT")
	private String content;

	@Builder
	public Board(Long idx, String title, String writer, String content) {
		this.idx = idx;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
}
