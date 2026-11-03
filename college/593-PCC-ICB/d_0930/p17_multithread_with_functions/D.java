package d_0930.p17_multithread_with_functions;

class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("I = " + i);
            if (i == 1) {
                try {
                    sleep(1000);
                } catch (Exception e) {
                }
            }
        }
        System.out.println("Exit from thread A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("J = " + j);
            if (j == 3) {
                try {
                    // stop is deprecated in modern java
                    // stop();
                } catch (Exception e) {
                    break;
                }
            }
        }
        System.out.println("Exit from thread B");
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            if (k == 1) {
                Thread.yield();
            }
            System.out.println("K = " + k);
        }
        System.out.println("Exit from thread C");
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
