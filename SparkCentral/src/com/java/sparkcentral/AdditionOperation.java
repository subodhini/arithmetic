package com.java.sparkcentral;

/**
 * Class to perform addition operation
 * @author schopde
 *
 */
public class AdditionOperation implements Calculation{

	@Override
	public int calculate(int a, int b) {
		return (a + b);
	}

}
