package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * Performs the subtraction of the two given numbers
	 * @param left The number on the left of the expression
	 * @param right The number on the right of the expression
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		return (left.getValue() - right.getValue());
	}

}
