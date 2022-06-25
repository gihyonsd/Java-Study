package ����Ŭ����;

public class InnerTest2 {
	class InstanceInner {
		int iiv = 100;
		static int isv = 200; 
		final static int CONST = 300; // final����� ���𰡴�
	}

	static class StaticInner {
	    int siv = 300;
		static int cv = 400; // static Ŭ���������� static ���� ���� ����
	}

	InstanceInner iv = new InstanceInner(); // �ν��Ͻ���������� ���� ����
	static StaticInner cv = new StaticInner(); // ����ƽ ��� ���� ���� ����

	static void staticMethod() { // ����ƽ ����� �ν��Ͻ���� ���� ����
		// InstanceInner iobj1 = new InstanceInner(); //�̳��ν��Ͻ� Ŭ���� ���� ���� �Ұ�
		StaticInner sobj1 = new StaticInner();

		InnerTest2 oobj1 = new InnerTest2(); // �ν��Ͻ� Ŭ������ �ܺ�Ŭ������ ���� �����ؾ� ���� ����
		InstanceInner iobj2 = oobj1.new InstanceInner(); // �ܺ�Ŭ���� ���������� prefix�� ���̸� ���ٰ���

	}

	void instanceMethod() { // �ν��Ͻ� �޼��忡���� �ν��Ͻ������ ����ƽ ��� ��� ���� ����
		InstanceInner iobj3 = new InstanceInner(); // �ܺ�Ŭ���� ���� ������ Prefix�� ���̸� ���� ����
		StaticInner sobj2 = new StaticInner(); // �ܺ�Ŭ���� ���������� Prefix�� ���̸� ���� ����
		// LocalInner lv = new LocalInner(); //���ó���Ŭ������ �ܺο��� ��� �Ұ���
	}

	void t1Method() {// �޼��峻���� Ŭ������ ���� ����
		class LocalInner {
			int iv = 500;
		}
		LocalInner lv1 = new LocalInner();
	}

	public static void main(String[] args) {
		System.out.println("static cv = " + StaticInner.cv);
		System.out.println("InstanceInner.CONST = " + InstanceInner.CONST);
		System.out.println("InstatnceInner.isv = " + InstanceInner.isv);

		System.out.println();
		InnerTest2 itlv1 = new InnerTest2();
		InstanceInner iiv1 = itlv1.new InstanceInner();
		System.out.println("iiv1.i1v = " + iiv1.iiv);
		System.out.println("iiv1.isv = " + iiv1.isv);
		System.out.println("iiv1.CONST = " + iiv1.CONST);

		System.out.println("static cv = " + StaticInner.cv);
//		System.out.println("static siv = " + StaticInner.siv);
//		StaticInner siv1 = itlv1.new StaticInner();
//		System.out.println("static iv = " + siv1.iv);
		System.out.println("static siv = " +cv.siv);

	}
}
