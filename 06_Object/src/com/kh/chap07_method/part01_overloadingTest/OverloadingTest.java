package com.kh.chap07_method.part01_overloadingTest;


// ---------------------< 5/25 ȭ������ ���� >----------------

public class OverloadingTest {
	// �����ε� �׽�Ʈ
	
	public void test() {}
	
	public void test(int a) {}
	
	public void test(int a, String s) {}
	
	public void test(String s, int a) {}
	
	public void test(int a, int b) {}
	
	/*public void test(int c, int d) {
	  
	 }*/  //  > ���� �߻� : �Ű�������� �����ϰ� �ڷ����� Ÿ��/����/������ �ٸ��� �ۼ� �Ǿ�� ��
	
	public void test(int a, int b, String s) {}
	
	/*public int test(int a, int b, String s) {
		return 0;
	}*/ // > ���� �߻� : ��ȯ���� �ٸ��ٰ� �����ε� ���� ���� ����.
	
	/*private void test(int a, int b, String s) {}
	*/ //  > ���� �߻� : ���� �����ڰ� �ٸ��ٰ� �����ε� ���� ���� ����.
	
	public static void main(String[] args) {
		OverloadingTest o1 = new OverloadingTest();
		o1.test();
		o1.test(10);
		o1.test(10, "abc");
		o1.test("abc", 10);
		o1.test(10, 20);
		o1.test(10, 20, "abc");
		System.out.println();
		// > �����ε��� �޼ҵ���� ���� ��� �߻�
		//   ���� ������, ��ȯ������ �����ϰ� �Ű������� �ڷ����� ���� ������ �ٸ��� �ۼ��Ǿ�߸� ��
		//   ���� java api ��ɵ��� �����ε� �Ǿ� ����
		
	}

}
