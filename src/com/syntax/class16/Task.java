package com.syntax.class16;

import com.syntax.class04.LargestNumber;

public class Task {
    /*
1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
2.Create a method that will take a number and prints whether the number is even or odd.
3.Create a method that will print whether given String is palindrome or not.
4.Create a method that will say Hello in different language
based on the country that will passed when method is executed.
     */
    public static void main(String[] args) {
        LargestNumber(100.5, 10.5);
        LargestNumber(10, 100);
        LargestNumber(10, 10);
        IsEvenOrOdd(2);
        IsEvenOrOdd(3);
        IsEvenOrOdd(0);
        IsPalindromeOrNot("Anna");
        IsPalindromeOrNot("My gym");
        IsPalindromeOrNot("Was it a cat I saw");
        IsStringPalindrome("anna");
        IsStringPalindrome("a");
        IsStringPalindrome("abc");
        HelloInDifferentLanguage("Spain");
        HelloInDifferentLanguage("Italy");
        HelloInDifferentLanguage("Russia");
        HelloInDifferentLanguage("China");
        HelloInDifferentLanguage("France");
    }

    //    methods
    public static void LargestNumber(double num1, double num2) {//if use double we can use int as well, but we can not use double in int
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void IsEvenOrOdd(int num1) {
        if (num1 % 2 == 0) {
            System.out.println(num1 + " is even number");//if number is completely divisible by 2 --> even
        } else {
            System.out.println(num1 + " is odd number");
        }
    }

    public static void IsPalindromeOrNot(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        reverse = reverse.replaceAll(" ", "");
        System.out.println("Is " + word + " palindrome? " + reverse.equalsIgnoreCase(word.replaceAll(" ", "")));
    }
    public static void IsStringPalindrome(String string){
        int i=0;
        int j = string.length()-1;
        while(i<j){
            if(string.charAt(i)!=string.charAt(j)){//char is primitive --> !=; string is not primitive --> .equals
                System.out.println("String "+string+" is not palindrome");
                return;//if true come out and do not execute anything
            }
            i++;
            j--;
        }
        System.out.println("String "+string+" is a palindrome");
    }

    public static void HelloInDifferentLanguage(String country) {
        String hello = "";
        switch (country) {
            case "Spain":
                hello = "Hola";
                break;
            case "Italy":
                hello = "Ciao";
                break;
            case "Russia":
                hello = "Privet";
                break;
            case "China":
                hello = "Ni hao";
                break;
            case "Turkey":
                hello = "Merhaba";
                break;
            default:
                hello = "No information";
                break;
        }
        System.out.println("Hello in " + country + " is " + hello);
    }


}
