package com.bluemaple.application.test;

public class Add2 {
	private String name;
	private String address;
	private String age;
	private String pin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "List3 [name=" + name + ", address=" + address + ", age=" + age
				+ ", pin=" + pin + "]";
	}

}
