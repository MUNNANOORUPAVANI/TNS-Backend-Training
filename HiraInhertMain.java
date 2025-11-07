package com.avn.tns.oopsdemo;

public class HiraInhertMain {

	public static void main(String[] args) {

		Bike b=new Bike("pulsar","red","125cc",10);
		System.out.println("Bike Details:");
		b.display();
		Car c=new Car("thar","black",4);
		System.out.println("Car Details:");
		c.display();

	}

}
