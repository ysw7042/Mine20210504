package xyz.itwill.util;

import java.util.Date;

//java.util.Date : 날짜와 시간정보를 저장하기 위한 클래스
public class DateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Date 클래스의 매개변수가 없는 생성자로 인스턴스를 생성하면 시스템의 현재 날짜와
		//시간정보가 인스턴스에 저장 
		Date now=new Date();
		
		//Date.toString() : Date 인스턴스에 저장된 날짜와 시간정보를 문자열로 변환하여 반환하는 메소드
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);//toString() 메소드 자동 호출
		
		String[] day={"일","월","화","수","목","금","토"};
		String printDate=(now.getYear()+1900)+"년 "+(now.getMonth()+1)+"월 "
				+now.getDate()+"일 "+day[now.getDay()]+"요일 ";
		//now.getMonth()+1 => 0~11월까지만 출력 되기 때문에 +1을 하여 1~12월까지 출력된다.
		System.out.println("현재 = "+printDate);
		
		//Date.getTime() : Date 인스턴스에 저장된 날짜와 시간정보를 long type의 정수값
		//(TimeStamp)으로 변환하여 반환하는 메소드  
		//타임 스템프(TimeStamp) : 1970년 01월 01일부터 1ms마다 1씩 증가된 정수값
		// => 날짜와 시간정보를 정수값으로 표현하여 연산하기 위해 사용
		//long nowTime=now.getTime();
		
		//System.currentTimeMillis() : 시스템의 현재 날짜와 시간정보에 대한 타임 스템프를 반환
		long nowTime=System.currentTimeMillis();
		System.out.println("nowTime = "+nowTime);
		
		Date wantDate=new Date(100, 0, 1);//2000년 1월 1일 0시 0분 0초 
		System.out.println("wantDate = "+wantDate);
		
		long wantTime=wantDate.getTime();
		
		System.out.println("연산결과(초) = "+((nowTime-wantTime)/1000));
	}
}
