package xyz.itwill.thread;

//프로그램 실행시 JVM이 main() 메소드를 호출하여 실행하기 위해 자동으로 main 스레드 생성
// => main 스레드만 이용하여 프로그램 작성 : 단일 스레드 프로그램
// => main() 메소드가 종료되면 main 스레드 자동 소멸 - 프로그램 종료
public class SingleThreadApp {
	public static void main(String[] args) {
		/*
		System.out.println("SingleThreadApp 클래스의 main() 메소드 시작");
		
		//Thread : 스레드 관련 정보와 기능을 제공하기 위한 클래스
		//Thread.currentThread() : 현재 명령을 실행하는 Thread 인스턴스를 반환하는 메소드
		//Thread.getName() : Thread 인스턴스의 이름(고유값)을 반환하는 메소드
		System.out.println("["+Thread.currentThread().getName()
			+"] 스레드에 의해 main() 메소드의 명령 실행");
		
		//인스턴스 메소드 호출하면 스레드가 이동되어 메소드의 명령 실행
		// => 호출 메소드 실행 후 스레드 복귀
		new SingleThread().display();
		
		System.out.println("SingleThreadApp 클래스의 main() 메소드 종료");
		*/
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
		}
		
		new SingleThread().display();

		for(char i='A';i<='Z';i++) {
			System.out.print(i);
		}
	}
}



