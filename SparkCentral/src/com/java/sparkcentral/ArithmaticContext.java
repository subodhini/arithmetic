package com.java.sparkcentral;

/**
 * ArithmaticContext will invoke any arithmatic invokation at runtime.
 * 
 * @author schopde
 *
 */
public class ArithmaticContext {
	
	   private Calculation calculation;
	   /**
	    * Constructor to initialize the arithmatic class we want to implement.
	    * eg : ArithmaticContext(new AdditionOperation)
	    * @param calculation
	    */
	   public ArithmaticContext(Calculation calculation){
	      this.calculation = calculation;
	   }
	   
	   /**
	    * if Calculation calculation =  new AdditionOperation();
	    * calculation.calculate will invoke addition operation.
	    * @param num1
	    * @param num2
	    * @return
	    */
	   public int performArithmaticCalculation(int num1, int num2){
	      return calculation.calculate(num1, num2);
	   }
}
