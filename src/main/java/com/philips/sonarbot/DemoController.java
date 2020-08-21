package com.philips.sonarbot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/")
	public String displayHelloMessage() {
		return "Hello";
	}
	
	@GetMapping("/check-equals/{inputString}")
	public String checkStringEqualsFoo(@PathVariable("inputString") String inputString) {
		return demoService.checkStringEqualsFoo(inputString);
	}
	
	@GetMapping("/getInputStrings")
	public List<String> getInputStringsList() {
		return demoService.getInputStringsList();
	}
	
}
