package interface_prac;

public class Computer implements RemoteControllable {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터 전원을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끈다.");
	}

	@Override
	public void remoteOn() {
		System.out.println("컴퓨터가 절전 모드이다.");
	}

	@Override
	public void remoteOff() {
		System.out.println("컴퓨터가 절전 모드가 풀렸다.");
	}

}
