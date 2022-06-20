package interface_prac;
interface Portable {
	void inMyBag();
}
public class Notebook extends Computer implements Portable {
	public void inMyBag() {
		System.out.println("노트북은 가방에 있다.");
		//Portable 인터페이스의 메서드를 구현한다.
	}
	
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}
	
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	} //Computer 클래스의 메서드를 오버라이딩 한다.
	
	public static void main(String[] args) {
		Notebook n = new Notebook();
		
		n.turnOn();
		n.turnOff();
		n.inMyBag();
	}

}
