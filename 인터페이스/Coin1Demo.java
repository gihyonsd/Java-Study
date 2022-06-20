package interface_prac;

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUARTER = 25;
	//int만 표시되어 있지만, public static final int이다. 인터페이스의 모든 필드는
	//public static final이기 때문
}

public class Coin1Demo {

	public static void main(String[] args) {
		System.out.println("Dime은 " +Coin.DIME+ "센트입니다."); //인터페이스에 정의된 상수 DIME을 의미
	}

}
