package com.onesoft.day6;

public class EvenOdd {
	public static void main(String[] args) {
		int count1=0;
		int count2=0;
		for(int i=11;i<=20;i++) {
			if(i%2==0) {
				count1=count1+1;
				//System.out.println(i+" is a even number");
			}
			else {
				count2=count2+1;
				//System.out.println(i+" is a odd number");
			}
		}
		System.out.println("Even number count is"+count1);
		System.out.println("Odd number count is"+count2);
	}

}
