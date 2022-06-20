package interface_prac;

public interface Controllable {
	default void repair() {
		show("장비를 수리한다."); //디폴트 메서드이다.
	}
	
	static void reset() {
		System.out.println("장비를 초기화 한다.");
	}
	
	private void show(String s) {
		System.out.println(s); 
	}
	
	void turnOn();
	void turnOff(); //둘다 추상 메서드 이다.
}
