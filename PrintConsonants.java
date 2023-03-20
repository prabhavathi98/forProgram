package com.onesoft.day6;

public class PrintConsonants {
	public static void main(String[] args) {
		String a="beautiful";
		int count=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
			count=count+1;
			}
			else {
				System.out.println(a.charAt(i));
			}
		}
	}

}
