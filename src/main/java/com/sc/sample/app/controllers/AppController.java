package com.sc.sample.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sc.sample.app.domain.entity.Pfp;
import com.sc.sample.app.services.AppService;

@RestController
public class AppController {

	@Autowired
	AppService appService;
	
	@GetMapping("/pfp")
	List<Pfp> firstMethodController() {
		return appService.getPfps();
	}
}
