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
		
		System.out.println("시작 시간은 "+hour+"시 "+minute+"분 "+seconds+"초 입니다.");
		
	}
	
	public void plusHour(int hour) {
		this.hour += hour;
	}
	
	/*	
	 * 	카카오는 하반기 경력 개발자 공개채용을 진행 중에 있으며 
	 * 	현재 지원서 접수와 코딩테스트가 종료되었습니다. 
	 * 	이번 채용에서 지원자는 지원서 작성 시 아래와 같이 4가지 항목을 반드시 선택하도록 하였습니다.

		코딩테스트 참여 개발언어 항목에 cpp, java, python 중 하나를 선택해야 합니다.
		지원 직군 항목에 backend와 frontend 중 하나를 선택해야 합니다.
		지원 경력구분 항목에 junior와 senior 중 하나를 선택해야 합니다.
		선호하는 소울푸드로 chicken과 pizza 중 하나를 선택해야 합니다.
		
		인재영입팀에 근무하고 있는 니니즈는 코딩테스트 결과를 분석하여 채용에 참여한 개발팀들에 
		제공하기 위해 지원자들의 지원 조건을 선택하면 해당 조건에 맞는 지원자가 몇 명인 지 
		쉽게 알 수 있는 도구를 만들고 있습니다.
		
		예를 들어, 개발팀에서 궁금해하는 문의사항은 다음과 같은 형태가 될 수 있습니다.
		코딩테스트에 java로 참여했으며, backend 직군을 선택했고, junior 경력이면서, 
		소울푸드로 pizza를 선택한 사람 중 코딩테스트 점수를 50점 이상 받은 지원자는 몇 명인가?

		물론 이 외에도 각 개발팀의 상황에 따라 아래와 같이 다양한 형태의 문의가 있을 수 있습니다.

		코딩테스트에 python으로 참여했으며, frontend 직군을 선택했고, 
		senior 경력이면서, 소울푸드로 chicken을 선택한 사람 중 코딩테스트 
		점수를 100점 이상 받은 사람은 모두 몇 명인가?
		
		코딩테스트에 cpp로 참여했으며, senior 경력이면서, 
		소울푸드로 pizza를 선택한 사람 중 코딩테스트 점수를 100점 이상 받은 사람은 모두 몇 명인가?
		
		backend 직군을 선택했고, senior 경력이면서 코딩테스트 
		점수를 200점 이상 받은 사람은 모두 몇 명인가?
		
		소울푸드로 chicken을 선택한 사람 중 코딩테스트 점수를 250점 이상 받은 사람은 모두 몇 명인가?
		코딩테스트 점수를 150점 이상 받은 사람은 모두 몇 명인가?
		
		즉, 개발팀에서 궁금해하는 내용은 다음과 같은 형태를 갖습니다.

	 	* [조건]을 만족하는 사람 중 코딩테스트 점수를 X점 이상 받은 사람은 모두 몇 명인가?
		[문제]
		지원자가 지원서에 입력한 4가지의 정보와 획득한 코딩테스트 점수를 
		하나의 문자열로 구성한 값의 배열 info, 
		개발팀이 궁금해하는 문의조건이 문자열 형태로 담긴 배열 query가 매개변수로 주어질 때,
		각 문의조건에 해당하는 사람들의 숫자를 순서대로 배열에 
		담아 return 하도록 solution 함수를 완성해 주세요.

		[제한사항]
		info 배열의 크기는 1 이상 50,000 이하입니다.
		info 배열 각 원소의 값은 지원자가 지원서에 입력한 4가지 값과 
		코딩테스트 점수를 합친 "개발언어 직군 경력 소울푸드 점수" 형식입니다.
		개발언어는 cpp, java, python 중 하나입니다.
		직군은 backend, frontend 중 하나입니다.
		경력은 junior, senior 중 하나입니다.
		소울푸드는 chicken, pizza 중 하나입니다.
		점수는 코딩테스트 점수를 의미하며, 1 이상 100,000 이하인 자연수입니다.
		각 단어는 공백문자(스페이스 바) 하나로 구분되어 있습니다.
		query 배열의 크기는 1 이상 100,000 이하입니다.
		query의 각 문자열은 "[조건] X" 형식입니다.
		
		[조건]은 "개발언어 and 직군 and 경력 and 소울푸드" 형식의 문자열입니다.
		언어는 cpp, java, python, - 중 하나입니다.
		직군은 backend, frontend, - 중 하나입니다.
		경력은 junior, senior, - 중 하나입니다.
		소울푸드는 chicken, pizza, - 중 하나입니다.
		'-' 표시는 해당 조건을 고려하지 않겠다는 의미입니다.
		
		X는 코딩테스트 점수를 의미하며 조건을 만족하는 사람 중 X점 이상 받은 사람은 모두 몇 
		명인 지를 의미합니다.
		각 단어는 공백문자(스페이스 바) 하나로 구분되어 있습니다.
		예를 들면, "cpp and - and senior and pizza 500"은 "cpp로 코딩테스트를 봤으며, 
		경력은 senior 이면서 소울푸드로 pizza를 선택한 지원자 중 코딩테스트 
		점수를 500점 이상 받은 사람은 모두 몇 명인가?"를 의미합니다.
		
		[입출력 예]
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
		입출력 예에 대한 설명
		지원자 정보를 표로 나타내면 다음과 같습니다.

		언어		직군			경력		소울 푸드		점수
		java	backend		junior	pizza		150
		python	frontend	senior	chicken		210
		python	frontend	senior	chicken		150
		cpp		backend		senior	pizza		260
		java	backend		junior	chicken		80
		python	backend		senior	chicken		50
		
		
"java and backend and junior and pizza 100" : java로 코딩테스트를 봤으며, backend 직군을 선택했고 junior 경력이면서 소울푸드로 pizza를 선택한 지원자 중 코딩테스트 점수를 100점 이상 받은 지원자는 1명 입니다.
"python and frontend and senior and chicken 200" : python으로 코딩테스트를 봤으며, frontend 직군을 선택했고, senior 경력이면서 소울 푸드로 chicken을 선택한 지원자 중 코딩테스트 점수를 200점 이상 받은 지원자는 1명 입니다.
"cpp and - and senior and pizza 250" : cpp로 코딩테스트를 봤으며, senior 경력이면서 소울푸드로 pizza를 선택한 지원자 중 코딩테스트 점수를 250점 이상 받은 지원자는 1명 입니다.
"- and backend and senior and - 150" : backend 직군을 선택했고, senior 경력인 지원자 중 코딩테스트 점수를 150점 이상 받은 지원자는 1명 입니다.
"- and - and - and chicken 100" : 소울푸드로 chicken을 선택한 지원자 중 코딩테스트 점수를 100점 이상을 받은 지원자는 2명 입니다.
"- and - and - and - 150" : 코딩테스트 점수를 150점 이상 받은 지원자는 4명 입니다.
	 * 
	 * 
	 */
	
	/*
	 * 	코딩테스트 참여 개발언어 항목에 cpp, java, python 중 하나를 선택해야 합니다.
		지원 직군 항목에 backend와 frontend 중 하나를 선택해야 합니다.
		지원 경력구분 항목에 junior와 senior 중 하나를 선택해야 합니다.
		선호하는 소울푸드로 chicken과 pizza 중 하나를 선택해야 합니다.
		
		[조건]은 "개발언어 and 직군 and 경력 and 소울푸드" 형식의 문자열입니다.
		언어는 cpp, java, python, - 중 하나입니다.
		직군은 backend, frontend, - 중 하나입니다.
		경력은 junior, senior, - 중 하나입니다.
		소울푸드는 chicken, pizza, - 중 하나입니다.
		'-' 표시는 해당 조건을 고려하지 않겠다는 의미입니다.
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













