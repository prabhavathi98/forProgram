package com.onesoft.day7;

public class UseAirConditioner {
	public static void main(String[] args) {
		AirConditioner ac1=new AirConditioner();
		ac1.brand="LG";
		ac1.model="a5";
		ac1.price=35000;
		ac1.taxPercentage=12;
		ac1.netPrice=ac1.netPrice();
		
		AirConditioner ac2=new AirConditioner();
		ac2.brand="Panosonic";
		ac2.model="a2";
		ac2.price=25000;
		ac2.taxPercentage=10;
		ac2.netPrice=ac2.netPrice();
		
		AirConditioner ac3=new AirConditioner();
		ac3.brand="Croma";
		ac3.model="X5";
		ac3.price=25000;
		ac3.taxPercentage=10;
		ac3.netPrice=ac3.netPrice();
		
		AirConditioner[] air= {ac1,ac2,ac3};
		for(int i=0;i<air.length;i++) {
			System.out.println("Brand:"+air[i].brand+", NetPrice:"+air[i].netPrice);
		}
	}

}
