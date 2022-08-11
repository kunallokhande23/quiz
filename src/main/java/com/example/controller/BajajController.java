package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.data.RequestArray;
import com.example.data.Response;
import com.example.service.BajajService;

@RestController
public class BajajController {
	@Autowired
	BajajService service;
	
	/*
	@GetMapping("/")
	public String hello() {
		return "hello";
	}
*/
	@PostMapping("/bfhl")
	public Response getresponse(@RequestBody RequestArray req)
	{
		return service.prepareResponse(req);
	}
}
