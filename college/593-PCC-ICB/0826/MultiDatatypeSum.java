// write a program to take two arrays of int and double types and calculate the
// sum of the elements in each type of array

import java.util.Scanner;

public class MultiDatatypeSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ints = new int[10];
		double[] doubles = new double[10];

		System.out.println("Enter integers:");
		for(int i = 0; i < ints.length; i++) {
			System.out.print("\t" + (i + 1) + " > ");
			ints[i] = sc.nextInt();
		}
		System.out.println("Sum: " + ArrSum.calculate(ints) + "\n");

		System.out.println("Enter doubles:");
		for(int i = 0; i < doubles.length; i++) {
			System.out.print("\t" + (i + 1) + " > ");
			doubles[i] = sc.nextDouble();
		}
		System.out.println("Sum: " + ArrSum.calculate(doubles) + "\n");

		sc.close();
	}
}

class ArrSum {
	static int calculate(int[] arr) {
		int sum = 0;

		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

	static double calculate(double[] arr) {
		double sum = 0;

		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}
}
