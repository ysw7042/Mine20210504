package xyz.itwill.lang;

//Wrapper : 원시 데이타 타입의 자료형(Primitive Type)을 클래스로 표현한 자료형
// => Byte, Short, Integer, Long, Character, Float, Double, Boolean
public class WrapperApp {
	public static void main(String[] args) {
		/*
		int num1=100,num2=200;
		int num3=num1+num2;
		System.out.println("합계 = "+num3);
		*/
		
		/*
		//Integer : 정수값을 저장하기 위한 클래스
		//정수값이 저장된 Integer 인스턴스를 생성하여 참조변수에 저장
		Integer num1=Integer.valueOf(100);
		Integer num2=Integer.valueOf("200");
		Integer num3=Integer.valueOf(num1.intValue()+num2.intValue());
		System.out.println("합계 = "+num3.intValue());
		*/
		
		//JDK5에서는 오토박싱과 오토언박싱 기능 추가
		//오토박싱(Auto Boxing) : 원시 데이타 타입의 값을 자동으로 Wrapper 인스턴스로 변환하는 기능
		//오토언박싱(Auto UnBoxing) : Wrapper 인스턴스를 자동으로 원시 데이타 타입의 값으로 변환하는 기능
		Integer num1=100,num2=200;
		Integer num3=num1+num2;
		System.out.println("합계 = "+num3);
		System.out.println("=====================================================");
		//Integer.valueOf(String s, int radix) : Integer 인스턴스를 생성하여 전달받은
		//진수의 문자열을 정수값으로 저장하여 반환하는 메소드 
		Integer num=Integer.valueOf("ABC", 16);//int num=0xABC;
		System.out.println("num = "+num);//정수값을 10진수로 출력
		System.out.println("=====================================================");
		//Integer number=50;
		Integer number=-50;
		
		System.out.println("number(10진수) = "+number);
		//Integer.toOctalString(int i) : 전달받은 정수값을 8진수의 문자열로 변환하여 반환하는 메소드
		System.out.println("number(8진수) = "+Integer.toOctalString(number));
		//Integer.toHexString(int i) : 전달받은 정수값을 16진수의 문자열로 변환하여 반환하는 메소드
		System.out.println("number(16진수) = "+Integer.toHexString(number));
		//Integer.toBinaryString(int i) : 전달받은 정수값을 2진수의 문자열로 변환하여 반환하는 메소드
		System.out.println("number(2진수) = "+Integer.toBinaryString(number));
		System.out.println("=====================================================");
		String str1="100",str2="200";
		System.out.println("합계 = "+(str1+str2));//문자열 결합
		
		//Integer.parseInt(String s) : 문자열을 전달받아 정수값으로 변환하여 반환하는 메소드
		// => 실행시 전달받은 문자열이 정수값으로 변환되지 못할 경우 NumberFormatException 발생
		System.out.println("합계 = "+(Integer.parseInt(str1)+Integer.parseInt(str2)));
		System.out.println("=====================================================");
		
	}
}





