package abstract_prac;

import java.util.Arrays;

class Book implements Comparable<Book>{
	int price;
	Book(int price) {
		this.price = price;
	}
	public void show() {
		System.out.println("Book [price="+price+"]");
	}
	@Override
	public int compareTo(Book o) {
		if(this.price > o.price) {
			return 1;
		} else if(this.price == o.price) {
			return 0;
		}else {
			return -1;
		}
	}
}
public class BookTest {

	public static void main(String[] args) {
		Book[] books = {new Book(15000), new Book(50000), new Book(20000)};
		System.out.println("정렬 전");
		for(Book x : books) {
			x.show();
		}
		Arrays.sort(books);
		System.out.println("정렬 후");
		for(Book x : books) {
			x.show();
		}
	}

}
