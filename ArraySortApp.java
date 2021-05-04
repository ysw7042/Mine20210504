package oop;

import java.util.Arrays;

//배열의 요소값을 오름차순 정렬하여 출력하는 프로그램을 작성하세요.
public class ArraySortApp {
	public static void main(String[] args) {
		int[] array={30,50,10,40,20};
		
		//절차 지향 프로그램
		/*
		System.out.print("정렬 전 >> ");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		//배열의 요소값들을 선택 정렬 알고리즘을 이용하여 오름차순 정렬
		for(int i=0;i<array.length-1;i++) {//비교 요소의 첨자 : 처음~마지막-1
			for(int j=i+1;j<array.length;j++) {//피비교 요소의 첨자 : 비교+1~마지막
				//요소값을 비교하여 요소에 저장된 값을 서로 치환
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.print("정렬 후 >> ");
		for(int num:array) {
			System.out.print(num+" ");
		}
		System.out.println();
		*/
		
		//객체 지향 프로그램
		System.out.print("정렬 전 >> ");
		//Arrays : 배열에 대한 다양한 기능(메소드)을 제공하는 클래스
		//Arrays.toString(Object[] array) : 배열 정보를 전달받아 배열의 요소값을 문자열로 
		//변환하여 반환하는 메소드  
		System.out.println(Arrays.toString(array));//, 로 반환하는 형태이기 때문에 다른 형태로 출력이 불가능하다.
		
		//Arrays.sort(Object[] array) : 배열 정보를 전달받아 배열의 요소값을 정렬하는 메소드
		Arrays.sort(array);//sort 메소드가 알아서 정렬을 시켜준다
		
		System.out.print("정렬 후 >> ");
		System.out.println(Arrays.toString(array));
		
	}
}




