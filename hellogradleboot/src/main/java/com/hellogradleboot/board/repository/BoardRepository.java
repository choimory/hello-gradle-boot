package com.hellogradleboot.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellogradleboot.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
