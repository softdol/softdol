package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class D08_PhoneBook {
	
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
	
	//PhoneBook phoneGroup
	
	static HashMap<String, HashMap<String, UserInfo>> phoneGroup = 
			new HashMap<String,HashMap<String, UserInfo>>();
	
	public static void insGroup(String groupName) {
		if(!phoneGroup.containsKey(groupName)) {
			phoneGroup.put(groupName, new HashMap<String, UserInfo>() );
			System.out.println("새 그룹을 생성했습니다.");
		}else {
			System.out.println("이미 존제하는 그룹 입니다.");
		}
	}
	
	public static void insInfo(String groupName, String phoneNum, UserInfo info) {
		phoneGroup.get(groupName).put(phoneNum, info);
	}
	
	public static void searchPhone(String phoneNum, char chkName, boolean ascChk) {
		Set<String> keys = phoneGroup.keySet();
		System.out.println(" 전화번호 검색 결과 ["+ phoneNum +"]");
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
		System.out.println(" 이름 검색 결과 [" + name + "]");		
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
		
		insGroup("회사");
		insGroup("가족");
		insGroup("친구");
		
		String[] s = {"가족","회사","친구"};
		String[] fName = {"길동", "꺽정", "건우", "지민", "민호", "도훈", "승훈", "원형", "미영", "종민", "서영","종호","태영"};
		String[] lName = {"손","김","이","박","김","홍","황","곽","허","최"};
		
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
		// 폰번호
		searchPhone("11", 'N', true);
		System.out.println();
		// 이름
		searchName("이", 'P', true);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("------정렬 테스트------");
		
		viewAll('A',true);
		

	}
	
	

}
class OrderChk implements Comparator<UserInfo>{

	boolean ascChk;
	char chkName;
	
	/***
	 * 
	 * @param chkName : N 이름, A 나이, P 전화번호
	 * @param ascChk : true 오름차순, false 내림차순
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

// 오름차순
class OrderASC implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
// 내림차순
class OrderDESC implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}

