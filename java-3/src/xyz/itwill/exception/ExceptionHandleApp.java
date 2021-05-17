package xyz.itwill.exception;

public class ExceptionHandleApp {
		public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		
		//예외가 발생 가능한 명령을 try 영역에 작성
		// => 에외가 발생될 경우 예외 관련 인스턴스 생성 
		// => Catch 구문에서 예외 인스터스를 전달받아 예외 처리 
		try {
			//배열의 요소 표현시 첨자를 잘못 사용한 경우 ArrayIndexOutOfBoundsException 발생
			// => ArrayIndexOutOfBoundsException 발생된 경우 JVM에 의해 자동으로 예외 처리
			// => JVM의 예외처리는 예외가 발생된 경로를 상세하게 표현하여 출력 - 개발자 중심
			// => 사용자 중심의 프로그램을 작성하기 위해 직접 예외 처리하는 것을 권장
			for(int i=0;i<=array.length;i++) {
				System.out.println("array["+i+"] = "+array[i]);
			}
			
			//예외가 발생된 명령 하단에 존재하는 명령은 미실행
			// => 예외가 발생되면 catch 구문으로 스레드(프로그램의 실행 흐름) 이동
			System.out.println("[메세지]프로그램이 정상적으로 실행 되었습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {//예외 인스턴스를 전달받아 참조변수에 저장
			//catch 영역에 설정된 예외 클래스에 대한 예외 처리 명령 작성 - 메세지 출력
			//예외 처리 명령 - 메세지 출력
			//System.out.println("[에러]프로그램 실행에 예기치 못한 오류가 발생되었습니다.");
			
			//Throwable.getMessage() : 예외 인스턴스의 오류 메세지를 반환하는 메소드 
			//System.out.println("예외 메세지 = "+e.getMessage());
			
			//Throwable.printStackTrace() : 예외가 발생된 경로를 상세하게 표현하여 출력하는 메소드
			e.printStackTrace(); 
		}finally {
			//예외와 상관없이 무조건 실행될 명령을 작성하는 영역 : 생략 가능
			// => 자원에 대한 제거 명령을 구현할 경우 사용
			System.out.println("[메세지]무조건 실행되는 명령 ");
		}
	}
}
