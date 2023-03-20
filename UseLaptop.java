package com.onesoft.laptopInterface;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l=new Laptop("HP",23000,"i3");
		System.out.println(l.brand+", "+l.price+", "+l.proccessor+", "+l.findTypeOfLaptop(5)+", "+l.isTouchScreen(false));
	}

}
