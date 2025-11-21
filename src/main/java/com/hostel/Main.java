package com.hostel;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static List<String> students = new ArrayList<>();
    static List<String> rooms = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("===== Hostel Management System (NO DATABASE) =====");

        while (true) {
            System.out.println("\n1. Register Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.print("Enter option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) registerStudent();
            else if (option == 2) viewStudents();
            else if (option == 3) {
                System.out.println("Exiting...");
                break;
            }
            else System.out.println("Invalid choice!");
        }
    }

    public static void registerStudent() {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Number: ");
        String room = sc.nextLine();

        students.add(name);
        rooms.add(room);

        System.out.println("Student Registered Successfully!");
    }

    public static void viewStudents() {
        System.out.println("\n--- Student List ---");

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (int i = 0; i < students.size(); i++) {
            System.out.println((i+1) + ". " + students.get(i) + " - Room: " + rooms.get(i));
        }
    }
}
