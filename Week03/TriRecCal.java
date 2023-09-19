package ch02.sec05;

import java.util.Scanner;

public class TriRecCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가로 길이를 입력하시오 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.println("세로 길이를 입력하시오 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int a = x * y;
		double b = 0.5 * x * y;
		
		System.out.printf("삼각형의 넓이는 %.0f입니다.%n",b);
		System.out.printf("사각형의 넓이는 %d입니다.%n",a);

	}

}
