package com.philips.sonarbot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
	private List<String> inputStringsList = new ArrayList<>();
	
	@SuppressWarnings({"java:S1104"})
	public static DummyClass dummyInstance = new DummyClass();
	
	public String checkStringEqualsFoo(String inputString) {
		int unusedLocalVarA;
		int unusedLocalVarB, unusedLocalVarC;
		int unusedLocalVarD = 0, newVarE = 1;

		dummyInstance.displayHello();
		
		inputStringsList.add(inputString);
		
		return inputString.equals("foo") ?
				"Input string matches foo" : 
					"Input string does not match foo";		
	}

//	public String checkStringEqualsFoo(String inputString) {
//		return inputString.equals("foo") ? 
//				"Input string matches foo" : 
//					"Input string does not match foo";
//	}

//	public String checkStringEqualsFoo(String inputString) {
//		return inputString.equals("foo") ? 
//				"Input string matches foo" : 
//					"Input string does not match foo";
//	}
//	
	
	public List<String> getInputStringsList() {
		String dummyStr = "bar";
		System.out.println("foo".equals(dummyStr));
		if (inputStringsList.size() > 0) {
			return inputStringsList;
		}
		return new ArrayList<>();
	}
}
