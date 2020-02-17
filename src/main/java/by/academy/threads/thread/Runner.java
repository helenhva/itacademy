package by.academy.threads.thread;


import by.academy.threads.thread.bean.Printer;

public class Runner {

    public static void main(String[] args) {

        Printer first = new Printer("First");
        first.start();

        Printer second = new Printer("Second");
        second.start();
    }
}
