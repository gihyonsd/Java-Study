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
		if(num > 0 && num < 11) { //1������� 10������ �ƴ� ��
			rooms[num] = new Room(num, name);
		}
	}
	public void show() {
		for(Room r : rooms) {
			if(r != null) {
				System.out.println(r.num+"�� ���� " +r.name+ "�� �����Ͽ����ϴ�.");
			}
		}
	}
}

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "ȣ����");
		hotel.add(7, "�浿��");
		hotel.show();
	}
}
