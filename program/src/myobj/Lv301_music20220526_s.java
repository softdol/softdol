package myobj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Lv301_music20220526_s {
	/*
	 * ���� ����
		��Ʈ���� ����Ʈ���� �帣 ���� ���� ���� ����� �뷡�� �� ���� ��� ����Ʈ �ٹ��� ����Ϸ� �մϴ�. 
		�뷡�� ���� ��ȣ�� �����ϸ�, �뷡�� �����ϴ� ������ ������ �����ϴ�.

		���� �뷡�� ���� ����� �帣�� ���� �����մϴ�.
		�帣 ������ ���� ����� �뷡�� ���� �����մϴ�.
		�帣 ������ ��� Ƚ���� ���� �뷡 �߿����� ���� ��ȣ�� ���� �뷡�� ���� �����մϴ�.
		�뷡�� �帣�� ��Ÿ���� ���ڿ� �迭 genres�� �뷡�� ��� Ƚ���� ��Ÿ���� ���� �迭 plays�� �־��� ��, 
		����Ʈ �ٹ��� �� �뷡�� ���� ��ȣ�� ������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.

		���ѻ���
		genres[i]�� ������ȣ�� i�� �뷡�� �帣�Դϴ�.
		plays[i]�� ������ȣ�� i�� �뷡�� ����� Ƚ���Դϴ�.
		genres�� plays�� ���̴� ������, �̴� 1 �̻� 10,000 �����Դϴ�.
		�帣 ������ 100�� �̸��Դϴ�.
		�帣�� ���� ���� �ϳ����, �ϳ��� � �����մϴ�.
		��� �帣�� ����� Ƚ���� �ٸ��ϴ�.
		
		����� ��
		genres											plays						return
		["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]

		����� �� ����
		classic �帣�� 1,450ȸ ����Ǿ�����, classic �뷡�� ������ �����ϴ�.

		���� ��ȣ 3: 800ȸ ���
		���� ��ȣ 0: 500ȸ ���
		���� ��ȣ 2: 150ȸ ���
		pop �帣�� 3,100ȸ ����Ǿ�����, pop �뷡�� ������ �����ϴ�.

		���� ��ȣ 4: 2,500ȸ ���
		���� ��ȣ 1: 600ȸ ���
		���� pop �帣�� [4, 1]�� �뷡�� ����, classic �帣�� [3, 0]�� �뷡�� �״����� �����մϴ�.

		�� ���� - 2019�� 2�� 28�� �׽�Ʈ���̽��� �߰��Ǿ����ϴ�.
	 * 
	 */
	
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		//System.out.println(solution(genres, plays)); 
		System.out.println(Arrays.toString(solution(genres, plays)));
	}
	
	public static int[] solution(String[] genres, int[] plays) {
		
		HashMap<String, Integer> timeList = new HashMap<>();
		ArrayList<Music> mList = new ArrayList<>();
		ArrayList<Integer> viewList = new ArrayList<>();
		
		for(int i = 0; i < genres.length; i++) {
			timeList.put(genres[i], timeList.getOrDefault(genres[i],0) + plays[i] );
			mList.add(new Music(genres[i], plays[i], i));
		}

		Collections.sort(mList);
		//System.out.println(mList);
		
		List<Entry<String, Integer>> orderList = new ArrayList<Entry<String, Integer>>(timeList.entrySet());
		
		Collections.sort(orderList, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		//System.out.println(orderList);
		for(Entry<String,Integer> e : orderList) {
			//System.out.println(e.getKey() + " : " + e.getValue());
			int count = 0;
			for(int i = 0; i < mList.size(); i++) {
				if(e.getKey().contains(mList.get(i).getName())) {
					//System.out.println(e.getKey() + " : " + mList.get(i).getIdx());
					viewList.add(mList.get(i).getIdx());
					count++;
				}
				if(count > 1) {
					count = 0;
					break;
				}
			}
			count = 0;
			
		}		
								
//		System.out.println(timeList);
//		System.out.println(orderList);
//		Collections.sort(orderList, Collections.reverseOrder());
//		System.out.println(orderList);
		
//		System.out.println(viewList);
        int[] answer = new int[viewList.size()];
        for(int i = 0; i < viewList.size(); i++) {
        	answer[i] = viewList.get(i);
        }
        
        
        return answer;
    }
}

//class Music implements Comparator<Music>{
class Music implements Comparable<Music>{
	private String name;
	private int play;
	private int idx;
	
	public Music(String name, int play, int idx) {
		this.name = name;
		this.play = play;
		this.idx = idx;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPlay() {
		return play;
	}
	
	public int getIdx() {
		return idx;
	}
	
	@Override
	public int compareTo(Music o) {
		return this.play > o.play ? -1 : this.play != o.play ? 1 : this.idx > o.idx ? 1 : -1;
	}

	@Override
	public String toString() {
		return String.format("%s(%d) : %d", name, idx, play);
	}

	
}






