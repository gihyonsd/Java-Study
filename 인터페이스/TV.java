package interface_prac;

public class TV implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다."); //Controllable 인터페이스에 정의된 모든 추상 메서드를 구현해야 함
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다.");
		//반드시 public 이어야 한다. 자식은 부모보다 접근 범위가 좁으면 안되기 때문이다.
		//부모인 인터페이스의 메서드는 모두 public 이다.
		
	} 
	

}
