package d_0930.p19_interthread_comm;

class A extends Thread {
    public void run() {
        System.out.println("I am Thread A!");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("I am Thread B!");
    }
}

class C extends Thread {
    public void run() {
        System.out.println("I am Thread C!");
    }
}

public class D {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.start();
        b.start();
        c.start();
    }
}
