package quiz;

import java.util.Scanner;

public class B15_ShuffleText {
	
	public static void main(String[] args) {
		
		boolean self = false;
		
		if(self) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문장을 입력해 주세요 >> ");
			
			String text = sc.nextLine();
			
			sc.close();
			
			char[] shuffled_text = text.toCharArray();
			
			for(int i = 0; i < 100; i++) {
				
				int x = (int)(Math.random() * shuffled_text.length);
				int y = (int)(Math.random() * shuffled_text.length);
				
				char temp = shuffled_text[x]; 
				
				shuffled_text[x] = shuffled_text[y];
				shuffled_text[y] = temp;
				
			}
			
			System.out.print(shuffled_text);
			
			shuffled_text = text.toCharArray();
			
			boolean[] pick = new boolean[shuffled_text.length];
			
			char[] original_text = text.toCharArray();
			
			StringBuilder shuffled_text_builder = new StringBuilder();
			
			while(shuffled_text_builder.length() !=  original_text.length) {
				
				int rnd = (int)(Math.random() *original_text.length);
				
				if(!pick[rnd]) {
					shuffled_text_builder.append(original_text[rnd]);
					pick[rnd] = true;
				}				
				
			}
			
			
		}else {
			
			String word = "";
			StringBuilder word2 = new StringBuilder();
			Scanner sc = new Scanner(System.in);

			System.out.print("문장을 입력해 주세요 >> ");
			
			word = sc.nextLine();
			
			sc.close();
			
			int cnt = 0;
			
			char[] ch = word.toCharArray();		
			
			while(cnt < ch.length) {
				boolean chk = true;
				while(chk) {
					int rnd = (int)(Math.random() * ch.length);
					if(ch[rnd] != '^') {
						word2.append(ch[rnd]);
						ch[rnd] = '^';
						++cnt;
						chk = false;
					}
				}
			}
			
			System.out.println("출력 문장은 : " + word2);
			
		}
		
		
	}

}
