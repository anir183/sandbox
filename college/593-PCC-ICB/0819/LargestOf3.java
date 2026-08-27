// write a program to print the largest of 3 numbers

public class LargestOf3 {
	public static void main(String[] args) {
		System.out.println("The largest of 1, 2 and 3 is: " + Largest.calculate(1, 2, 3));
	}
}

class Largest {
	static int calculate(int a, int b, int c) {
		return (a > b ? (a > c ? a : c) : (b > c ? b : c));
	}
}
