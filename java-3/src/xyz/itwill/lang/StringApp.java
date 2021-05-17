package xyz.itwill.lang;

//String : 문자열을 저장하기 위한 클래스
// => 문자열을 제어할 수 있는 기능 제공 - 저장된 문자열을 변환하는 메소드 미존재
// => 내부적으로 String 인스턴스의 문자열은 byte 배열의 요소에 문자로 저장되어 처리
public class StringApp {
	public static void main(String[] args) {
		//" " 기호를 이용하여 String 인스턴스 표현 가능
		String str1="ABC";//String 인스턴스 생성
		
		//String.toString() : String 인스턴스에 저장된 문자열을 반환하는 메소드 
		System.out.println("str1.toString() = "+str1.toString());
		//참조변수를 출력할 경우 자동으로 toString() 메소드 호출
		System.out.println("str1 = "+str1);
		System.out.println("============================================================");
		//" " 기호를 이용하여 String 인스턴스를 표현할 경우 동일한 문자열을 저장한 
		//인스턴스가 존재하면 기존 인스턴스를 재사용
		String str2="ABC";//기존 인스턴스 재사용
		
		//참조변수를 관계연산자로 비교할 경우 참조변수에 저장된 인스턴스의 해쉬코드(HashCode)를
		//비교하여 결과 제공
		// => String 인스턴스에 저장된 문자열을 비교하는 것이 아니라 인스턴스의 위치를 비교
		// => 관계연산자로 String 인스턴스에 저장된 문자열 비교 불가능
		if(str1==str2) {
			System.out.println("str1과 str2에 저장된 인스턴스의 해쉬코드가 같습니다.");
		} else {
			System.out.println("str1과 str2에 저장된 인스턴스의 해쉬코드가 다릅니다.");
		}
		System.out.println("============================================================");
		//new 연산자로 생성자를 호출하여 인스턴스를 생성하면 무조건 새로운 인스턴스 생성
		String str3=new String("ABC");
		
		if(str1==str3) {
			System.out.println("str1과 str3에 저장된 인스턴스의 해쉬코드가 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 인스턴스의 해쉬코드가 다릅니다.");
		}
		System.out.println("============================================================");
		//String.equals(String s) : 저장된 문자열과 전달받은 문자열을 서로 비교하여 다르면
		//false를 반환하고 같으면 true를 반환하는 메소드
		if(str1.equals(str3)) {
			System.out.println("str1과 str3에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str3에 저장된 문자열이 다릅니다.");
		}
		System.out.println("============================================================");
		String str4="abc";
		//equals() 메소드는 대소문자를 구분하여 비교 결과 반환
		if(str1.equals(str4)) {
			System.out.println("str1과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("============================================================");
		//String.equalsIgnoreCase(String s) : 저장된 문자열과 전달받은 문자열을 대소문자
		//구분없이 서로 비교하여 다르면 false를 반환하고 같으면 true를 반환하는 메소드
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1과 str4에 저장된 문자열이 같습니다.");
		} else {
			System.out.println("str1과 str4에 저장된 문자열이 다릅니다.");
		}
		System.out.println("============================================================");
		//String.compareTo(String s) : 저장된 문자열과 전달받은 문자열을 비교하여 저장된
		//문자열이 크면 양수를 반환하고 같으면 0을 반환하고 전달받은 (매개변수)문자열이 크면
		//음수를 반환하는 메소드 - 대소문자 구분 
		//String.compareToIgnoreCase(String s) : 구분없이 비교하여 다르면 false 같으면 true
		if(str1.compareTo(str4)>0) {
			System.out.println("str1에 저장된 문자열이 str4에 저장된 문자열보다 큽니다." );
		} else if(str1.compareTo(str4)==0){
			System.out.println("str1에 저장된 문자열과 str4에 저장된 문자열이 같습니다." );
		} else {
			System.out.println("str1에 저장된 문자열이 str4에 저장된 문자열보다 작습니다." );
		}
		System.out.println("============================================================");
		//문자열은 내부적으로 byte 배열로 저장되므로 첨자(Index)를 이용하여 처리하는 메소드 존재
		String str5="ABCDEFG";
		
		//String.length() : 저장된 문자열의 문자 갯수를 반환하는 메소드
		System.out.println("문자열의 문자 갯수 = "+str5.length());
		System.out.println("============================================================");
		//String.charAt(int index) : 전달받은 첨자 위치의 문자를 반환하는 메소드
		//IndexOutOfBoundsException 문자 갯수가 벗어나면 에러가 발생될 수 있음 
		System.out.println("문자열의 두번째 위치의 문자 = " + str5.charAt(1));
		System.out.println("============================================================");
		//String.indexOf(String str) : 전달된 문자열을 검색하여 저장된 위치의 시작첨자를 반환하는 메소드 
		// => 검색 문자열이 없는 경우 -1 반환
		System.out.println("A 문자열의 저장 위치(Index) = "+str5.indexOf("A"));
		System.out.println("EFG 문자열의 저장 위치(Index) = "+str5.indexOf("EFG"));
		System.out.println("X 문자열의 저장 위치(Index) = "+str5.indexOf("X"));
		System.out.println("============================================================");
		String str6 ="Java Programming";
		
		System.out.println("str6 = "+str6);
		//String.toUpperCase() : 저장된 문자열을 모두 대문자로 변환하여 반환하는 메소드
		System.out.println("str6(대문자) = "+str6.toUpperCase());
		//String.toLowerCase() : 저장된 문자열을 모두 소문자로 변환하여 반환하는 메소드
		System.out.println("str6(소문자) = "+str6.toLowerCase());
		System.out.println("============================================================");
		String str7 = "   홍길동    ";
		System.out.println("입력된 이름은 ["+str7+"]입니다.");
		//String.trim() : 저장된 문자열의 앞과 뒤에 존재하는 모든 공백을 제거하여 반환하는 메소드(중간의 공백은 제거 되지 않음) 
		System.out.println("입력된 이름은 ["+str7.trim()+"]입니다.");
		System.out.println("============================================================");
		String str8 = "  임  꺽  정  ";
		
		System.out.println("입력된 이름은 ["+str8+"]입니다.");
		//String.replace(String regEx, String replacement) : 저장된 문자열에서 검색 문자열
		//(정규표현식)을 찾아 치환 문자열로 변경하여 반환하는 메소드
		System.out.println("입력된 이름은 ["+str8.replace(" ", "").replace("꺽", "걱")+"]입니다.");
		System.out.println("============================================================");
		String str9 = "010-1234-5678";
		System.out.println("전화번호 = "+str9);
		
		//String.split(String regEx) : 저장된 문자열을 전달받은 구분 문자열(정규표현식)로
		//분리하여 문자열 배열로 반환하는 메소드
		// => 정규표현식의 메타문자는 \\를 이용하여 Escape 문자로 표현
		String[] array = str9.split("-");
		//String[] array = str9.split("\\*");
		
		System.out.println("전화번호 앞부분 = "+array[0]);
		System.out.println("전화번호 중간부분 = "+array[1]);
		System.out.println("전화번호 뒷부분 = "+array[2]);
		System.out.println("============================================================");
		//String.subString(int beginIndex, Integer endindex) : 저장된 문자열에서 시작첨자(문자
		//포함)부터 종료첨자(문자 미포함)까지의 문자열을 분리하여 반환하는 메소드
		System.out.println("전화번호 앞부분 = "+str9.substring(0, 3));
		System.out.println("전화번호 중간부분 = "+str9.substring(4, 8));
		//System.out.println("전화번호 뒷부분 = "+str9.substring(9, 13));
		//시작첨자만 전달할 경우 시작첨자의 문자부터 마지막 문자까지 분리하여 반환 
		System.out.println("전화번호 뒷부분 = "+str9.substring(9));
		System.out.println("============================================================");
		
	}
}

