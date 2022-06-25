package sec06.other;
abstract class Controller {
	boolean power;
	void show() {
	}
}
class TV1 extends Controller {
	TV1(boolean power) {
		this.power = power;
	}
	void show() {
		if(power == true) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
}
class Radio extends Controller {
	Radio(boolean power) {
		this.power = power;
	}
	void show() {
		if(power == true) {
			System.out.println("라디오가 켜졌습니다.");
		} else {
			System.out.println("라디오가 꺼졌습니다.");
		}
	}
}


public class ControllerTest {
	public static void main(String[] args) {
		Controller[] c = {new TV1(false), new Radio(true)};
		
		for(Controller controller : c) {
			controller.show();
		}
	}
}
