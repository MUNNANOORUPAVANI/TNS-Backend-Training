package com.avn.tns.oopsdemo;

public class Jeep extends Car {
     public int avgSpeed;
     public Jeep(String vehicleName,String vehicleColor,int seatingCapacity,int avgSpeed) {
    	 super(vehicleName,vehicleColor,seatingCapacity);
    	 this.avgSpeed=avgSpeed;
     }
     public void display() {
    	 super.display();
    	 System.out.println("avgSpeed="+avgSpeed);
     }
}
