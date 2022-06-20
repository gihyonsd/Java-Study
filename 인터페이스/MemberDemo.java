package interface_prac;

public class MemberDemo {
	class Eagle extends Bird {
		public void move() {
			System.out.println("독수리가 난다.");
		}
		public void sound() {
			System.out.println("휘익");
		}
	}
	Eagle e = new Eagle(); //MemberDemo 클래스의 멤버 필드이다.
	
	public static void main(String[] args) {
		
	}

}
