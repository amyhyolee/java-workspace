package dto;

public class ProblemDto {
	// 문제를 만들때 필요한 데이터
	// 수
	private int num1;
	// 연산자
	private String op;
	// 수
	private int num2;
	// 답
	private int result;

	// getter setter 필요 (Shift + Alt + S) 눌러서 자동으로 생성
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

}