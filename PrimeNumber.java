package com.onesoft.day6;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=7;
		boolean a=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				a=false;
			}
		}
		if(a==true) {
			System.out.println("It is prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}

}
