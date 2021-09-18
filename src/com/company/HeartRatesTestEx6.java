//ex6
package com.company;

import java.util.Scanner;

public class HeartRatesTestEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRatesEx6 person1;
        person1 = new HeartRatesEx6();
        System.out.println("Insert your name: ");
        person1.setName(input.nextLine());
        System.out.println("Surname: ");
        person1.setSurname(input.nextLine());
        System.out.println("Day of birth: ");
        person1.setDay(input.nextInt());
        System.out.println("Month of birth: ");
        person1.setMonth(input.nextInt());
        System.out.println("Year of birth: ");
        person1.setYear(input.nextInt());
        System.out.printf("Years: %d%n", person1.personAge(person1.getDay(), person1.getMonth(), person1.getYear()));
        System.out.printf("Maxim Heart Rates: %d%n", person1.maxHeartRate());
        System.out.printf("Target Heart Rates: Between %d and %d%n",person1.minTargetHeartRate(), person1.maxTargetHeartRate());
    }
}