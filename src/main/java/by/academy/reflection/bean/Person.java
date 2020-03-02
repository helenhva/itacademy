package by.academy.reflection.bean;

public class Person {
    private String name;
    private int age;
    private String address;
    private final String sity = "Gomel";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSity() {
        return sity;
    }
}
