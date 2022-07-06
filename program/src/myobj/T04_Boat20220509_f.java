package myobj;

import java.util.Arrays;

public class T04_Boat20220509_f {
	
	/*
	 * 
	 * 	���ε��� ���� ������� ����Ʈ�� �̿��Ͽ� �����Ϸ��� �մϴ�. 
	 * 	����Ʈ�� �۾Ƽ� �� ���� �ִ� 2�� �ۿ� Ż �� ����, ���� ���ѵ� �ֽ��ϴ�.

		���� ���, ������� �����԰� [70kg, 50kg, 80kg, 50kg]�̰� ����Ʈ�� 
		���� ������ 100kg�̶�� 2��° ����� 4��° ����� ���� Ż �� ������ 1��° 
		����� 3��° ����� ������ ���� 150kg�̹Ƿ� ����Ʈ�� ���� ������ �ʰ��Ͽ� ���� Ż �� �����ϴ�.

		����Ʈ�� �ִ��� ���� ����Ͽ� ��� ����� �����Ϸ��� �մϴ�.

		������� �����Ը� ���� �迭 people�� ����Ʈ�� ���� ���� limit�� �Ű������� �־��� ��, 
		��� ����� �����ϱ� ���� �ʿ��� ����Ʈ ������ �ּڰ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 * 
	 * 
	 * 	���ε��� ���� ����� 1�� �̻� 50,000�� �����Դϴ�.
		�� ����� �����Դ� 40kg �̻� 240kg �����Դϴ�.	
		����Ʈ�� ���� ������ 40kg �̻� 240kg �����Դϴ�.
		
		����Ʈ�� ���� ������ �׻� ������� ������ �� �ִ񰪺��� 
		ũ�� �־����Ƿ� ������� ������ �� ���� ���� �����ϴ�.
	 * 
	 * 
	 * 	people				limit	return
		[70, 50, 80, 50]	100		3
		[70, 80, 50]		100		3
	 */

	public static void main(String[] args) {
		//int[] people = {40,50,50,80};
		//int[] people = {90,80,70,60,50,40,30,20,10};
		int[] people = {40,100};
		//int[] people = {70, 80, 50};
		int limit = 140;
		System.out.println(Arrays.toString(people));
		System.out.println(solution(people, limit));
		System.out.println(Arrays.toString(people));
	}
	
	public static int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int right = people.length - 1;
        int left = 0;

        while (right >= left) {
            int weight = people[right--];
            if (weight + people[left] <= limit) {
              left++;
            }
            answer++;
         }
        
//        for(int i = people.length - 1; i >= 0; i--) {
//        	int tempP = people[i];
//        	if(tempP > 0) {
//        		boolean chkBoat = true;
//        		for(int j = i - 1; j >= 0 ; j--) {
//        			
//        			if(tempP + people[j] <= limit) {
//        				answer++;
//        				people[j] = 0;
//        				chkBoat = false;
//        				break;
//        			}
//        		}
//        		answer = chkBoat ? answer + 1 : answer;         		
//        	}
//        	
//        }
        
        
        return answer;
    }
	
}
