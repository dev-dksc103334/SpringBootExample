package com.test.commerce.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/v4/store/{storeid}")
@ComponentScan(basePackages="com.dsg.commerce.configuration")
public class TestController{
	 	@RequestMapping("/")
	    @ResponseBody
	    @Cacheable(value="home")
	    public String home() {
	        return "Hello World!";
	    }
	 	
	 	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	 	@ResponseBody
	 	@Cacheable("calculateResult")
	    public String calculateResult() {
	 	    return "result";
	 	}
}
