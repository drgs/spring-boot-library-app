package com.philips.sonarbot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	private List<String> inputStringsList = new ArrayList<>();
	
	@SuppressWarnings({"java:S1104"})
	public static final DummyClass dummyInstance = new DummyClass();
	
	public String checkStringEqualsFoo(String inputString) {

		dummyInstance.displayHello();
		
		inputStringsList.add(inputString);
		
		return "foo".equals(inputString) ?
				"Input string matches foo" : 
					"Input string does not match foo";		
	}

//	
	
	public List<String> getInputStringsList() {
		if (inputStringsList.isEmpty()) {
			return inputStringsList;
		}
		return new ArrayList<>();
	}
}