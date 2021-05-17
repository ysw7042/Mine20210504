package xyz.itwill.thread;

public class AccountUserApp {
	public static void main(String[] args) {
		Account account=new Account(10000);
		
		/*
		//단일 스레드를 이용하여 사용자의 입금 처리 
		AccountUser[] users=new AccountUser[3];
		users[0]=new AccountUser(account, "홍길동");
		users[1]=new AccountUser(account, "임꺽정");
		users[2]=new AccountUser(account, "전우치");
		
		for(AccountUser user:users) {
			user.getAccount().deposit(user.getUserName(), 5000);
		}
		*/
		
		//다중 스레드를 이용하여 사용자의 입금(출력) 처리 
		new AccountUser(account, "홍길동").start();
		new AccountUser(account, "임꺽정").start();
		new AccountUser(account, "전우치").start();
	}
}