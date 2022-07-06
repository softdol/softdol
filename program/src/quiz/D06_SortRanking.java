package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D06_SortRanking {

	/*
	 * 	���� ������� ����� ������ �� �ִ� �����͸� Ŭ������ �ϳ� �����ϰ�
	 * 	�ش� ����� Ŭ���� Ÿ�Ӽ��� ���������� ����� �� �ִ� ���α׷��� ��������
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
	
	
	// Record�� ���� �����̹Ƿ� Record �ȿ� �־������ �������� ���� �� �ִ�
	// (����Ʈ���� ������: ���� �ִ� �͵鳢�� �� ������� ����. �������� ����.)
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
	
	final static String[] FIRST_NAME = {"�浿", "����", "�ǿ�", "����", "��ȣ", "����", "����", "����", "�̿�", "����", "����","��ȣ","�¿�"};
	final static String[] LAST_NAME = {"��","��","��","��","��","ȫ","Ȳ","��","��","��"};
	
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
		//return String.format("[%s]%3d�� %3d��\t[���� : %d]", name, timeH, timeM, score);
		return String.format("[%s]%3d��\t[���� : %d]", name, timeH, score);
	}

	@Override
	public int compareTo(RankingInfo r) {
		// TODO Auto-generated method stub
		//return timeH != o.timeH ? timeH - o.timeH : (timeM != o.timeM ? timeM - o.timeM : score - o.score); 
		return timeH != r.timeH ? timeH - r.timeH : score - r.score;
	}
	
}
