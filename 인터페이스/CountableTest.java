package 도전과제;

abstract class Countable {
	protected String name;
	protected int num;

	Countable(String name, int num) {
		this.name = name;
		this.num = num;
	}

	abstract void count();
}

class Bird extends Countable {

	Bird(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "마리 있다.");
	}

	void fly() {
		System.out.println(num + "마리 " + name + "가 날아간다.");
	}
}

class Tree extends Countable {

	Tree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "가 " + num + "그루 있다.");
	}

	void ripen() {
		System.out.println(num + "그루 " + name + "에 열매가 잘 익었다.");
	}

}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7) };
		
		for(Countable x : m) {
			x.count();
		}
		for(Countable y : m) {
			if(y instanceof Bird) {
				((Bird)y).fly();
			} else {
				((Tree)y).ripen();
			}
		}
	}
}