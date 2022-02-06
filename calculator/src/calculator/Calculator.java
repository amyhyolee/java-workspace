package calculator;

public class Calculator {
	
	// Class 6 
	// 사칙 연산 클래스
	
		// 더하기 메소드
		public int add(int num1, int num2) {
			return num1 + num2;
		}
		// 빼기 메소드
		public int sub(int num1, int num2) {
			return num1 - num2;
		}
		// 곱하기 메소드
		public int mul(int num1, int num2) {
			return num1 * num2;
		}
		// 나누기 메소드
		public int div(int num1, int num2) {
			return num1 / num2;
		}
		
		// 돈 복사기 메소드(3배 뻥튀기)
		public int pung(int m) {
			return m * 3;
		}
	}