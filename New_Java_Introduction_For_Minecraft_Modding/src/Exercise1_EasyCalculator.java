import java.util.Scanner;

public class Exercise1_EasyCalculator {

	/* EXERCISE 1: Easy Calculator

	  Create a calculator that runs multiple times until you manually break out of it.
	  You should read the operation first, then read the first and second number.

	  Depending on the operation chosen, you then have to return a different result.
	  You can do this with if statements or a switch statement.

	  Please note that when reading in a String, you want to use scanner.next()
	  And when comparing strings you wanna use:
	  String s = "something";
	  s.equals("something");
	  and not ==

	  After the result has been output, ask the user if they want to continue, if not end the program!
	  Estimated time to complete: 30-45 minutes */

	public static void main(String[] args) {
		EasyCalculator();
	}
	public static double EasyCalculator(){
		Scanner scanner = new Scanner(System.in);


		String operation;
		while (true) {
			System.out.println("Enter operation (+, -, *, /): ");
			operation = scanner.next();

			if (operation.length() != 1) {
				System.out.println("Please enter only one character!");
				continue;  // Skip to next loop iteration
			}

			char op = operation.charAt(0);

			if (op != '+' && op != '-' && op != '*' && op != '/') {
				System.out.println("Invalid operation!");
				continue;  // Skip to next loop iteration
			}

			// Valid input - break out of loop
			break;
		}

		// Continue with calculator logic using op

		double num1 = 0 ; 
		double num2 = 0 ;

		try {
			System.out.println("Enter a number: ");
			num1 = scanner.nextDouble();
			System.out.println("Enter another number: ");
			num2 = scanner.nextDouble();}
		catch(Exception e){
			System.out.println("You must enter a number!");
			scanner.close();
			return 0;
		}

		double result = 0;

		if(operation.equals ("+")) {
			result = num1 + num2;
		}
		else if(operation.equals("-")) {
			result = num1 - num2;
		}
		else if(operation.equals("*")) {
			result = num1 * num2;
		}
		else if(operation.equals("/")) {
			result = num1 / num2;
		}
		else if(operation.equals("^")) {
			result = Math.pow(num1, num2);
		}			
		scanner.close();
		System.out.println("Your result is: " + result);
		return result;











	}
}
