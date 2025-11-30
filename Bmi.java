package se.second;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your name: ");
        String name = sc.nextLine();

        System.out.println("enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("enter your height (meter): ");
        double height = Double.parseDouble(sc.nextLine());

        System.out.println("enter your weight (kilo-gram): ");
        double weight = Double.parseDouble(sc.nextLine());

        System.out.println("enter your status (Married/Single): ");
        String status = sc.nextLine();
        boolean isMarried = status.equalsIgnoreCase("Married");

        System.out.println(name + " " + age + " " + height + " " + weight + " " + (isMarried ? "Married" : "Single"));

        double BMI = weight / (height * height);
        System.out.println("Your BMI is: " + BMI);
    }
}
