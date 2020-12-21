package com.hellogradleboot.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hellogradleboot.board.service.BoardService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {
	private final String SERVICE_NAME = BoardService.SERVICE_NAME;
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	private final BoardService boardService;

	@GetMapping({"/board"})
	public String list(Model model) {
		final String VIEW = String.format("/%s/list", this.SERVICE_NAME);

		model.addAttribute("serviceName", this.SERVICE_NAME);

		return VIEW;
	}

	@GetMapping({"/board/{idx}"})
	public String view(@PathVariable Integer idx, Model model) {
		final String VIEW = String.format("/%s/view", this.SERVICE_NAME);

		model.addAttribute("serviceName", this.SERVICE_NAME);

		return VIEW;
	}

	@PostMapping({"/board/{idx}"})
	public String form(@PathVariable Integer idx, Model model) {
		final String VIEW = String.format("/%s/form", this.SERVICE_NAME);

		model.addAttribute("serviceName", this.SERVICE_NAME);

		return VIEW;
	}

	@PutMapping({"/board"})
	public String insert(Model model) {
		final String VIEW = String.format("redirect:/%s", this.SERVICE_NAME);
		return VIEW;
	}

	@PatchMapping({"/board"})
	public String update(Model model) {
		final String VIEW = String.format("redirect:/%s", this.SERVICE_NAME);
		return VIEW;
	}

	@DeleteMapping({"/board/{idx}"})
	public String delete(@PathVariable Integer idx, Model model) {
		final String VIEW = String.format("redirect:/%s", this.SERVICE_NAME);
		return VIEW;
	}
}
