package by.academy.threads.thread.bean;

public class Printer extends Thread {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("I'm %s\n", name);
    }
}
