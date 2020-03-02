package by.academy.reflection;

import by.academy.reflection.bean.Person;

import java.lang.reflect.Field;

public class VariablesRunner {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Field[] declaredFields = personClass.getDeclaredFields();
        System.out.println("ALL VARIABLES:");
        for (Field field : declaredFields) {
            System.out.println(field);
        }

        System.out.println("\nVARIABLES BY NAME:");
        try {
            Field sity = personClass.getDeclaredField("sity");
            System.out.println(sity);

            Field gender = personClass.getDeclaredField("gender");
            System.out.println(gender);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
