// write a double class program but with int return type for first class

public class DoubleClassWReturn {
	public static void main(String[] args) {
		Room2 r = new Room2();
		int a = r.get();
		System.out.println(a);
	}
}

class Room2 {
	int l = 5, b = 20;

	int get() {
		return l * b;
	}
}
