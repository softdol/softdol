
public class A01_Escape {
	
	/*
	 *  # Escape 문자
	 *  
	 *   - 특수한 기능을 가진 문자
	 *   - 그냥 출력하기 애매한 문자들을 표현하기 위한 방식
	 *   - \ 와 하나의 문자가 합쳐져서 특수한 기능을 한다
	 *   - \ 와 문자가 합쳐져 하나의 문자로 인식된다 ('' 내부에 넣을 수 있다)
	 */
	public static void main(String[] args) {
		System.out.println("안녕하세요 반\n갑습니다.");		
		System.out.println('\n');						// \n : 줄 바꿈의 기능을 가진 특수 문자
		System.out.println("안녕하세요 반\t갑	습니다.");	// \t : Tab의 기능을 가진 특수 문자
		System.out.println("안녕하세요 반\\갑습니다.");		// \\ : 그냥 역슬래시 하나를 출력하고 싶을 때 사용하는 특수 문자
		System.out.println("c:\\Program Files\\Java");
		System.out.println("안녕하세요 \"반\"갑습니다.");		// \" : 그냥 큰 따움표를 출력하고 싶을 때 사용하는 특수 문자
		System.out.println("안녕하세요 \'반\'갑습니다." + '\'');		// \' : 그냥 작은 따움표를 출력하고 싶을 때 사용하는 특수 문자
	}

}


