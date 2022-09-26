package com.palindrome.test;

public enum TestScenarios {
	
	T0("User input teks Palindrome");

	private String testName;
	
	TestScenarios(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}
}
