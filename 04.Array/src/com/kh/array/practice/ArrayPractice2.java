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
		 System.out.print("���� ���� : ");
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
		 String[] arr= {"���", "��", "����", "������", "����"};
		 
		 System.out.println(arr[1]);
		 
	 }
	 
	 public void practice5(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("���ڿ� : ");
		 String st = sc.nextLine();
		 
		 System.out.print("���� : ");
		 char ch = sc.next().charAt(0);
		 
		 char arr[] = new char[st.length()];
		 
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = st.charAt(i);
		}
		 int count = 0;
		 System.out.print(st + "�� " + ch + "�� �����ϴ� ��ġ(�ε���) : ");
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count++;
			}
		}
		 System.out.println();
		 System.out.println(ch +" ���� : " + count);
	 }
	 
	 public void practice6(){
		 String[] arr= {"��", "ȭ", "��", "��", "��", "��", "��"};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("0 ~ 6 ���� ���� �Է� : ");
		 int num = sc.nextInt();
		 
		 if (num >= 0 && num <= 6) {
			 System.out.println(arr[num] + "����");
		 } else {
			 System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		 }
	 }
	 
	 public void practice8(){
		 Scanner sc = new Scanner(System.in);
		 
		 while(true) {
			 System.out.print("���� : ");
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
				 System.out.println("�ٽ� �Է�������.");
			 }
		 }
	 }
	 
	 public void practice9(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("ġŲ �̸��� �Է��ϼ��� :  ");
		 String st = sc.nextLine();
		 
		 String arr[] = {"���", "�Ķ��̵�", "�Ѹ�Ŭ"};
		 int i = 0;
		 for (; i < arr.length; i++) {
			if(arr[i].equals(st)) {
				break;
			}
		 }
		 if(i < arr.length) {
			 System.out.println(st + "ġŲ ��� ����");
		 } else {
			 System.out.println(st + "ġŲ�� ���� �޴��Դϴ�.");
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
		 System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
		 System.out.print("���ڿ� : ");
		 String num = sc.nextLine();
		 
		 char arr[] = new char[num.length()];
		 int count = 0;
		 for (int i = 0; i < arr.length; i++) {
			 arr[i] = num.charAt(i);
			 count++;
		}
		 System.out.print("���ڿ��� �ִ� ���� : ");
		 for (int i = 0; i < arr.length; i++) {
			if(i < arr.length-1) {
				System.out.print(arr[i] + ", ");
			} else {
				System.out.print(arr[i]);
			}
		}
		 System.out.println();
		 System.out.print("���� ���� : " + count);
		 
	 }
	 
	 public void practice15(){
         Scanner sc = new Scanner(System.in);
		 
		 System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		 int num = sc.nextInt();
		 sc.nextLine();
		 
		 String arr[] = new String[num];
		 
		 for (int i = 0; i < arr.length; i++) {
			 System.out.print(i+1+"��° ���ڿ� : ");
			 arr[i] = sc.nextLine();
		}
		
		 while(true) {
			 System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			 String yes = sc.nextLine().toUpperCase();
			 
			 if(yes.equals("Y")) {
				 System.out.print("�� ���� �Է��ϰ� ���� ����: ");
				 int num2 = sc.nextInt();
				 sc.nextLine();
				 
				 String newArr[] = new String[arr.length + num2];
				
				 for (int i = 0; i < newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					} else {
						System.out.print(i+1+"��° ���ڿ� : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
			 } else if (yes.equals("N")) {
				 break;			 
			 } else {
				 System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			 }
		 }
		 
		
		System.out.println(Arrays.toString(arr));
		
		 
		 
		 
	 }






}
