package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//java.text 패키지 : 정보(값)를 원하는 형태의 패턴으로 표현하기 위한 자료형이 선언된 패키지

//java.text.SimpleDateFormatApp : 날짜와 시간정보에 대한 패턴을 저장하기 위한 클래스
// => Date 인스턴스와 String 인스턴스를 서로 변환하는 메소드 제공
public class SimpleDateFormatApp {
	public static void main(String[] args) {
		Date now=new Date();
		
		//SimpleDateFormat(String pattern) : 날짜와 시간 관련 패턴문자를 전달하여
		//SimpleDateFormat 인스턴스를 생성하는 생성자
		// => 패턴정보 : 패턴문자를 이용하여 표현된 문자열 
		// => 패턴문자 : y(년),M(월),d(일),H(시),m(분),s(초),E(요일) 등
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		
		//SimpleDateFormat.format(Date date) : Date 인스턴스를 전달받아 원하는 패턴의
		//문자열(String)으로 변환하여 반환하는 메소드
		String printDate=dateFormat.format(now);
		
		System.out.println("현재 = "+printDate);
		
		//SimpleDateFormat.applyPattern(String pattern) : SimpleDateFormat 인스턴스에
		//저장된 패턴정보를 변경하는 메소드 
		dateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("현재 = "+dateFormat.format(now));
		
		String want="2000-01-01 00:00:00";
		try {
			//SimpleDateFormat.parse(String str) : SimpleDateFormat 인스턴스에 저장된
			//패턴정보의 문자열(String)을 전달받아 Date 인스턴스로 변환하여 반환하는 메소드
			// => 패턴정보와 다른 문자열이 전달된 경우 ParseException 발생 - 예외처리(try - catch)
			Date wantDate=dateFormat.parse(want);
			System.out.println("wantDate ="+wantDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
