package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import myobj.phonebook.PersonInfo;

public class D08_PhoneBook2 {
	
	/*
	 * 	# HashMap을 이용해 전화번호부를 구현해보세요
	 * 	
	 * 	1. [그룹/전화번호/개인정보]를 저장해야 한다
	 * 	2. 전화번호부 해쉬맵에 그룹명을 키값으로 넣으면 해당 그룹의 해쉬맵을 꺼낼 수 있다
	 * 	3. 꺼낸 해쉬맵에 전화번호를 키값으로 넣으면 그사람의 개인정보를 꺼낼 수 있다  
	 * 
	 * 	# 구현해야 할 메서드
	 * 
	 * 	1. 새로운 그룹을 추가하는 메서드
	 * 	2. 존재하는 그룹에 새로운 전화번호 및 개인정보를 등록하는 메서드
	 * 	3. 이름의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	 *  4. 전화번호의 일부를 입력하면 일치하는 모든 사람의 목록을 보여주는 메서드
	 *  5. 등록된 모든 정보를 원하는 항목 기준으로 오름/내림차순으로 출력하는 메서드
	 *  
	 */
	static HashMap<String, HashMap<String, PersonInfo>> phonebook = 
			new HashMap<String,HashMap<String, PersonInfo>>();
	
	
	
	public boolean addGroup(String groupName) {
		if(!phonebook.containsKey(groupName)) {
			phonebook.put(groupName, new HashMap<String, PersonInfo>() );
			System.out.println("새 그룹을 생성했습니다.");
			return true;
		}else {
			System.out.println("이미 존제하는 그룹 입니다.");
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
			System.out.println("해당 그룹이 존재하지 않습니다. 그룹을 먼저 생성해주세요.");
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
		
		mybook.addGroup("가족");
		
		mybook.addPerson(new PersonInfo("가족", "1-2-3", "김아빠"));
		mybook.addPerson(new PersonInfo("가족", "1-2-4", "박엄마"));
		mybook.addPerson(new PersonInfo("가족", "1-2-5", "김아들"));
		mybook.addPerson(new PersonInfo("가족", "1-2-6", "김딸"));
		mybook.addPerson(new PersonInfo("가족", "1-2-7", "박엄마1"));
		mybook.addPerson(new PersonInfo("가족", "1-4-8", "박엄마2"));
		mybook.addPerson(new PersonInfo("가족", "1-4-9", "박엄마3"));
		mybook.addPerson(new PersonInfo("가족", "1-4-7", "박엄마1"));
		mybook.addPerson(new PersonInfo("가족", "1-4-8", "박엄마2"));
		mybook.addPerson(new PersonInfo("가족", "1-2-9", "박엄마3"));
		
//		mybook.searchByName("박");
//		mybook.searchByName("김");
		
//		mybook.searchByNumber("4");
		
		mybook.printAll(PersonInfo.NUMBER_COLUMN, true);
		
		System.out.println(mybook);
	}
	
}

