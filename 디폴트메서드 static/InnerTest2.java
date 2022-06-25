package 내부클래스;

public class InnerTest2 {
	class InstanceInner {
		int iiv = 100;
		static int isv = 200; 
		final static int CONST = 300; // final상수는 선언가능
	}

	static class StaticInner {
	    int siv = 300;
		static int cv = 400; // static 클래스내부의 static 변수 선언 가능
	}

	InstanceInner iv = new InstanceInner(); // 인스턴스멤버끼리는 접근 가능
	static StaticInner cv = new StaticInner(); // 스태틱 멤버 끼리 접근 가능

	static void staticMethod() { // 스태틱 멤버는 인스턴스멤버 접근 가능
		// InstanceInner iobj1 = new InstanceInner(); //이너인스턴스 클래스 직접 접근 불가
		StaticInner sobj1 = new StaticInner();

		InnerTest2 oobj1 = new InnerTest2(); // 인스턴스 클래스는 외부클래스를 먼저 생성해야 접근 가능
		InstanceInner iobj2 = oobj1.new InstanceInner(); // 외부클래스 참조변수를 prefix로 붙이면 접근가능

	}

	void instanceMethod() { // 인스턴스 메서드에서는 인스턴스멤버와 스태틱 멤버 모두 접근 가능
		InstanceInner iobj3 = new InstanceInner(); // 외부클래스 참조 변수를 Prefix로 붙이면 접근 가능
		StaticInner sobj2 = new StaticInner(); // 외부클래스 참조변수를 Prefix로 붙이면 접근 가능
		// LocalInner lv = new LocalInner(); //로컬내부클래스는 외부에서 즙근 불가능
	}

	void t1Method() {// 메서드내에서 클래스를 포함 가능
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
