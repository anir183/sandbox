// write a double class program but with int return type for first class

package d_0812.p02_double_class_return;

public class Result {
    public static void main(String args[]) {
        Room r1 = new Room();
        int a = r1.get();
        System.out.println(a);
    }
}

class Room {
    int len = 4, brd = 16, a;

    int get() {
        int l, b;
        l = len;
        b = brd;
        a = l * b;
        return a;
    }
}
