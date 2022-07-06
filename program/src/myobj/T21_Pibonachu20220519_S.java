package myobj;

/*
 * �Ǻ���ġ ���� F(0) = 0, F(1) = 1�� ��, 
 * 1 �̻��� n�� ���Ͽ� F(n) = F(n-1) + F(n-2) �� ����Ǵ� �� �Դϴ�.

	�������

	F(2) = F(0) + F(1) = 0 + 1 = 1
	F(3) = F(1) + F(2) = 1 + 1 = 2
	F(4) = F(2) + F(3) = 1 + 2 = 3
	F(5) = F(3) + F(4) = 2 + 3 = 5
	�� ���� �̾����ϴ�.

	2 �̻��� n�� �ԷµǾ��� ��, 
	n��° �Ǻ���ġ ���� 1234567���� ���� �������� �����ϴ� �Լ�, 
	solution�� �ϼ��� �ּ���.

	���� ����
	n�� 2 �̻� 100,000 ������ �ڿ����Դϴ�.
	
	����� ��
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
















