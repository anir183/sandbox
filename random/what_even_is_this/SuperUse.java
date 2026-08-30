// super() - parents constructor

class Parent {
	int a = 6;
	void display() {
		System.out.println("I am parent " + a);
	}
}

class Child extends Parent {
	int a = 7;

	@Override
	void display() {
		super.display();
		System.out.println("I am child " + a + "" + super.a);
	}
}

public class SuperUse {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}
}
