package com.example.rand.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rand.model.Rand;

@RestController
public class RandController {
	@GetMapping("/random")
	public Rand rand(@RequestParam(value="bound", defaultValue="100") String bound,
			@RequestParam(value="size", defaultValue="50") String size,
			@RequestParam(value="origin", defaultValue="0") String origin) {
		
		return new Rand(Long.parseLong(size),Integer.parseInt(origin), Integer.parseInt(bound));
	}
}
