package by.academy.threads.callable;

import by.academy.threads.callable.bean.Printer;

public class Runner {

    public static void main(String[] args) throws Exception {
        Printer printer = new Printer();

        printer.call();
    }
}
