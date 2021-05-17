package xyz.itwill.util;

import java.util.Calendar;

//java.util.Calendar : 날짜와 시간정보를 저장하기 위한 클래스
public class CalendarApp {
	public static void main(String[] args) {
		//Calendar.getInstance() : 시스템의 현재 날짜와 시간정보를 저장한 Calendar 
		//인스턴스를 반환하는 메소드 
		Calendar now=Calendar.getInstance();//싱글톤 클래스
		
		//Calendar.toString() : Calendar 인스턴스에 저장된 날짜와 시간정보를 문자열로 
		//변환하여 반환하는 메소드
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = " + now);
		
		String[] day={"일","월","화","수","목","금","토"};
		//Calendar.get(int field) : Calendar 인스턴스에 저장된 정보 중 상수를 전달하여
		//원하는 값을 반환하는 메소드
		String printDate=now.get(Calendar.YEAR)+"년 "+(now.get(Calendar.MONTH)+1)+"월 "
			+now.get(Calendar.DATE)+"일 "+day[now.get(Calendar.DAY_OF_WEEK)-1]+"요일";
		
		System.out.println("현재 = "+printDate);
	}
}
