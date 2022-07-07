package programmingproblem;

interface Human {
	void eat();

	static void echo() {
		System.out.println("��ȣ!!");
	}
}

class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("���� �Խ��ϴ�.");
	}
	
	public void print() {
		System.out.println("�ΰ��Դϴ�.");
	}
	
}
class Student implements Human {
	

	private int num;

	public Student(int num) {
		this.num = num;
	}

	@Override
	public void eat() {
		System.out.println("���ö��� �Խ��ϴ�.");
		
	}
	public void print() {
		System.out.println(num+"���� �л��Դϴ�.");
	}


	
}


public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		((Worker) p).print();
		p.eat();
	}

}
