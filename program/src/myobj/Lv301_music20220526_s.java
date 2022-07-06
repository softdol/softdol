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
	 * 문제 설명
		스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 
		노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

		속한 노래가 많이 재생된 장르를 먼저 수록합니다.
		장르 내에서 많이 재생된 노래를 먼저 수록합니다.
		장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
		노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 
		베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

		제한사항
		genres[i]는 고유번호가 i인 노래의 장르입니다.
		plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
		genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
		장르 종류는 100개 미만입니다.
		장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
		모든 장르는 재생된 횟수가 다릅니다.
		
		입출력 예
		genres											plays						return
		["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]

		입출력 예 설명
		classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.

		고유 번호 3: 800회 재생
		고유 번호 0: 500회 재생
		고유 번호 2: 150회 재생
		pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.

		고유 번호 4: 2,500회 재생
		고유 번호 1: 600회 재생
		따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.

		※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.
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






