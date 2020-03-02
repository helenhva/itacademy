package by.academy.reflection;

import by.academy.reflection.bean.Person;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifiersRunner {

    public static void main(String[] args) {
        Person person = new Person();
        Class personClass = person.getClass();
        Field[] declaredFields = personClass.getDeclaredFields();
        int mods = personClass.getModifiers();

        System.out.println("VARIABLES MODIFIERS:");
        for (Field field : declaredFields) {
            if (Modifier.isPublic(field.getModifiers())) {
                System.out.println("public");
            }
            if (Modifier.isPrivate(field.getModifiers())) {
                System.out.println("private");
            }
            if (Modifier.isFinal(field.getModifiers())) {
                System.out.println("final");
            }
        }

        System.out.println("\nMETHOD MODIFIERS:");
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            int modifier = method.getModifiers();
            System.out.printf("%s: %s\n", method.getName(), Modifier.toString(modifier));
        }
    }
}
