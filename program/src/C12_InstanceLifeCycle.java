
public class C12_InstanceLifeCycle {
	
	/*
	 * 	# 인스턴스 생성시 실행되는 코드들의 순서
	 * 
	 * 		1. (첫 실행시) 스태틱 블록이 실행
	 * 		2. 인스턴스 생성
	 * 		3. 인스턴스 블록 실행
	 * 		4. 생성자 호출 
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("프로그램 실행");
	 	
	 	/*
	 	 * 	스태틱 영역은 무조건 메모리에 실어놓는 것이 아니라
	 	 * 	해당 클래스가 초초로 사용되는 시점에 메모리에 실리게 된다
	 	 * 
	 	 */
		System.out.println(InstanceLife.a);
		
		new InstanceLife(); 		
	 	new InstanceLife();
	 	new InstanceLife();
	 	
	 	System.out.println("프로그램 종료");
	}
	

}

class InstanceLife{
	static int a;
	
	{
		System.out.println("2. 인스턴스 블록");
	}
	
	static {
		System.out.println("1. 스태틱 블록");
	}
	
	public InstanceLife() {
		System.out.println("3. 생성자 블록");
	}
	
}
















