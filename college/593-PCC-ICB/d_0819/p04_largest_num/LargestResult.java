// write a program to print the largest of 3 numbers

package d_0819.p04_largest_num;

class Largest {
    static int calculate(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
}

public class LargestResult {
    public static void main(String args[]) {
        System.out.println("Largest of 1, 2 and 3 is: " + Largest.calculate(1, 2, 3));
    }
}
