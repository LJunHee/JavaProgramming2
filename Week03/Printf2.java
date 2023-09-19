package ch02.sec05;

public class Printf2 {

	public static void main(String[] args) {
		double a = 10.3645;
		double b = 24.1526;
		double c = 31.9845;
		double d = a * b * c;
		
		System.out.printf("%.1f%n",a);
		System.out.printf("%.2f%n",b);
		System.out.printf("%.3f%n%n",c);
		
		System.out.printf("변수 a,b,c의 곱은%10.3f입니다.",d);
		
		
		

	}

}
