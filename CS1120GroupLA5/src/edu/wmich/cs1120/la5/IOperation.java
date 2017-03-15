package edu.wmich.cs1120.la5;

public interface IOperation {
	// perform the operation accordingly and return the value
	Integer perform(IExpression left, IExpression right);
}
