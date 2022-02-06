package javaclass;

public class ConstructorClass {

	// Class 6
	
	/* 생서자 */
	private String d;
	private int e;
	
	// 클래스를 만들면 눈에는 안보이지만 클래스는 아래와 같은 모양의 생성자가 항상 존재한다. 
	public ConstructorClass(String d) {
		this.d = d; // 위에 있는 private String d를 바꾸고 싶을 때 this 활용
	}
	
	public void printD() {
		System.out.println(d); // 생성자 만들 때 기본 값 설정해 준 d로 출력
	}
	
	public void localVariable() {
		String d = "지역변수";   // 메소드 안에서만 존재하는 지역변수
		this.d = d; // 밖으로 나가면 지역변수 this.a 값 소멸
		System.out.println(d);
	}
	
	// private 으로 되있는 변수들을 부르는 방법 (private 변수 접근 방법)
	public void setE(int e) {
		this.e = e;
	}
	
	public int getE() {
		return this.e;
	}
}
