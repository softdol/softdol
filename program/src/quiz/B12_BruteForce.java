package quiz;

public class B12_BruteForce {
	
	/*
	 * 	������ �ӽ� ��й�ȣ�� ���⶧����
	 * 	��� ��й�ȣ�� �����ϰ� �����ϴ� ���α׷��� ����� ������.
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
		 * 	�� ���ڿ��� ����� ����  += ���� ���ڿ��� �ѱ��ھ� �ϼ���Ű�� ���� �ſ� ������
		 * 
		 * 	���ڿ��� �� ���ھ� �ϼ�Ű��� ���� ���� StringBuilder��� Ŭ������ ����Ѵ�
		 *
		 *	append() : += ���� ���ڸ� �Ѱ��� �ڿ� �߰��ϴ� �Ͱ� ���� ȿ���� ���� �޼���(�Լ�)
		 * 	insert() : �ش� ���ڿ��� �� �տ� ���ڸ� �߰��ϴ� �޼���
		 * 
		 */
		
		for(int i = 0; i < mac_index ; ++i) {
			//System.out.println(i);
			//String brute_password = "";
			// ���ο� StringBuilder�� ����(��ĳ�� �������)
			StringBuilder brute_password = new StringBuilder();
			
			int brute_idx = i;
			
			for(int j = 0; j < pass.length(); ++j) {
				brute_password.insert(0, symbols.charAt(brute_idx % symbols.length()));
				//brute_password += symbols.charAt(brute_idx % symbols.length());
				brute_idx /= symbols.length();
				
				// StringBuilder �� ������� ����� ���ڿ��� ������
				if(pass.equals(brute_password.toString())){
					System.out.println("--------------------------------");
					System.out.println("�ءء� " + brute_password + " �ءء�");							
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
//							System.out.println("�ءء� " + samplePass4 + " �ءء�");							
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

