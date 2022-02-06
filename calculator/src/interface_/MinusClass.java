package interface_;

import dto.NumDto;
import dto.OpDto;

public class MinusClass implements OperImpl {
	// 빼기 연산하는 메소드
	// 메소드 오버라이딩
	public String calc(NumDto dto, OpDto odto) {
		// 빼기 연산이면 빼기 연산
		dto.setResult(dto.getNum1() - dto.getNum2());
		return "-";

	}
}