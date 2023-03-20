package com.onesoft.day6;

public class PrintReverseCharacter { 
	public static void main(String[] args) {
		String a="Prabha";
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
	}

}
