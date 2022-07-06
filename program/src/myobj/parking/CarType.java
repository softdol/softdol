package myobj.parking;

public class CarType {
	
	private int value;
	private String name;
	
	public CarType(int value, String name) {
		this.value = value;					
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getValue() {
		return value;
	}

}
