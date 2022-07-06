
public class B04_switch {
	/*
	 * 	# switch-case문
	 * 
	 * 		- ()안의 연산 결과에 따라 실행할 코드를 결정하는 문법
	 * 		- ()안에 boolean 타입 대신 다른 타입을 사용한다
	 * 		- if문으로 완벽하게 대체할 수 있기 때문에 많이 사용하지는 않는다
	 * 		- break가 없으면 break를 만날때까지 내려가면서 모든 case를 실행한다
	 * 		- default는 if문의 else같은 역할을 한다
	 */
	
	public static void main(String[] args) {
		
		int num = 22;
		
		switch (num % 5) {
			case 0:
				System.out.println("num % 5 가 0 입니다.");
				//break;
			case 1:
				System.out.println("num % 5 가 1 입니다.");
				break;
			case 2:	case 3: case 4:
				System.out.println("num % 5 가 2,3,4 입니다.");
				break;
			default :
				System.out.println("위의 case가 모두 해당하지 않아 실행됩니다.");
				break;
		}
		
	}

}
