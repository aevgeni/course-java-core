package com.rakovets.course.java.core.practice.class_work;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Storage storage;
    private final Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;
    private int userId = 0;

    public Engine(Storage storage) {
        this.storage = storage;
    }

    private int userCounter() {
        return userId++;
    }

    private void addUserToStorage() {
        System.out.print("Enter user first name: ");
        String firstName = scanner.next();
        System.out.print("Enter user last name: ");
        String lastName = scanner.next();
        System.out.print("Enter user age: ");
        int age = scanner.nextInt();
        storage.addUser(new User(firstName, lastName, age, userCounter()));
        System.out.println("User added to storage!");
    }

    private void printMenu() {
        System.out.println("0 - Exit \n" +
                "1 - Add new user \n" +
                "2 - Print all users");
    }

    private void choosePointOfMenu() {
        int numberOfMenu = scanner.nextInt();
        switch (numberOfMenu) {
            case 0:
                isRunning = false;
                break;
            case 1:
                addUserToStorage();
                break;
            case 2:
                System.out.println(storage.getUsersList());
                break;
            default:
                break;
        }
    }

    @Override
    public void run() {
        while (isRunning) {
            printMenu();
            choosePointOfMenu();
        }
    }
}
