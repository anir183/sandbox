// write a program to print the factorial of a given number

public class Factorial {
	public static void main(String[] args) {
		System.out.println("The factorial of 5 is: " + Fact.calculate(5));
	}
}

class Fact {
	static int calculate(int n) {
		int prod = 1;

		for(int i = n; i > 1; i--) {
			prod *= i;
		}

		return prod;
	}
}
