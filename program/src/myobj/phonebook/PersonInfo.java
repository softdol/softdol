package myobj.phonebook;

import java.util.Comparator;

public class PersonInfo {
	
	final public static int NUMBER_COLUMN = 0;  
	final public static int NAME_COLUMN = 1;
	final public static int GROUP_COLUMN = 2;
	
	private String number;
	private String group;
	private String name;
//	private int age;
//	private String memo;
	
	public PersonInfo(String group, String number, String name) {
		this.group = group;
		this.number = number;
		this.name = name;
	}
	
	public static Comparator<PersonInfo> getComparator(int column, boolean asc){
		
		return new Comparator<PersonInfo>() {
			
			@Override
			public int compare(PersonInfo o1, PersonInfo o2) {
				
				switch (column) {
				case NUMBER_COLUMN:
					return o1.number.compareTo(o2.number) * (asc ? 1 : -1);
				case GROUP_COLUMN:
					return o1.group.compareTo(o2.group) * (asc ? 1 : -1);
				case NAME_COLUMN:
					return o1.name.compareTo(o2.name) * (asc ? 1 : -1);
				default:
					return 0;
				}
			}
		};
	}
	
	public boolean checkByName(String qry) {
		return name.contains(qry);
	}
	public boolean checkByNumber(String qry) {
		return number.contains(qry);
	}
	
	public String getGroup() {
		return group;
	}
	
	public String getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", group, number, name);
	}
}
