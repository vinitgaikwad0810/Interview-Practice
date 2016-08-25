package stack.common;

public class InfixToPostfixFinal {

	private Boolean isOperator(char op) {
		return (op == '+' || op == '-' || op == '*' || op == '/' || op == '^' || op == '(' || op == ')');

	}

	private Integer getPrecedence(char ch) {

		switch (ch) {

		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;

		default:
			return -1;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
