package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D08_PhoneBook {
	
	/*
	 * 	# HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
	 * 	
	 * 	1. [�׷�/��ȭ��ȣ/��������]�� �����ؾ� �Ѵ�
	 * 	2. ��ȭ��ȣ�� �ؽ��ʿ� �׷���� Ű������ ������ �ش� �׷��� �ؽ����� ���� �� �ִ�
	 * 	3. ���� �ؽ��ʿ� ��ȭ��ȣ�� Ű������ ������ �׻���� ���������� ���� �� �ִ�  
	 * 
	 * 	# �����ؾ� �� �޼���
	 * 
	 * 	1. ���ο� �׷��� �߰��ϴ� �޼���
	 * 	2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ �� ���������� ����ϴ� �޼���
	 * 	3. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	 *  4. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ����� ����� �����ִ� �޼���
	 *  5. ��ϵ� ��� ������ ���ϴ� �׸� �������� ����/������������ ����ϴ� �޼���
	 *  
	 */
	
	//PhoneBook phoneGroup
	
	static HashMap<String, HashMap<String, UserInfo>> phoneGroup = 
			new HashMap<String,HashMap<String, UserInfo>>();
	
	public static void insGroup(String groupName) {
		if(!phoneGroup.containsKey(groupName)) {
			phoneGroup.put(groupName, new HashMap<String, UserInfo>() );
			System.out.println("�� �׷��� �����߽��ϴ�.");
		}else {
			System.out.println("�̹� �����ϴ� �׷� �Դϴ�.");
		}
	}
	
	public static void insInfo(String groupName, String phoneNum, UserInfo info) {
		phoneGroup.get(groupName).put(phoneNum, info);
	}
	
	public static void searchPhone(String phoneNum, char chkName, boolean ascChk) {
		Set<String> keys = phoneGroup.keySet();
		System.out.println(" ��ȭ��ȣ �˻� ��� ["+ phoneNum +"]");
		List<UserInfo> infoList = new ArrayList<>();
		for(String key: keys) {
			Set<String> subKeys = phoneGroup.get(key).keySet();
			for(String subKey: subKeys) {
				if(subKey.indexOf(phoneNum) >= 0) {
					infoList.add(phoneGroup.get(key).get(subKey));
				}
			}
		}
		viewList(infoList, chkName, ascChk);
	}
	
	public static void searchName(String name, char chkName, boolean ascChk) {
		Set<String> keys = phoneGroup.keySet();
		System.out.println(" �̸� �˻� ��� [" + name + "]");		
		List<UserInfo> infoList = new ArrayList<>();
		for(String key: keys) {
			Set<String> subKeys = phoneGroup.get(key).keySet();
			for(String subKey: subKeys) {
				if(phoneGroup.get(key).get(subKey).name.indexOf(name) >= 0) {
					infoList.add(phoneGroup.get(key).get(subKey));
				}
			}
		}
		viewList(infoList, chkName, ascChk);
	}
	
	public static void viewList(List<UserInfo> infoList, char chkName, boolean ascChk) {
		Collections.sort(infoList, new OrderChk(chkName,ascChk));
		for(UserInfo info : infoList) {
			System.out.printf("%s %s(%3d): %s\n", info.group,info.name, info.age, info.phone);
		}
	}
	
	public static void viewAll(char chkName, boolean ascChk) {
		
		List<String> keys = new ArrayList<>(phoneGroup.keySet());
		
		List<UserInfo> infoList = new ArrayList<>();
		for(String key: keys) {
			List<String> subKeys = new ArrayList<>(phoneGroup.get(key).keySet());
			for(String subKey: subKeys) {				
				infoList.add(phoneGroup.get(key).get(subKey));
			}
		}
		viewList(infoList, chkName, ascChk);		
	}
	
	public static void main(String[] args) {
		
		insGroup("ȸ��");
		insGroup("����");
		insGroup("ģ��");
		
		String[] s = {"����","ȸ��","ģ��"};
		String[] fName = {"�浿", "����", "�ǿ�", "����", "��ȣ", "����", "����", "����", "�̿�", "����", "����","��ȣ","�¿�"};
		String[] lName = {"��","��","��","��","��","ȫ","Ȳ","��","��","��"};
		
		//System.out.println(phoneGroup);
		
		for(int i = 0; i < 100; i++) {
		
			UserInfo info = new UserInfo();
			
			info.name = lName[(int)(Math.random() * lName.length)] + fName[(int)(Math.random() * fName.length)];
			info.age = (int)(Math.random() * 100 + 1);
			info.phone = "010" + (int)(Math.random() * 9999 + 1000) + (int)(Math.random() * 9999 + 1000);
			info.phone = info.phone.substring(0,11);
			info.group = s[(int)(Math.random() * s.length)];
			
			insInfo(info.group
				, info.phone
				, info);
		}
		//System.out.println(phoneGroup);
		// ����ȣ
		searchPhone("11", 'N', true);
		System.out.println();
		// �̸�
		searchName("��", 'P', true);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------���� �׽�Ʈ------");
		
		viewAll('A',true);
		

	}
	
	

}
class OrderChk implements Comparator<UserInfo>{

	boolean ascChk;
	char chkName;
	
	/***
	 * 
	 * @param chkName : N �̸�, A ����, P ��ȭ��ȣ
	 * @param ascChk : true ��������, false ��������
	 */
	public OrderChk(char chkName, boolean ascChk) {
		this.ascChk = ascChk;
		this.chkName = chkName;
	}
	
	@Override
	public int compare(UserInfo u1, UserInfo u2) {
		// TODO Auto-generated method stub		
		
		if(!ascChk) {
			UserInfo temp = u1;
			u1 = u2;
			u2 = temp;
		}
		
		switch(chkName) {
		case 'N':
			return u1.name.compareTo(u2.name);			
		case 'A':
			return u1.age != u2.age ? u1.age - u2.age : 0;
		case 'P':
			return u1.phone.compareTo(u2.phone);
		default:
			return u1.name.compareTo(u2.name);
		}
		
	}
	
}

class UserInfo {
	String phone;
	String group;
	String name;
	int age;
	String memo;
	
	public UserInfo() {
		// TODO Auto-generated constructor stub
	}
}

// ��������
class OrderASC implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
// ��������
class OrderDESC implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

