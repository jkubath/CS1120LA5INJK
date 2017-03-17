package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	/**
	 * This method will create and return a proper object according to the arguments received. 
	 * @param operator The operator of the expression
	 * @param val1 The left side of the expression
	 * @param val2 The right side of the expression
	 * @return A Binary object that holds the data for the expression
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		
		IExpression left = new Literal(val1);
		IExpression right = new Literal(val2);
		
		/*
		 * Must initialize op with a placeholder at the beginning, but op will reference the proper
		 * object when the read character is evaluated by the switch.
		 */
		IOperation op = new Addition();
		
		switch(operator){
		case '+':{
			op = new Addition();
			break;
		}
		case '-':{
			op = new Subtraction();
			break;
		}
		default:
			return new Literal(val1);
		}
		
		
		return new BinaryExpression(left, right, op);
	}

}
