package com.example.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 35386
 */
@RestController
public class RestAPIController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
        @RequestMapping({ "/authenticate" })
	public String auth() {
		return "Hello World";
	}

}