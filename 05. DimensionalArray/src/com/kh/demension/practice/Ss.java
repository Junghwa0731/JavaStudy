package com.kh.demension.practice;

import java.util.Scanner;

public class Ss {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice2(){
		int[][] arr = new int[4][4];
		
		int value = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = value--;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice3(){
		String[][] arr = new String[3][3];		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "("+ i + ", "+ j + ")"; 
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice4(){
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr[i].length -1; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void practice5(){
		
		while(true) {
			System.out.print("행 크기 : ");
			int row = sc.nextInt();
			System.out.print("열 크기 : ");
			int col = sc.nextInt();
			
			
			if((row >= 1 && row <= 10) && (col >= 1 && col <= 10)) {
				
				char[][] arr = new char[row][col];
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char)((int)(Math.random()*26)+65);
					}
				}
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
				
			
				
			} else {
				System.out.println("다시 입력하세요.");
				
			}
			
		}
		
	}
	
	public void practice6(){
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[j][i] + " ");
				}
			}
	}
	
	public void practice7(){
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		
		
		char[][] arr = new char[row][];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			int col = sc.nextInt();
			
			arr[i] = new char[col];
		}
		
		char value = 'a';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice8(){
		String[] Student = {"김예수", "김영해", "방명수", "손은희", "송종기", "윤은애", 
				 "이영지", "임시환", "전지연", "정중하", "차태연", "하이유"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = Student[count++];
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = Student[count++];
			}
		}
		
		System.out.println("==== 1분단 ====");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] +" ");
			}
			System.out.println();
		}
		
		System.out.println("==== 2분단 ====");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		String part = "";
		int numb = 0;
		String lr = "";
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				
			}
		}
	}



	


}
