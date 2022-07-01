package ��������;

interface Countable {
	void count();
}


class Bird implements Countable {
	String name;
	public Bird(String name) {
		this.name = name;
	}
	@Override
	public void count() {
		System.out.println(name+"�� 2���� �ִ�.");
	}
	public void fly() {
		System.out.println("2���� "+name+"�� ���ư���.");
	}
}
class Tree implements Countable {
	String name;
	public Tree(String name) {
		this.name = name;
	}
	@Override
	public void count() {
		System.out.println(name+"�� 5�׷� �ִ�.");
	}
	public void ripen() {
		System.out.println(name+"�� ���Ű� �� �;���.");
	}
	
}
public class CountableTest {
	public static void main(String[] args) {
		Countable[] m = { new Bird("���ٱ�"), new Bird("������"), new Tree("�������"), new Tree("�㳪��") };
		
		for(Countable e : m) {
			e.count();
		}
				
		for(int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly();
			} else {
				((Tree)m[i]).ripen();
			}
		}
	}
}