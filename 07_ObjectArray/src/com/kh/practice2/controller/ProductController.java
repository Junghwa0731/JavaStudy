package com.kh.practice2.controller;

import java.util.Scanner;


import com.kh.practice2.model.vo.Product;

public class ProductController {
	
	private Product[] pro = null;
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	{     //< {   }  �ʵ�ο��� �ʱ�ȭ ����. �� = null�� �ٷ�  new Product[10] �ʱ�ȭ ���� Ŭ��������
	        pro = new Product[10];
	}
	public void mainMenu() {
		int menu = 0;
		
		do {
			System.out.println("===== ��ǰ ���� �޴� =====");
			System.out.println("1. ��ǰ ���� �߰�");
			System.out.println("2. ��ǰ ��ü ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ ���� : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				 productInput();
			     break;
			case 2: 
			     productPrint();
			     break;
			case 9:
				System.out.println("���α׷��� ����Ǿ����ϴ�");
				return;
			default:
				System.out.println("�߸� �Է� �Ͽ����ϴ�. �ٽ� �Է����ּ���."); 
				break;
			}
			
		} while(menu != 9);
	}
	
	public void productInput() {
		
			System.out.print("��ǰ ��ȣ : ");
			int pId = sc.nextInt();
			sc.nextLine();
			
			System.out.print("��ǰ�� : ");
			String pName = sc.nextLine();
			
			System.out.print("��ǰ ���� : ");
			int price = sc.nextInt();
			
			System.out.print("��ǰ ���� : ");
			double tax = sc.nextDouble();
			
			pro[count] = new Product(pId, pName, price, tax);
			
		
		
		
	}
	
	public void productPrint() {
		for(int i= 0; i < count; i++) {
			System.out.println(pro[i].information());
		}
	}

}
