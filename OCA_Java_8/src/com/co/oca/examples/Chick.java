package com.co.oca.examples;

public class Chick {
	private String name = "Fluffy";
	private double doubleValue = 1_000_000;
	
	{
		System.out.println("setting field");
	}
	
	{
		
		System.out.println(name);
		
	}

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	public static void main(String[] args) {
		Chick chick = new Chick();
		System.out.println(chick.name);
	}
}
