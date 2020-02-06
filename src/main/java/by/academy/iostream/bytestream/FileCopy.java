package by.academy.iostream.bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("......\\example.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("......\\copied_example.txt")) {

            int a;
            while ((a = fileInputStream.read()) != -1) {
                fileOutputStream.write(a);
            }
        }
    }
}

