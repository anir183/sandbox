// write a program to print a fraction using constructor overloading
// - unparameterized
// - parameterized
// - parameterized with different datatype

package d_0819.p08_fraction_constructor;

class Fraction {
    float numerator;
    float denominator;

    Fraction() {
        numerator = 6;
        denominator = 7;
    }

    Fraction(int n, int d) {
        numerator = n;
        denominator = d;
    }

    Fraction(float n, float d) {
        numerator = n;
        denominator = d;
    }

    void display() {
        System.out.println("The fraction is:");
        System.out.println(numerator + "/" + denominator + " = " + (numerator / denominator));
    }
}

public class FractionResult {
    public static void main(String args[]) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(4, 9);
        Fraction f3 = new Fraction(2.5f, 7.2f);

        f1.display();
        f2.display();
        f3.display();
    }
}
