package dto;

/*
 * Class 7
 * 수 데이터 클래스
 */
public class NumDto {
	private int num1;
	private int num2;
	private int result;

	// 메소드
	// 값을 셋팅
	// setter method sets or updates its value
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public void setResult(int result) {
		this.result = result;
	}

	// 값을 가져오자
	// getter method returns its value
	public int getNum1() {
		return this.num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getResult() {
		return result;
	}

}