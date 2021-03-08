package interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOFF();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOFF();

	}
}
