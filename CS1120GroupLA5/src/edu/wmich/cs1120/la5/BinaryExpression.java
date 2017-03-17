package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	private IOperation op; // this variable will hold the location of an object .
	private IExpression left; // this variable will hold the location of an object representing a literal.
	private IExpression right; // this variable will hold the location of an object representing a literal.
	
	/**
	 * 
	 * @param left The object reference representing a literal to the left of an operand.
	 * @param right The object reference representing a literal to the right of an operand.
	 * @param op The object reference representing an operand of a binary expression.
	 */
	public BinaryExpression(IExpression left, IExpression right, IOperation op){
		this.op = op; // passes the reference op parameter to the associated field.
		this.left = left; // passes the reference of the left parameter to the associated field.
		this.right = right; // passes the reference of the right parameter to the associated field.
	}
	
	

	/**
	 * Calculates and returns the needed operation
	 * @return The outcome of the expression
	 */
	@Override
	public Integer getValue() {
		
		return op.perform(left, right);
	}

}
