package quiz;

import java.util.Scanner;

public class B07_CountAlphabet {
	
	/*
	 * 	����ڰ� ����� �˻��ϰ� ���� ���ĺ��� �Է��ϸ� 
	 * 	�ش� ���ĺ��� �� ȸ �����ϴ��� �˷��ִ� ���α׷��� ��������.
	 * 
	 * 	(��/�ҹ��� ��� ����� �մϴ�.)
	 * 
	 */
	
	public static void main(String[] args){
		
		boolean self = false;
		
		if(!self) {
			
			Scanner sc = new Scanner(System.in);			
			
			String str, query;
			System.out.print("������ �Է��� �ּ��� >> ");
			str = sc.nextLine();
			
			System.out.print("���ĺ��� �Է��� �ּ��� >> ");
			query = sc.next();
			
			System.out.println("���� : " + str + ", �˻���: " + query);
			sc.close();
			
			if(query.length() != 1) {
				System.out.println("�˻���� �ϳ��� �Է��ϼž� �մϴ�.. ���α׷� ���� ����");
				return;
			}
			
			
			//����ڰ� �˻���� �ҹ��ڸ� �Է��ߴٸ� �빮�ڸ� q2�� �߰��ϰ�
			//����ڰ� �˻���� �빮�ڸ� �Է��ߴٸ� �ҹ��ڸ� q2�� �߰��ϰ�
			char q1 = query.charAt(0);
			char q2;
			
			if(q1 >= 'a' && q1 <='z') {
				q2 = (char)(q1 - 32);
			} else if (q1 >= 'A' && q1 <= 'Z') {
				q2 = (char)(q1 + 32);
			} else {
				System.out.println("�˻���� ��� �����մϴ�... ���α׷��� �����մϴ�");
				return;
			}
			
			//System.out.println(Math.abs('A'- 'a'));
			int cnt= 0;
			
			for(int i = 0 ; i < str.length(); ++i) {
				char ch = str.charAt(i);
				
				if(ch == q1 || ch == q2) {
					++cnt;
				}
			}
			
			System.out.printf("%s���� %c or %c�� %dȸ �����մϴ�. \n", str, q1, q2, cnt);
			
		}else {
			
			String str = "I love strawberry ICECREAM";
			char search1 = ' ';	//�ҹ���
			char search2;		//�빮��
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �Է��� �ּ��� >> ");
			str = sc.nextLine();
			
			System.out.print("���ĺ��� �Է��� �ּ��� >> ");
			//search1 = sc.next(char a);
			search1 = sc.next().charAt(0);
			
			sc.close();
			
			if(search1 >= 97 && search1 <= 122) { //�ҹ���
				search2 =  (char)(search1 - 32);
			}else if(search1 >= 65 && search1 <= 90) {	//�빮��
				search2 = search1;
				search1 = (char)(search1 + 32);
			}else {	// ���� �ƴ�
				System.out.println("���ĺ��� �ƴմϴ�.");
				return;
			}
			
			int cnt = 0;
			
			for(int i = 0; i < str.length(); ++i) {
				char ch = str.charAt(i);
				
				if(ch == search1 || ch == search2) {
					++cnt;
				}
			}
			
			System.out.printf("\"%s\" ���� \n '%c'�Ǵ� '%c'�� ������ Ƚ���� %dȸ �Դϴ�.\n", str, search1, search2, cnt);
			
		}
		
		
		
	}

}
