// write a single class program with main loop in the class itself

public class SingleClass {
	int a = 3, b = 4;

	public static void main(String[] args) {
		SingleClass obj = new SingleClass();
		obj.get();
	}

	void get() {
		System.out.println(a);
		System.out.println(b);
	}
}
