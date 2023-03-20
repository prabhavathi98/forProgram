package com.onesoft.day6;

public class PrintStringLength {
	public static void main(String[] args) {
		String[] words= {"Ajay","Priya","Vignesh","Viji","Muthu"};
		for(int i=0;i<=words.length-1;i++) {
			System.out.println(words[i]+" "+words[i].length());
		}
	}

}
