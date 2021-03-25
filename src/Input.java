import java.util.Scanner;

public class Input {
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

}
