package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice2 {
	
	 public void practice1(){
		 int[] arr = new int[10];
		
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = i+1;
			
		}
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		 
	 }
	 
	 public void practice2(){
		 int[] arr = new int[10];
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = arr.length - i;
			
		}
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	 }
	 
	 public void practice3(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("양의 정수 : ");
		 int num = sc.nextInt();
		 
		 int[] arr = new int[num];
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = i + 1;
		}
		 
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	 }
	 
	 public void practice4(){
		 String[] arr= {"사과", "귤", "포도", "복숭아", "참외"};
		 
		 System.out.println(arr[1]);
		 
	 }
	 
	 public void practice5(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("문자열 : ");
		 String st = sc.nextLine();
		 
		 System.out.print("문자 : ");
		 char ch = sc.next().charAt(0);
		 
		 char arr[] = new char[st.length()];
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = st.charAt(i);
		}
		 int count = 0;
		 System.out.print(st + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		 System.out.println();
		 System.out.println(ch +" 개수 : " + count);
	 }
	 
	 public void practice6(){
		 String[] arr= {"월", "화", "수", "목", "금", "토", "일"};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("0 ~ 6 사이 숫자 입력 : ");
		 int num = sc.nextInt();
		 
		 if (num >= 0 && num <= 6) {
			 System.out.println(arr[num] + "요일");
		 } else {
			 System.out.println("잘못 입력하셨습니다.");
		 }
	 }
	 
	 public void practice8(){
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("정수 : ");
			 int num = sc.nextInt();
			 
			 int arr[] = new int[num];
			 int count = 1;
			 
			 if(num >= 3 && num % 2 == 1) {
				 for (int i = 0; i < arr.length/2; i++) {
					 arr[i] = count;
					 count++;
				}
				 for (int i = arr.length/2; i < arr.length; i++) {
					 arr[i] = count;
					 count--;
				}
				 for (int i = 0; i < arr.length; i++) {
					if(i < arr.length - 1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.print(arr[i]);
					}
				} break;
				 
				 
			 } else {
				 System.out.println("다시 입력히세요.");
			 }
		 }
	 }
	 
	 public void practice9(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("치킨 이름을 입력하세요 :  ");
		 String st = sc.nextLine();
		 
		 String arr[] = {"양념", "후라이드", "뿌링클"};
		 int i = 0;
		 for (; i < arr.length; i++) {
			if(arr[i].equals(st)) {
				break;
			}
		 }
		 if(i < arr.length) {
			 System.out.println(st + "치킨 배달 가능");
		 } else {
			 System.out.println(st + "치킨은 없는 메뉴입니다.");
		 }
		 
	 }
	 
	 public void practice10(){
		 int arr[] = new int[10];
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = (int)(Math.random()*10)+1;
			 System.out.print(arr[i] + " ");
		}
		 
	 }
	 
	 public void practice11(){
		 int arr[] = new int[10];
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = (int)(Math.random()*10)+1;
			 for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		 
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	 }
	 
	 public void practice12(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("주민등록번호(-포함) : ");
		 String num = sc.nextLine();
		 
		 char arr[] = new char[num.length()];
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = num.charAt(i);
		}
		 
		 char copy[] = arr.clone();
		 
		 for (int i = 0; i < copy.length; i++) {
			if(i < 8) {
				copy[i] = arr[i];
			} else {
				copy[i] = '*';
			}
		}
		 for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
		 System.out.println();
		 for (int i = 0; i < copy.length; i++) {
			 System.out.print(arr[i]);
		}
	 }
	 
	 public void practice13(){
		 int[] arr = new int[6];
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = (int)(Math.random()*50)+1;
			 
			 for (int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		 
		 for (int i = 0; i < arr.length; i++) {
			Arrays.sort(arr);
		}
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	 }
	 
	 public void practice14(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("문자열 : ");
		 String num = sc.nextLine();
		 
		 char arr[] = new char[num.length()];
		 int count = 0;
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = num.charAt(i);
			 count++;
		}
		 System.out.print("문자열에 있는 문자 : ");
		 for (int i = 0; i < arr.length; i++) {
			if(i < arr.length-1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		 System.out.println();
		 System.out.print("문자 개수 : " + count);
		 
	 }
	 
	 public void practice15(){
         Scanner sc = new Scanner(System.in);
		 
		 System.out.print("배열의 크기를 입력하세요 : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 String arr[] = new String[num];
		 
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(i+1+"번째 문자열 : ");
			 arr[i] = sc.nextLine();
		}
		
		 while(true) {
			 System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			 String yes = sc.nextLine().toUpperCase();
			 
			 if(yes.equals("Y")) {
				 System.out.print("더 값을 입력하고 싶은 개수: ");
				 int num2 = sc.nextInt();
				 sc.nextLine();
				 
				 String newArr[] = new String[arr.length + num2];
				
				 for (int i = 0; i < newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.print(i+1+"번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
			 } else if (yes.equals("N")) {
				 break;			 
			 } else {
				 System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			 }
		 }
		 
		
		System.out.println(Arrays.toString(arr));
		
		 
		 
		 
	 }






}
