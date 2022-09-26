package com.palindrome.test;

import io.cucumber.java.en.When;

public class Palindrome {

	public static void main(String[] args){
		new Palindrome().palindrome("kasur ini rusak");		
	}
	
	public void palindrome(String kasur){		
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
