import java.util.Scanner;

public class Input {
	static String[] splitLineInput(String input) {
		String[] inputs = input.split(" ");
		return inputs;
	}
	
	static String getLineInput(Scanner scanner) {
		System.out.println("input calculating formula");
		String input = scanner.nextLine();
		return input;
	}

	static int getNumber(String input) {
		int result = Integer.parseInt(input);
		return result;
	}

	static String getSymbol(String input) {
		String result = input;
		return result;
	}

}
