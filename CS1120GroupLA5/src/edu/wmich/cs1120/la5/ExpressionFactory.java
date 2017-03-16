package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	/**
	 * This method will create and return a proper object according to the arguments received. 
	 * @param operator
	 * @param val1
	 * @param val2
	 * @return
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
			System.out.println("This expression can't be turned into an object.");
		}
		
		
		return new BinaryExpression(left, right, op);
	}

}
