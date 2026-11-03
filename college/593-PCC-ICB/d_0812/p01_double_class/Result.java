// write a double class program with the main loop in the second class

package	d_0812.p01_double_class;

public class Result {
	public static void main(String args[]) {
		Room r1 = new Room();
		r1.get();
	}
}

class Room {
	int len = 4, brd = 16;

	void get() {
		int l, b;
		l = len;
		b = brd;
		System.out.println(l * b);
	}
}
