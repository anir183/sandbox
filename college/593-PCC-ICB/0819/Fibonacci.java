// write a program to print the fibonacci series till the nth term

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("The first 10 terms of fibonacci series are:");
		Fibo.display(10);
	}
}

class Fibo {
	static void display(int n) {
		int a = 0, b = 1;

		for(int i = 0; i < n; i ++) {
			System.out.print(a + " ");
			b = b + a;
			a = b - a;
		}
		System.out.println();
	}
}
