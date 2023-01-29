package com.problem1.service;

import java.util.Stack;

public class BalancingBrackets {

	public boolean misMatch(char op, char cl) {
		return op == '(' && cl != ')' || op == '{' && cl != '}' || op == '[' && cl != ']';
	}

	public boolean isBalanced(String s) {
		Stack<Character> st = new Stack<>();
		char[] bracketExp = s.toCharArray();
		for (char c : bracketExp) {
			if (c == '(' || c == '{' || c == '[') {
				st.push(c);
			} else {
				if (st.isEmpty() || misMatch(st.peek(), c))
					return false;
				else
					st.pop();
			}
		}
		return st.isEmpty() ? true : false;
	}
}
