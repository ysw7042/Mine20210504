package xyz.itwill.thread;

//다중 스레드 프로그램 - main 스레드외 다른 스레드를 생성하여 새로운 명령 실행
// => 모든 스레드가 소멸되어야만 프로그램 종료
public class MultiThreadApp {
	//main 메소드에서 전달되는 모든 예외는 JVM이 자동으로 예외처리
	public static void main(String[] args) throws InterruptedException {
		//JVM에 의해 main 스레드 자동 생성
		
		//Thread 인스턴스를 생성하여 start() 메소드 호출
		// => 새로운 스레드를 만들어 run() 메소드의 명령 실행
		//Thread 클래스에 선언된 run() 메소드에는 실행될 명령 미존재 
		// => 자식클래스를 이용하여 run() 메소드를 오버라이드 선언하여 실행될 명령 작성
		/*
		Thread thread=new Thread();
		thread.start();
		*/
		
		//Thread 클래스를 상속받은 자식 클래스로 인스턴스 생성
		// => 자식 클래스의 생성자로 인스턴스를 생성하여 부모(Thread) 인스턴스가 먼저 생성
		//부모(Thread) 인스턴스의 start() 메소드를 호출하여 스레드 생성
		// => 생성된 스레드는 자식 클래스에서 오버라이드 선언된 run() 명령 실행
		/*
		MultiThreadOne thread=new MultiThreadOne();
		thread.start();
		*/
		//Thread 인스턴스로 start() 메소드외 호출할 메소드가 없는 경우 참조변수 없이 메소드 호출
		new MultiThreadOne().start();
		//하나의 Thread 인스턴스는 하나의 스레드만 생성 가능
		new MultiThreadOne().start();
		
		/*
		//Runnable 인터페이스를 상속받은 자식 클래스로 인스턴스 생성
		MultiThreadTwo multiThreadTwo=new MultiThreadTwo();
		//Thread 클래스로 인스턴스 생성 
		// => Runnable 인스턴스를 전달받아 Thread 인스턴스를 생성하는 생성자 호출
		// => run() 메소드가 오버라이드 선언되는 것과 같은 효과
		Thread thread=new Thread(multiThreadTwo);
		//Thread 인스턴스로 start() 메소드 호출 - 새로운 스레드를 생성하여 run() 명령 실행
		thread.start();
		*/
		new Thread(new MultiThreadTwo()).start();
		
		/*
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			
			//Thread.sleep(long ms) : 현재 명령을 실행하는 스레드를 원하는 시간(ms)동안 
			//일시 중지하는 메소드 
			// => InterruptedException 발생 - 예외 처리하지 않을 경우 에러 발생
			Thread.sleep(500);
		}
		*/
		for(char i='0';i<='9';i++) {
			System.out.print(i);
			Thread.sleep(500);
		}
		
	}
}





