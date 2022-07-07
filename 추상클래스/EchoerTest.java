package programmingproblem;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("시작합니다.");
	}
	abstract void echo();
	
	void stop() {
		System.out.println("종료합니다.");
	}
}


public class EchoerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Echoer e = new Echoer() {
			void start() {
				System.out.println("시작합니다.");
				String start = sc.nextLine();
				System.out.println(start);
			}
			void echo() {
				String echo = sc.nextLine();
				System.out.println(echo);
			}
			void stop() {
				String stop = sc.nextLine();
				System.out.println(stop);
				System.out.println("종료합니다.");
			}
		};
		e.start();
		e.echo();
		e.stop();
	}
}
