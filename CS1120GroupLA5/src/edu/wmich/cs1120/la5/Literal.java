package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	//Holds one of the numbers of the dat file expression
	private int value;
	
	/**
	 * Sets the local value
	 * @param value One of the numbers in the expression
	 */
	public Literal(int value){
		this.value = value;
	}

	/**
	 * Returns the stored value
	 * @return value A number from the expression
	 */
	@Override
	public Integer getValue() {
		
		return value;
	}

}
