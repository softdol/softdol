import java.util.Scanner;

public class B03_If {

	/*
	 * 	# if 문
	 * 
	 * 		- ()안의 값이 true면 {}안의 내용을 실행하는 문법
	 * 		- ()안의 값이 false면 {}안의 내용을 무시한다
	 * 
	 * 	# else if문
	 * 
	 * 		- 위의 if문이 실행되지 않았다면 if문처럼 동작한다
	 * 		- else if는 여러번 사용할 수 있다
	 * 		- else if는 단독으로 사용할 수 없다
	 * 
	 * 	# else문
	 * 
	 * 		- 위의 조건(if, else if)이 모두 아니라면 {}안의 내용을 무조건 실행한다
	 * 		- if문 바로 다음에 사용할 수도 있다
	 * 		- 단독으로 사용할 수 없다
	 * 		- else가 붙어있는 if절은 최소한 한번은 실행된다
	 * 
	 */
	
	public static void main(String[] args) {
		
		if (true) {
			System.out.println("if문이 true일 때 실행되는 명령어1");
			System.out.println("if문이 true일 때 실행되는 명령어2");
			System.out.println("if문이 true일 때 실행되는 명령어3");
		}
		
		int a = 6;
		
		if (a % 2 == 0) {
			System.out.println("a의 값이 짝수일때만 출력되는 문장");
		}else if (a % 3 == 0) {
			System.out.println("a의 값이 짝수가 아니면서 3의 배수임");
		}else if (a % 5 == 0) {
			System.out.println("2의 배수가 아니고 3의 배수도 아닌 5의 배수");
		}else {
			System.out.println("위의 조건이 모두 아닙니다");
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매하실 사과의 개수 >> ");
		
		int apple;
		String size;
		apple = sc.nextInt();
		
		sc.close();
		
		if(apple > 10) {
			size = "대용량 종이백";
		}else if (apple > 5) {
			size = "중형 종이백";
		}else {
			size = "소형 종이백";
		}
		
		System.out.println(size);
		
		//String answer;
		
		//answer.replace(/[`~!@#$%^&*()|+\=?;:'"<>\{\}\[\]\\\/ ]/g,'');
	}
	
}
