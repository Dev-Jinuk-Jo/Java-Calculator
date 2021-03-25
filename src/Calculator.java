import java.util.Scanner;

public class Calculator {
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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = Input.getFirstValue(scanner);		
		int result = first;
		while (true) {
			String symbol = Input.getSymbol(scanner);
			if (symbol.equals("quit")) {
				System.out.println("result : " + result);
				break;
			}
			int second = Input.getSecondValue(scanner);
			result = calculate(symbol, result, second);
			Output.print(result);
		}
	}
}
