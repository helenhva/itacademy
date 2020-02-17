package by.academy.threads.runnable;

import by.academy.threads.runnable.bean.Printer;

public class Runner {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.start();

        Thread threadTwo = new Thread(() -> System.out.println("I'm something"));
        threadTwo.start();
    }
}
