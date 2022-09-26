package com.palindrome.test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",
					features= "src/test/resources/01.Palindrome.feature",
					glue= "com.palindrome.test",
					plugin= {"pretty", "html:target/cucumber-reports.html"})

public class TestRunnerPalindrome extends AbstractTestNGCucumberTests{

}
