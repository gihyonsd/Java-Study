package abstract_prac;

class Circle extends Shape {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}

	
	public void draw() {
		System.out.println("원을 그리다."); //부모 클래스에서 추상 메서드로 선언했으므로 자식 클래스에서 반드시 구현해야 한다.
	}
	public double findArea() {
		return pi * radius * radius; //부모 클래스의 메서드를 오버라이딩 한다.
		//pi -> 부모 클래스인 shape에서 물려받은 변수
	}
}
