package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	private IOperation op; //
	private IExpression left; //
	private IExpression right; //
	
	/**
	 * 
	 * @param left The number on the left of the operand
	 * @param right The number on the right of the operand
	 * @param op The object to perform the needed operation
	 */
	public BinaryExpression(IExpression left, IExpression right, IOperation op){
		this.op = op;
		this.left = left;
		this.right = right;
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
