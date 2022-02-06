package javaclass;

public class Method {

	// Class 4
	// 메소드 설명 

	/* class에서 쓸수 있는 것은 변수와 메소드만 가능하다.
	 * (변수) 클래스에 쓰면 두 메소드에서 사용 가능. 
	 * Example: m1 , m2 */
	boolean flag = false;
	public void m1() {
		// 지역 변수, 매소드 변수 // 다른 메소드에서는 사용 안됨.
		// boolean flag = false;
		int a = 0;
		if (a < 10) {
			flag = true;
		}
	}
	public void m2() {
		if (flag) {
			System.out.println("Success");
		}
	}

	
	/* m3에 있는 flag2를 m4로 전달 하고 싶으면 return 사용
	 * method로 전달해서 사용 가능. (순서)
	 * return 값이 없었기 때문에 void (리턴값 없음) 사용함.
	 * return을 사용할때 return type을 바꿔줘야함. 
	 * Example: m3, m4 */
	public boolean m3() {
		boolean flag2 = false;
		int a = 0;
		if (a < 10) {
			flag2 = true;
		}
		return flag2; // 순서 1 
	}
	public void m4() {
		boolean flag2 = m3(); // 순서 2 
		if (flag2) { // 순서 3 
		// 위 2줄 되신 밑에 줄 사용해도 같음.
		// if (m3()) {	
			System.out.println("Success");
		}
	}

	
	/* 메소드: public void printHello()
	 * 매게 변수 (parameter) 도 넣어서 사용할 수 있음.
	 * 매게 변수: int, cnt */ 
	public void printHello(int cnt) {
		for (int i = 0; i < cnt; i++) {
			System.out.println((i + 1) + ". Hello World");
		}
	} // method

} // class

// 같은 값을 공유하고 싶을 때 static 을 사용한다.
// static 메소드를 사용하면 새로운 객체가 만들어 져도 항상 고정되어 있다.