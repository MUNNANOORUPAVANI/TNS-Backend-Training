package com.avn.tns.oopsdemo;

public class Child implements Father,Mother{
	public void responsibility() {
		System.out.println("Responsibilities from Father");
	}
	public void love() {
		System.out.println("love from Mother");
	}

}
