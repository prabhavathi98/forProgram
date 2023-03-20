package com.onesoft.day6;

public class ReverseString {
	public static void main(String[] args) {
		String a="Dog";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
		if(a.equalsIgnoreCase(temp)) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
