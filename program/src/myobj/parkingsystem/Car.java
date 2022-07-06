package myobj.parkingsystem;

public class Car {
	
//	final public static CarType normal = new CarType(0, "일반");
//	final public static CarType disabled = new CarType(1, "장애인");
//	final public static CarType babyRide = new CarType(2, "유아동승");
//	final public static CarType lightCard = new CarType(3, "경차");
	
//	private static String[] parkState = {"판별중","주차가능","진입금지"};
	final static String[] carType = {"일반","장애인","유아동승","경차"}; 
	
	private String number;
	private int type;
	
	public Car(String number, int type) {
		this.number = number;
		this.type = type;
	}
	
	public String getNumber() {
		return number;
	}
	
	/**
	 * 0 : 일반 1: 장애인 2: 유아동승 3: 경차
	 * @return
	 */
	public int getType() {
		return type;
	}
		
	public String getTypeValue() {
		return carType[type];
	}
	
//	@Override
//	public String toString() {
//		return String.format("%s - %s [%s]", carNum, carType.getName(), parkState[state] );
//	}

}
