package myobj;

import java.util.Arrays;

public class T19_Ranking20220518 {
	/*
	 * 	īī���� �Ϲݱ� ��� ������ ����ä���� ���� �߿� ������ ���� ������ ������ �ڵ��׽�Ʈ�� ����Ǿ����ϴ�. 
	 * 	�̹� ä�뿡�� �����ڴ� ������ �ۼ� �� �Ʒ��� ���� 4���� �׸��� �ݵ�� �����ϵ��� �Ͽ����ϴ�.

		�ڵ��׽�Ʈ ���� ���߾�� �׸� cpp, java, python �� �ϳ��� �����ؾ� �մϴ�.
		���� ���� �׸� backend�� frontend �� �ϳ��� �����ؾ� �մϴ�.
		���� ��±��� �׸� junior�� senior �� �ϳ��� �����ؾ� �մϴ�.
		��ȣ�ϴ� �ҿ�Ǫ��� chicken�� pizza �� �ϳ��� �����ؾ� �մϴ�.
		
		���翵������ �ٹ��ϰ� �ִ� �ϴ���� �ڵ��׽�Ʈ ����� �м��Ͽ� ä�뿡 ������ �������鿡 
		�����ϱ� ���� �����ڵ��� ���� ������ �����ϸ� �ش� ���ǿ� �´� �����ڰ� �� ���� �� ����
		 �� �� �ִ� ������ ����� �ֽ��ϴ�.
		 
		���� ���, ���������� �ñ����ϴ� ���ǻ����� ������ ���� ���°� �� �� �ֽ��ϴ�.
		
		�ڵ��׽�Ʈ�� java�� ����������
		, backend ������ �����߰�
		, junior ����̸鼭
		, �ҿ�Ǫ��� pizza�� ������ ��� �� 
		�ڵ��׽�Ʈ ������ 50�� �̻� ���� �����ڴ� �� ���ΰ�?

		���� �� �ܿ��� �� �������� ��Ȳ�� ���� �Ʒ��� ���� �پ��� ������ ���ǰ� ���� �� �ֽ��ϴ�.

		�ڵ��׽�Ʈ�� python���� ����������, frontend ������ �����߰�, 
		senior ����̸鼭, �ҿ�Ǫ��� chicken�� ������ ��� �� 
		�ڵ��׽�Ʈ ������ 100�� �̻� ���� ����� ��� �� ���ΰ�?
		
		�ڵ��׽�Ʈ�� cpp�� ����������, senior ����̸鼭, 
		�ҿ�Ǫ��� pizza�� ������ ��� �� �ڵ��׽�Ʈ ������ 100�� �̻� ���� ����� ��� �� ���ΰ�?
		
		backend ������ �����߰�, senior ����̸鼭 �ڵ��׽�Ʈ ������ 
		200�� �̻� ���� ����� ��� �� ���ΰ�?
		
		�ҿ�Ǫ��� chicken�� ������ ��� �� �ڵ��׽�Ʈ ������ 250�� �̻� ���� ����� ��� �� ���ΰ�?
		
		�ڵ��׽�Ʈ ������ 150�� �̻� ���� ����� ��� �� ���ΰ�?
		
		��, ���������� �ñ����ϴ� ������ ������ ���� ���¸� �����ϴ�.

	  	[����]�� �����ϴ� ��� �� �ڵ��׽�Ʈ ������ X�� �̻� ���� ����� ��� �� ���ΰ�?

		[����]
		�����ڰ� �������� �Է��� 4������ ������ ȹ���� �ڵ��׽�Ʈ ������ �ϳ��� ���ڿ��� 
		������ ���� �迭 info, �������� �ñ����ϴ� ���������� ���ڿ� ���·� ��� 
		�迭 query�� �Ű������� �־��� ��,
		�� �������ǿ� �ش��ϴ� ������� ���ڸ� ������� �迭�� 
		��� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

		[���ѻ���]
		info �迭�� ũ��� 1 �̻� 50,000 �����Դϴ�.
		info �迭 �� ������ ���� �����ڰ� �������� �Է��� 4���� ���� �ڵ��׽�Ʈ ������ 
		��ģ "���߾�� ���� ��� �ҿ�Ǫ�� ����" �����Դϴ�.
		
		���߾��� cpp, java, python �� �ϳ��Դϴ�.
		������ backend, frontend �� �ϳ��Դϴ�.
		����� junior, senior �� �ϳ��Դϴ�.
		�ҿ�Ǫ��� chicken, pizza �� �ϳ��Դϴ�.
		������ �ڵ��׽�Ʈ ������ �ǹ��ϸ�, 1 �̻� 100,000 ������ �ڿ����Դϴ�.
		�� �ܾ�� ���鹮��(�����̽� ��) �ϳ��� ���еǾ� �ֽ��ϴ�.
		query �迭�� ũ��� 1 �̻� 100,000 �����Դϴ�.
		query�� �� ���ڿ��� "[����] X" �����Դϴ�.
		
		[����]�� "���߾�� and ���� and ��� and �ҿ�Ǫ��" ������ ���ڿ��Դϴ�.
		���� cpp, java, python, - �� �ϳ��Դϴ�.
		������ backend, frontend, - �� �ϳ��Դϴ�.
		����� junior, senior, - �� �ϳ��Դϴ�.
		�ҿ�Ǫ��� chicken, pizza, - �� �ϳ��Դϴ�.
		'-' ǥ�ô� �ش� ������ ������� �ʰڴٴ� �ǹ��Դϴ�.
		X�� �ڵ��׽�Ʈ ������ �ǹ��ϸ� ������ �����ϴ� ��� �� X�� �̻� ���� ����� ��� �� ���� ���� �ǹ��մϴ�.
		�� �ܾ�� ���鹮��(�����̽� ��) �ϳ��� ���еǾ� �ֽ��ϴ�.
		
		���� ���, "cpp and - and senior and pizza 500"�� 
		"cpp�� �ڵ��׽�Ʈ�� ������,
		����� senior �̸鼭 �ҿ�Ǫ��� pizza�� ������ ������ �� �ڵ��׽�Ʈ ������ 500�� �̻� ���� ����� ��� �� ���ΰ�?"�� �ǹ��մϴ�.
		
		[����� ��]
		info									
		["java backend junior pizza 150"
		,"python frontend senior chicken 210"
		,"python frontend senior chicken 150"
		,"cpp backend senior pizza 260"
		,"java backend junior chicken 80"
		,"python backend senior chicken 50"]	
		
		query	
		["java and backend and junior and pizza 100"
		,"python and frontend and senior and chicken 200"
		,"cpp and - and senior and pizza 250"
		,"- and backend and senior and - 150"
		,"- and - and - and chicken 100"
		,"- and - and - and - 150"]	
		
		result
		[1,1,1,1,2,4]
	 * 
	 * 
	 */
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String[] info = {"java backend junior pizza 150"
				,"python frontend senior chicken 210"
				,"python frontend senior chicken 150"
				,"cpp backend senior pizza 260"
				,"java backend junior chicken 80"
				,"python backend senior chicken 50"};
		String[] query = {"java and backend and junior and pizza 100"
				,"python and frontend and senior and chicken 200"
				,"cpp and - and senior and pizza 250"
				,"- and backend and senior and - 150"
				,"- and - and - and chicken 100"
				,"- and - and - and - 150"};
		
		
		System.out.println(Arrays.toString(solution(info, query)));
	}
	
	
	public static int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
//        int i = 0;
//        for(String s: query) {
//        	String qry = s.replace(" and", "");
//        	qry = qry.replace(" ", "");
//        	qry = qry.replace("-", "");
//        	qry = qry.replaceAll("\\d", "");
//        	int cnt = 0;
//        	int sScore = Integer.parseInt(s.replaceAll("\\D", ""));
//        	System.out.println(qry);
//        	for(String u: info) {
//        		u = u.replace(" ", "");        		
//        		if(u.indexOf(qry) >= 0) {
//        			if(sScore <= Integer.parseInt(u.replaceAll("\\D", ""))) {
//						cnt++;
//					}
//        		}
//        	}
//        	answer[i++] = cnt;
//        }

        int i = 0;
        Arrays.sort(info);
        
		for (String s : query) {
			String[] qry = s.replace(" and", "").split(" ");
			int cnt = 0;
			for(String u : info) {
				String[] ui = u.split(" ");
				if((qry[0].equals("-") || qry[0].equals(ui[0]))
						&& (qry[1].equals("-") || qry[1].equals(ui[1]))
						&& (qry[2].equals("-") || qry[2].equals(ui[2]))
						&& (qry[3].equals("-") || qry[3].equals(ui[3]))){
					if(Integer.parseInt(qry[4]) <= Integer.parseInt(ui[4])) {
						cnt++;
					}
				}
			}
			
			answer[i++] = cnt;
		}
        return answer;		
    }
}
