package ch02.sec05;
import java.util.Scanner;

public class FourBasicOperations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x값을 입력하시오 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("y값을 입력하시오 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int a = x + y;
		int b = x - y;
		int c = x * y;
		int d = x / y;
		
		System.out.printf("x + y 는 %d입니다.%n",a);
		System.out.printf("x - y 는 %d입니다.%n",b);
		System.out.printf("x * y 는 %d입니다.%n",c);
		System.out.printf("x / y 는 %d입니다.%n",d);

	}

}
