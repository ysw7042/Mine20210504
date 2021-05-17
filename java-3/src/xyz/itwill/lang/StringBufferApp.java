package xyz.itwill.lang;

//StringBuffer : 문자열을 저장하기 위한 클래스
// => 저장된 문자열의 문자를 직접 변환하는 메소드 제공
public class StringBufferApp {
	public static void main(String[] args) {
		//StringBuffer 클래스는 new 연산자로 생성자를 호출하여 인스턴스 생성
		StringBuffer sb=new StringBuffer("ABC");
		
		//StringBuffer.toString() : StringBuffer 인스턴스에 저장된 문자열을 반환하는 메소드
		System.out.println("sb.toString() = "+sb.toString());
		System.out.println("sb = "+sb);
		
		//StringBuffer 인스턴스를 String 인스턴스로 반환받아 저장
		String str=sb.toString(); 
		System.out.println("str ="+str);
		System.out.println("===================================================");
		
		//StringBuffer.append(Object o) : 전달값을 저장된 문자열에 추가하는 메소드 //가장 많이쓰인다.
		// => String 인스턴스에 저장된 문자열에 += 연산자를 사용한 효과와 동일
		sb.append("DEF");
		System.out.println("sb = "+sb);//.append는 기존의 문자열에 추가하는 메소드 
		System.out.println("===================================================");
		
		//StringBuffer.insert(int offset, Object o) : 저장된 문자열에서 원하는 위치(index)에 
		//전달값을 삽입하는 메소드		
		sb.insert(4, "X"); //4번째 index의 자리에 "X"를 추가
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
		
		//StringBuffer.deleteCharAt(int index) : 저장된 문자열에서 원하는 위치(index)의
		//문자를 제거하는 메소드
		sb.deleteCharAt(2);//
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
		
		//StringBuffer.delete(int start,int end) : 저장된 문자열에서 원하는 범위(start 문자
		//포함, end 문자 미포함)의 문자들을 제거하는 메소드
		sb.delete(4, 6);//4번째와 6번째 자리 제거 
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
		
		//StringBuffer.reverse(): 저장된 문자열의 문자를 반대로 바꾸어 저장하는 메소드
		sb.reverse();//반대로 바꾼다
		System.out.println("sb = "+sb);
		System.out.println("===================================================");
	}
}
