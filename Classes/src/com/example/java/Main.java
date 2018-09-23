package com.example.java;

public class Main {

    public static void main(String[] args) {
        Employees employee1 = new Employees("Sean", "McLoughlin", 2007, 1);
        Employees employee2 = new Employees("Mark", "Fischbach", 2012, 2);
        Employees employee3 = new Employees("Felix", "Kjellberg", 2010, 3);

        employee1.printAll();
        System.out.println("\n");
        employee2.printAll();
        System.out.println("\n");
        employee3.printAll();
    }
}
