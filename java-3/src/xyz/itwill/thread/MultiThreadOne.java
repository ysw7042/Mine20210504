package xyz.itwill.thread;

//Thread 클래스를 상속받은 자식 클래스 - 반드시 run() 메소드 오버라이드 선언
public class MultiThreadOne extends Thread {
	@Override
	public void run() {
		//새로운 스레드로 실행될 명령 작성
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			
			//오버라이드 선언된 메소드는 예외 전달 불가능
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
