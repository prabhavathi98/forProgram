package com.onesoft.day7;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.brand="Reynolds";
		m1.price=25;
		m1.color="Black";
		
		Marker m2=new Marker();
		m2.brand="Faber";
		m2.price=32;
		m2.color="Red";
		
		Marker m3=new Marker();
		m3.brand="camlin";
		m3.price=50;
		m2.color="Blue";
		
		Marker m4=new Marker();
		m4.brand="Reynolds";
		m4.price=40;
		m4.color="Blue";
		
		Marker m5=new Marker();
		m5.brand="Camlin";
		m5.price=45;
		m5.color="Black";
		
		Marker m6=new Marker();
		m6.brand="Faber";
		m6.price=32;
		m6.color="Blue";
		
		Marker m7=new Marker();
		m7.brand="Reynolds";
		m7.price=15;
		m7.color="Red";
		
		Marker m8=new Marker();
		m8.brand="Camlin";
		m8.price=60;
		m8.color="Red";
// Print item which is not in blue color		
		Marker[] m= {m1,m2,m3,m4,m5,m6,m7,m8};
		for(int i=0;i<m.length;i++) {
			if(m[i].color!="Blue") {
				m[i].display();
			}
		}
		
//		Print price more than 20
		
		for(Marker marker:m) {
			if(marker.price>20) {
				marker.display();
			}
		}
		
//		Add all reynolds price
		int total=0;
		for(int i=0;i<m.length;i++) {
			if(m[i].brand=="Reynolds") {
				total=total+m[i].price;
			}
		}
		System.out.println(total);
	}

}
