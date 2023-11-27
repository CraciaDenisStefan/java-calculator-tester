package org.java;

public class Calculator {
	
	 public float somma(float num1, float num2) {
	        return num1 + num2;
	    }

	 public float sottrai(float num1, float num2) {
	        return num1 - num2;
	    }

	 public float dividi(float num1, float num2) {
	        if (num2 == 0) {
	            throw new IllegalArgumentException("non puoi dividere per 0");
	        }
	        return num1 / num2;
	    }

	 public float moltiplica(float num1, float num2) {
	        return num1 * num2;
	    }

}
