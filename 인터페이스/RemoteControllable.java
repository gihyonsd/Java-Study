package interface_prac;
//인터페이스 상속도 extends 사용
public interface RemoteControllable extends Controllable {
	void remoteOn(); //RemoteControllable인터페이스에 새로 추가한 메서드이다.
	
	void remoteOff(); 
	
	//Controllable의 turnOn(), turnOff() 사용 가능
}
