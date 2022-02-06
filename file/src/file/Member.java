package file;

import java.util.ArrayList;
import dto.MemberDto;

public class Member {
	private ArrayList<MemberDto> mList; // ArrayList 선언

	public Member() {
		mList = new ArrayList<MemberDto>(); // mList로 선언한 ArrayList 생성
	}

	// 파일에서 읽어온 데이터를 멤버DTO 리스트에 저장
	public void setMemberList(String str, String re1, String re2) {
		String[] strArr = str.split(re1);
		for (String s : strArr) {
			String[] tmpArr = s.split(re2);

			MemberDto dto = new MemberDto();
			dto.setNum(Integer.parseInt(tmpArr[0]));
			dto.setName(tmpArr[1]);
			dto.setMajor(tmpArr[2]);
			dto.setEmail(tmpArr[3]);
			mList.add(dto); // ArrayList에 추가
		}
	}

	// 파일에서 가져온 데이터를 리스트에 담은 데이터를 출력
	public void printList() {
		for (MemberDto dto : mList) {
			System.out.println("번호: " + dto.getNum() + " | 이름: " + dto.getName() + " | 전공: " + dto.getMajor()
					+ " | 이메일: " + dto.getEmail());
		} // 교수님, Member.java에 있는 mList에 관해 질문이
	}

}