// write a single class program with main loop in the class itself

package d_0812.p00_single_class;

public class Room {
    int length = 4, breadth = 16;

    public static void main(String args[]) {
        new Room().get();
    }

    void get() {
        System.out.println("length: " + length);
        System.out.println("breadth: " + breadth);
    }
}
