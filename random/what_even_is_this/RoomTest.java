class Room {
	int l, b;

	void calc(int x, int y) {
		l = x;
		b = y;
	}

	int display() {
		return l * b;
	}
}

class BRoom extends Room {
	int z;

	void calc1(int x, int y, int z) {
		calc(x, y);
		this.z = z;
	}

	int display1() {
		return l * b * z;
	}
}

public class RoomTest {
	public static void main(String[] args) {
		BRoom r = new BRoom();
		r.calc1(1, 2, 3);
		System.out.println(r.display1());
	}
}
