package quiz;

public class B12_TempPassword {
	
	/*
	 * 
	 * 	6자리의 랜덤 임시 비밀번호를 생성하는 프로그램을 만들어 보세요.
	 * 	(비밀번호를 구성하는 문자 - 영어, 숫자, 특수문자)
	 * 
	 * 	※ 사용가능한 특수문자
	 * 	!"#$%'()*+,-./:;<=>?@[\]^_'{|}~
	 */
	

	public static void main(String[] args) {
		
		String symbols = "abcdefghijk";		
		String pass = "";
		for(int i = 0; i < 6 ; i++) {
			
			int rnd_idx = (int)(Math.random() * symbols.length());
			char rnd_ch = symbols.charAt(rnd_idx);
			
			pass += rnd_ch;
			
		}
		
//				
//		for(int i = 0 ; i < 6; ++i) {
//			//33 ~ 126
//			int rndNum = (int)(Math.random() * 94 + 33);
//			char ch = (char)rndNum;			
//			pass += ch;
//		}
		
		System.out.println(pass);
		
		
	}
	
}
