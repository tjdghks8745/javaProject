package variables;

public class CheckValueBefore {
	public static void main(String[] args) {
		int i = 15;
		System.out.println(Byte.MIN_VALUE);
		if(i <Byte.MIN_VALUE || (i > Byte.MAX_VALUE)) {
			System.out.println("byteŸ������ ��ȯ �� �� �����ϴ�.");
			System.out.println("���� Ȯ���ϼ���.");
		} else {
			byte b = (byte) i ;
			System.out.println("byteŸ�� �� :" + b);

		}
	}
}
