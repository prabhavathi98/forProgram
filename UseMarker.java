package com.onesoft.day6;

public class UseMarker {
	public static void main(String[]args) {
		Marker marker1=new Marker();
		marker1.brand="camlin";
		marker1.price=50;
		marker1.color="Blue";
		marker1.isRefillable=false;
		
		Marker marker2=new Marker();
		marker2.brand="Faber";
		marker2.price=70;
		marker2.color="Red";
		marker2.isRefillable=true;
		
		Marker marker3=new Marker();
		marker3.brand="Reynolds";
		marker3.price=40;
		marker3.color="Black";
		marker3.isRefillable=true;
		
		Marker marker4=new Marker();
		marker4.brand="Buidge";
		marker4.price=70;
		marker4.color="Blue";
		marker4.isRefillable=false;
		
		Marker[] m=new Marker[4];
		m[0]=marker1;
		m[1]=marker2;
		m[2]=marker3;
		m[3]=marker4;
		
//	Print All items:
//		for(int i=0;i<m.length;i++) {
//			System.out.println(m[i].brand+"  "+m[i].price+"  "+m[i].color);
//		}
//		
		
//	Print all item in reverse:
//		for(int i=m.length-1;i>=0;i--) {
//			System.out.println(m[i].brand+" "+m[i].price+" "+m[i].color);
//		}
//		
		
//	Enhance for loop:
//		for(Marker a:m) {
//			System.out.println(a.brand+" "+a.price+" "+a.color);
//		}
		
//	Print first half of the item :
//		for(int i=0;i<m.length/2;i++) {
//			System.out.println(m[i].brand+"  "+m[i].price+"  "+m[i].color);
//		}
//		
//		for(int i=m.length/2-1;i>=0;i--) {
//			System.out.println(m[i].brand+"  "+m[i].price+"  "+m[i].color);
//		}
//		
		
		for(int i=m.length/2;i<m.length;i++) {
			System.out.println(m[i].brand+"  "+m[i].price+"  "+m[i].color);
		}
		
		for(int i=m.length-1;i>=m.length/2;i--) {
			System.out.println(m[i].brand+"  "+m[i].price+"  "+m[i].color);
		}
	}

}
