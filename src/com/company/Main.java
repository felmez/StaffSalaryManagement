package com.company;

public class Main {
    public static void main(String[] args) {
        Employee john = new Employee("John Doe", 3000, 41, 2021);
        Employee max = new Employee("Max Corner", 5000, 50, 2010);
        Employee kemal = new Employee("Kemal Yilmaz", 2000, 45, 1985);
        System.out.println(john.toString());
        System.out.println("============");
        System.out.println(max.toString());
        System.out.println("============");
        System.out.println(kemal.toString());
    }
}
