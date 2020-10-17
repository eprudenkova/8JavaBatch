package com.syntax.class06;

import java.util.Scanner;

public class Repl040_SwitchStatement {

//	For you to do: 
//
//	By using the switch statement concept please validate what is the responsibility 
//	each instructor in the syntax solution.
//
//	First Output: "Enter name of the instructor"
//
//	case 1: if User provided the name as Asghar as input it should show  "Will take care of Java Assignment"
//	case 2: if User provided the name as Moazam as input it should show  "Will take care of SDLC Assignment"
//	case 3: if User provided the name as Weqas as input it should show  "Will take care of Selenium Assignment"
//	case 4: if User provided the name as Asel as input it should show  "Will take care of every Assignment"
//
//	Other than these four names if the user provides any other names --> " Invalid instructor selected"

//	1.
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String name;
//		String subject=null;
//		System.out.println("Enter name of your instructor");
//		name = input.nextLine().toLowerCase();
//		switch (name) {
//		case "asghar":
//			subject = "Java";
//			break;
//		case "moazam":
//			subject = "SDLC";
//			break;
//		case "weqas":
//			subject = "Selenium";
//			break;
//		case "asel":
//			subject = "every";
//			break;
//		default:
//			System.out.println("Invalid instructor selected");
//			break;
//		}
//		if(subject!=null) {
//		System.out.println("Will take care of "+subject+" Assigment");
//		}
//	}
//}

//	2.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name, message;
		System.out.println("Enter name of the instructor");
		name = input.nextLine().toLowerCase();
		switch (name) {
		case "asghar":
			message = "Will take care of Java Assignment";
			break;
		case "moazam":
			message = "Will take care of SDLC Assignment";
			break;
		case "weqas":
			message = "Will take care of Selenium Assignment";
			break;
		case "asel":
			message = "Will take care of every Assignment";
			break;
		default:
			message = "Invalid instructor selected";
			break;
		}
		System.out.println(message);
	}
}
