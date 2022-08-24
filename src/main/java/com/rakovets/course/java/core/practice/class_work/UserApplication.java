package com.rakovets.course.java.core.practice.class_work;

public class UserApplication {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread engine = new Thread(new Engine(storage));
        engine.start();
    }
}
