package oop;

//자동차를 표현하기 위한 클래스(자료형)
public class Car {
	//필드(Field) : 표현에 대상에 대한 속성 구현 - 속성값 저장 
	// => 클래스에 선언된 모든 메소드에서 필드에 접근하여 사용 가능
	String aliasName;//이름(별칭) - 고유값
	boolean engineStatus;//엔진상태(시동유무) - false : off, true : on
	int currentSpeed;//현재속도
	
	//생성자(Constructor) : 객체(인스턴스)를 생성하기 위한 특별한 메소드
	// => 하나의 생성자도 선언하지 않으면 매개변수가 없는 기본 생성자가 존재하는 것으로 처리된다. 
	
	//메소드(Method) : 표현 대상에 대한 행위 구현   
	// => 필드를 이용하여 표현 대상의 행위를 명령으로 작성해 기능으로 제공 
	
	// 자동차 시동을 켜는 행위를 표현한 메소드
	void startEngine() {
		engineStatus=true;
		System.out.println(aliasName+"의 시동을 켰습니다.");
	}
 	
	// 자동차 시동을 끄는 행위를 표현한 메소드
	void stopEngine() {
		engineStatus=false;
		System.out.println(aliasName+"의 시동을 껐습니다.");
	}
	
	//자동차 속도를 증가하는 행위를 표현한 메소드 
	void speedUp(int speed) {
		currentSpeed+=speed; //currentSpeed 는 현재속도 speed에 들어가는 정수값 만큼 속도가 증가한다. 
		System.out.println(aliasName+"의 속도가 "+speed
				+"Km/h 증가 되었습니다. 현재 속도는 "+currentSpeed+"Km/h 입니다.");
	}
	
	//자동차 속도를 감소하는 행위를 표현한 메소드
	void speedDown(int speed) {
		currentSpeed-=speed; //currentSpeed 는 현재속도 speed에 들어가는 정수값 만큼 속도가 감소한다. 
		System.out.println(aliasName+"의 속도가 "+speed
				+"Km/h 감소 되었습니다. 현재 속도는 "+currentSpeed+"Km/h 입니다.");
	}
	
	//자동차를 멈추는 행위를 표현한 메소드 
	void sppedZero() {
		currentSpeed=0;
		System.out.println(aliasName+"의 자동차가 멈췄습니다.");
	}
	
}









