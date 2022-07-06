package myobj.phonebook;

import java.util.HashMap;

public class Phonebook {

	public HashMap<String, HashMap<String, PersonInfo>> insGroup(HashMap<String, HashMap<String, PersonInfo>> phoneGroup,
			String groupName) {
		
		if(!phoneGroup.containsKey(groupName)) {
			phoneGroup.put(groupName, new HashMap<String, PersonInfo>() );
			System.out.println("새 그룹을 생성했습니다.");
		}else {
			System.out.println("이미 존제하는 그룹 입니다.");
		}
		
		return phoneGroup;
		
	}
}
