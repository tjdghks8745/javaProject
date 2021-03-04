package Check;

public class ShopService {
	private static ShopService a = new ShopService();

	private ShopService() {
	} 
	public static ShopService getInstance() {
		return a;
	}
}
