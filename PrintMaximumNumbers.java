package com.onesoft.day6;

public class PrintMaximumNumbers {
	public static void main(String[] args) {
		int[] a= {12,36,15,45,158,20,39,78,79,98,71,50};
		int max=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>=max) {
				max=a[i];
			}
		}
		//System.out.println(max);
		
		if(max%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
