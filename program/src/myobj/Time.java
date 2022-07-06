package myobj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {
	
	public int hour;
	public int minute;
	public int seconds;
	public String name;
	public int timedifferenceH;
	public int timedifferenceM;
	public int timedifferenceS;
	
	public void viewTime() {
		
		System.out.println("���� �ð��� "+hour+"�� "+minute+"�� "+seconds+"�� �Դϴ�.");
		
	}
	
	public void plusHour(int hour) {
		this.hour += hour;
	}
	
	/*	
	 * 	īī���� �Ϲݱ� ��� ������ ����ä���� ���� �߿� ������ 
	 * 	���� ������ ������ �ڵ��׽�Ʈ�� ����Ǿ����ϴ�. 
	 * 	�̹� ä�뿡�� �����ڴ� ������ �ۼ� �� �Ʒ��� ���� 4���� �׸��� �ݵ�� �����ϵ��� �Ͽ����ϴ�.

		�ڵ��׽�Ʈ ���� ���߾�� �׸� cpp, java, python �� �ϳ��� �����ؾ� �մϴ�.
		���� ���� �׸� backend�� frontend �� �ϳ��� �����ؾ� �մϴ�.
		���� ��±��� �׸� junior�� senior �� �ϳ��� �����ؾ� �մϴ�.
		��ȣ�ϴ� �ҿ�Ǫ��� chicken�� pizza �� �ϳ��� �����ؾ� �մϴ�.
		
		���翵������ �ٹ��ϰ� �ִ� �ϴ���� �ڵ��׽�Ʈ ����� �м��Ͽ� ä�뿡 ������ �������鿡 
		�����ϱ� ���� �����ڵ��� ���� ������ �����ϸ� �ش� ���ǿ� �´� �����ڰ� �� ���� �� 
		���� �� �� �ִ� ������ ����� �ֽ��ϴ�.
		
		���� ���, ���������� �ñ����ϴ� ���ǻ����� ������ ���� ���°� �� �� �ֽ��ϴ�.
		�ڵ��׽�Ʈ�� java�� ����������, backend ������ �����߰�, junior ����̸鼭, 
		�ҿ�Ǫ��� pizza�� ������ ��� �� �ڵ��׽�Ʈ ������ 50�� �̻� ���� �����ڴ� �� ���ΰ�?

		���� �� �ܿ��� �� �������� ��Ȳ�� ���� �Ʒ��� ���� �پ��� ������ ���ǰ� ���� �� �ֽ��ϴ�.

		�ڵ��׽�Ʈ�� python���� ����������, frontend ������ �����߰�, 
		senior ����̸鼭, �ҿ�Ǫ��� chicken�� ������ ��� �� �ڵ��׽�Ʈ 
		������ 100�� �̻� ���� ����� ��� �� ���ΰ�?
		
		�ڵ��׽�Ʈ�� cpp�� ����������, senior ����̸鼭, 
		�ҿ�Ǫ��� pizza�� ������ ��� �� �ڵ��׽�Ʈ ������ 100�� �̻� ���� ����� ��� �� ���ΰ�?
		
		backend ������ �����߰�, senior ����̸鼭 �ڵ��׽�Ʈ 
		������ 200�� �̻� ���� ����� ��� �� ���ΰ�?
		
		�ҿ�Ǫ��� chicken�� ������ ��� �� �ڵ��׽�Ʈ ������ 250�� �̻� ���� ����� ��� �� ���ΰ�?
		�ڵ��׽�Ʈ ������ 150�� �̻� ���� ����� ��� �� ���ΰ�?
		
		��, ���������� �ñ����ϴ� ������ ������ ���� ���¸� �����ϴ�.

	 	* [����]�� �����ϴ� ��� �� �ڵ��׽�Ʈ ������ X�� �̻� ���� ����� ��� �� ���ΰ�?
		[����]
		�����ڰ� �������� �Է��� 4������ ������ ȹ���� �ڵ��׽�Ʈ ������ 
		�ϳ��� ���ڿ��� ������ ���� �迭 info, 
		�������� �ñ����ϴ� ���������� ���ڿ� ���·� ��� �迭 query�� �Ű������� �־��� ��,
		�� �������ǿ� �ش��ϴ� ������� ���ڸ� ������� �迭�� 
		��� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.

		[���ѻ���]
		info �迭�� ũ��� 1 �̻� 50,000 �����Դϴ�.
		info �迭 �� ������ ���� �����ڰ� �������� �Է��� 4���� ���� 
		�ڵ��׽�Ʈ ������ ��ģ "���߾�� ���� ��� �ҿ�Ǫ�� ����" �����Դϴ�.
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
		
		X�� �ڵ��׽�Ʈ ������ �ǹ��ϸ� ������ �����ϴ� ��� �� X�� �̻� ���� ����� ��� �� 
		���� ���� �ǹ��մϴ�.
		�� �ܾ�� ���鹮��(�����̽� ��) �ϳ��� ���еǾ� �ֽ��ϴ�.
		���� ���, "cpp and - and senior and pizza 500"�� "cpp�� �ڵ��׽�Ʈ�� ������, 
		����� senior �̸鼭 �ҿ�Ǫ��� pizza�� ������ ������ �� �ڵ��׽�Ʈ 
		������ 500�� �̻� ���� ����� ��� �� ���ΰ�?"�� �ǹ��մϴ�.
		
		[����� ��]
		info	query	result
		["java backend junior pizza 150"
		,"python frontend senior chicken 210"
		,"python frontend senior chicken 150"
		,"cpp backend senior pizza 260"
		,"java backend junior chicken 80"
		,"python backend senior chicken 50"]	
		
		["java and backend and junior and pizza 100"
		,"python and frontend and senior and chicken 200"
		,"cpp and - and senior and pizza 250"
		,"- and backend and senior and - 150"
		,"- and - and - and chicken 100"
		,"- and - and - and - 150"]	
		
		[1,1,1,1,2,4]
		����� ���� ���� ����
		������ ������ ǥ�� ��Ÿ���� ������ �����ϴ�.

		���		����			���		�ҿ� Ǫ��		����
		java	backend		junior	pizza		150
		python	frontend	senior	chicken		210
		python	frontend	senior	chicken		150
		cpp		backend		senior	pizza		260
		java	backend		junior	chicken		80
		python	backend		senior	chicken		50
		
		
"java and backend and junior and pizza 100" : java�� �ڵ��׽�Ʈ�� ������, backend ������ �����߰� junior ����̸鼭 �ҿ�Ǫ��� pizza�� ������ ������ �� �ڵ��׽�Ʈ ������ 100�� �̻� ���� �����ڴ� 1�� �Դϴ�.
"python and frontend and senior and chicken 200" : python���� �ڵ��׽�Ʈ�� ������, frontend ������ �����߰�, senior ����̸鼭 �ҿ� Ǫ��� chicken�� ������ ������ �� �ڵ��׽�Ʈ ������ 200�� �̻� ���� �����ڴ� 1�� �Դϴ�.
"cpp and - and senior and pizza 250" : cpp�� �ڵ��׽�Ʈ�� ������, senior ����̸鼭 �ҿ�Ǫ��� pizza�� ������ ������ �� �ڵ��׽�Ʈ ������ 250�� �̻� ���� �����ڴ� 1�� �Դϴ�.
"- and backend and senior and - 150" : backend ������ �����߰�, senior ����� ������ �� �ڵ��׽�Ʈ ������ 150�� �̻� ���� �����ڴ� 1�� �Դϴ�.
"- and - and - and chicken 100" : �ҿ�Ǫ��� chicken�� ������ ������ �� �ڵ��׽�Ʈ ������ 100�� �̻��� ���� �����ڴ� 2�� �Դϴ�.
"- and - and - and - 150" : �ڵ��׽�Ʈ ������ 150�� �̻� ���� �����ڴ� 4�� �Դϴ�.
	 * 
	 * 
	 */
	
	/*
	 * 	�ڵ��׽�Ʈ ���� ���߾�� �׸� cpp, java, python �� �ϳ��� �����ؾ� �մϴ�.
		���� ���� �׸� backend�� frontend �� �ϳ��� �����ؾ� �մϴ�.
		���� ��±��� �׸� junior�� senior �� �ϳ��� �����ؾ� �մϴ�.
		��ȣ�ϴ� �ҿ�Ǫ��� chicken�� pizza �� �ϳ��� �����ؾ� �մϴ�.
		
		[����]�� "���߾�� and ���� and ��� and �ҿ�Ǫ��" ������ ���ڿ��Դϴ�.
		���� cpp, java, python, - �� �ϳ��Դϴ�.
		������ backend, frontend, - �� �ϳ��Դϴ�.
		����� junior, senior, - �� �ϳ��Դϴ�.
		�ҿ�Ǫ��� chicken, pizza, - �� �ϳ��Դϴ�.
		'-' ǥ�ô� �ش� ������ ������� �ʰڴٴ� �ǹ��Դϴ�.
	 * 
	 */
	public static void main(String[] args) {
		//String[] info = {"java backend junior pizza 150"};
		
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
		//[1,1,1,1,2,4]
	}
	
	
	
	public static int[] solution(String[] info, String[] query) {
		int[] answer = new int[query.length];
		
		ArrayList<String> infoList = new ArrayList<String>();
		ArrayList<Pattern> queryList = new ArrayList<Pattern>();
		int[] infoScore = new int[info.length];
		int[] queryScore = new int[query.length];
		
		for(int i = 0; i < info.length; i++) {
        	String[] s = info[i].split(" ");
        	StringBuilder infoSum = new StringBuilder();
        	infoSum.append(s[0].charAt(0));
        	infoSum.append(s[1].charAt(0));
        	infoSum.append(s[2].charAt(0));
        	infoSum.append(s[3].charAt(0));        	
        	infoList.add(infoSum.toString());        	
        	infoScore[i] = Integer.parseInt(s[4]);
        }
		
		for(int i = 0; i < query.length; i++) {
    		String[] q = query[i].replace('-', '.').split(" and ");
    		StringBuilder querySum  = new StringBuilder();
    		querySum.append(q[0].charAt(0));
    		querySum.append(q[1].charAt(0));
    		querySum.append(q[2].charAt(0));
    		querySum.append(q[3].charAt(0));        	
        	queryList.add(Pattern.compile(querySum.toString()));
        	queryScore[i] = Integer.parseInt(q[3].replaceAll("\\D", ""));
		}		

		int i = 0;		
		for(Pattern p : queryList) {
			int qScore = queryScore[i];			
			int j = 0;
			for(String s : infoList) {
				if(infoScore[j++] >= qScore) {
					Matcher m = p.matcher(s); 
					if(m.find()) {
						answer[i]++;
					}
				}else {
					//break;
				}
			}
			i++;
		}

		/*
		ArrayList<Info> infoList = new ArrayList<>();
		
		for(int i = 0; i < info.length; i++) {
        	String[] s = info[i].split(" ");
        	StringBuilder infoSum = new StringBuilder();
        	infoSum.append(s[0].charAt(0));
        	infoSum.append(s[1].charAt(0));
        	infoSum.append(s[2].charAt(0));
        	infoSum.append(s[3].charAt(0));  
        	infoList.add(new Info(infoSum.toString(), Integer.parseInt(s[4])));
        }

		
		Collections.sort(infoList, new Comparator<Info>() {
			@Override
			public int compare(Info o1, Info o2) {
				return o1.getScore() > o2.getScore() ? -1 : 1;
			}
		});

		ArrayList<String> queryList = new ArrayList<String>();
		int[] queryScore = new int[query.length];
		
		for(int i = 0; i < query.length; i++) {
    		String[] q = query[i].replace('-', '.').split(" and ");
    		StringBuilder querySum  = new StringBuilder();
    		querySum.append(q[0].charAt(0));
    		querySum.append(q[1].charAt(0));
    		querySum.append(q[2].charAt(0));
    		querySum.append(q[3].charAt(0));        	
        	queryList.add(querySum.toString());
        	queryScore[i] = Integer.parseInt(q[3].replaceAll("\\D", ""));
		}
		
		for(int i = 0; i < queryScore.length; i++) {
			Pattern p = Pattern.compile(queryList.get(i));
			Matcher m;
			int qScore = queryScore[i];
			for(Info ifo : infoList) {
				if(ifo.getScore() >= qScore) {
					m = p.matcher(ifo.getInfo());
					if(m.find()) {
						answer[i]++;
					}
				}else {
					break;
				}
			}
		}
		*/
		
		/*
		ArrayList<String> infoList = new ArrayList<String>();
		ArrayList<String> queryList = new ArrayList<String>();
		int[] infoScore = new int[info.length];
		int[] queryScore = new int[query.length];
		
		for(int i = 0; i < info.length; i++) {
        	String[] s = info[i].split(" ");
        	StringBuilder infoSum = new StringBuilder();
        	infoSum.append(s[0].charAt(0));
        	infoSum.append(s[1].charAt(0));
        	infoSum.append(s[2].charAt(0));
        	infoSum.append(s[3].charAt(0));        	
        	infoList.add(infoSum.toString());        	
        	infoScore[i] = Integer.parseInt(s[4]);
        }
		
		System.out.println(Arrays.toString(infoScore));
		
		for(int i = 0; i < query.length; i++) {
    		String[] q = query[i].replace('-', '.').split(" and ");
    		StringBuilder querySum  = new StringBuilder();
    		querySum.append(q[0].charAt(0));
    		querySum.append(q[1].charAt(0));
    		querySum.append(q[2].charAt(0));
    		querySum.append(q[3].charAt(0));        	
        	queryList.add(querySum.toString());
        	queryScore[i] = Integer.parseInt(q[3].replaceAll("\\D", ""));
		}		
		
		for(int i = 0; i < queryScore.length; i++) {
			int qScore = queryScore[i];
			String str = queryList.get(i);
			for(int j = 0; j < infoList.size(); j++) {				
				if(infoScore[j] >= qScore) {
					if(Pattern.matches(str, infoList.get(j))) {
						answer[i]++;
					}
				}else {
					break;
				}
			}			
		}
		*/
		
//		
//		for(int i = 0; i < query.length; i++) {
//			System.out.println(query[i].replaceAll(" and ", ""));
//		}
		
		//out.println(Collections.frequency(list, "aaa2"));
		
		/*
        char[][] infoList = new char[info.length][4];
        int[] infoScore = new int[info.length];
        
        for(int i = 0; i < info.length; i++) {
        	String[] s = info[i].split(" ");        	
        	for(int j = 0; j < s.length - 1; j++) {
        		infoList[i][j] = s[j].charAt(0);
        	}
        	infoScore[i] = Integer.parseInt(s[s.length - 1]);
        }
        
        for(int i = 0; i < query.length; i++) {     
        	for(int j = 0; j < infoList.length; j++) {        		        		
        		boolean chk = true;
        		String[] q = query[i].split(" and ");
        		String[] qs = q[q.length-1].split(" ");
        		if(infoScore[j] < Integer.parseInt(qs[1])) {
    				chk = false;
    				continue;
        		}
        		
        		for(int k = 0; k < q.length - 1; k++) {
        			char c = q[k].charAt(0);
            		if(c != '-') {
        				if(infoList[j][k] != c) {            			
	            			chk = false;
	            			continue;
        				}
            		}
            	}        		
        		if(chk) {	        		
	        		char c = qs[0].charAt(0);
	        		if(infoList[j][q.length-1] == c || c == '-') {
	        			answer[i]++;
	        		}
        		}

        	}
        }
        */
        return answer;
    }
	
	
}



class Info{
	private String info;
	private int score;
	
	public String getInfo() {
		return info;
	}
	
	public int getScore() {
		return score;
	}
	
	public Info(String info, int score) {
		this.info = info;
		this.score = score;
	}
	
	
}













