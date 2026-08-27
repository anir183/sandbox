// write a program to calcualte the area of a circle, reactangle and triangle

import java.util.Scanner;

public class ShapeArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Circle Radius: ");
		System.out.println("Area: " + Area.calculate(sc.nextInt()) + "\n");

		System.out.print("Rectangle Length: ");
		int l = sc.nextInt();
		System.out.print("Rectangle Breadth: ");
		int b = sc.nextInt();
		System.out.println("Area: " + Area.calculate(l, b) + "\n");

		System.out.print("Triangle Side 1: ");
		int s1 = sc.nextInt();
		System.out.print("Triangle Side 2: ");
		int s2 = sc.nextInt();
		System.out.print("Triangle Side 3: ");
		int s3 = sc.nextInt();
		System.out.println("Area: " + Area.calculate(s1, s2, s3) + "\n");

		sc.close();
	}
}

class Area {
	static double calculate(int rad) {
		return 2 * Math.PI * rad;
	}

	static int calculate(int len, int brd) {
		return len * brd;
	}

	static double calculate(int side1, int side2, int side3) {
		float s = (side1 + side2 + side3) / 2f;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
