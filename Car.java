package com.avn.tns.oopsdemo;

public class Car extends Vehicle {
	public int seatingCapacity;
	public Car(String vehicleName,String vehicleColor,int seatingCapacity) {
		super(vehicleName,vehicleColor);
		this.seatingCapacity=seatingCapacity;
	}
	public void display() {
		super.display();
		System.out.println("seatingcapacity ="+seatingCapacity);
	}
	
}
