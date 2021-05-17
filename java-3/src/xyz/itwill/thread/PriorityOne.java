package xyz.itwill.thread;

public class PriorityOne extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.print("A");
		}
	}
}
