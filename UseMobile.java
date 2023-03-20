package com.onesoft.day6;


public class UseMobile {
	public static void main(String[] args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="Vivo";
		mobile1.price=15000;
		mobile1.color="Black";
		mobile1.ram="4GB";
		mobile1.isWarranty=true;
		
		Mobile mobile2=new Mobile();
		mobile2.brand="Redmi";
		mobile2.price=20000;
		mobile2.color="Blue";
		mobile2.ram="4GB";
		mobile2.isWarranty=true;
		
		Mobile mobile3=new Mobile();
		mobile3.brand="Oppo";
		mobile3.price=18000;
		mobile3.color="Red";
		mobile3.ram="8GB";
		mobile3.isWarranty=true;
		
		Mobile[]m=new Mobile[3];
		m[0]=mobile1;
		m[1]=mobile2;
		m[2]=mobile3;
		
		//System.out.println(m[0].brand+" "+m[0].price);
		
//Print all brand and price:
//		for(int i=0;i<m.length;i++) {
//			System.out.println(m[i].brand+" "+m[i].price);
//		}
//		
		
//	Enhance for loop:
//		for(Mobile x:m) {
//			System.out.println(x.brand+" "+x.price);
//		}
//		
		
//print brand and color which price is more than 15k:
//		for(int i=0;i<m.length;i++) {
//			if(m[i].price>15000) {
//				System.out.println(m[i].brand+" "+m[i].color);
//			}
//		}
//		
		
//Find maximum price:
//		Mobile max=m[0];
//		for(int i=0;i<m.length;i++) {
//			if(m[i].price>=max.price) {
//				max=m[i];
//			}
//		}
//		System.out.println(max.brand+" "+max.price);
//		
		
//	Find maximum Price and discount 5% to that price:	
//		Mobile max=m[0];
//		int temp=0;
//		for(int i=0;i<m.length;i++) {
//			if(m[i].price>=max.price) {
//			temp=m[i].price-(m[i].price*5/100);
//				max=m[i];
//			}
//		}
//		System.out.println(max.brand+" "+temp);
		
//	Add all item price:	
//		int temp=0;
//		for(int i=0;i<m.length;i++) {
//			temp=temp+m[i].price;
//		}
//		System.out.println(temp);
//		
		
// maximum string length in brand:
		Mobile max=m[0];
		for(int i=0;i<m.length;i++) {
			if(m[i].brand.length()>=max.brand.length()) {
				max=m[i];
			}
		}
		System.out.println(max.brand+" "+max.price+" "+max.color);
	}

}
