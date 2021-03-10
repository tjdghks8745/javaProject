package nestedClasses;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();

		btn.setONClickListener(new CallListener());
		btn.touch();

		btn.setONClickListener(new MessageListener());
		btn.touch();

		btn.setONClickListener(new Button.OnClickLstener() {

			@Override
			public void onClick() {
				System.out.println("영상을 보냅니다.");
			}
		});
		btn.touch();
	}
}
