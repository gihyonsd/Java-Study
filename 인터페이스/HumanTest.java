package programmingproblem;

interface Human {
	void eat();

	static void echo() {
		System.out.println("야호!!");
	}
}

class Worker implements Human {

	@Override
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	
	public void print() {
		System.out.println("인간입니다.");
	}
	
}
class Student implements Human {
	

	private int num;

	public Student(int num) {
		this.num = num;
	}

	@Override
	public void eat() {
		System.out.println("도시락을 먹습니다.");
		
	}
	public void print() {
		System.out.println(num+"세의 학생입니다.");
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
