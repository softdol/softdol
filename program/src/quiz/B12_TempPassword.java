package quiz;

public class B12_TempPassword {
	
	/*
	 * 
	 * 	6�ڸ��� ���� �ӽ� ��й�ȣ�� �����ϴ� ���α׷��� ����� ������.
	 * 	(��й�ȣ�� �����ϴ� ���� - ����, ����, Ư������)
	 * 
	 * 	�� ��밡���� Ư������
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
