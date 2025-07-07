package com.daythree.ScannerClass;

import java.util.Scanner;

public class Constructor {
    // Private data members
    private String name;
    private int age;

    // Default constructor
    public Constructor() {
        this.name = "Not Set";
        this.age = 0;
    }

    // Parameterized constructor
    public Constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Constructor c1 = new Constructor();
        System.out.println("Default Constructor Output:");
        c1.display();

        // Getting input using Scanner and setting via setters
        System.out.println("\nEnter name:");
        String inputName = sc.nextLine();
        System.out.println("Enter age:");
        int inputAge = sc.nextInt();

        c1.setName(inputName);
        c1.setAge(inputAge);
        System.out.println("\nUpdated Details using Setters:");
        c1.display();

        // Using parameterized constructor
        Constructor c2 = new Constructor("Pritam", 21);
        System.out.println("\nParameterized Constructor Output:");
        c2.display();

        sc.close();
    }
}
