package oop;

//Car 클래스를 이용하여 작성된 프로그램
public class CarApp {
	public static void main(String[] args) {
		//클래스로 객체(인스턴스)를 생성하여 참조변수에 저장
		//형식) 클래스명 참조변수=new 클래스명()
		//객체(인스턴스)를 생성하면 인스턴스 필드에는 기본값이 자동으로 저장되어 초기화
		// => 기본값 - 숫자형 : 0, 논리형 : false, 참조형 : null 
		Car carOne =new Car();
		Car carTwo =new Car();
		
		System.out.println("carOne ="+carOne);
		System.out.println("carTwo ="+carTwo);
		System.out.println("========================================================");
		//참조변수를 이용하여 참조변수에 저장된 객체(인스턴스)의 요소에 접근하여 사용
		// => . 연산자를 이용하여 객체(인스턴스)의 요소(필드 또는 메소드)에 접근 
		carOne.aliasName="티코";
		carOne.engineStatus=false;
		carOne.currentSpeed=0;
		
		System.out.println("첫번째 자동차의 별칭 = "+carOne.aliasName);
		System.out.println("첫번째 자동차의 엔진상태 = "+carOne.engineStatus);
		System.out.println("첫번째 자동차의 현재속도 = "+carOne.currentSpeed);
		System.out.println("========================================================");
		carTwo.aliasName="싼타페";
		System.out.println("두번째 자동차의 별칭 = "+carTwo.aliasName);//기본값이 null(존재하지 않아 참조할수없다)이다.
		System.out.println("두번째 자동차의 엔진상태 = "+carTwo.engineStatus);
		System.out.println("두번째 자동차의 현재속도 = "+carTwo.currentSpeed);
		System.out.println("========================================================");
		//객체(인스턴스)를 이용하여 메소드 호출 - 기능 구현
		carOne.startEngine();
		carOne.speedUp(30);
		carOne.speedUp(50);
		carOne.speedDown(40);
		carOne.sppedZero();
		carOne.stopEngine();
		System.out.println("========================================================");
	}
}
