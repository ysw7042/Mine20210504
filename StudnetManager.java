package xyz.itwill.util;

import java.util.ArrayList;
import java.util.List;

//학생정보를 관리(저장,변경,삭제,검색)하는 기능을 제공하기 위한 클래스 
// => BO(Business Object) 클래스 : Manager 클래스
public class StudnetManager {
	//다수의 학생정보를 저장하기 위한 콜렉션 필드
	private List<Student> studentList;//저장매체(DataSource)
	
	public StudnetManager() {
		studentList=new ArrayList<Student>();//포함관계
	}
	
	//학번을 전달받아 콜렉션 필드에 저장된 요소를 검색하여 요소의 위치값(첨자)을 반환하는 메소드
	// => 해당 학번의 학생정보가 콜렉션 필드에 저장된 요소가 아닌 경우 -1 반환
	// => 클래스 내부에서만 접근하여 사용 가능하도록 은닉화 처리
	private int getStudentIndex(int num) {
		int index=-1;
		
		//콜렉션 필드에 저장된 요소에 대한 반복 처리
		for(int i=0;i<studentList.size();i++) {
			//콜렉션 필드에 저장된 요소(학생정보)의 학번과 전달된 학번을 비교하여 같은 경우
			if(studentList.get(i).getNum()==num) {
				index=i;//요소의 첨자 저장
				break;
			}
		}

		return index;
	}
	
	//학생정보를 전달받아 콜렉션 필드의 요소로 저장(추가)하고 저장 결과를 반환하는 메소드
	// => false : 미저장, true : 저장
	// => 전달받은 학생정보의 학번이 이미 콜렉션 필드에 저장된 요소인 경우 저장되지 않도록 처리
	public boolean insertStudent(Student student) {
		if(getStudentIndex(student.getNum())!=-1) {//콜렉션 필드에 저장된 요소인 경우
			return false;
		}
		studentList.add(student);
		return true;
	}
	
	//학생정보를 전달받아 콜렉션 필드의 요소를 변경하고 변경 결과를 반환하는 메소드
	// => false : 미변경, true : 변경
	// => 전달받은 학생정보의 학번이 콜렉션 필드에 저장된 요소가 아닌 경우 변경되지 않도록 처리
	public boolean updateStudent(Student student) {
		int index=getStudentIndex(student.getNum());
		if(index==-1) {//콜렉션 필드에 저장된 요소가 아닌 경우
			return false;
		}
		studentList.set(index, student);
		return true;
	}
	
	//학번을 전달받아 콜렉션 필드의 요소를 삭제하고 삭제 결과를 반환하는 메소드
	// => false : 미삭제, true : 삭제
	// => 전달받은 학번이 콜렉션 필드에 저장된 요소가 아닌 경우 삭제되지 않도록 처리
	public boolean deleteStudent(int num) {
		int index=getStudentIndex(num);
		if(index==-1) {
			return false;
		}
		studentList.remove(index);
		return true;
	}
	
	//학번을 전달받아 콜렉션 필드의 요소를 검색하여 요소값(학생정보)을 반환하는 메소드
	// => 전달받은 학번이 콜렉션 필드에 저장된 요소가 아닌 경우 null 반환
	public Student selectStudent(int num) {
		int index=getStudentIndex(num);
		if(index==-1) {
			return null;
		}
		return studentList.get(index);
	}
	
	//콜렉션 필드에 저장된 모든 학생정보를 반환하는 메소드
	public List<Student> selectStudentList() {
		return studentList;
	}
}









