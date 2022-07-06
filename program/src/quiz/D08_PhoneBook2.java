package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook2 {
	
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
	static HashMap<String, HashMap<String, PersonInfo>> phonebook = 
			new HashMap<String,HashMap<String, PersonInfo>>();
	
	
	
	public boolean addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<String, PersonInfo>() );
			System.out.println("�� �׷��� �����߽��ϴ�.");
			return true;
		}else {
			System.out.println("�̹� �����ϴ� �׷� �Դϴ�.");
			return false;
		}
	}
	
	public boolean addPerson(PersonInfo info) {
		String group = info.getGroup();
		String number = info.getNumber();
		
		if(phonebook.containsKey(info.getGroup())) {
			HashMap<String, PersonInfo> groupMap = phonebook.get(group);			
			groupMap.put(number, info);			
			return true;
		}else {
			System.out.println("�ش� �׷��� �������� �ʽ��ϴ�. �׷��� ���� �������ּ���.");
			return false;
		}		
	}
	
	public void searchByName(String query) {
		for(HashMap<String, PersonInfo> group: phonebook.values()) {
			for(PersonInfo info : group.values()) {
				if(info.checkByName(query)) {
					System.out.println(info);
				}
			}
		}
	}
	
	public void searchByNumber(String query) {
		for(HashMap<String, PersonInfo> group: phonebook.values()) {
			for(PersonInfo info : group.values()) {
				if(info.checkByNumber(query)) {
					System.out.println(info);
				}
			}
		}
	}
	
	public void printAll(int column, boolean asc) {
		ArrayList<PersonInfo> all = new ArrayList<>();
		
		for(HashMap<String, PersonInfo> group : phonebook.values()) {
			all.addAll(group.values());
		}
			
		Comparator<PersonInfo> comparator = PersonInfo.getComparator(column, asc);
		Collections.sort(all,comparator);
		for(PersonInfo info : all) {
			System.out.println(info);
		}
		
	}
	
	public static void main(String[] args) {
		
		D08_PhoneBook2 mybook = new D08_PhoneBook2();
		
		mybook.addGroup("����");
		
		mybook.addPerson(new PersonInfo("����", "1-2-3", "��ƺ�"));
		mybook.addPerson(new PersonInfo("����", "1-2-4", "�ھ���"));
		mybook.addPerson(new PersonInfo("����", "1-2-5", "��Ƶ�"));
		mybook.addPerson(new PersonInfo("����", "1-2-6", "���"));
		mybook.addPerson(new PersonInfo("����", "1-2-7", "�ھ���1"));
		mybook.addPerson(new PersonInfo("����", "1-4-8", "�ھ���2"));
		mybook.addPerson(new PersonInfo("����", "1-4-9", "�ھ���3"));
		mybook.addPerson(new PersonInfo("����", "1-4-7", "�ھ���1"));
		mybook.addPerson(new PersonInfo("����", "1-4-8", "�ھ���2"));
		mybook.addPerson(new PersonInfo("����", "1-2-9", "�ھ���3"));
		
//		mybook.searchByName("��");
//		mybook.searchByName("��");
		
//		mybook.searchByNumber("4");
		
		mybook.printAll(PersonInfo.NUMBER_COLUMN, true);
		
		System.out.println(mybook);
	}
	
}

