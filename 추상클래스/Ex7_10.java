package abstract_prac;

abstract class Unit {
	int x, y;

	abstract void move(int x, int y);

	void stop() {
		/* 현재 위치에 정지 */}
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
}
class Tank extends Unit { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x="+ x +",y="+ y + "]");
	}
}
class Dropship extends Unit { //수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load() {/*선택된 대상을 태운다*/}
	void unload() {/*선택된 대상을 내린다.*/}
}
public class Ex7_10 {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		for(int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}

	}

}
