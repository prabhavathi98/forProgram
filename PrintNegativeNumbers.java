package com.onesoft.day6;

public class PrintNegativeNumbers {
	public static void main(String[] args) {
		int[] a= {2,-5,3,-6,-2,9,-6,-7,4};
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}
		}
	}

}
