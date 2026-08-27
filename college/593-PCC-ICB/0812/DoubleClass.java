// write a double class program with the main loop in the second class

public class DoubleClass {
	public static void main(String[] args) {
		Room1 r = new Room1();
		r.get();
	}
}

class Room1 {
	int l = 4, b = 16;

	void get() {
		System.out.println(l * b);
	}
}
