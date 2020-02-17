package by.academy.threads.runnable.bean;

public class Printer implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm printer!");
    }
}
