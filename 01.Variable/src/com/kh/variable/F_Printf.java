package com.kh.variable;

public class F_Printf {
	
	public void printfMethod() {
		System.out.println('a');   //a
		System.out.printf("%c\n", 'a');  //a
		
		System.out.printf("%c     %c\n", 'a', 'b');
		System.out.printf("%5c%5c", 'a', 'b');
		System.out.println();  // ����
		
		System.out.printf("%5d%-5d%5d\n", 100, 200, 300);
		System.out.printf("%s\t%f\t%10.2f\n", "ABC", 10.95, 10.975);
		
		// 10���� 100�� 10����,  8����, 16������ ��Ÿ����?
		System.out.printf("100�� 10�� : %5d 8�� : %5o 16�� : %5x\n", 100, 100, 100);
		
		// 10���� 100, 16���� 100, 8���� 100�� 10������ ��Ÿ����?
		System.out.println("100�� 10�� : " + 100);
		System.out.println(0x100);  // 0x 16���� ǥ��
		System.out.println(0100);   // 0   8���� ǥ��
		
		
	}

}
