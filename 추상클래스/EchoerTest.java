package programmingproblem;

import java.util.Scanner;

abstract class Echoer {
	void start() {
		System.out.println("�����մϴ�.");
	}
	abstract void echo();
	
	void stop() {
		System.out.println("�����մϴ�.");
	}
}


public class EchoerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Echoer e = new Echoer() {
			void start() {
				System.out.println("�����մϴ�.");
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
				System.out.println("�����մϴ�.");
			}
		};
		e.start();
		e.echo();
		e.stop();
	}
}
