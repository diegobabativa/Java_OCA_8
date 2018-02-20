package com.co.oca.assessment;

public class Main {
	
	private static int $;
	
	public static void main(String[] args) {
		
		System.out.println("Imprimiendo arguments:");
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
		
		
		String a_b="";
		System.out.println($);
		System.out.println(a_b);
		
		
		
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while(count++ < 3) {
		int y = (1 + 2 * count) % 3;
		switch(y) {
		default:
		case 0: x -= 1; break;
		case 1: x += 5;
		}
		}
		System.out.println(x);
		
	}

}
