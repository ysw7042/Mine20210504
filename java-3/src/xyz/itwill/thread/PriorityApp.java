package xyz.itwill.thread;

public class PriorityApp {
	public static void main(String[] args) {
		PriorityOne one=new PriorityOne();
		PriorityTwo two=new PriorityTwo();
		
		one.setPriority(Thread.MIN_PRIORITY);//thread의 실행처리 우선순위를 최대한 천천히
		two.setPriority(Thread.MAX_PRIORITY);//thread의 실행처리 우선순위를 최대한 빨리 
		
		one.start();
		two.start();
	}
}
