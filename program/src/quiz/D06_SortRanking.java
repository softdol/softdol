package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking {

	/*
	 * 	여러 사람들의 기록을 저장할 수 있는 데이터를 클래스를 하나 설계하고
	 * 	해당 기록을 클리어 타임순과 점수순으로 출력할 수 있는 프로그램을 만들어보세요
	 * 
	 */
	public static void main(String[] args) {
		
		
		ArrayList<Record> records = new ArrayList<>();
		
		records.add(new Record("KHJ", 1000, 3300000));
		records.add(new Record("JJJ", 800, 4000000));
		records.add(new Record("KIM", 3300, 2100000));
		records.add(new Record("JJJ", 2200, 3100000));
		records.add(new Record("J22", 2200, 3200000));
		records.add(new Record("J12", 2200, 3400000));
		records.add(new Record("J33", 2200, 3500000));
		records.add(new Record("Jff", 2200, 3600000));
		records.add(new Record("Jgg", 2200, 3700000));
		records.add(new Record("aaa", 2200, 330000));
		
		Collections.sort(records);
		
		System.out.println(records);
		
		Collections.sort(records, Record.ORDER_BY_SCORE_DESC);
		System.out.println(records);
		
		
//		ArrayList<RankingInfo> list = new ArrayList<>();
//		
//		for(int i = 0; i < 100; i++) {
//			list.add(new RankingInfo());
//		}
//		
//		for(RankingInfo r: list) {
//			System.out.println(r);
//		}
//		
//		System.out.println();
//		Collections.sort(list, new TimeList());
//		
//		for(RankingInfo r: list) {
//			System.out.println(r);
//		}
//		
//		System.out.println();
//		
//		Collections.sort(list, new ScoreList());
//		
//		for(RankingInfo r: list) {
//			System.out.println(r);
//		}
		
	}
	
}

class Record implements Comparable<Record> {
	
	
	// Record의 정렬 기준이므로 Record 안에 넣어놓으면 응집도를 높일 수 있다
	// (소프트웨어 응집도: 관련 있는 것들끼리 잘 묶어놓은 정도. 높을수록 좋다.)
	public static Comparator<Record> ORDER_BY_SCORE_DESC = new Comparator<>() {

		@Override
		public int compare(Record r1, Record r2) {
			// TODO Auto-generated method stub
			//return r1.score != r2.score ? r2.score - r1.score : r1.time - r2.time;
			// return Integer.compare(r2.score, r1.score);
			return Integer.compare(r2.score, r1.score) == 0 ?
					Integer.compare(r1.time, r2.time) : Integer.compare(r2.score, r1.score);
		}
		
	};
	
	String name;
	int time;
	int score;
	
	public Record(String name, int time, int score) {
		this.name = name;
		this.time = time;
		this.score = score;
				
	}

	@Override
	public int compareTo(Record r) {
		// TODO Auto-generated method stub
		return time != r.time ? time - r.time : r.score - score;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name: %s, time: %d, score: %d\n", name, time, score);
	}
}


class TimeList implements Comparator<RankingInfo>{

	@Override
	public int compare(RankingInfo o1, RankingInfo o2) {
		// TODO Auto-generated method stub
		return o1.timeH != o2.timeH ? o1.timeH - o2.timeH : o2.score - o1.score;
	}
	
}

class ScoreList implements Comparator<RankingInfo>{

	@Override
	public int compare(RankingInfo o1, RankingInfo o2) {
		// TODO Auto-generated method stub
		return o2.score != o1.score ? o2.score - o1.score : o1.timeH - o2.timeH;
	}
	
}

class RankingInfo implements Comparable<RankingInfo>{
	
	final static String[] FIRST_NAME = {"길동", "꺽정", "건우", "지민", "민호", "도훈", "승훈", "원형", "미영", "종민", "서영","종호","태영"};
	final static String[] LAST_NAME = {"손","김","이","박","김","홍","황","곽","허","최"};
	
	private String name;
	int timeH;
	int timeM;
	int score;
	
	public RankingInfo() {
		name = LAST_NAME[(int)(Math.random() * LAST_NAME.length)]
				+ FIRST_NAME[(int)(Math.random() * FIRST_NAME.length)];
		timeH = (int)(Math.random() * 24);
		//timeM = (int)(Math.random() * 59);
		score = (int)(Math.random() * 30000);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return String.format("[%s]%3d시 %3d분\t[점수 : %d]", name, timeH, timeM, score);
		return String.format("[%s]%3d시\t[점수 : %d]", name, timeH, score);
	}

	@Override
	public int compareTo(RankingInfo r) {
		// TODO Auto-generated method stub
		//return timeH != o.timeH ? timeH - o.timeH : (timeM != o.timeM ? timeM - o.timeM : score - o.score); 
		return timeH != r.timeH ? timeH - r.timeH : score - r.score;
	}
	
}
