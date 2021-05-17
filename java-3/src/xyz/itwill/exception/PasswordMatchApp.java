package xyz.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 정수값을 입력받아 저장된 비밀번호와 비교하여 비교결과를 출력하는 프로그램을 작성하세요
public class PasswordMatchApp {
	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		
		System.out.print("비밀번호 입력 >> ");
		int password=sc.nextInt();
		
		if(password==1234) {
			System.out.println("[결과]입력된 비밀번호가 맞습니다.");
		} else {
			System.out.println("[결과]입력된 비밀번호가 다릅니다.");
		}
		
		sc.close();
		*/
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("비밀번호 입력 >> ");
			int password=sc.nextInt();//InputMismatchException 발생
			
			if(password!=1234) {//비밀번호가 맞지 않을 경우
				//인위적으로 예외 인스턴스를 생성하여 예외 발생 
				// => JVM에 의해 자동으로 예외 처리되는 예외가 아니므로 예외 처리하지 않으면 에러 발생 
				throw new PasswordMismatchException("[결과]입력된 비밀번호가 다릅니다.");
			}
			
			System.out.println("[결과]입력된 비밀번호가 맞습니다.");	
			
		} catch (InputMismatchException e) {
			System.out.println("[에러]숫자만 입력 가능합니다.");
		} catch (PasswordMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			//사용 자원을 제거하는 명령 >> 예외에 상관없이 무조건 실행 
			sc.close();			
		}
		
	}
}
