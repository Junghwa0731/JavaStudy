package com.kh.chap01_Abstraction.run;

import com.kh.chap01_Abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// ���� (�ϳ��� �ڷ���,�ϳ��� ��)���� ������ ���α׷��� �Ѵٸ�/.
		String name1 = "�캰��";
		int kor1 = 100;
		int math1 = 99;
		int eng1 = 98;
		// > ���麴�� �л��� �ִٸ� ������ ������ �ʹ� �þ ������ �����
		
		// �迭(�ϳ����ڷ���, �������ǰ�) �� ������ ���α׷��� �Ѵٸ�?
		String[] name = {"�캰��", "�迵��"};
		int[] kor = {100, 70};
		int[] math = {99, 80};
		int[] eng = {98, 90};
		// > �������� ������������ٴ� ȿ���������� �� ���� ������ ���� �ȴٸ�?
		//   �ش� �л��� ������ ���� �� ������ �ε����� ã�� ���� �����־�� �ϸ� �Ǽ��� �߸� ����� ���� ��Ȳ
		
		// ���� Ŭ����(Ʋ)�� ����� ��ü�� ������ !
		// Ŭ����(Ʋ) �� ����� �ڹٿ����� ��ü ���·� ����� ���ؼ��� new �����ڸ� ���� Heap ������ ��ü�� ������
		Student lim = new Student();
		lim.name = "�캰��";
		lim.kor = 100;
		lim.math = 99;
		lim.eng = 98;
		// > ���� ������ ���� �� �ʱ�ȭ
		
		System.out.println(lim.name + "���� ���� ������ " + lim.kor + "�̰�, ���� ������ "
		                   + lim.math + "�̸�, ���� ������ " + lim.eng + "�Դϴ�.");
		// > ���� ������ ���� �� ��������
		// > �캰�� ��ü�� �����ϱ� ���ؼ��� lim �̶�� ���۷��� ������ �˸� �ȴ�
		
		Student dong = new Student();
		dong.name = "ȫ�浿";
		dong.kor = 30;
		dong.math = 40;
		dong.eng = 50;
		
		System.out.println(dong.name + "���� ���� ������ " + dong.kor + "�̰�, ���� ������ "
                + dong.math + "�̸�, ���� ������ " + dong.eng + "�Դϴ�.");
		
		
		// public���� �۾��� �ϰ� �Ǹ� �ܺο��� ���� �����Ͽ� ���� ���� ��ų �� ����
		// > ĸ��ȭ �۾��� �ʿ���
		
	}

	
}
