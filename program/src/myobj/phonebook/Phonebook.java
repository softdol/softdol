package myobj.phonebook;

import java.util.HashMap;

public class Phonebook {

	public HashMap<String, HashMap<String, PersonInfo>> insGroup(HashMap<String, HashMap<String, PersonInfo>> phoneGroup,
			String groupName) {
		
		if(!phoneGroup.containsKey(groupName)) {
			phoneGroup.put(groupName, new HashMap<String, PersonInfo>() );
			System.out.println("�� �׷��� �����߽��ϴ�.");
		}else {
			System.out.println("�̹� �����ϴ� �׷� �Դϴ�.");
		}
		
		return phoneGroup;
		
	}
}
