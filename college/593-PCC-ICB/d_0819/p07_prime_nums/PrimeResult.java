// write a program to print all prime numbers between 1 and 100

package d_0819.p07_prime_nums;

class Primes {
    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void display(int l, int u) {
        for (int i = l; i <= u; i++) {
            if (Primes.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

public class PrimeResult {
    public static void main(String args[]) {
        System.out.println("Prime numbers btw 1 and 100 are: ");
        Primes.display(1, 100);
        System.out.println();
    }
}
