package com.onesoft.day7;

public class UseCar3 {
		public static void main(String[] args) {
			Car car1=new Car();
			car1.brand="Audi";
			car1.model="A6";
			car1.price=700000;
			car1.color="Black";
			
			Car car2=new Car();
			car2.brand="BMW";
			car2.model="X6";
			car2.price=1000000;
			car2.color="Blue";
			
			Car car3=new Car();
			car3.brand="Jaguar";
			car3.model="Fpace";
			car3.price=1500000;
			car3.color="Red";
			
			Car car4=new Car();
			car4.brand="Ambastar";
			car4.model="A12";
			car4.price=850000;
			car4.color="Black";
			
			Car car5=new Car();
			car5.brand="Toyato";
			car5.model="X12";
			car5.price=900000;
			car5.color="Gray";
			
			Car[] cars= {car1,car2,car3,car4,car5};
			for(int i=0;i<cars.length;i++) {
				if(cars[i].price>=1000000) {
				System.out.println("Brand:"+cars[i].brand+", NetPrice:"+(cars[i].price+(cars[i].price*5/100)));
			}
			}
		}
	}


