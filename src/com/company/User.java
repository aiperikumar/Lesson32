package com.company;

public class User {
    String name;
    int age;



    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameLengthExeption {
        if (name.length()> 20){
            throw new IllegalNameLengthExeption("Слишком длинное имя");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age> 100 || age<1){
            throw new IllegalAgeExeption("Не подходящий возраст");
        }
        this.age = age;
    }
}
