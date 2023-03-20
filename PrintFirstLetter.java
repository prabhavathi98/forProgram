package com.onesoft.day6;

public class PrintFirstLetter {
	public static void main(String[] args) {
		String[] words= {"Ajay","Priya","Vignesh","Viji","Muthu"};
//		for(int i=0;i<=words.length-1;i++) {
//			System.out.println(words[i].charAt(0));
//		}
		
		int count=0;
		for(int i=0;i<=words.length-1;i++) {
			if(words[i].contains("a") || words[i].contains("e") || words[i].contains("i") || words[i].contains("o") || words[i].contains("u")) {
				count=count+1;
			}
		}
		System.out.println(count);
	}

}


