package ��������;

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
		System.out.println(name + "�� " + num + "���� �ִ�.");
	}

	void fly() {
		System.out.println(num + "���� " + name + "�� ���ư���.");
	}
}

class Tree extends Countable {

	Tree(String name, int num) {
		super(name, num);
	}

	@Override
	void count() {
		System.out.println(name + "�� " + num + "�׷� �ִ�.");
	}

	void ripen() {
		System.out.println(num + "�׷� " + name + "�� ���Ű� �� �;���.");
	}

}

public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("���ٱ�", 5), new Bird("������", 2), new Tree("�������", 10), new Tree("�㳪��", 7) };
		
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