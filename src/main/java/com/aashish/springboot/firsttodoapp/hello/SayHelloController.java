package com.aashish.springboot.firsttodoapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! How are you doing?";
	}

	@RequestMapping("/say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
}
