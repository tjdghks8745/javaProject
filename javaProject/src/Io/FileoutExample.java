package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutExample {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/Temp/Dir/cap.PNG");
		FileOutputStream fos = new FileOutputStream("C:/Temp/Dir/copyary.PNG");
		int data = 0, cnt = 0;
		byte[] readByets = new byte[100];
		while ((data = fis.read(readByets)) != -1) {
			fos.write(readByets);
			cnt++;
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("end ......." + cnt);
	}
}
