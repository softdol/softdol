package myobj;

import java.util.Stack;

public class T08_Double20220511_f {

	public static int solution(String s){
		int answer = 0;
		
		Stack<Character> st = new Stack<>();
		for(int i = 0 ; i < s.length(); i++) {
			if(!st.empty()) {
				if(!(st.peek() == s.charAt(i))) {
					st.push(s.charAt(i));
				}else {
					st.pop();
				}
			}else {
				st.push(s.charAt(i));
			}
		}
		answer = st.empty() ? 1 : 0;
		
		
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "ccdcd";
		
		System.out.println(solution(s));
	}
}
