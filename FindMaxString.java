package com.onesoft.day6;

public class FindMaxString {
	public static void main(String[] args) {
		String[] a= {"nisha","kumar","karthi","gowtham"};
//		String[] a=new String[2];
//		a[0]="nishanthi";
//		a[1]="kumar";
		
		
		int maxLength=0;
		String temp="";
		for(int i=0;i<=a.length-1;i++) {
			if(a[i].length()>=maxLength) {
				maxLength=a[i].length();
				temp=a[i];
			}
			
		}
		System.out.println(temp+" "+maxLength);
	}

}
