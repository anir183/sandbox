// write a program to print the fibonacci series till the nth term

package d_0819.p06_fibonacci;

class Fibonacci {
    static void display(int n) {
        int a = 0, b = 1, c;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = b;
            b = a + b;
            a = c;
        }
    }
}

public class FibonacciResult {
    public static void main(String args[]) {
        System.out.println("First 10 Fibonacci are: ");
        Fibonacci.display(10);
        System.out.println();
    }
}
