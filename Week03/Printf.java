package ch02.sec05;

public class Printf {

	public static void main(String[] args) {
		double PV = 10000.54;
		double r = 0.03 ;
		double n = 2.48 ;
		double SimpleFV ;
		double CompoundFV ;
		
		 SimpleFV = PV * (1 + (r * n));
		 CompoundFV = PV * Math.pow((1+r),n);
		 
		 int SimpleFV2 = (int) SimpleFV;
	     int CompoundFV2 = (int) CompoundFV;

		 System.out.printf("원금  %.2f 원의 단리 이자는 %.2f원, 정수로 %d 원 입니다.%n", PV, SimpleFV,SimpleFV2);
		 System.out.printf("원금 %.2f 원의 복리 이자는 %.2f원, 정수로 %d 원 입니다.",PV, CompoundFV,CompoundFV2);
	}

}
