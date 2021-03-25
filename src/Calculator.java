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
		String input = Input.getLineInput(scanner);
		String[] inputs = Input.splitLineInput(input);
		int first = Input.getNumber(inputs[0]);		
		int result = first;
		for(int i = 1; i < inputs.length; i = i + 2) {
			String symbol = (inputs[i]);
			int second = Input.getNumber(inputs[i + 1]);
			result = calculate(symbol, result, second);
		}
		Output.print(result);			
	}

}