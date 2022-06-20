package interface_prac;
import interface_prac.*;


public class ControllableDemo {

	public static void main(String[] args) {
//		TV tv = new TV();
//		Computer com = new Computer();
//		
//		tv.turnOn();
//		tv.turnOff();
//		tv.repair();
//		
//		com.turnOn();
//		com.turnOff();
//		com.remoteOn();
//		com.remoteOff();
//		com.repair(); //Controllable 인터페이스로 TV 객체와 Computer 객체를 동작하는 방법이 같다.
//		
//		Controllable.reset();// 정적 메서드는 인터페이스로 직접 호출해야한다.
		Controllable[] controllable = { new TV(), new Computer() };
		//인터페이스 타입의 배열 변수에 구현 객체 배열을 대입한다.
		
		for(Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair(); //인터페이스 타입 변수를 사용해 구현 객체의 메서드를 호출한다.
		}
		Controllable.reset();
		
	}

}
