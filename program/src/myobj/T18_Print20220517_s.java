package myobj;

import java.util.LinkedList;
import java.util.Queue;

public class T18_Print20220517_s {
	
	/*
	 *	�Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. 
	 *	�׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
	 *	�̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. 
	 *	�� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.

		1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
		2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� 
		   J�� ������� ���� �������� �ֽ��ϴ�.
		3. �׷��� ������ J�� �μ��մϴ�.
			���� ���, 4���� ����(A, B, C, D)�� ������� �μ� ����Ͽ� �ְ� 
			�߿䵵�� 2 1 3 2 ��� C D A B ������ �μ��ϰ� �˴ϴ�.

			���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� �˰� �ͽ��ϴ�. 
			���� ������ C�� 1��°��, A�� 3��°�� �μ�˴ϴ�.

			���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� 
			���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� 
			location�� �Ű������� �־��� ��, 
			���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

			���ѻ���
			���� ����Ͽ��� 1�� �̻� 100�� ������ ������ �ֽ��ϴ�.
			�μ� �۾��� �߿䵵�� 1~9�� ǥ���ϸ� ���ڰ� Ŭ���� �߿��ϴٴ� ���Դϴ�.
			location�� 0 �̻� (���� ����Ͽ� �ִ� �۾� �� - 1) ������ ���� ������ 
			������� ���� �տ� ������ 0, �� ��°�� ������ 1�� ǥ���մϴ�.

			����� ��
			priorities				location	return
			[2, 1, 3, 2]			2(0,2)(4)		1(4-2)
			[1, 1, 9, 1, 1, 1]		0(-2,2)(2)		5(
			[1, 1, 1, 1, 1, 1] 		3(3,0)(3)		4 
			[2, 3, 3, 2, 9, 3, 3]	3(-1,4)(7)		6
			[2, 1, 9, 1, 9, 1]		1(-1,2)(2)		4
			
			����� �� ����
			���� #1

			������ ���� ���� �����ϴ�.

			���� #2

			6���� ����(A, B, C, D, E, F)�� �μ� ����Ͽ� �ְ� �߿䵵�� 1 1 9 1 1 1 �̹Ƿ� C D E F A B ������ �μ��մϴ�.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 1;
		
		System.out.println(solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
        int answer = 0;
        
        Queue<Integer> qList = new LinkedList<>();
        //char[] ch = new char[priorities.length];
     
        for(int i = 0; i < priorities.length; i++) {
        	qList.offer(priorities[i]);
        }
        while(!qList.isEmpty()) {        	
        	int temp = qList.poll();
        	boolean qChk = false;
        	
        	for(int i : qList) {
            	if(temp < i) {
            		qChk = true;
            		break;
            	}            	
            }
        	if(qChk) {
        		qList.offer(temp);
        	}else {
        		System.out.print(temp);
        	}
        	
        }
        System.out.println();
        
        return answer;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
