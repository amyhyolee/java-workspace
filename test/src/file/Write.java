package file;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {
	// Class 9
	// 파일로 출력하는 방법

	public static void main(String[] args) {
		PrintWriter out = null;
		try {
			out = new PrintWriter("/Users/hyojinlee/Desktop/out.txt"); // Desktop에 파일
			for (int i = 1; i < 11; i++) {
				String data = i + " 번째 줄입니다.";
				out.println(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			out.close();
		}
	}
}
