package quiz;

public class B07_CountE {
	
	/*
	 * 	사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇 번 등장하는지 
	 * 	알려주는 프로그램을 만들어 보세요.
	 * 	(대/소문자 모두 세어야 합니다.)
	 */
	public static void main(String[] args) {
		
		boolean self = false;
		
		String word = "";
		
		//Scanner sc = new Scanner(System.in);
				
//		System.out.print("문장을 입력해 주세요 >> ");		
//		
//		word = sc.nextLine();
//		
//		sc.close();
		
		if(!self) {
			
			word = "I love strawberry ICECREAM";
			//System.out.println(word.length()-1);
			int cnt = 0;
			
			for(int i = 0; i < word.length(); ++i) {
				char ch = word.charAt(i);
				
				if(ch == 'e' || ch == 'E') {
					++cnt;
				}
			}
			
			System.out.printf("\"%s\" 에서 \n 'e'또는 'E'가 등장한 횟수는 %d회 입니다.\n", word, cnt);
			
		}
		else {
			
			//word = "wfgwEefddwe";
			word = "I love strawberry ICECREAM";
		
			int count = 0;
			
			for(int i = 0; i < word.length(); ++i) {
				if(word.charAt(i) == 'E' || word.charAt(i) == 'e') {
					count++;
				}
			}
			
			System.out.println("입력된 문장의 E(e)의 수는 " + count + "개 입니다.");		
		
		
		}
	}

}
