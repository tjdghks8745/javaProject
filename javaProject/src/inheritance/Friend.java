package inheritance;

// 친구의 정보를 저장하는 연락처 정도
public class Friend {
	String name;
	String phone;

	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
}
