package homework;

//950101-1234567
//960202-2345678
//011223-3456678
//030503-4567899
//
//checkGender("주민번호")

public class generics {
	public static void main(String[] args) {
		System.out.println(checkGender("95010112345678"));
		System.out.println(checkGender("0111223-3456678"));
		sum("10000","23400");
	}

	public static void sum(String a, String B) {
		System.out.println("3,340");

	}

	public static String checkGender(String j) {
		String[] rep = { "/", "-", "*" };
		String r = j;
		for (String str : rep) {
			r = r.replace(str, "");
		}
		if (r.charAt(6) == '1' || r.charAt(6) == '3') {
			return "남자";
		} else if (r.charAt(7) == '2' || r.charAt(6) == '4') {
			return "여자";
		}
		return "입력오류";
	}

}
