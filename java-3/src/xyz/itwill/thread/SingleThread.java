package xyz.itwill.thread;

public class SingleThread {
	public void display() {
		/*
		System.out.println("SingleThread 클래스의 display() 메소드 시작");

		System.out.println("["+Thread.currentThread().getName()
				+"] 스레드에 의해 display() 메소드의 명령 실행");
		
		System.out.println("SingleThread 클래스의 display() 메소드 종료");
		*/
		
		for(char i='a';i<='z';i++) {
			System.out.print(i);
		}
	}
}
