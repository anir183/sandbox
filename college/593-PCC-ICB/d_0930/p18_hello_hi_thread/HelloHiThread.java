package d_0930.p18_hello_hi_thread;

class Hello extends Thread {
    public void run() {
        System.out.println("Hello");
    }
}

class Hi extends Thread {
    public void run() {
        System.out.println("Hi");
    }
}

public class HelloHiThread {
    public static void main(String[] args) {
        Hello he = new Hello();
        Hi hi = new Hi();
        he.start();
        hi.start();
    }
}
