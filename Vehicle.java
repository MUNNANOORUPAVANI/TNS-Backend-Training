package com.avn.tns.oopsdemo;

public class Vehicle {
 
	public String vehicleName;
	public String vehicleColor;
	public Vehicle(String vehicleName,String vehicleColor ) {
		this.vehicleName=vehicleName;
		this.vehicleColor=vehicleColor;
	}
	void display() {
		System.out.println(" vehicleName "+vehicleName +" vehicleColor "+vehicleColor);
			
		}
	}
		
