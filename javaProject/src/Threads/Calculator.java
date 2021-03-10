package Threads;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) { //순차적으로 처리해야하는 synchronized 를 사용 해야 하는 것 
		this.memory = memory;
		try {
			Thread.sleep(2000);
			
		}catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory); // 멀티 스레드 이기 때문에 동시작업으로 인해 동시에 50출력 
	}

}
