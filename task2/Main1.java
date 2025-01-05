package com.guvi.day4.task2;

public class Main1 {

    public static void main(String[] args) {
        Person1 person1 = new Person1();
        Person1 person2 = new Person1();
        person1.setName("Kiruba");
        person2.setAge(22);
        person2.setName("Divya");
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old");
    }
}
