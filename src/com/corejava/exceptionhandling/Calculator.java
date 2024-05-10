package com.corejava.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter First Number");
			a = sc.nextInt();
			System.out.println("Enter Second Number");
			b = sc.nextInt();
			System.out.println(String.format("quotient of %d and %d is %d", a, b, (a/b)));
			throw new MyOutOfWorldException("Failed Deliberately");
		}catch(ArithmeticException ex) {
			System.out.println("Denominator should not be zero buddy!");
		}catch(InputMismatchException exc) {
			System.out.println("Accepting integer inputs only!");
		}catch (MyOutOfWorldException e) {
			System.out.println("This is unlike anything!");
		}
	}
}
