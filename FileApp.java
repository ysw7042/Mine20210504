package xyz.itwill.io;

import java.io.File;
import java.io.IOException;

//java.io.File : 파일 정보(파일경로, 파일권한, 파일크기 등)을 저장하기 위한 클래스
// => 폴더(디렉토리)도 파일로 인식되어 File 클래스로 표현 가능 
public class FileApp {
	public static void main(String[] args) throws IOException {
		//File(String pathname) : 시스템의 파일경로를 전달받아 File 인스턴스를 생성하는 생성자
		//시스템 파일경로(System File Path) : 시스템에 존재하는 파일 위치를 표현하기 위한 방법
		// => 절대경로 표현방법, 상대경로 표현방법
		//절대경로 : 최상위 폴더(드라이브)를 기존으로 파일의 위치를 표현하는 방법
		//상대경로 : 현재 실행 프로그램의 작업 폴더를 기준으로 파일의 위치를 표현하는 방법
		// => 이클립스에서는 프로젝트 폴더를 작업 폴더로 처리
		//Windows 운영체제에서는 폴더(드라이브)와 파일을 구분하기 위해 \ 기호 사용
		// => Java에서는 \ 기호를 Escape 문자를 표현하는 용도로 사용
		// => \ 기호를 문자로 표현하기 위해서는 \\ 형태로 표현
 		File fileOne=new File("c:\\data");
 		
 		//File.exists() : File 인스턴스에 저장된 파일경로에 파일이 존재하지 않을 경우 false를 
 		//반환하고 존재하는 경우 true를 반환하는 메소드
 		if(fileOne.exists()) {
 			System.out.println("c:\\data 폴더가 존재합니다.");
 		} else {
 			//File.mkdir() : File 인스턴스에 저장된 파일경로로 폴더를 생성하는 메소드
 			fileOne.mkdir();
 			System.out.println("c:\\data 폴더를 생성 하였습니다.");
 		}
 		System.out.println("===========================================================");
 		//File fileTwo=new File("c:\\data\\abc.txt");
 		//Windows 운영체제를 제외한 나머지 운영체제에서는 폴더(드라이브)와 파일을 구분하기
 		//위해 / 기호 사용 - 파일 경로를 표현할 때 \ 기호 대신 / 기호를 사용하는 것을 권장 
 		File fileTwo=new File("c:/data/abc.txt");
 		
 		if(fileTwo.exists()) {
 			System.out.println("c:\\data\\abc.txt 파일이 존재합니다.");
 		} else {
 			//File.createNewFile() : File 인스턴스에 저장된 파일경로로 파일를 생성하는 메소드
 			// => IOException 발생 - 예외 처리
 			fileTwo.createNewFile();
 			System.out.println("c:\\data\\abc.txt 파일을 생성 하였습니다.");
 		}
 		System.out.println("===========================================================");
 		//File fileThree=new File("c:/data/xyz.txt");
 		
 		//File(File parent, String child) 생성자 또는 File(String parent, String child) 생성자
 		// => 파일경로를 부모(폴더 경로)와 자식(파일명)으로 구분하여 File 인스턴스를 생성하는 생성자 
 		//File fileThree=new File(fileOne,"xyz.txt");
 		File fileThree=new File("c:/data","xyz.txt");
 		
 		if(fileThree.exists()) {
 			fileThree.delete();
 			System.out.println("c:\\data\\xyz.txt 파일을 삭제 하였습니다.");
 		} else {
 			System.out.println("c:\\data\\xyz.txt 파일이 존재하지 않습니다.");
 		}
 		System.out.println("===========================================================");
 		//파일경로를 상대경로 표현방법으로 전달하여 File 인스턴스 생성
 		// => 현재 작업 폴더는 기본적으로 프로젝트 폴더로 설정
 		// => [..] 형식으로 상위 폴더를 표현하며 [폴더(파일)] 형식으로 하위 폴더 또는 파일 표현
 		File fileFour=new File("src");
 		
 		if(fileFour.exists()) {
 			//File.toString() : File 인스턴스에 저장된 파일경로를 문자열로 변환하여 반환하는 메소드
 			//System.out.println("파일경로 = "+fileFour.toString());
 			System.out.println("파일경로 = "+fileFour);
 			
 			//File.getAbsolutePath() : File 인스턴스에 저장된 파일경로를 절대경로 표현방식의
 			//문자열로 변환하여 반환하는 메소드
 			System.out.println("파일경로 = "+fileFour.getAbsolutePath());
 		} else {
 			System.out.println("작업 폴더에 src 하위 폴더가 존재하지 않습니다.");
 		}
 		System.out.println("===========================================================");
 		File fileFive=new File("c:/");
 		
 		//File.isDirectory() : File 인스턴스에 저장된 파일경로기 폴더가 아닌 경우 false를
 		//반환하고 폴더인 경우 true를 반환하는 메소드
 		if(fileFive.isDirectory()) {
 			//File.listFiles() : File 인스턴스에 저장된 파일경로의 자식 파일 목록을 File
 			//인스턴스 배열로 반환하는 메소드
 			File[] subFiles=fileFive.listFiles();
 			
 			System.out.println(fileFive+" 폴더의 자식 목록 >>");
 			for(File file:subFiles) {
 		 		//File.isFile() : File 인스턴스에 저장된 파일경로가 파일이 아닌 경우
 		 		//false를 반환하고 파일인 경우 true를 반환하는 메소드
 				if(file.isFile()) {
 					System.out.println("파일 = "+file);
 				} else {
 					System.out.println("폴더 = "+file);
 				}
 			}
 		}
 		System.out.println("===========================================================");
	}
}










