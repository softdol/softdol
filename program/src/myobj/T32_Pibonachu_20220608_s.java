package myobj;

public class T32_Pibonachu_20220608_s {
	/*
	 * 	���� ����
		���� ���̰� 2�̰� ������ ���̰� 1�� ���簢������� Ÿ���� �ֽ��ϴ�. 
		�� ���簢�� Ÿ���� �̿��Ͽ� ������ ���̰� 2�̰� ������ ���̰� n�� �ٴ��� ���� ä����� �մϴ�. 
		Ÿ���� ä�� ���� ������ ���� 2���� ����� �ֽ��ϴ�.

		Ÿ���� ���η� ��ġ �ϴ� ���
		Ÿ���� ���η� ��ġ �ϴ� ���
		������ n�� 7�� ���簢���� ������ ���� ä�� �� �ֽ��ϴ�.

		Imgur

		���簢���� ������ ���� n�� �Ű������� �־��� ��, 
		�� ���簢���� ä��� ����� ���� return �ϴ� solution �Լ��� �ϼ����ּ���.

		���ѻ���
		������ ���� n�� 60,000������ �ڿ��� �Դϴ�.
		����� ���� ���� �� �� �����Ƿ�, ����� ���� 1,000,000,007���� ���� �������� return���ּ���.
		
		����� ��
		n	result
		4	5
	 * 
	 */
	public static void main(String[] args) {
		
		int n = 100;
		
		System.out.println(solution(n));
		
	}
	
	public static int solution(int n) {
        int answer = 0;
          
        
        long temp1 = 1;
        long temp2 = 1;
        long reslut = 0;

		if (n <= 1) {
			reslut = 1;
		}else {
			for (int i = 1; i < n; i++) {
				reslut = temp1 + temp2;
				temp1 = temp2;
				temp2 = reslut;
				
				reslut %= 1000000007;
				
				System.out.println(reslut);
			}
		}		
		
		answer = (int)(reslut % 1000000007);
        
        return answer;
    }
}
