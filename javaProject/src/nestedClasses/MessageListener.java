package nestedClasses;

public class MessageListener implements Button.OnClickLstener {

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
		
	}
	
}
