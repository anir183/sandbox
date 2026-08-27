// write a program to print a fraction using constructor overloading
// - unparameterized
// - parameterized
// - parameterized with different datatype

public class ConstrOverloadFraction {
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(6, 9);
		Fraction f3 = new Fraction(4.2f, 18.3f);

		f1.display();
		f2.display();
		f3.display();
	}
}

class Fraction {
	float numerator;
	float denominator;
	float value;

	Fraction() {
		numerator = 6;
		denominator = 7;
		value = numerator / denominator;
	}

	Fraction(int num, int denom) {
		numerator = num;
		denominator = denom;
		value = numerator / denominator;
	}

	Fraction(float num, float denom) {
		numerator = num;
		denominator = denom;
		value = numerator / denominator;
	}

	void display() {
		System.out.println("The fraction is:");
		System.out.println(numerator + "/" + denominator + " = " + value);
	}
}
