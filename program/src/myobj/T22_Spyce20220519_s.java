package myobj;

import java.util.PriorityQueue;

public class T22_Spyce20220519_s {
	/*
	 * 	�ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. 
	 * 	��� ������ ���ں� ������ K �̻����� ����� ���� 
	 * 	Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.

		���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2)
		
		Leo�� ��� ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�.
		Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ� ���ں� ���� K�� �־��� ��, 
		��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ��� solution �Լ��� �ۼ����ּ���.
		
		���� ����		
		scoville�� ���̴� 2 �̻� 1,000,000 �����Դϴ�.
		K�� 0 �̻� 1,000,000,000 �����Դϴ�.
		scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�.
		��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1�� return �մϴ�.

		����� ��
		scoville				K	return
		[1, 2, 3, 9, 10, 12]	7	2
		
		����� �� ����
		���ں� ������ 1�� ���İ� 2�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
		���ο� ������ ���ں� ���� = 1 + (2 * 2) = 5
		���� ������ ���ں� ���� = [5, 3, 9, 10, 12]

		���ں� ������ 3�� ���İ� 5�� ������ ������ ������ ���ں� ������ �Ʒ��� ���� �˴ϴ�.
		���ο� ������ ���ں� ���� = 3 + (5 * 2) = 13
		���� ������ ���ں� ���� = [13, 9, 10, 12]

		��� ������ ���ں� ������ 7 �̻��� �Ǿ��� �̶� ���� Ƚ���� 2ȸ�Դϴ�.
	 * 
	 */
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		//int[] scoville = {1,1,1,1,1};
		//int[] scoville = {1};
		int K = 7;
		System.out.println(solution(scoville, K));
	}
	
	public static int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> list = new PriorityQueue<>();
        for(int i : scoville) {
        	list.offer(i);
        }
        System.out.println(list);
        Integer fNum = 0;
        while(!list.isEmpty()) {        	
        	fNum = list.poll();
        	if(fNum >= K) {
        		list.add(fNum);
        		break;
        	}
        	
        	Integer sNum;
        	if((sNum = list.poll()) != null) {
        		fNum = fNum + sNum * 2;
        		list.add(fNum);
        	}else {
        		break;
        	}
        	answer++;
        }
        
        answer = list.size() == 0 ? -1 : answer;
        
        return answer;
    }
}






















