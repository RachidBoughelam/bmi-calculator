package org.rachiboughelam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        List<Person> people = new ArrayList<>();

        while (continueProgram) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add student and calculate BMI");
            System.out.println("2. Show all students and their BMI");
            System.out.println("3. Show students with BMI > 25");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add a new student:");

                    System.out.print("Enter height in cm: ");
                    int sizeCm = scanner.nextInt();
                    System.out.print("Enter weight in kg: ");
                    double weight = scanner.nextDouble();

                    Student student = new Student(sizeCm, weight);

                    Task task = new Task(people, student);
                    Thread thread = new Thread(task);
                    thread.start();

                    break;

                case 2:
                    System.out.println("=== Students BMI ===");
                    for (Person p : people) {
                        p.displayDetails();
                        double bmi = p.calculateBMI();
                        System.out.printf("BMI: %.2f%n", bmi);
                        System.out.println(interpretBMI(bmi));
                    }
                    break;

                case 3:
                    System.out.println("=== Students with BMI > 25 ===");
                    people.stream()
                            .filter(p -> p.calculateBMI() > 25)
                            .forEach(p -> p.displayDetails());
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }
        }

        scanner.close();
    }

    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "You are underweight.";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Your weight is normal.";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "You are overweight.";
        } else {
            return "You are obese.";
        }
    }
}