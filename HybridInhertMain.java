package com.avn.tns.oopsdemo;

public class HybridInhertMain {

	public static void main(String[] args) {
		// multilevel with hierarchy
		Jeep j=new Jeep("mahendra","Green",6,120);
		System.out.println("Multilevel inhertance");
		System.out.println("jeep Details:");
		j.display();
		System.out.println("hierarchy inhertance");
		Bike b=new Bike("pulsar","red","125cc",10);
		System.out.println("Bike Details:");
		b.display();

}
}
