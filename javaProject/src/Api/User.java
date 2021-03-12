package Api;

public class User {

	String userId;
	int score;
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return score;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
//		return super.equals(obj);
		User u = (User)obj;
		return this.userId.equals(obj.userId);
		
	}

}
