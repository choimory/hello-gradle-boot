package com.hellogradleboot.board.dto;

import com.hellogradleboot.board.domain.Board;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BoardDto {
	private String title;
	private String writer;
	private String content;

	public Board toDomain() {
		return Board.builder()
					.title(title)
					.writer(writer)
					.content(content)
					.build();
	}
}
