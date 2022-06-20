package interface_prac;
interface Movable {
	void move(int x);
}

class Car implements Movable {
	private int pos = 0;
	
	public void move(int x) {
		pos += x; //Movable 인터페이스의 추상 메서드인 move()의 구현체이다.
	}
	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}
}
public class MovableDemo {

	public static void main(String[] args) {
		Movable m = new Car();
		
		m.move(5); 
		//m.show(); Movable 타입에는 show() 메서드가 없기 때문에 호출할 수 없다.
		
		Car c = (Car)m; //m이 참조하는 실제 객체가 Car 타입이므로 강제 타입 변환할 수 있다.
		c.move(10);
		c.show();

	}

}
