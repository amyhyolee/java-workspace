package interface_;

import dto.NumDto;
import dto.OpDto;

public class MultiplyClass implements OperImpl {
	// 곱하기 연산하는 메소드
	// 메소드 오버라이딩
	public String calc(NumDto dto, OpDto odto) {
		// 곱하기 연산이면 곱하기 연산
		dto.setResult(dto.getNum1() * dto.getNum2());
		return "*";

	}
}