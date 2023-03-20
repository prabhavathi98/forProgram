package com.onesoft.day7;

public class AirConditioner {
	String brand;
	String model;
	int price;
	int netPrice;
	int taxPercentage;
	
	public int netPrice() {
		int net=price+(price*taxPercentage/100);
		return net;
	}
	}
