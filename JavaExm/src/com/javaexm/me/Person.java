package com.javaexm.me;

public class Person {
	public String name;
	public int age;
	public String address;

	public Person() {

	}

	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void display() {
		System.out.println(address + " " + age + " " + address);
	}

}
