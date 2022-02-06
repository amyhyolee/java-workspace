package interface_;

import dto.NumDto;
import dto.OpDto;

public class PlusClass implements OperImpl {
	// 더하기 연산하는 메소드
	// 재정의
	// 메소드 오버라이딩
	public String calc(NumDto dto, OpDto odto) {
		// 더하기 연산이면 더하기 연산
		dto.setResult(dto.getNum1() + dto.getNum2());
		return "+";

	}
}