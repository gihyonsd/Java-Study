package programmingproblem;

class Hotel {
	private class Room {
		int num;
		String name;

		private Room(int num, String name) {
			this.num = num;
			this.name = name;
		}
		
	}
	Room[] rooms = new Room[10];
	public void add(int num, String name) {
		if(num > 0 && num < 11) { //1번방부터 10번방이 아닐 시
			rooms[num] = new Room(num, name);
		}
	}
	public void show() {
		for(Room r : rooms) {
			if(r != null) {
				System.out.println(r.num+"번 방을 " +r.name+ "가 예약하였습니다.");
			}
		}
	}
}

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();
	}
}
