package com.hellogradleboot.board.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hellogradleboot.board.domain.Board;

@SpringBootTest
public class BoardRepositoryTest {
	@Autowired
	private BoardRepository boardRepository;
	
	@Test
	public void 등록_테스트() {
		/*given*/
		boardRepository.save(Board.builder()
									.title("테스트")
									.writer("테스터")
									.content("테스트")
									.build());
		
		/*when*/
		List<Board> boardList = boardRepository.findAll();
		
		/*then*/		
		Board board = boardList.get(4);
		assertEquals("테스트", board.getTitle());
	}
	
	@Test
	public void 조건_삭제_테스트() {
		/*given*/
		boardRepository.delete(Board.builder()
									.idx(1l)
									.build());
		
		/*when*/
		List<Board> boardList = boardRepository.findAll();
		
		/* then */
		assertEquals(3, boardList.size());
	}
	
	@AfterEach
	public void 테스트_후_삭제() {
		/*given*/
		boardRepository.delete(Board.builder()
									.title("테스트")
									.writer("테스터")
									.content("테스트")
									.build());
		
		/*when*/
		List<Board> boardList = boardRepository.findAll();
		
		/*then*/
		assertEquals(4, boardList.size());
	}
}
