package myobj;

import java.util.LinkedList;
import java.util.Queue;

public class T07_StringZip20220511_s {

	/*
	 * ������ ó�� �������� �ǰ� ���� "����ġ"�� ���ڿ��� �����ϴ� ����� ���� ���θ� �ϰ� �ֽ��ϴ�. 
	 * �ֱٿ� �뷮�� ������ ó���� ���� ������ ��ս� ���� ����� ���� ���θ� �ϰ� �ִµ�, 
	 * ���ڿ����� ���� ���� �����ؼ� ��Ÿ���� ���� 
	 * 
	 * �� ������ ������ �ݺ��Ǵ� ������ ǥ���Ͽ� �� ª�� ���ڿ��� �ٿ��� ǥ���ϴ� �˰����� �����ϰ� �ֽ��ϴ�.
	 * 
	 * ������ ���� "aabbaccc"�� ��� "2a2ba3c"(���ڰ� �ݺ����� �ʾ� �ѹ��� ��Ÿ�� ��� 1�� ������)
	 * �� ���� ǥ���� �� �ִµ�, �̷��� ����� �ݺ��Ǵ� ���ڰ� ���� ��� ������� ���ٴ� ������ �ֽ��ϴ�. 
	 * ���� ���, "abcabcdede"�� ���� ���ڿ��� ���� ������� �ʽ��ϴ�. 
	 * "����ġ"�� �̷��� ������ �ذ��ϱ� ���� ���ڿ��� 1�� �̻��� ������ �߶� �����Ͽ� �� ª�� ���ڿ��� 
	 * ǥ���� �� �ִ��� ����� ã�ƺ����� �մϴ�.

		���� ���, "ababcdcdababcdcd"�� ��� ���ڸ� 1�� ������ �ڸ��� ���� ������� ������, 
		2�� ������ �߶� �����Ѵٸ� "2ab2cd2ab2cd"�� ǥ���� �� �ֽ��ϴ�. 
		�ٸ� ������� 8�� ������ �߶� �����Ѵٸ� "2ababcdcd"�� ǥ���� �� ������, 
		�̶��� ���� ª�� �����Ͽ� ǥ���� �� �ִ� ����Դϴ�.

		�ٸ� ����, "abcabcdede"�� ���� ���, ���ڸ� 2�� ������ �߶� �����ϸ� "abcabc2de"�� ������, 
		3�� ������ �ڸ��ٸ� "2abcdede"�� �Ǿ� 3�� ������ ���� ª�� ���� ����� �˴ϴ�. 
		�̶� 3�� ������ �ڸ��� �������� ���� ���ڿ��� �״�� �ٿ��ָ� �˴ϴ�.

		������ ���ڿ� s�� �Ű������� �־��� ��, ���� ������ ������� 1�� �̻� ������ ���ڿ��� �߶� �����Ͽ�
		 ǥ���� ���ڿ� �� ���� ª�� ���� ���̸� return �ϵ��� solution �Լ��� �ϼ����ּ���.

		���ѻ���		
		s�� ���̴� 1 �̻� 1,000 �����Դϴ�.
		s�� ���ĺ� �ҹ��ڷθ� �̷���� �ֽ��ϴ�.
		
		����� ��
		s							result
		"aabbaccc"					7
		"ababcdcdababcdcd"			9
		"abcabcdede"				8
		"abcabcabcabcdededededede"	14
		"xababcdcdababcdcd"			17

		����� ���� ���� ����
		����� �� #1

		���ڿ��� 1�� ������ �߶� �������� �� ���� ª���ϴ�.

		����� �� #2

		���ڿ��� 8�� ������ �߶� �������� �� ���� ª���ϴ�.

		����� �� #3

		���ڿ��� 3�� ������ �߶� �������� �� ���� ª���ϴ�.

		����� �� #4

		���ڿ��� 2�� ������ �ڸ��� "abcabcabcabc6de" �� �˴ϴ�.
		���ڿ��� 3�� ������ �ڸ��� "4abcdededededede" �� �˴ϴ�.
		���ڿ��� 4�� ������ �ڸ��� "abcabcabcabc3dede" �� �˴ϴ�.
		���ڿ��� 6�� ������ �ڸ� ��� "2abcabc2dedede"�� �Ǹ�, �̶��� ���̰� 14�� ���� ª���ϴ�.

		����� �� #5

		���ڿ��� ���� �պ��� ������ ���̸�ŭ �߶�� �մϴ�.
		���� �־��� ���ڿ��� x / ababcdcd / ababcdcd �� �ڸ��� ���� �Ұ��� �մϴ�.
		�� ��� ��� ���ڿ��� �߶� ������� �����Ƿ� ���� ª�� ���̴� 17�� �˴ϴ�.
	 * 
	 */
	
	
	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
		int answer = s.length();
		
		char[] chs = s.toCharArray();
		
		Queue<Character> qList = new LinkedList<>();

		StringBuilder sbSum = new StringBuilder();
		
		int chkNum = chs.length / 2;
		
		for(int i = 1;  i < chkNum; i++ ) {
			
			StringBuilder sb = new StringBuilder();
						
			for(char c : chs) {
				qList.add(c);
			}
			
			int count = 0;
			
			while(!qList.isEmpty() && count < i) {
				sb.append(qList.poll());
				count++;
			}
			
			int samCount = 1;
			StringBuilder sbSub = new StringBuilder();
			
			while(!qList.isEmpty()) {
				count = 0;				
				while(!qList.isEmpty() && count < i) {
					if(sb.length() < i) {
						sb.append(qList.poll());
					}else {
						sbSub.append(qList.poll());
					}
					count++;
				}
				
				System.out.println(sb + " : " + sbSub + " : " + samCount);
				if(sbSub.length() > 0) {
					if(sb.toString().equals(sbSub.toString())) {						
						samCount++;
						sbSub.setLength(0);
					}else {
						if(samCount > 1) {							
							sbSum.append(samCount);
							samCount = 1;
						}else {
							
						}
						
						sbSum.append(sb);
						sb.setLength(0);
						sb.append(sbSub);
						sbSub.setLength(0);
					}
				}
			}
			
			if(samCount > 1) {
				sbSum.append(samCount);
			}
			sbSum.append(sb);
			System.out.println(i + " : " + sbSum);
			answer = (int)Math.min(answer, sbSum.length());
			
			sbSum.setLength(0);
			
		}
        return answer;
    }
}
