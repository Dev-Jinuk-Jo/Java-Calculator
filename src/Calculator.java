import java.util.Scanner;

public class Calculator {
	static int getFirstValue(Scanner scanner) {
		System.out.println("first input : ");
		int input = scanner.nextInt();
		return input;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("second input : ");
		int input = scanner.nextInt();
		return input;
	}
	static String getSymbol(Scanner scanner) {
		System.out.println("choose symbol ( + - * / ) : ");
		String input = scanner.next();
		return input;
	}
	static int calculate(String symbol, int first, int second) {
		if (symbol.equals("+")) {
			first = (first + second);
		} else if (symbol.equals("-")) {
			first = (first - second);			
		} else if (symbol.equals("*")) {
			first = (first * second);			
		} else if (symbol.equals("/")) {
			first = (first / second);			
		} else {
			System.out.println("Not available symbol");
		}
		return first;		
	}
	static void print(int result) {
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = getFirstValue(scanner);		
		int result = first;
		while (true) {
			String symbol = getSymbol(scanner);
			if (symbol.equals("quit")) {
				System.out.println("result : " + result);
				break;
			}
			int second = getSecondValue(scanner);
			result = calculate(symbol, result, second);
			print(result);
		}
	}
}
