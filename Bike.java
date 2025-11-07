package com.avn.tns.oopsdemo;

public class Bike extends Vehicle{
	public String model;
	public int fuelCapacity;
	public Bike(String vehicleName,String vehicleColor,String model,int fuelCapacity ) {
		super(vehicleName,vehicleColor);
		this.model=model;
		this.fuelCapacity=fuelCapacity;
		
	}
	public void display() {
       super.display();
       System.out.println("model "+model+" fuelCapacity "+fuelCapacity);
}
}
