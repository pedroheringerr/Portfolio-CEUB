import java.util.Scanner;

class cliCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("CLI Calculator");

		System.out.println("Write the first number: ");
		double num1 = Double.parseDouble(scanner.nextLine());

		System.out.println("Write the operation (+ - * /): ");
		String opr = scanner.nextLine();

		System.out.println("Write the second number: ");
		double num2 = Double.parseDouble(scanner.nextLine());

		double result;

		switch (opr) {
			case "+": result = num1 + num2;
									System.out.printf("The result of the sum of %.2f and %.2f is %.2f.", num1, num2, result);
									break;
				case "-": result = num1 - num2;
									System.out.printf("The result of the subtraction of %.2f and %.2f is %.2f.", num1, num2, result);
									break;
				case "*": result = num1 * num2;
									System.out.printf("The result of %.2f multiplied by %.2f is %.2f.", num1, num2, result);
									break;
				case "/": result = num1 / num2;
									System.out.printf("The result of %.2f divided by %.2f is %.2f.", num1, num2, result);
			default: result = 0;
							 break;
		}
	}
}
