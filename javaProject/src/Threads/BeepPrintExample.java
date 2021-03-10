package Threads;

import java.awt.Toolkit;

class WorkerThread extends Thread {

	@Override
	public void run() {
		super.run();
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 내는 것 beep
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			} // sleep 0.5초간 일시정지
		}
		
	}
}

public class BeepPrintExample {
	public static void main(String[] args) {

		Thread thread = new WorkerThread(); // 같이 소리나게 워크 스레드를 상속받아 진행 소리와 텍스트 모두 출력
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("딩딩딩딩딩");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
