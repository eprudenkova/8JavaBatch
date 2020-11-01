package com.syntax.class15;

import java.util.Scanner;

public class TaskKidName {
    public static void main(String[] args) {
        /*
Write a program that reads two people's first names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? boy Suggested baby name: DANRY
Example Output: Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl? girl Suggested baby name: MAIEL
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter mom's first name: ");
        String nameMom = input.nextLine();
        System.out.print("Please enter dad's first name: ");
        String nameDad = input.nextLine();
        System.out.print("Whom are you expecting? (boy / girl): ");
        String kid = input.nextLine();
        String nameKidBoy = nameDad.substring(0, nameDad.length() / 2) + nameMom.substring(nameMom.length() / 2, nameMom.length());
        String nameKidGirl = nameMom.substring(0, nameMom.length() / 2) + nameDad.substring(nameDad.length() / 2, nameDad.length());

        if (kid.toLowerCase().startsWith("b")) {
            System.out.println("Suggested baby name: " + nameKidBoy.toUpperCase());
        } else if (kid.toLowerCase().startsWith("g")) {
            System.out.println("Suggested baby name: " + nameKidGirl.toUpperCase());
        } else {
            System.out.println("No suggestions");
        }
    }
}
