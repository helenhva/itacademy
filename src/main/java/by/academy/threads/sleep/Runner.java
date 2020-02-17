package by.academy.threads.sleep;

import java.time.LocalTime;

public class Runner {

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i++;
            if (i == 50) {
                Thread.sleep(4000);
            }
        }
    }
}
