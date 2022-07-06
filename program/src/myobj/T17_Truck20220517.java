package myobj;

public class T17_Truck20220517 {
	
	/*
	 * 	Ʈ�� ���� �밡 ���� ���������� ������ �ٸ��� ������ ������ �ǳʷ� �մϴ�. 
	 * 	��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� �˾Ƴ��� �մϴ�. 
	 * 	�ٸ����� Ʈ���� �ִ� bridge_length�� �ö� �� ������, 
	 * 	�ٸ��� weight ���ϱ����� ���Ը� �ߵ� �� �ֽ��ϴ�. 
	 * 
	 * 	��, �ٸ��� ������ ������ ���� Ʈ���� ���Դ� �����մϴ�.

		���� ���, Ʈ�� 2�밡 �ö� �� �ְ� ���Ը� 10kg���� �ߵ�� �ٸ��� �ֽ��ϴ�. 
		���԰� [7, 4, 5, 6]kg�� Ʈ���� ������� �ִ� �ð� �ȿ� �ٸ��� �ǳʷ��� ������ ���� �ǳʾ� �մϴ�.

		��� �ð�	�ٸ��� ���� Ʈ��	�ٸ��� �ǳʴ� Ʈ��	��� Ʈ��
		0		[]				[]				[7,4,5,6]
		1~2		[]				[7]				[4,5,6]
		3		[7]				[4]				[5,6]
		4		[7]				[4,5]			[6]
		5		[7,4]			[5]				[6]
		6~7		[7,4,5]			[6]				[]
		8		[7,4,5,6]		[]				[]
		
		����, ��� Ʈ���� �ٸ��� �������� �ּ� 8�ʰ� �ɸ��ϴ�.

		solution �Լ��� �Ű������� �ٸ��� �ö� �� �ִ� Ʈ�� �� bridge_length, 
		�ٸ��� �ߵ� �� �ִ� ���� weight, Ʈ�� �� ���� truck_weights�� �־����ϴ�. 
		�̶� ��� Ʈ���� �ٸ��� �ǳʷ��� �ּ� �� �ʰ� �ɸ����� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

		���� ����
		bridge_length�� 1 �̻� 10,000 �����Դϴ�.
		weight�� 1 �̻� 10,000 �����Դϴ�.
		truck_weights�� ���̴� 1 �̻� 10,000 �����Դϴ�.
		��� Ʈ���� ���Դ� 1 �̻� weight �����Դϴ�.
		
		����� ��
		bridge_length	weight	truck_weights					return
		2				10		[7,4,5,6]						8
		100				100		[10]							101
		100				100		[10,10,10,10,10,10,10,10,10,10]	110
	 * 
	 */	
	
	public static void main(String[] args) {
//		 int bridge_length = 2;
//		 int weight = 10;
//		 int[] truck_weights = {7,4,5,6};
		 int bridge_length = 100;
		 int weight = 100;
		 int[] truck_weights = {10};
		 
		 long begin = System.currentTimeMillis();
		 
		 System.out.println(solution(bridge_length, weight, truck_weights));
		 
		 System.out.println(System.currentTimeMillis() - begin);
	 }
	
	 public static int solution(int bridge_length, int weight, int[] truck_weights) {
	        int answer = 0;
	        
	        int maxLen = truck_weights.length;
	        int cntLen = 0;
	        int sum = 0;
	        int tempW = weight;
	        	        
	        while(cntLen < maxLen && bridge_length > 0) {
	        	
	        	if(sum <= sum + truck_weights[cntLen]) {	        	
	        		sum += truck_weights[cntLen];
	        	}
	        	
	        	tempW -= sum;
	        	
	        	if(tempW <= 0) {
	        		tempW = weight;
	        		sum = 0;
	        		cntLen++;
	        	}
	        		        	
	        	answer++;
	        }
	        
	        
	        return answer;
	 }

}
