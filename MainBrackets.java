package com.problem1.driver;
import com.problem1.service.BalancingBrackets;

public class MainBrackets {
	public static void main(String[] args) {
		BalancingBrackets balancingBrackets = new BalancingBrackets();
		String bracketExpression = "([[{}]])";
		boolean result = balancingBrackets.isBalanced(bracketExpression);
		if(result)
			System.out.println("The entered string is Balanced Brackets.");
		else
			System.out.println("The entered string is not Balanced Brackets.");
	}
}
