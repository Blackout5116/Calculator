package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Davids calculator!");
		Scanner scan = new Scanner(System.in);
		String input;
		String end = "end";
		boolean calculatorRuns = true;
		
		while (calculatorRuns) {
			
			System.out.println("Type add, subtract, multiply, or divide to start.");
			System.out.println("Type end to stop.");
			input = scan.nextLine();
			
			if (input.toLowerCase().equals(end)) {
				System.out.println("Ending...");
				calculatorRuns = false;
			}
			else if (input.toLowerCase().equals("add")) {
				add();
			}
			else if (input.toLowerCase().equals("subtract")) {
				subtract();
			}
			else if (input.toLowerCase().equals("multiply")) {
				multiply();
			}
			else if (input.toLowerCase().equals("divide")) {
				divide();
			}
			else {
				System.out.println("Sorry, that's not something I can do.");
			}
		}
	}
	
	//Adds two inputs from the user
	public static void add() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("You are in the \"add\" function.");
		String userInput; //Text input
		double input; //First number input
		double input_2; //Second number input
		double add; //First input plus second input
		boolean addRuns = true;
		String yes = "yes";
		String no = "no";
		
		while (addRuns) {
			
			System.out.println("Choose a different math function? (yes/no)");
			userInput = scanner2.nextLine();
			
			if (userInput.toLowerCase().equals(yes)) {
				System.out.println("Going back...");
				System.out.println();
				addRuns = false;
			}
			if (userInput.toLowerCase().equals(no)) {
				try {
					System.out.print("Type a number to add: ");
					input = scanner2.nextInt();
					System.out.print("Type a number to add: ");
					input_2 = scanner2.nextInt();
					add = input + input_2;
					System.out.println(input_2 + " + " + input + " = " + add);
					System.out.println();
				} 
				catch (InputMismatchException e) {
					System.err.println("ERROR: NUMBERS ONLY");
					System.out.println();
				}
			}
		}
}
	
	//Subtracts two inputs from the user
	public static void subtract() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("You are in the \"subtract\" function.");
		String userInput; //Text input
		double input; //First number input
		double input_2; //Second number input
		double subtract; //Subtracts first input with second input
		boolean addRuns = true;
		String yes = "yes";
		String no = "no";
		
		while (addRuns) {
			
			System.out.println("Choose a different math function? (yes/no)");
			userInput = scanner2.nextLine();
			
			if (userInput.toLowerCase().equals(yes)) {
				System.out.println("Going back...");
				System.out.println();
				addRuns = false;
			}
			if (userInput.toLowerCase().equals(no)) {
				try {
					System.out.print("Type a number: ");
					input = scanner2.nextInt();
					System.out.print("Type a number to subtract: ");
					input_2 = scanner2.nextInt();
					subtract = input - input_2;
					System.out.println(input + " - " + input_2 + " = " + subtract);
					System.out.println();
				} 
				catch (InputMismatchException e) {
					System.err.println("ERROR: NUMBERS ONLY");
					System.out.println();
				}
			}
		}
	}
	
	//Multiplies two inputs from the user
	public static void multiply() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("You are in the \"multiply\" function.");
		String userInput; //Text input
		double input; //First number input
		double input_2; //Second number input
		double multiply; //Multiplies first input by second input
		boolean addRuns = true;
		String yes = "yes";
		String no = "no";
		
		while (addRuns) {
			
			System.out.println("Choose a different math function? (yes/no)");
			userInput = scanner2.nextLine();
			
			if (userInput.toLowerCase().equals(yes)) {
				System.out.println("Going back...");
				System.out.println();
				addRuns = false;
			}
			if (userInput.toLowerCase().equals(no)) {
				try {
					System.out.print("Type a number: ");
					input = scanner2.nextInt();
					System.out.print("Type a number to multiply: ");
					input_2 = scanner2.nextInt();
					multiply = input * input_2;
					System.out.println(input_2 + " * " + input + " = " + multiply);
					System.out.println();
				} 
				catch (InputMismatchException e) {
					System.err.println("ERROR: NUMBERS ONLY");
					System.out.println();
				}
			}
		}
	}
	
	//Divides two inputs from the user
	public static void divide() {
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("You are in the \"divide\" function.");
		String userInput; //Text input
		double input; //First number input
		double input_2; //Second number input
		double divide; //Divides first input by second input
		boolean addRuns = true;
		String yes = "yes";
		String no = "no";
		
		while (addRuns) {
			
			System.out.println("Choose a different math function? (yes/no)");
			userInput = scanner2.nextLine();
			
			if (userInput.toLowerCase().equals(yes)) {
				System.out.println("Going back...");
				System.out.println();
				addRuns = false;
			}
			if (userInput.toLowerCase().equals(no)) {
				try {
					System.out.print("Type a number: ");
					input = scanner2.nextInt();
					System.out.print("Type a number to divide: ");
					input_2 = scanner2.nextInt();
					divide = input / input_2;
					System.out.println(input_2 + " / " + input + " = " + divide);
					System.out.println();
				} 
				catch (InputMismatchException e) {
					System.err.println("ERROR: NUMBERS ONLY");
					System.out.println();
				}
			}
		}
	}

}
