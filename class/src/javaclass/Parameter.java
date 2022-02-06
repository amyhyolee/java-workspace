package javaclass;

public class Parameter {
	// Class 6
	
	// 같은 이름을 가진 메소드는 매개변수가 다르면 된다.
	public void method() {
		System.out.println("나는 method()");
	}
	
	/* output이 다르지만 메소드 이름 같게할 수 없음.
	 * public String method() {
	 * return "나는 method()"; }
	 */
	
	public void method(int number) {
		System.out.println("나는 숫자를 받을 수 있는 method()");
	}
	
	public void method(int number1, int number2) {
		System.out.println("나는 숫자 두개를 받을 수 있는 method()");
	}
	
	public void method(String str) {
		System.out.println("나는 문자열을 받을 수 있는 method()");
	}
}

