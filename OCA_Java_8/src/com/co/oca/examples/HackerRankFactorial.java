package com.co.oca.examples;

import java.math.BigInteger;
import java.util.Scanner;

public class HackerRankFactorial {

	static void extraLongFactorials(int n) {
		System.out.println(calculateFactorial(n));
	}

	static BigInteger calculateFactorial(int n) {
		BigInteger uno = BigInteger.valueOf(1);
		if (n == 1 || n > 100 || n < 1) {
			return uno;
		}
		return calculateFactorial(n - 1).multiply(new BigInteger(n + ""));
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		extraLongFactorials(n);
		in.close();
	}

}
