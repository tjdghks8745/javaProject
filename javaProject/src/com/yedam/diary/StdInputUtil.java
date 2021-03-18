package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class StdInputUtil {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SimpleDateFormat df = new SimpleDateFormat("yymmdd");

	static int readInt() {
		int result = 0;
		do {
			try {
				String temp = br.readLine();
				result = Integer.parseInt(temp); // 문자열 타입을 숫자값으로 바꿔줌 parseInt
				break;
			} catch (IOException e) {
//			e.printStackTrace();
				System.out.println("숫자 형식이 아닙니다.");
			}
		} while (true);
		return result;
	}

	// 날짜입력
	public static String readDate() {
		String result = "";
		do {
			try {
				result = br.readLine();
				df.parse(result.trim());
				break;
			} catch (Exception e) { // IO보다 더 높은 최상위 Exception을 불러오게 된것.
//			e.printStackTrace();
				System.out.println("날짜 형식이 아닙니다.");
			}
		} while (true);
		return result;

	}

	// 여러줄 입력
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();
		try {
			while (true) {
				String temp = br.readLine();
				if (temp.equals("end")) {
					break;
				}
				result.append(temp + "\n");

			}
		} catch (IOException e) {
//			e.printStackTrace();
		}
		return result.toString();

	}
}
