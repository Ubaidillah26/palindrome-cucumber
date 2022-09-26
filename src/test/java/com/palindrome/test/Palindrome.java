package com.palindrome.test;

import io.cucumber.java.en.When;

public class Palindrome {

	public static void main(String[] args){
		new Palindrome().user_input_text_palindrome("kasur ini rusak");		
	}
	
	@When("User input text Palindrome")
	public void user_input_text_palindrome(String kasur){		
		String poli = "";		

		for(int i=kasur.length();i>0;i--){
			String test1 = kasur.substring(i-1, i);
			poli += test1;
		}
		
		if(kasur.equals(poli)){
			System.out.println("==== "+kasur+" adalah Palindrome =====");
		}else{
			System.out.println("==== "+kasur+" bukan Palindrome =====");
		}
	}
}
