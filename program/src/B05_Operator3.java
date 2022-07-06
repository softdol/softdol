
public class B05_Operator3 {
	
	/*
	 * 	# 대입 연산자
	 * 
	 * 		= : 왼쪽의 변수에 오른쪽의 값을 대입한다
	 * 
	 * 	# 복합 대입 연산자
	 * 
	 * 		- 해당 변수에 값을 누적시키는 연산
	 * 		- +=, -=, *=, /=, ...
	 * 
	 * 
	 * 	# 단항 연산자
	 * 
	 * 		- 해당 변수에 값을 1씩 누적시키는 연산
	 * 		- ++, --의 위치에 따라서 결과가 달라진다
	 * 		- ++, --를 뒤에 붙이면 해당 줄의 모든 명령을 실행한 후에 값이 변한다
	 * 		- ++, --를 앞에 붙이면 해당 줄의 명령을 실행하기 전에 값이 변한다
	 */
	
	public static void main(String[] args) {
		
		int num = 100;
		
		num = num + 5;
		System.out.println(num);
		num += 5;	// num = num + 5;
		System.out.println(num);
		num *= 2;	// num = num * 2;
		System.out.println(num);
		num /= 5;	// num = num / 5;
		System.out.println(num);
		num %= 10; 	// num = num % 10;		
		System.out.println(num);
		System.out.println("------------------");
		
		num = 10;
		
		num++;	// num = num + 1 또는 num += 1 과 같음
		System.out.println(num);
		++num;
		System.out.println(num);
		num--;	// num = num - 1 또는 num -= 1 과 같음
		System.out.println(num);
		--num;
		System.out.println(num);
		System.out.println("------------------");
		
		num = 20;
		
		System.out.println(num++);
		System.out.println(++num);
		
	}

}
