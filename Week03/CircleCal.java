package ch02.sec05;
import java.util.Scanner;
public class CircleCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원의 반지름 값을 입력하시오 : ");
		String strX = scanner.nextLine();
		int r = Integer.parseInt(strX);
		
		double a = 2 * 3.141592 * r;
		double b = 3.141592 * Math.pow(r,2);
		double c = 4/3 * 3.141592 * Math.pow(r,3);
		
		System.out.printf("반지름이 %d인 원의 둘레는 %.2f입니다.%n",r,a);
		System.out.printf("반지름이 %d인 원의 넓이는 %.2f입니다.%n",r,b);
		System.out.printf("반지름이 %d인 구의 부피는 %.2f입니다.%n",r,c);

	}

}
