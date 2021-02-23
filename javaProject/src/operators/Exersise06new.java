package operators;

public class Exersise06new {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (0.5*(lengthTop + lengthBottom))*height;
		System.out.println(area);
		area = getRectArea(lengthTop, lengthBottom, height);
		System.out.println(area);
	}
	public static double getRectArea(int top, int bottom, int height){ // getRecArea 라는 메소드임 . 사다리꼴 구하는 메소드
		double area = (double) (top + bottom) / 2 * height;
		return area;
	}
}
