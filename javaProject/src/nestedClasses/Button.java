package nestedClasses;

public class Button {
	OnClickLstener listener;

	void setONClickListener(OnClickLstener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();

	}

	interface OnClickLstener {
		void onClick();

	}

}
