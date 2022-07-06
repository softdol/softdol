package quiz;

public class B12_BruteForce {
	
	/*
	 * 	생성된 임시 비밀번호를 맞출때까지
	 * 	모든 비밀번호를 생성하고 대조하는 프로그램을 만들어 보세요.
	 * 
	 */

	public static void main(String[] args) {
		
		String symbols = "!\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMN"
				+ "OPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}";
		
		String pass = "";
		for(int i = 0; i < 4 ; i++) {
			
			int rnd_idx = (int)(Math.random() * symbols.length());
			char rnd_ch = symbols.charAt(rnd_idx);
			
			pass += rnd_ch;
			
		}
		
	
		pass = "!!IZb";
		
		double mac_index = Math.pow(symbols.length(), 4);
		
		/*
		 * 	빈 문자열을 만들어 놓고  += 으로 문자열을 한글자씩 완성시키는 것은 매우 느리다
		 * 
		 * 	문자열을 한 글자씩 완성키기고 싶을 때는 StringBuilder라는 클래스를 사용한다
		 *
		 *	append() : += 으로 문자를 한갈자 뒤에 추가하는 것과 같은 효과를 가진 메서드(함수)
		 * 	insert() : 해당 문자열의 맨 앞에 글자를 추가하는 메서드
		 * 
		 */
		
		for(int i = 0; i < mac_index ; ++i) {
			//System.out.println(i);
			//String brute_password = "";
			// 새로운 StringBuilder를 생성(스캐너 만들듯이)
			StringBuilder brute_password = new StringBuilder();
			
			int brute_idx = i;
			
			for(int j = 0; j < pass.length(); ++j) {
				brute_password.insert(0, symbols.charAt(brute_idx % symbols.length()));
				//brute_password += symbols.charAt(brute_idx % symbols.length());
				brute_idx /= symbols.length();
				
				// StringBuilder 로 만들어진 결과를 문자열로 꺼내기
				if(pass.equals(brute_password.toString())){
					System.out.println("--------------------------------");
					System.out.println("※※※ " + brute_password + " ※※※");							
					return;
				}
			}
						
//			brute_password += symbols.charAt(i % symbols.length());
//			brute_password += symbols.charAt(i / symbols.length() % symbols.length());
//			brute_password += symbols.charAt(i / symbols.length() / symbols.length() % symbols.length());
//			brute_password += symbols.charAt(i / symbols.length() / symbols.length() / symbols.length() % symbols.length());
			
			System.out.println(brute_password);
		}
			
	
		
//		for(int i=0; i < symbols.length(); ++i) {
//			String samplePass1 = "" + symbols.charAt(i);
//			
//			for(int j=0; j < symbols.length(); ++j) {
//				String samplePass2 = samplePass1 + symbols.charAt(j);
//				
//				for(int k=0; k < symbols.length(); ++k) {
//					String samplePass3 = samplePass2 + symbols.charAt(k);
//					
//					for(int l=0; l < symbols.length(); ++l) {
//						
//						String samplePass4 = samplePass3 + symbols.charAt(l);
//						System.out.println(samplePass4);
//		
//						if(pass.equals(samplePass4)){
//							System.out.println("--------------------------------");
//							System.out.println("※※※ " + samplePass4 + " ※※※");							
//							return;
//						}
//						
//					}	
//					
//				}	
//				
//			}	
//			
//			
//		}
			
			
			
					
//		for(int i = 33 ; i < 126 ; ++i) {
//			System.out.print((char)i);
//		}
		
		
	}
	
}

