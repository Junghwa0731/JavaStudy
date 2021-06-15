package com.kh.object_vs_objectArray.run;

import java.util.Scanner;

import com.kh.object_vs_objectArray.model.vo.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		// 1. 기본 자료형 배열
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println(arr);
		System.out.println(arr[0]);
		
		// arr의 자료형 : int[] -- > 레퍼런스 == 주소값을 가지는 변수
		// arr[index]의 자료형 : int --> 기본자료형 == 실제 값을 가지는 변수
		
		// 2. 객체 배열
		Book[] bk = new Book[3];
		 
		bk[0] = new Book();
		bk[1] = new Book();
		bk[2] = new Book();
		
		System.out.println(bk);
		System.out.println(bk[0]);
		System.out.println(bk[0].getPrice());
		
		// bk의 자료형 : Book[] --> 레퍼런스
		// bk[index]의 자료형 --> Book --> 레퍼런스
		// bk[index]의 자료형.getPrice()의 자료형 : int --> 변수
		
		
		// 도서 정보 입력
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < bk.length; i++) {
			System.out.println(i+1+ "번째 도서 정보 입력");
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			bk[i] = new Book(title, author, price, publisher);
		}
		
		// 도서 정보 출력
		for(int i = 0; i < bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		// 도서 검색
		System.out.print("검색할 책 제목 : ");
		String keyword = sc.nextLine();
		
		for(int i = 0; i < bk.length; i++) {
			if(bk[i].getTitle().equals(keyword)) {
				System.out.println(bk[i].information());
			}
		}
		
		// ---------------------------------------------------
		// 객체 배열 선언, 할당, 초기화
		Book[] bArr = {new Book("제목1", "저자1", 30000, "출판사1"),
				       new Book("제목2", "저자2", 40000, "출판사2"),
				       new Book("제목3", "저자3", 50000, "출판사3")};
		
		Book[] bArr2 = new Book[] {new Book("제목1", "저자1", 30000, "출판사1"),
			                       new Book("제목2", "저자2", 40000, "출판사2"),
			                       new Book("제목3", "저자3", 50000, "출판사3")};
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
