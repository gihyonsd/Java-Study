package interface_prac;
interface Animal {
	void sound();
}
class Dog implements Animal {
	public void sound() {
		System.out.println("멍멍!");
	}
}
class Cuckoo implements Animal {
	public void sound() {
		System.out.println("뻐꾹!");
	}
}
public class AnimalDemo {
	static void makeSound(Animal a) { //Dog 객체나 Cuckoo 객체를 Animal 타입에 대입한다.
		a.sound(); //a 객체의 타입을 실행 도중에 결정한다. a 객체가 Dog 타입이면 멍멍을 Cuckoo 타입이면 뻐꾹을 출력한다.
	}
	public static void main(String[] args) {
		Dog d = new Dog();
		Cuckoo c = new Cuckoo();
		
		makeSound(d);
		makeSound(c);
		

	}

}
