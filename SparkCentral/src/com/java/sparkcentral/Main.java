package com.java.sparkcentral;

public class Main {

	public static void main(String[] args) {
		//infix notaion
		String cal1 = "5 - 6";
		String postfixCal1 = "56-";
		//Convert to char array 
		//Take each first 2 charecter and put it in stack.
		//int a =  popped element from stack
		int a = 5;
		int b = 6;
		//int b =  popped element from stack
		//WHen 3  character " - " is encountered, call 
		ArithmaticContext c = new ArithmaticContext(new SubstractionOperation());
		int value = c.performArithmaticCalculation(a, b);
		System.out.println("value " + value);
	}

}
