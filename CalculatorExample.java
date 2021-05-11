package pre_oop;

public class CalculatorExample {
	public static void main(String[] args) {
		Calcurator cal=new Calcurator();
		
		cal.poweron();
		
		int result1=cal.plus(5, 6);
		System.out.println("result1 : "+result1);
		
		byte x =10;
		byte y = 4;
		double result2= cal.divide(x, y);
		System.out.println("result2 : "+result2);
		
		cal.poweroff();
	}
}
