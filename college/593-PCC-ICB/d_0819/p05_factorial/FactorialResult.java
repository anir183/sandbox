// write a program to print the factorial of a given number

package d_0819.p05_factorial;

class Factorial {
    static long calcualte(int n) {
        long prod = 1;
        while (n > 1) {
            prod *= n;
            n--;
        }

        return prod;
    }
}

public class FactorialResult {
    public static void main(String args[]) {
        System.out.println("Factorial of 5 is: " + Factorial.calcualte(5));
    }
}
