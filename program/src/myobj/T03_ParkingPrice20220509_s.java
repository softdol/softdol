package myobj;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class T03_ParkingPrice20220509_s {

	public static void main(String[] args) {
		
//		int[] fees = {180, 5000, 10, 600};		
//		String[] records = {"07:59 0148 IN","05:34 5961 IN", "06:00 0000 IN", 
//				"06:34 0000 OUT", "07:59 5961 OUT", 
//				 "18:59 0000 IN", 
//				"19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
		
		int[] fees = {120, 0, 60, 591};		
		String[] records = {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT",
				"18:00 0202 OUT","23:58 3961 IN"};
		
		System.out.println(Arrays.toString(solution(fees, records)));
		
	}
	
	public static int[] solution(int[] fees, String[] records) {
		
		int[] answer = {};
		
		int[][] list = new int[records.length][3];
		
		for(int i = 0; i < records.length; i++) {
			String[] temp = records[i].split(" ");
			String[] time = temp[0].split(":");
			int timeMin = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
			int inOut = temp[2].equals("IN") ? 0 : 1;
			
			list[i][0] = timeMin;
			list[i][1] = Integer.parseInt(temp[1]);
			list[i][2] = inOut;					
		}
		
		Map<Integer, Integer> hsList = new TreeMap<>();
		boolean chkOut = true;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i][2] == 0){
				for(int j = i + 1; j < list.length; j++) {
					if(list[i][1] == list[j][1] && list[j][2] == 1) {						
						hsList.put(list[i][1], hsList.getOrDefault(list[i][1], 0) + (list[j][0] - list[i][0]));
						list[i][2] = 2;
						list[j][2] = 3;
						chkOut = false;
						break;
					}
				}
				if(chkOut) {
					list[i][2] = 2;
					hsList.put(list[i][1], hsList.getOrDefault(list[i][1], 0) + (1439 - list[i][0]));
				}
				chkOut = true;
			}
		}
		
		int defTime = fees[0];
		int defPrice = fees[1];
		int perMin = fees[2];
		int perWon = fees[3];
		int resultMin = 0;
		int price = 0;
		
		answer = new int[hsList.size()];
		
		
		
		int count = 0;
		for(Integer key : hsList.keySet()) {			
			resultMin = (hsList.get(key) - defTime) / perMin;
			if((hsList.get(key) - defTime) % perMin > 0) {
				resultMin++;
			}
			price = defPrice + resultMin * perWon;
			if(hsList.get(key) <= defTime) {
				price = defPrice;
			}
			answer[count++] = price;
		}
		
		
		return answer;
	}
}
