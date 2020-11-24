package com.syntax.class16;

import java.sql.SQLOutput;

public class HWMethods {
    /*
1.Create a method createEmail().
Based on values of users name, lastName and email type, your method should return complete email Address.
Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
2.Write a method to return whether given number is prime or not?
3.Create  class Student that will have a method getGrade.
Your method should accept the score of a student and return a grade:
score > 90 - A
score > 80 - B
score > 70 - C
score > 50 - D
anything else - F (edited)
     */
    public static void main(String[] args) {
        createEmail("John", "Snow", "gmail");
        isPrimeOrNot(12);
        isPrimeOrNot(11);
        getGrade(95);
        getGrade(88);
        getGrade(75);
        getGrade(51);
        getGrade(50);

        System.out.println();

        HWMethods task3 = new HWMethods();
        System.out.println("90 " + task3.getGradeAsghar(90));//B
        System.out.println("101 " + task3.getGradeAsghar(101));//B
        System.out.println("40 " + task3.getGradeAsghar(40));//F
        System.out.println("70 " + task3.getGradeAsghar(70));//F
        System.out.println("-1 " + task3.getGradeAsghar(-1));//F
    }

    public static void createEmail(String name, String lastname, String emailType) {//(parameter, parameter, parameter)
        System.out.println(name.toLowerCase() + lastname.toLowerCase() + "@" + emailType.toLowerCase() + ".com");
    }

    String createEmailAsghar(String name, String lastname, String emailType) {//(parameter, parameter, parameter)
        return name + lastname + "@" + emailType + ".com";
    }

    public static void isPrimeOrNot(int num) {//Number > 1 and which div only by 1 and itself
        boolean isPrime = true;
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        System.out.println("Is " + num + " boolean? " + isPrime);
    }

    boolean isPrimeAsghar(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void getGrade(int score) {
        if (score > 90) {
            System.out.println("A");
            return;
        }
        if (score > 80) {
            System.out.println("B");
            return;
        }
        if (score > 70) {
            System.out.println("C");
            return;
        }
        if (score > 50) {
            System.out.println("D");
            return;
        }
        if (score > 0) {
            System.out.println("F");
            return;
        }
    }

    char getGradeAsghar(int marks) {
        char grade;
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 50 && marks < 70) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
