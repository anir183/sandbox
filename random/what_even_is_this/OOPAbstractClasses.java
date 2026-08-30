abstract class Video {
	int a = 5;

	Video(int x) {
		System.out.println("generic video " + x);
	}

	abstract void display();

	void play() {
		System.out.println("play");
	}

	void pause() {
		System.out.println("pause");
	}
}

class MP4 extends Video {
	MP4() {
		super(42342);

		System.out.println("MP4");
	}

	void display() {
		System.out.println("display");
	}

	void get() {
		a++;
	}
}
