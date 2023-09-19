package ch02.sec05;

import java.util.Scanner;

public class SimpleCompoundCal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원금을 입력하시오 : ");
		String a = scanner.nextLine();
		int PV = Integer.parseInt(a);
		
		System.out.println("이자율을 입력하시오 : ");
		String b = scanner.nextLine();
		double r = Float.parseFloat(b);
		
		System.out.println("기간을 입력하시오 : ");
		String c = scanner.nextLine();
		int n = Integer.parseInt(c);

		double SimpleFV ;
		double CompoundFV ;
		
		 SimpleFV = PV * (1 + (r * n));
		 CompoundFV = PV * Math.pow((1+r),n);
		 System.out.printf("원금 %d원의 단리 이자는 %.1f원 입니다.%n",PV,SimpleFV);
		 System.out.printf("원금 %d원의 복리 이자는 %.1f원 입니다.",PV,CompoundFV);

	}

}
