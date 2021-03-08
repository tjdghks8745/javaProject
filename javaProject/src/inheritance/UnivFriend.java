package inheritance;

public class UnivFriend extends Friend {
	String major;

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	@Override
	public String toString() {
		return "UnivFriend [major=" + major + ", name=" + name + ", phone=" + phone + "]";
	}

}