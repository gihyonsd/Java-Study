package abstract_prac;

class Rectangle extends Shape {
	int x;
	int y; //세로 길이
	
	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	public void draw() {
		System.out.println("사각형을 그리다.");
	}
	
	public double findArea() {
		return x*y;
	}

}
