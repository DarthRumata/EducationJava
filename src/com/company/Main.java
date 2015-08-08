package com.company;

public class Main {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.name = "John";
        Parent hisSon = new Child();
        hisSon.name = "Vasya";

        parent.say(parent.name);
        hisSon.say(hisSon.name);

    }
}

class Parent {

    String name;

    public void say(String whatToSay) {
        System.out.println(whatToSay);
    }
}

class Child extends Parent {

    public void method1() {
        System.out.println("method1");
    }

    public static void method2() {
        System.out.println("method1");
    }

    @Override
    public void say(String whatToSay) {
        super.say(whatToSay);
        System.out.println("Always say YES");
    }
}



