package quiz;

public class B07_CountE {
	
	/*
	 * 	����ڰ� ������ �Է��ϸ� �ش� ���忡 ���ĺ� e�� �� �� �����ϴ��� 
	 * 	�˷��ִ� ���α׷��� ����� ������.
	 * 	(��/�ҹ��� ��� ����� �մϴ�.)
	 */
	public static void main(String[] args) {
		
		boolean self = false;
		
		String word = "";
		
		//Scanner sc = new Scanner(System.in);
				
//		System.out.print("������ �Է��� �ּ��� >> ");		
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
			
			System.out.printf("\"%s\" ���� \n 'e'�Ǵ� 'E'�� ������ Ƚ���� %dȸ �Դϴ�.\n", word, cnt);
			
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
			
			System.out.println("�Էµ� ������ E(e)�� ���� " + count + "�� �Դϴ�.");		
		
		
		}
	}

}
