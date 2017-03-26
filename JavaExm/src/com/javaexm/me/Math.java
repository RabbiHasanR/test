package com.javaexm.me;

public class Math {
	public double firstValue;
	public double secondValue;
	public double result;

	public Math() {

	}

	public Math(double firstValue, double secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	public void add() {
		result = firstValue + secondValue;
		System.out.println("Addition= " + result);
	}

	public void sub() {

		if (firstValue < secondValue) {
			result = secondValue - firstValue;
			System.out.println("Sub= " + result);
		} else {
			result = firstValue - secondValue;
			System.out.println("Sub= " + result);
		}
	}

	public void multiplication() {
		result = firstValue * secondValue;
		System.out.println("Multiplication= " + result);
	}

	public void division() {
		result = firstValue / secondValue;
		System.out.println("Division= " + result);
	}

}
