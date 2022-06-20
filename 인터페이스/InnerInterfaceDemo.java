package interface_prac;

class Icon {
	interface Touchable {
		void touch(); //중첩 인터페이스이다.
	}
}

public class InnerInterfaceDemo implements Icon.Touchable { //Icon 클래스의 멤버 Touchable 인터페이스를 의미한다.
	public void touch() {
		System.out.println("아이콘을 터치한다.");
	}

	public static void main(String[] args) {
		Icon.Touchable btn = new InnerInterfaceDemo();
		btn.touch();
	}

}
