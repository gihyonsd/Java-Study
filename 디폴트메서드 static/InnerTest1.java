package 내부클래스;

class InnerTest1 {
	class InstanceInner {
		int iv = 100;
		static int stcv = 200;
		final static int fsv = 200;
	}
	static class StaticInner {
		int stiv = 200;
		static int stcv = 300; //스태틱 클래스에서만 스태틱 멤버 정의 가능
	}
	void timethod() {
		class LocalInner {
			int loiv = 400;
			static int stcv = 500; //스태틱 변수를 선언 불가
			//System.out.println(loiv);
			final static int fsloiv = 600; //파이널스태틱은 실수로서 선언 가능
		}
		int i = LocalInner.fsloiv; //ok
		System.out.println("tiMethod loiv = " +LocalInner.fsloiv); //로컬 내부클래스는 메서드 내에서만 사용가능
		System.out.println("tiMethod i = " + i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("InstanceInner.fsv = "+InstanceInner.fsv);
		System.out.println("StaticInner.stcv = "+StaticInner.stcv);
		
		//System.out.println(LocalInner.fsloiv); 로컬 내부클래스는 메서드 내에서만 사용 가능
		InnerTest1 it1 = new InnerTest1();
		it1.timethod();
	}

}
