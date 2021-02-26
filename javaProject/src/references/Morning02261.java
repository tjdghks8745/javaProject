package references;

public class Morning02261 {
	public static void main(String[] args) {
		int[] oldAry = {45, 55, 67};
		int[] newAry = new int[3];
		
		for(int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}
		System.out.println(newAry[0]);
		System.out.println(newAry[1]);
		System.out.println(newAry[2]);
		
		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 1, newAry2, 0, 2); //원본 배열에 복사 위치에 뒤에 복사 하는 메소드
		
		System.out.println();
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
		
	
		
	}public static void arrayCopy() { 
	
	}
	
}
