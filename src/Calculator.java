import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("first input : ");
		int first = scanner.nextInt();		
		while (true) {
			System.out.println("choose symbol ( + - * / ) : ");
			String symbol = scanner.next();
			if (symbol.equals("quit")) {
				System.out.println("result : " + first);
				break;
			}
			System.out.println("second input : ");
			int second = scanner.nextInt();
			if (symbol.equals("+")) {
				first = (first + second);
			} else if (symbol.equals("-")) {
				first = (first - second);			
			} else if (symbol.equals("*")) {
				first = (first * second);			
			} else if (symbol.equals("/")) {
				first = (first / second);			
			}
			System.out.println(first);
		}
	}
}
