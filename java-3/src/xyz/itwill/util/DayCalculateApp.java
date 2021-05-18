package xyz.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//키보드로 생년월일을 입력받아 오늘까지 살아온 날짜(일)을 계산하여 출력하는 프로그램을 작성하세요.
//ex) 생년월일 입력[ex.2000-01-01] >> 2021-05-16
//    [결과]태어난지 1일 지났습니다.
// => 형식에 맞지 않은 생년월일을 입력한 경우 에러 메세지 출력 후 프로그램 종료
public class DayCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		Date birthday=null;
		System.out.print("생년월일 입력[ex.2000-01-01] >> ");
		try {
			//입력된 문자열을 Date 인스턴스로 변환하여 저장
			// => 패턴에 맞지 않은 문자열을 입력할 경우 ParseException 발생
			birthday=dateFormat.parse(scanner.nextLine());
		} catch (ParseException e) {
			System.out.println("[에러]생년월일을 형식에 맞게 입력해 주세요.");
			System.exit(0);
		} finally {
			scanner.close();
		}
		
		//살아온 날짜를 계산하여 출력
		long day=(System.currentTimeMillis()-birthday.getTime())/(1000*60*60*24);
		
		System.out.println("[결과]태어난지 "+day+"일이 지났습니다.");
		
	}
}




