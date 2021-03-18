package Stream;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Scanner;

public class sil {
	public static void main(String[] args) throws Exception {
		FileOutputStream name = new FileOutputStream("C:/Temp/namelist.txt");
		Writer writer = new OutputStreamWriter(name);
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("이름과 전화번호를 입력하세요> ");
			String data = scn.nextLine();
			if (data.equals("end")) {
				break;
			} else {
				writer.write(data);
			
			}
		}
		writer.flush();
		writer.close();
	}
}
