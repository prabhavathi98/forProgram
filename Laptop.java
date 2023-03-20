package com.onesoft.laptopInterface;

public class Laptop implements Tab {
	String brand;
	int price;
	String proccessor;
	public Laptop(String b,int p,String c) {
		brand=b;
		price=p;
		proccessor=c;
	}
	public boolean isTouchScreen(boolean touch) {
		return touch;
	}
	public String findTypeOfLaptop(int core) {
		if(core>8) {
			return "GAMINGLAPTOP";
		}
		else {
			return "STUDYLAPTOP";
		}
	}

}
