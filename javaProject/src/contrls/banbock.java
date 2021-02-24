package contrls;

public class banbock {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;		
		while(i <10) {
			while (j <10) {
				System.out.println(i * j);
			j++;
		}
		j=1;
		i++;
	}
}
}