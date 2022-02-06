package interface_;

import dto.NumDto;
import dto.OpDto;

public class SuperClass implements OperImpl {
	// 연산에 맞게 계산하는 메소드
	// 메소드 오버라이딩
	public String calc(NumDto dto, OpDto odto) {
		if (odto.getOp().equals("+")) {
			dto.setResult(dto.getNum1() + dto.getNum2());
		} else if (odto.getOp().equals("-")) {
			dto.setResult(dto.getNum1() - dto.getNum2());
		} else if (odto.getOp().equals("*")) {
			dto.setResult(dto.getNum1() * dto.getNum2());
		} else if (odto.getOp().equals("/")) {
			dto.setResult(dto.getNum1() / dto.getNum2());
		}
		return null;

	}
}