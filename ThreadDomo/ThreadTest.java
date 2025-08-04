package ThreadDomo;

// 继承thread
public class ThreadTest {
    static Lefthand left;
    static Righthand right;

    public static void main(String[] args) {
        left = new Lefthand();
        right = new Righthand();

        left.start();
        right.start();
    }

    static class Righthand extends Thread {
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("I am right");
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    static class Lefthand extends Thread {
        public void run() {
            for (int i = 0; i <= 5; i++) {
                System.out.println("I am Left");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
