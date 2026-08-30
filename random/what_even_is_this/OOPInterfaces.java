interface Image {
	int height = 1080;
	int width = 1920;

	void display();
}

interface TransparentImage {
	int background = 0;

	void removeBackground();
}

interface CompressedImage {
	int size = 5;

	void decompress();
	void compress();
}

class PNG implements Image, TransparentImage {
	public void display() {
		System.out.println("no background " +  background);
	}

	public void removeBackground() {}
}

class WebP implements Image, CompressedImage {
	public void display() {
		System.out.println("very compressed " + size);
	}

	public void compress() {}
	public void decompress() {}
}

class Gallery {
	Image img;

	void show() {
		img.display();
	}
}

public class OOPInterfaces {
	public static void main(String[] args) {
		Gallery g = new Gallery();
		g.img = new WebP();
		g.show();
	}
}
