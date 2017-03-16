package edu.wmich.cs1120.la5;

public class Addition implements IOperation {

	/**
	 * Adds the two parameters and returns them
	 * @return The addition of the two parameters
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		return (left.getValue() + right.getValue());
	}

}
