package pre_oop;

public class ComputerExample {
	public static void main(String[] args) {
		Computer mycom=new Computer();
		
		int[] values1 = {1,2,3};
		int result1=mycom.sum1(values1);
		System.out.println("result1 : "+result1);
		
		int result2 = mycom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+result2);
		
		int result3 =mycom.sum2(1,2,3);
		System.out.println("result3 : "+result3);
		
		int result4 =mycom.sum2(1,2,3,4,5);
		System.out.println("result4 : "+result4);
		
	}
}
