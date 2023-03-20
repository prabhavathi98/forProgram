package com.onesoft.day6;

public class UpperLowerCount {
	public static void main(String[] args) {
		String word="PrabhaSamy";
		String a=word.toUpperCase();
		int count1=0;
		int count2=0;
		for(int i=0;i<word.length()-1;i++) {
			if(word.charAt(i)==a.charAt(i)) {
				count1=count1+1;
			}
			else {
				count2=count2+1;
			}
		}
		System.out.println("Uppercase count is "+count1);
		System.out.println("Lowercase count is "+count2);
	}

}
