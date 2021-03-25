import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("first input : ");
		int first = scanner.nextInt();		
		System.out.println("second input : ");
		int second = scanner.nextInt();
		System.out.println("choose ( + - * / ) : ");
		String sign = scanner.next();
		if (sign.equals("+")) {
			System.out.println("덧셈 : " + (first + second));			
		} else if (sign.equals("-")) {
			System.out.println("뺄셈 : " + (first - second));			
		} else if (sign.equals("*")) {
			System.out.println("곱셈 : " + (first * second));			
		} else if (sign.equals("/")) {
			System.out.println("나눗셈 : " + (first / second));			
		}
	}
}
