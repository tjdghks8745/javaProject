package inheritance;

public class CellPhoneEx {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "White";
		
		cp.bell();
		cp.powerOn();
		cp.powerOff();
		
		cp.equals("");
		cp.getClass();
		
		
		System.out.println("==================================");
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel =20;
		dp.bell();
		dp.powerOff();
		dp.powerOn();
		dp.turnOnDmb();
		dp.turnOffDmb();
		
		System.out.println("==================================");
		SmartPhone sp = new SmartPhone();
		sp.model = "LG phone";
		sp.color = "Pink";
		sp.commonMethod();
		
		System.out.println("==================================");
		
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
		
	}
}
//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib ojbdc
