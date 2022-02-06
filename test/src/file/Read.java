package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/hyojinlee/Desktop/out.txt")); // Desktop에 파일
			while(true) {
				String line = br.readLine();
				if (line == null)
					break;
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done Reading");
	}
}
