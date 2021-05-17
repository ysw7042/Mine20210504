package xyz.itwill.util;

import java.util.Random;

//java.util.Random : 난수 관련 기능을 제공하는 클래스  
public class RandomApp {
	public static void main(String[] args) {
		Random random=new Random();//시드값이 같으면 동일한 난수를 발생
		
		for(int i=1;i<=5;i++) {
			//Random.nextInt(int bound) : 0부터 bound-1 범위의 정수난수를 발생하여 반환하는 메소드
			System.out.println(i+"번째 정수난수 = "+random.nextInt(100));//0~99
			
		}
	}
}
