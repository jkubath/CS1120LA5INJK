package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	private IOperation op; //
	private IExpression left; //
	private IExpression right; //
	
	/**
	 * 
	 * @param left
	 * @param right
	 * @param op
	 */
	public BinaryExpression(IExpression left, IExpression right, IOperation op){
		this.op = op;
		this.left = left;
		this.right = right;
	}

	/**
	 * 
	 * @return
	 */
	@Override
	public Integer getValue() {
		
		return op.perform(left, right);
	}

}
