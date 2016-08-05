package com.app.utilities;

public class Hello {

	private String greeting;

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.setGreeting("Hello");
		System.out.println(obj.getGreeting());
	}
}
