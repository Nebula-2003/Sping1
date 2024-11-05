package com.github.Nebula;

import java.io.Serializable;

public class Alien  {

    public int age;
    private Computer computer;
    public void code(){
        System.out.println("Coding");
        this.computer.compile();
    }

    public Alien(){
        System.out.println("Alien obj created");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age is being set" + " : " + age);
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}