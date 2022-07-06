package myobj;

public class T09_Hindex20220511_s {
	
	public static int solution(int[] citations) {
        int answer = 0;
        
        int maxCnt = 0;

        for(int i = 0, upCnt = 0; i < citations.length; i++) {
            for(int j = 0; j < citations.length; j++) {
                if(citations[i] <= citations[j]) {
                    upCnt++;                    
                }
                if(citations[i] <= upCnt) {
                    break;
                }               
            }

            maxCnt = maxCnt < upCnt ? upCnt : maxCnt;
            answer = maxCnt;
            if(maxCnt == upCnt){
                answer = citations[i];
            }
            upCnt = 0;
        }
        System.out.println(maxCnt);
        
        
//        Arrays.sort(citations);
//
//        int max = 0;
//        for(int i = citations.length-1; i > -1; i--){
//            int min = (int)Math.min(citations[i], citations.length - i);
//            if(max < min) max = min;
//        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] citations = {3, 0, 6, 1, 5};
		
		System.out.println("answer : " + solution(citations));
	}

}
