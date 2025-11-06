package com.avn.tns.oopsdemo;

public class Person {
	private int pid;
	private String name;
	private int age;
	
	//getter and setters are used to access private data outside
	public int getPid() {
		return pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

}
