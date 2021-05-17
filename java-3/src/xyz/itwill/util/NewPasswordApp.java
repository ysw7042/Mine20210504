package xyz.itwill.util;

import java.util.Random;
import java.util.UUID;

//새로운 비밀번호를 제공하는 프로그램
public class NewPasswordApp {
	//새로운 비밀번호를 반환하는 메소드
	public static String newPasswordOne() {
		Random random=new Random();
		
		//비밀번호로 사용될 문자들을 저장한 문자열 생성
		String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String newPassword="";
		for(int i=1;i<=10;i++) {
			newPassword+=str.charAt(random.nextInt(str.length()));
			//str의 첨자(index)를 정수형으로 받고 다시 문자형을 변환하여 반환하여 newPassword에 기입.
		}
		
		return newPassword;
	}
	
	public static String newPasswordTwo(){
		//java.util.UUID : 범용적으로 사용되는 고유값을 제공하기 위한 클래스 
		//UUID.randomUUID() : 고유값이 저장된 UUID 인스턴스를 반환하는 메소드 
		// => 고유값 : 숫자와 알파벳 (소문자),-(4개)의 36개 문자들로 구성된 문자열
		//UUID.toString() : UUID 인스턴스에 저장된 고유값을 문자열(String)로 반환하는 메소드
		return UUID.randomUUID().toString().replace("-", "").substring(0, 10).toUpperCase();
	}// replace - 변환,substring - 잘라내기,toUpperCase - 대문자로 변환
	
	public static void main(String[] args) {
		System.out.println("임시비밀번호-1 = "+newPasswordOne());
		System.out.println("임시비밀번호-2 = "+newPasswordTwo());
	}
}
