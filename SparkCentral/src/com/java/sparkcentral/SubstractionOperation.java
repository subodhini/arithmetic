package com.java.sparkcentral;
/**
 * Class to perform substraction operation
 * @author schopde
 *
 */
public class SubstractionOperation implements Calculation{

	@Override
	public int calculate(int a, int b) {
		return (a - b);
	}

}
