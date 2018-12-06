package learnbyexample.java8;

public class Main {

    public static void main(String[] args) {
        Countdown countdown = new Countdown();

        CountdownThread t1 = new CountdownThread(countdown);
        t1.setName("Thread 1");
        t1.setPriority(10);
        CountdownThread t2 = new CountdownThread(countdown);
        t2.setName("Thread 2");
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}

class Countdown {
        int i;
    void doCountdown() {
        String color;

        final Thread thread = Thread.currentThread();
        switch (thread.getName()) {
            case "Thread 1":
                color = "Blue";
                break;
            case "Thread 2":
                color = "Green";
                break;
            default:
                color = "Black";
        }

        for (i = 10; i > 0; i--) {
            System.out.println(color + thread.getName() + ", id : " + thread.getId() + ": i = " + i);
            System.out.println(thread.getId());
        }
    }
}

class CountdownThread extends Thread {
    private Countdown threadCountdown;

    public CountdownThread(Countdown countdown) {
        threadCountdown = countdown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
