
public class C09_AccessModifier extends myobj.C09_PublicClass {
	
	public C09_AccessModifier() {
		// 다른 패키지의 자원이더라도 상속받은 클래스에서는 protected까지 사용할 수 있다
		super.m1();
		super.m2();
	}
	/*
	 * 	# 접근 제어자 (Access Modifier)
	 * 
	 * 	 - 다른 클래스에서 해당 자원을 사용하려고 할 떄 허용 범위를 설정한다
	 * 	 
	 * 	# 종류
	 * 
	 * 	 - public		: 다른 패키지에서도 자유롭게 접근할 수 있는 자원
	 * 	 - protected	: 다른 패키지에서는 상속 받은 클래스에서만 접근할 수 있는 자원  
	 * 	 - default		: 같은 패키지에서는 자유롭게 접근할 수 있는 자원(앞에 접근 제어자를 붙이지 않는것)
	 * 	 - private		: 같은 클래스 내부에서만 접근할 수 있는 자원
	 * 
	 * 
	 */	
	public static void main(String[] args) {
		
		// 같은 패키지에 있는 클래스의 자원은 public, protected, default까지 사용할 수 있다
		C09_PublicClass instance1 = new C09_PublicClass();
		DefaultClass instance2 = new DefaultClass();
				
		// private으로 직접 접근은 안되지만, 다른 메서드를 통한 간접적인 사용은 가능하다
		instance1.m1();
		instance1.m2();
		instance1.m3();
		
		instance2.m1();
		instance2.m2();
		instance2.m3();
		
		// 다른 페키지에 있는 클래스의 자원은 기본적으로 public이 붙은 것만 사용할 수 있다
		myobj.C09_PublicClass instance3 = new myobj.C09_PublicClass();
		
		// 다른 패키지에 있는 Default클래스도 사용 할 수 없다 
		//myobj.DefaultClass
		
		instance3.m1();
		
	}
	
}
