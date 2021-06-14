package com.kh.chap07_method.part02_methodTest.run;

import java.util.Arrays;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap07_method.part02_methodTest.controller.NonStaticMethod;
import com.kh.chap07_method.part02_methodTest.controller.StaticMethod;

public class Run {

	public static void main(String[] args) {
		NonStaticMethod test = new NonStaticMethod();
		
		// 1. �Ű������� ��ȯ���� ���� �޼ҵ� ȣ��
		test.method1();
		
		// 2. �Ű������� �����ȯ���� �ִ� �޼ҵ� ȣ��
		//    �� ��ȯ���� ��ġ�ϴ� �ڷ����� ������ �޼ҵ� ���� ���� ��ȯ ���� ��Ƽ� ���
		String str = test.method2();
		System.out.println(str);
		
		// 3. �Ű������� �ְ� ��ȯ���� ���� �޼ҵ� ȣ��
		test.method3(20, 10);
		// > �ݵ�� ���� ���� �Ű������� Ÿ�԰� ������ ������ ��ġ�ϴ� ���� �Ѱ��־�� ��
		
		// 4. �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ� ȣ��
		int num1 = 3;
		int num2 = 5;
		int result = test.method4(num1, num2);
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
		System.out.println("result : " + result);
		
		// 5. �Ű������� ��ȯ���� �迭�� ���
		int[] arr = {1, 2, 3, 4, 5};
		int[] returnArr = test.method5(arr);
	    System.out.println(Arrays.toString(arr));
	    System.out.println(Arrays.toString(returnArr));
	    
	    // 6. �Ű������� ��ȯ���� ��ü�� ���
	    Person p = new Person();
	    p.setName("�캰��");
	    p.setAge(20);
	    Person returnPerson = test.method6(p);
	    System.out.println(p.information());
	    System.out.println(returnPerson.information());
	    
	    // 7. ��������
	    System.out.println(test.method7(1));
	    System.out.println(test.method7(1,2));
	    System.out.println(test.method7(1,2,3));
	    System.out.println(test.method7(1,2,3,4));
	    
	    // -------------------------------------------------
	    // StaticMethod�� ��� ��ü �������� �ʰ� ȣ��
	    // �̹� ���α׷� ���� �� Static ������ �޼ҵ尡 ���� �Ǿ� �ֱ� ����
	    // Ŭ������, �޼ҵ��();
	    StaticMethod.method1();
	    
	    System.out.println("10�� 20�� ���� "+ StaticMethod.method2() + "�Դϴ�.");
	    
	    StaticMethod.method3("�캰��");
	    
	    System.out.println(StaticMethod.method4("�캰��"));

	}

}
