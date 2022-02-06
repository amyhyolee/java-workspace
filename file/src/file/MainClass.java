package file;

import util.Util;


public class MainClass {
	
	// Class 10

	public static void main(String[] args) {
		// 내가 만든 유틸에서 파일 읽기
		String filePath = "/Users/hyojinlee/java-workspace/file/src/file/email.txt";
		String name = Util.readtoConsole(filePath);
		Member member = new Member();
		member.setMemberList(name, "\n", ",");   // 파일에서 가져온 데이터를 리스트에 담아
		member.printList();
}
}