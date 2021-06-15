package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;


public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student[] st = new Student[10];
		
		int index = 0;
		
		while(index < st.length) {
			
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				
				System.out.print("�������� : ");
				int kor = sc.nextInt();
				
				System.out.print("�������� : ");
				int eng = sc.nextInt();
				
				System.out.print("�������� : ");
				int math = sc.nextInt();
				sc.nextLine();
				
				st[index++] = new Student(grade, classroom, name, kor, eng, math);
				
			    
			    System.out.print("��� �߰� �Ͻðڽ��ϱ�?(Y/N) : ");
			    String str = sc.nextLine().toUpperCase();
			    
			    if(str.equals("N")) break;
				
			
		}
		
		for(int i = 0; i <index; i++) {
			int sum = st[i].getKor() + st[i].getEng() + st[i].getMath();
			System.out.println(st[i].information() + ", ��� : " + sum/3);
		}
		
	
		}
		
	

}
