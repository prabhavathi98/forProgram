package com.onesoft.day6;

public class PrintOddindexValue {
	public static void main(String[] args) {
		String a="Prabhasamy";
		for(int i=0;i<=a.length()-1;i++) {
			if(i%2!=0) {
				System.out.println(a.charAt(i));
			}
			
		}
	}

}
