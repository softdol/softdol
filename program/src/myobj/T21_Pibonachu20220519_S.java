package myobj;

/*
 * 피보나치 수는 F(0) = 0, F(1) = 1일 때, 
 * 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.

	예를들어

	F(2) = F(0) + F(1) = 0 + 1 = 1
	F(3) = F(1) + F(2) = 1 + 1 = 2
	F(4) = F(2) + F(3) = 1 + 2 = 3
	F(5) = F(3) + F(4) = 2 + 3 = 5
	와 같이 이어집니다.

	2 이상의 n이 입력되었을 때, 
	n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, 
	solution을 완성해 주세요.

	제한 사항
	n은 2 이상 100,000 이하인 자연수입니다.
	
	입출력 예
	n	return
	3	2
	5	5
 * 
 */

public class T21_Pibonachu20220519_S {
	
	public static void main(String[] args) {
		int n= 100;
		
		System.out.println(solution(n));
	}
	
	public static long solution(int n) {
        int answer = 0;
        
        long[] arr = new long[n+1];
        
        long begin = System.currentTimeMillis();
        
        answer = (int)fibo(arr, n);
        
        System.out.println((System.currentTimeMillis() - begin) + "ms");
        
        return answer;
    }
	
	public static int Fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
		
	}
	
	public static long fibo(long[] arr, int n) {
		
		if(n <= 1) {
			return n;
		}else if(arr[n] != 0) {
			return arr[n];
		}else{
			return arr[n] = (fibo(arr, n-1) + fibo(arr, n-2)) % 1234567;
		}
		
	}

}
















