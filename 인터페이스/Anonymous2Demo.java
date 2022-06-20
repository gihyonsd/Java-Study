package interface_prac;

public class Anonymous2Demo {

	public static void main(String[] args) {
		new Bird() {
			public void move() {
				System.out.println("독수리가 난다.");
			}
		}.move();
	}

}
