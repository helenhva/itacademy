package by.academy.threads.callable.bean;

import java.util.concurrent.Callable;

public class Printer implements Callable<String> {

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName();
    }
}
