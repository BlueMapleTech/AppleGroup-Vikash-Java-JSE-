package com.bluemaple.application.test;

public class Add {

	private String name;
	private String address;
	private String age;
	private String pin;
	private Add add;

	public Add getAdd() {
		return add;
	}

	public void setAdd(Add add) {
		this.add = add;
	}

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
		return "Add [name=" + name + ", address=" + address + ", age=" + age
				+ ", pin=" + pin + ",add=" + add + "]";
	}

}
