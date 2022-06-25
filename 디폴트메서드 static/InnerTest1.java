package ����Ŭ����;

class InnerTest1 {
	class InstanceInner {
		int iv = 100;
		static int stcv = 200;
		final static int fsv = 200;
	}
	static class StaticInner {
		int stiv = 200;
		static int stcv = 300; //����ƽ Ŭ���������� ����ƽ ��� ���� ����
	}
	void timethod() {
		class LocalInner {
			int loiv = 400;
			static int stcv = 500; //����ƽ ������ ���� �Ұ�
			//System.out.println(loiv);
			final static int fsloiv = 600; //���̳ν���ƽ�� �Ǽ��μ� ���� ����
		}
		int i = LocalInner.fsloiv; //ok
		System.out.println("tiMethod loiv = " +LocalInner.fsloiv); //���� ����Ŭ������ �޼��� �������� ��밡��
		System.out.println("tiMethod i = " + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("InstanceInner.fsv = "+InstanceInner.fsv);
		System.out.println("StaticInner.stcv = "+StaticInner.stcv);
		
		//System.out.println(LocalInner.fsloiv); ���� ����Ŭ������ �޼��� �������� ��� ����
		InnerTest1 it1 = new InnerTest1();
		it1.timethod();
	}

}
