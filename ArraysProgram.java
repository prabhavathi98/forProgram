package com.onesoft.day6;

public class ArraysProgram {
	public static void main(String[] args) {
		String[] words= {"birds","phone","LION","names","animals","PENS","pencil"};
//		for(int i=0;i<words.length;i++) {
//			if(words[i].endsWith("s")) {
//				System.out.println(words[i]);
//			}
//		}
		
		
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(words[i].toUpperCase())) {
				System.out.println(words[i]);
			}
		}
	}

}
