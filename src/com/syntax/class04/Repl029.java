package com.syntax.class04;

import java.util.Scanner;

public class Repl029 {
	public static void main (String[] args){
	    Scanner input = new Scanner (System.in);
	    System.out.println("Please enter first number");
	    int x = input.nextInt();
	    System.out.println("Please enter second number");
	    int y = input.nextInt();
	    if(x*y>=0){
	      System.out.println("true");
	    }else{
	      System.out.println("false");
	    }
	  }

}
