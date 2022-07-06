package myobj;

// public class : 파일명과 같은 이름의 클래스
public class C09_PublicClass {

	public int a1 = 10;
	protected int a2 = 11;
	int a3 = 12;
	private int a4 = 13;
	
	public void m1() {
		System.out.println(a4);
	}
	
	protected void m2() {
		System.out.println(a4);
	}
	
	void m3() {
		System.out.println(a4);
	}
	
//	private void m4() {
//		System.out.println(a4);
//	}
	
}

// default class : 접근제어자를 앞에 붙이지 않은 클래스
class Defaultclass{
	public int a1 = 10;
	protected int a2 = 11;
	int a3 = 12;
	private int a4 = 13;
	
	public void m1() {
		System.out.println(a4);
	}
	
	protected void m2() {
		System.out.println(a4);
	}
	
	void m3() {
		System.out.println(a4);
	}
	
//	private void m4() {
//		System.out.println(a4);
//	}
}