package interfaces;

public class Audio implements RemoteControl {
	int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오 켭니다.");
	}

	@Override
	public void turnOFF() {
		System.out.println("오디오 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;

		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;

		}
		System.out.println("현재 오디오 볼륨은 " + volume);

	}

}
