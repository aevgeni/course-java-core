package com.rakovets.course.java.core.practice.class_work;

import java.util.Scanner;

public class Engine implements Runnable {
    private final Storage storage;
    private final Scanner scanner = new Scanner(System.in);
    private boolean isRunning = true;

    public Engine(Storage storage) {
        this.storage = storage;
    }

    private void addUserToStorage() {
        System.out.print("Enter user first name: ");
        String firstName = scanner.next();
        System.out.print("Enter user last name: ");
        String lastName = scanner.next();
        System.out.print("Enter user age: ");
        int age = scanner.nextInt();
        storage.addUser(new User(firstName, lastName, age));
        System.out.println("User added to storage!");
    }

    private void printMenu() {
        System.out.println("\n Choose point of menu: \n" +
                "0 - Exit \n" +
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
                System.out.println(storage.getUsers());
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
