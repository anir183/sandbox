// write a program to print all prime numbers between 1 and 100

public class Primes {
	public static void main(String[] args) {
		System.out.println("The primes from 1 to 100 are:");
		Prime.display(1, 100);
	}
}

class Prime {
	static boolean isPrime(int n) {
		for(int i = 2; i <= n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
		}

		return true;
	}

	static void display(int low, int up) {
		for(int i = low; i <= up; i++) {
			if(Prime.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}
}
