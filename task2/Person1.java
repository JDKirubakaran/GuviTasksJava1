package com.guvi.day4.task2;

public class Person1 {

    private String name;
    private int age=21;
	/*public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}*/

    public int  getAge() {
        return age;
    }

    public String getName() {
        return name;

    }
    public void setName(String newName) {
        this.name = newName;

    }
    public void setAge(int newAge) {
        this.age = newAge;

    }
}
